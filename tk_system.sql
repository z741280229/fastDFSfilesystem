/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.6.33 : Database - static_files
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`static_files` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `static_files`;

/*Table structure for table `file` */

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
  `file_id` varchar(32) NOT NULL COMMENT '文件ID',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '组织ID',
  `device_id` varchar(32) DEFAULT NULL COMMENT '设备ID',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户ID',
  `file_url` varchar(128) DEFAULT NULL COMMENT '文件路径',
  `file_name` varchar(256) DEFAULT NULL COMMENT '文件名',
  `file_type` varchar(8) DEFAULT NULL COMMENT '文件类型',
  `file_size` decimal(16,8) DEFAULT NULL COMMENT '文件大小',
  `file_upload_ip` varchar(32) DEFAULT NULL COMMENT '上传IP',
  `file_upload_date` varchar(32) DEFAULT NULL COMMENT '上传日期',
  `file_upload_time` varchar(32) DEFAULT NULL COMMENT '上传时间',
  `file_delete_date` varchar(32) DEFAULT NULL COMMENT '删除日期',
  `file_delete_time` varchar(32) DEFAULT NULL COMMENT '删除时间',
  `file_uploader_id` varchar(32) DEFAULT NULL COMMENT '上传者Id',
  `file_uploader_name` varchar(32) DEFAULT NULL COMMENT '上传者姓名',
  `file_delete_id` varchar(32) DEFAULT NULL COMMENT '删除者Id',
  `file_delete_name` varchar(32) DEFAULT NULL COMMENT '删除者姓名',
  `data_status` int(2) DEFAULT NULL COMMENT '数据状态',
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` int(4) NOT NULL,
  `up_token` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
