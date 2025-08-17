CREATE TABLE users (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       balance DOUBLE NOT NULL DEFAULT 0.0
);

CREATE TABLE vaults (
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        user_id BIGINT NOT NULL,
                        amount DOUBLE NOT NULL,
                        created_at DATETIME NOT NULL,
                        unlock_at DATETIME NOT NULL,
                        status VARCHAR(50) NOT NULL,
                        FOREIGN KEY (user_id) REFERENCES users(id)
);