DROP SCHEMA IF EXISTS `hb-01-one-to-one-uni`;

CREATE SCHEMA `hb-01-one-to-one-uni`;

use `hb-01-one-to-one-uni`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `instructor_detail`;

CREATE TABLE `instructor_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
`youtube_channel` varchar(128) DEFAULT NULL,
`hobby` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `instructor`;

CREATE TABLE `instructor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
`first_name` varchar(45) DEFAULT NULL,
`last_name` varchar(45) DEFAULT NULL,
`email` varchar(45) DEFAULT NULL,
`instructor_detail_id` int(11) DEFAULT NULL,
PRIMARY KEY (`id`),
KEY `FK_DETAIL_idx` (`instructor_detail_id`),
FOREIGN KEY (`instructor_detail_id`) REFERENCES `instructor_detail` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO `instructor_detail`(id, youtube_channel, hobby) values
(1, 'Bao To', 'Reading book'),
(2, 'Tam Nguyen', 'Listening music'),
(3, 'Tai Le', 'Watching movie');

INSERT INTO `instructor`(id, first_name, last_name, email, instructor_detail_id) values
(1, 'Bao', 'To', 'tohoaibao@gmail.com', 1),
(2, 'Tam', 'Nguyen', 'tamnguyen@gmail.com', 2),
(3, 'Tai', 'Le', 'taile@gmail.com', 3);
