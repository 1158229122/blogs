package com.gtcmaile.blogs.util;

import java.util.Random;
import java.util.UUID;

/**
 * 产生UUID随机字符串工具类
 */
public final class UuidUtil {
	public static final Random r = new Random();
	private UuidUtil(){}
	public static String getUuid(){
		return UUID.randomUUID().toString().replace("-","");
	}
	public static String getCheck(){
		int a =r.nextInt(900000)+100000;
		return a+"";
	}
}
