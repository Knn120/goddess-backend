package com.goddess.ec.manage.common;

import java.io.File;

/**
 * 常量数据字典
 * 
 */
public abstract class DictKeys {

	/**
	 * URL缓存Key
	 */
	public static final String cache_name_page = "SimplePageCachingFilter";

	/**
	 * 系统缓存，主要是权限和数据字典等
	 */
	public static final String cache_name_system = "system";

	/**
	 * 开发模式
	 */
	public static final String config_devMode = "config.devMode";

	/**
	 * 加密
	 */
	public static final String config_securityKey_key = "config.securityKey";

	/**
	 * 密码最大错误次数
	 */
	public static final String config_passErrorCount_key = "config.passErrorCount";

	/**
	 * 密码错误最大次数后间隔登陆时间（小时）
	 */
	public static final String config_passErrorHour_key = "config.passErrorHour";

	/**
	 * #文件上传大小限制 10 * 1024 * 1024 = 10M
	 */
	public static final String config_maxPostSize_key = "config.maxPostSize";

	/**
	 * # cookie 值的时间
	 */
	public static final String config_maxAge_key = "config.maxAge";

	/**
	 * 当前数据库类型
	 */
	public static final String db_type_key = "db.type";

	public static final String db_type_postgresql = "postgresql";
	public static final String db_type_mysql = "mysql";
	public static final String db_type_oracle = "oracle";

	public static final String db_connection_driverClass = "driverClass";
	public static final String db_connection_jdbcUrl = "jdbcUrl";
	public static final String db_connection_userName = "userName";
	public static final String db_connection_passWord = "passWord";

	public static final String db_connection_ip = "db_ip";
	public static final String db_connection_port = "db_port";
	public static final String db_connection_dbName = "db_name";

	public static final String db_initialSize = "db.initialSize";
	public static final String db_minIdle = "db.minIdle";
	public static final String db_maxActive = "db.maxActive";

	/**
	 * 分页参数初始化值
	 */
	public static final int default_pageNumber = 1;// 第几页
	public static final int default_pageSize = 20;// 每页显示几多

	/**
	 * 用户登录状态码
	 */
	public static final int login_info_0 = 0;// 用户不存在
	public static final int login_info_1 = 1;// 停用账户
	public static final int login_info_2 = 2;// 密码错误次数超限
	public static final int login_info_3 = 3;// 密码验证成功
	public static final int login_info_4 = 4;// 密码验证失败
	
	public static final String keywords = "keywords";
	
	public static final String keywords_mask = "***";

	public static final String path_root = new File(DictKeys.class.getClassLoader().getResource("/").getPath())
	.getParentFile().getParent();
	
	/**
	 * 图片上传的根路径
	 */
	public static final String image_url = "image.url";
	public static final String image_root = "image.root";
	public static final String image_path = "image.path";
	public static final String resource_root = "RESOURCE.root";
	

	/**
	 * 快递100
	 */
	public static final String delivery_key = "delivery.key"; // 推送服务授权秘钥key
	public static final String delivery_poll_url = "delivery.poll.url"; // 订阅请求url
	public static final String delivery_callbackurl = "delivery.callbackurl"; // 订阅请求url
	public static final String delivery_sf_start = "delivery.sf.start"; // 顺丰物流开始路由信息
	public static final String delivery_ns_start = "delivery.ns.start"; // 自配送物流开始路由信息
	public static final String delivery_ns_finish = "delivery.ns.finish"; // 自配送物流完成路由信息

	public static final String logo_print_price = "logoPrint.price"; // 自配送物流完成路由信息
}
