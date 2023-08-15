create table `t_sum`
(
    `id`       int(11) NOT NULL AUTO_INCREMENT,
    `num1` int(11) NOT NULL,
    `num2`  int(11) NOT NULL,
    `sum`   int(11) DEFAULT 0,
    PRIMARY KEY (`id`)
)ENGINE = InnoDb DEFAULT CHARSET=utf8 ROW_FORMAT = DYNAMIC;