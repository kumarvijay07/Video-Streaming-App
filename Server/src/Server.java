import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.image.BufferedImage;

import com.github.sarxos.webcam.Webcam;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket();
        server.bind(new InetSocketAddress(5000));
        System.out.println("Server is running... on port 5000");

        Socket clientSocket = server.accept();

        ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());

        Webcam webcam = Webcam.getDefault();
        webcam.open();
        System.out.println("Webcam opened successfully");

        BufferedImage image = webcam.getImage();
        Image dimg = image.getScaledInstance(640, 480, Image.SCALE_SMOOTH);

        ImageIcon icon = new ImageIcon(dimg);

        oos.writeObject(icon);

        while (true) {
            image = webcam.getImage();
            dimg = image.getScaledInstance(640, 480, Image.SCALE_SMOOTH);
            icon = new ImageIcon(dimg);

            oos.writeObject(icon);
        }
    }
}
