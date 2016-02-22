package com.carrey.HibernateTest.pojo;

public enum Gender {
	
	MALE('M'),
	FEMALE('F');
	
	private final char code;
	
	private Gender(char code){
		this.code = code;
	}
	
	public static Gender fromCode(char code) throws Exception{
		if(code == 'M' || code == 'm'){
			return MALE;
		}else if(code =='F' || code == 'f'){
			return FEMALE;
		}
		
		throw new Exception(code + " not supported.");
	}
	
	public char getCode(){
		return code;
	}

}
