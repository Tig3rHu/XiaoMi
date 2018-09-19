package com.wuyou.hellogradle;

import org.apache.commons.lang3.StringUtils;

public class CheckNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text1="a1234";
        String text2="1234";
        
        boolean result1=StringUtils.isNumeric(text1);
        boolean result2=StringUtils.isNumeric(text2);
        System.out.println(text1+"is a numer"+result1);
	}

}
