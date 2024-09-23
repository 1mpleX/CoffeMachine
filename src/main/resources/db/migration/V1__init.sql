CREATE TABLE coffee_recipe (
                               id BIGINT AUTO_INCREMENT PRIMARY KEY,
                               name VARCHAR(255) NOT NULL,
                               water INT NOT NULL,
                               coffee_beans INT NOT NULL,
                               milk INT NOT NULL
);

CREATE TABLE ingredient (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            quantity INT NOT NULL
);

CREATE TABLE statistics (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            coffee_type VARCHAR(255) NOT NULL,
                            count INT NOT NULL
);
-- нет смысла использовать постгру, тк, можно не хранить данные в качестве объектов со свойствами