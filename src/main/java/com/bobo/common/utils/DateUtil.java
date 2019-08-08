/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtil.java 
 * @Prject: bobo-common
 * @Package: com.bobo.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月7日 下午4:22:36 
 * @version: V1.0   
 */
package com.bobo.common.utils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月7日 下午4:22:36  
 */
public class DateUtil {
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//获取默认的日历类
		Calendar c = Calendar.getInstance();
		
		//用传入的日期初始化日历类
		c.setTime(src);
		//设置日历类  月的第一天
		c.set(Calendar.DAY_OF_MONTH, 1);
		//设置日历类 天的第0个小时
		c.set(Calendar.HOUR_OF_DAY, 0);
		//设置日历类 天的第0分钟
		c.set(Calendar.MINUTE, 0);
		//设置日历类 天的第0秒
		c.set(Calendar.SECOND, 0);
		return c.getTime();

	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		//获取默认的日历类
			
		Date date = getDateByInitMonth(src);
		
		//获取默认的日历类
		Calendar c = Calendar.getInstance();
		
		//用传入的日期初始化日历类
		c.setTime(date);
		//让月加1
		c.add(Calendar.MONTH, 1);
		//让秒减一
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}

}
