package com.naveen.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naveen.entities.Donor;

@Repository(value="donorDaoImpl")
public class DonorDaoImpl implements DonorDao
{
	@Autowired
	private SessionFactory ht;

	@Override
	public void saveDonor(Donor donor) 
	{
		ht.openSession().save(donor);
		
	}

	@Override
	public List<Donor> allDonors() {
	List<Donor> list =	ht.openSession().createCriteria(Donor.class).list();
		return list;
	}

	@Override
	public void savePost(String post) {
		ht.openSession().save(post);
		
	}

	@Override
	public List<Donor> login(String user, String name) {
		String query = "select * from donor where name =? and password=?";
		
		return ht.openSession().createSQLQuery(query).setParameter(0, user).setParameter(1, name).list();
	}

}
