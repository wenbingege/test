/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50642
 Source Host           : localhost:3306
 Source Schema         : myvue

 Target Server Type    : MySQL
 Target Server Version : 50642
 File Encoding         : 65001

 Date: 01/09/2020 16:58:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `id` int(64) NOT NULL,
  `city_num` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市编号',
  `city_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `city_parent_num` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父级城市编号，一级城市此属性为0',
  `city_leave` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市等级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (1, '1001', '北京市', '0', '1');
INSERT INTO `city` VALUES (2, '1002', '广东省', '0', '1');
INSERT INTO `city` VALUES (3, '1001001', '东城区', '1001', '2');
INSERT INTO `city` VALUES (4, '1001002', '西城区', '1001', '2');
INSERT INTO `city` VALUES (5, '1001003', '海淀区', '1001', '2');
INSERT INTO `city` VALUES (6, '1001004', '朝阳区', '1001', '2');
INSERT INTO `city` VALUES (7, '1001005', '景山区', '1001', '2');
INSERT INTO `city` VALUES (8, '1001006', '房山区', '1001', '2');
INSERT INTO `city` VALUES (9, '1002001', '广州市', '1002', '2');
INSERT INTO `city` VALUES (10, '1002002', '深圳市', '1002', '2');
INSERT INTO `city` VALUES (11, '1002003', '东莞市', '1002', '2');
INSERT INTO `city` VALUES (12, '1002004', '惠州市', '1002', '2');
INSERT INTO `city` VALUES (13, '1002002001', '福田区', '1002002', '3');
INSERT INTO `city` VALUES (14, '1002002002', '南山区', '1002002', '3');
INSERT INTO `city` VALUES (15, '1002002003', '龙岗区', '1002002', '3');
INSERT INTO `city` VALUES (16, '1002002004', '龙华区', '1002002', '3');
INSERT INTO `city` VALUES (17, '1002002005', '宝安区', '1002002', '3');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `person_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `person_sex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `person_age` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年龄',
  `person_date` datetime(0) NULL DEFAULT NULL COMMENT '入职日期',
  `person_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `person_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系方式',
  `person_plan` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '个人规划',
  `person_attr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '个人定位',
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司所在省份',
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司所在市',
  `regional` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司所在区',
  `create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (2, '小米', '男', '25', '2020-08-27 15:34:32', 'www@163.com', '18833444444', '架构师', '技术型', '1001', '1001005', NULL, '2020-08-28 15:13:49');
INSERT INTO `person` VALUES (3, '小化', '男', '25', '2020-08-27 15:34:32', 'www@163.com', '18833444444', '架构师', '技术型', '1001', '1001005', NULL, '2020-08-28 15:15:14');
INSERT INTO `person` VALUES (4, '上官蓝天', '男', '25', '2020-08-27 15:34:32', 'www@163.com', '18833444444', '架构师', '技术型', '1001', '1001005', NULL, '2020-08-28 15:15:45');
INSERT INTO `person` VALUES (5, '红红', '女', '25', '2020-08-27 15:34:32', 'www@163.com', '18833444444', '架构师', '技术型', '1001', '1001005', NULL, '2020-08-31 17:05:16');
INSERT INTO `person` VALUES (6, '兰兰', '女', '25', '2020-08-27 15:34:32', 'www@163.com', '18833444444', '架构师', '技术型', '1001', '1001005', NULL, '2020-08-31 17:05:29');
INSERT INTO `person` VALUES (7, '花花', '女', '25', '2020-08-27 15:34:32', 'www@163.com', '18833444444', '架构师', '技术型', '1001', '1001005', NULL, '2020-08-31 17:05:36');
INSERT INTO `person` VALUES (8, '小芳', '女', '25', '2020-08-27 15:34:32', 'www@163.com', '18833444444', '架构师', '技术型', '1001', '1001005', NULL, '2020-08-31 17:05:50');
INSERT INTO `person` VALUES (12, '测试5', '男', '34', '2020-08-31 16:00:00', '1234@123.com', NULL, '羡慕组织', '营销型,管理型', '1001', '1001005', NULL, '2020-09-01 13:39:15');
INSERT INTO `person` VALUES (13, '测试6', '女', '23', '2020-09-01 05:41:16', 'qwq@123.com', '12323454567', '技术总监', '技术型', '1002', '1002002', '1002002005', '2020-09-01 13:41:54');
INSERT INTO `person` VALUES (14, '张三', '男', '45', '2020-08-03 16:00:00', 'zhangsan@163.com', '18812341234', '当老板', '营销型,管理型', '1001', '1001006', NULL, '2020-09-01 14:40:36');
INSERT INTO `person` VALUES (15, '里斯', '男', '34', '2020-09-01 06:43:15', 'lisi@163.com', '15623452345', '当老板助理', '业务型,营销型', '1001', '1001005', NULL, '2020-09-01 14:44:00');

SET FOREIGN_KEY_CHECKS = 1;
