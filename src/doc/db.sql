CREATE TABLE `auth_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `userId` varchar(32) DEFAULT NULL COMMENT '用户ID 诺诺网用户ID',
  `appKey` varchar(10) DEFAULT NULL,
  `thirdUserId` varchar(32) DEFAULT NULL COMMENT '第三方用户ID 第三方用户ID',
  `createDate` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期 默认为当前时间',
  `updateDate` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新日期 默认为当前时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
