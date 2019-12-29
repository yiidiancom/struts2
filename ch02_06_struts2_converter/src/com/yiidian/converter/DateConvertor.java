package com.yiidian.converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.apache.struts2.util.StrutsTypeConverter;
/**
 * �Զ�������ת����
 * @author һ��̳�(yiidian.com)
 */
public class DateConvertor extends StrutsTypeConverter{
	//ҳ��->Action
	@Override
	public Object convertFromString(Map arg0, String[] param, Class arg2) {
		//param������ҳ�洫�ݵĲ���
		String dateString = param[0];
		//ת����ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	//Action->ҳ��
	@Override
	public String convertToString(Map arg0, Object arg1) {
		return null;
	}

}
