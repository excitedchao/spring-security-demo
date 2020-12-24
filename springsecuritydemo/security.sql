/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : security

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 24/12/2020 14:44:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sy_permission
-- ----------------------------
DROP TABLE IF EXISTS `sy_permission`;
CREATE TABLE `sy_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sy_permission
-- ----------------------------
INSERT INTO `sy_permission` VALUES (1, 'student:wirte');
INSERT INTO `sy_permission` VALUES (2, 'student:read');
INSERT INTO `sy_permission` VALUES (3, 'teacher:write');
INSERT INTO `sy_permission` VALUES (4, 'teacher:read');

-- ----------------------------
-- Table structure for sy_role
-- ----------------------------
DROP TABLE IF EXISTS `sy_role`;
CREATE TABLE `sy_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sy_role
-- ----------------------------
INSERT INTO `sy_role` VALUES (1, 'admin');
INSERT INTO `sy_role` VALUES (2, 'teacher');
INSERT INTO `sy_role` VALUES (3, 'student');

-- ----------------------------
-- Table structure for sy_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sy_role_permission`;
CREATE TABLE `sy_role_permission`  (
  `role_id` bigint(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`, `permission_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sy_role_permission
-- ----------------------------
INSERT INTO `sy_role_permission` VALUES (1, 1);
INSERT INTO `sy_role_permission` VALUES (1, 2);
INSERT INTO `sy_role_permission` VALUES (1, 3);
INSERT INTO `sy_role_permission` VALUES (1, 4);
INSERT INTO `sy_role_permission` VALUES (2, 3);
INSERT INTO `sy_role_permission` VALUES (2, 4);
INSERT INTO `sy_role_permission` VALUES (3, 1);

-- ----------------------------
-- Table structure for sy_user
-- ----------------------------
DROP TABLE IF EXISTS `sy_user`;
CREATE TABLE `sy_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sy_user
-- ----------------------------
INSERT INTO `sy_user` VALUES (1, 'admin', '$2a$10$ImH89lZRadc.H3fEqkESD.Yrgr.LoN97vOV.1HEVIzCjI.ghac5UC');
INSERT INTO `sy_user` VALUES (2, 'teacher', '$2a$10$ImH89lZRadc.H3fEqkESD.Yrgr.LoN97vOV.1HEVIzCjI.ghac5UC');
INSERT INTO `sy_user` VALUES (3, 'student', '$2a$10$ImH89lZRadc.H3fEqkESD.Yrgr.LoN97vOV.1HEVIzCjI.ghac5UC');

-- ----------------------------
-- Table structure for sy_user_perm
-- ----------------------------
DROP TABLE IF EXISTS `sy_user_perm`;
CREATE TABLE `sy_user_perm`  (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `perm_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sy_user_perm
-- ----------------------------

-- ----------------------------
-- Table structure for sy_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sy_user_role`;
CREATE TABLE `sy_user_role`  (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sy_user_role
-- ----------------------------
INSERT INTO `sy_user_role` VALUES (1, 1, 1);
INSERT INTO `sy_user_role` VALUES (2, 2, 2);
INSERT INTO `sy_user_role` VALUES (3, 3, 3);

SET FOREIGN_KEY_CHECKS = 1;
