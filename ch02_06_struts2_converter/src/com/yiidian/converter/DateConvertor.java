package com.yiidian.converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.apache.struts2.util.StrutsTypeConverter;
/**
 * 自定义类型转换器
 * @author 一点教程(yiidian.com)
 */
public class DateConvertor extends StrutsTypeConverter{
	//页面->Action
	@Override
	public Object convertFromString(Map arg0, String[] param, Class arg2) {
		//param：代表页面传递的参数
		String dateString = param[0];
		//转换格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	//Action->页面
	@Override
	public String convertToString(Map arg0, Object arg1) {
		return null;
	}

}
