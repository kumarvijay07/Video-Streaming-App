import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.121.43", 5000);

        // socket.connect(new InetSocketAddress("localhost", 5000));

        ObjectInputStream oin = new ObjectInputStream(socket.getInputStream());

        JFrame frame = new JFrame("Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,480);

        JLabel label = new JLabel();
        label.setSize(640, 480);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);

        frame.setVisible(true);

        while (true) {
            label.setIcon((ImageIcon)oin.readObject());
        }
    }
}
