
# Java Video Streaming Software

## Overview

This Java application enables secure video streaming using sockets and JWT (JSON Web Tokens). It allows for real-time video transmission over a network while ensuring authentication and authorization using JWT.

## Features

- **Video Streaming:** Stream video content in real-time over a network connection.
- **Socket Communication:** Utilizes Java sockets for efficient data transmission.
- **JWT Authentication:** Securely authenticate and authorize users using JWT tokens.
- **Multi-threaded:** Supports concurrent connections and streaming sessions.
- **Configurable:** Easily configurable settings for port, streaming quality, and authentication parameters.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Maven (for dependencies management, optional if dependencies are bundled)
- External libraries:
  - [Java JWT](https://github.com/jwtk/jjwt) - For JWT token handling

## Installation

1. Clone the repository:
   ```
   git clone https://github.com/your/repository.git
   cd repository-directory
   ```

2. Build the project (if using Maven):
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   java -jar your-application.jar
   ```

## Usage

1. Configure the application settings such as port number, video directory, JWT secret key in the configuration file (`config.properties`).

2. Start the server:
   ```
   java -jar your-application.jar server
   ```

3. Clients can connect to the server using the provided JWT token for authentication.

## Configuration

The `config.properties` file includes configurable parameters such as:
- `server.port`: Port number for socket communication.
- `jwt.secret`: Secret key for JWT token generation and validation.
- `video.directory`: Directory where video files are stored.

Example `config.properties`:
```properties
server.port=8080
jwt.secret=mySecretKey
video.directory=/path/to/videos
```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

For support or inquiries, please contact [Vijay Mahto] at [vijaymahto6178@gmail.com].
