package com.carrey.HibernateTest.converter;

import javax.persistence.AttributeConverter;

import com.carrey.HibernateTest.dojo.Gender;

public class GenderConverter implements AttributeConverter<Gender, Character> {

	public Character convertToDatabaseColumn(Gender attribute) {
		return attribute.getCode();
	}

	public Gender convertToEntityAttribute(Character dbData) {
		try {
			return Gender.fromCode(dbData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
