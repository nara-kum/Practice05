package com.javaex.ex09;

public class StringUtil {

	//필드
	static String[] str;
	//생성자

	
	//메소드
	public static String concatString(String[] strArray){
		
		str = strArray;
		
		return str[0]+str[1]+str[2];
		
    }

}
