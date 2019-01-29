package cn.huangxulin.cloud.utils;

import java.util.UUID;

public final class UUIDUtils {

	private UUIDUtils() {
		
	}
	
	/**
	 * 生成唯一标识码
	 * @return
	 */
	public static String createUUID() {
		return UUID.randomUUID().toString();
	}
	
	/**
	 * 获取32位不带中划线的UUID
	 * @return
	 */
	public static String create32UUID() {
		return createUUID().replace("-", "");
	}

}
