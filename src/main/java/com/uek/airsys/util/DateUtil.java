package com.uek.airsys.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 日期处理的工具类
 * 根据某种格式把字符串转化为日期
 * dateFormat:日期格式
 * dateStr：日期字符串
 */
public class DateUtil {
        
	public static Date toDate(String dateFormat,String dateStr){
        	  
        	  SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        	  
        	  try {
				return sdf.parse(dateStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
        	  return null;
          }
	/*
	 * 根据 某种日期格式把日期转化为字符串
	 */
    public static String dateToString(String dateForm,Date date){
  	  return new SimpleDateFormat(dateForm).format(date);
    }
}
