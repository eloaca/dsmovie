CREATE TABLE tb_user (
    id NUMERIC(19) NOT NULL AUTO_INCREMENT,
    email VARCHAR(60) NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE tb_movie (
    id NUMERIC(19) NOT NULL AUTO_INCREMENT,
    title VARCHAR(60) NOT NULL,
    score DECIMAL(19,2) NOT NULL,
    count INT NOT NULL,
    image VARCHAR(255) NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE tb_score (
    value DECIMAL(19,2) NOT NULL,
    movie_id NUMERIC(19),
    user_id NUMERIC(19),

    FOREIGN KEY (movie_id) REFERENCES tb_movie(id),
    FOREIGN KEY (user_id) REFERENCES tb_user(id)
);