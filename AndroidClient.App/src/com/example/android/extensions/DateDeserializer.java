package com.example.android.extensions;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class DateDeserializer implements JsonDeserializer<Date> {
	@Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException 
    {
		//DateMilliseconds��UTCʱ��ת��ʱ���Զ�ת��Ϊϵͳ������ʱ����ʱ��
        String JSONDateMilliseconds = "\\/(Date\\((.*?)(\\+.*)?\\))\\/";
        Pattern pattern = Pattern.compile(JSONDateMilliseconds);
        Matcher matcher = pattern.matcher(json.getAsJsonPrimitive()
                .getAsString());
        String result = matcher.replaceAll("$2");
        return new Date(Long.valueOf(result));
    }
}