/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-05-22 09:42:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `head` varchar(300) DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `phone` varchar(14) DEFAULT NULL,
  `picture` varchar(3000) DEFAULT NULL,
  `sex` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'test head', 'postman', '13820199946', '111111111111', '1');
INSERT INTO `user` VALUES ('2', 'test head2', 'springboot-wang', '13043275943', '222222222222', '1');
