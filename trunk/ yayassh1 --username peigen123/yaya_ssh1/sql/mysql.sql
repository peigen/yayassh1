CREATE TABLE  `test`.`t_user` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_name` varchar(20) NOT NULL,
  `user_pwd` varchar(10) NOT NULL default '123456',
  `user_sex` varchar(10) default 'female',
  `user_age` int(11) default NULL,
  PRIMARY KEY  USING BTREE (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11561 DEFAULT CHARSET=utf8