package com.carrey.HibernateTest.dao;

import com.carrey.HibernateTest.pojo.PersonDetail;

public class PersonDetailDao extends AbstractDao<PersonDetail, Long> {

	protected PersonDetailDao() {
		super(PersonDetail.class);
	}

}
