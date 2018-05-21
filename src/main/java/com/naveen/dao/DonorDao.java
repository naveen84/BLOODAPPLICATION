package com.naveen.dao;

import java.util.List;

import com.naveen.entities.Donor;

public interface DonorDao 
{
	void saveDonor(Donor donor);
	List<Donor> allDonors();
	void savePost(String post);
	List<Donor> login(String user , String name);
}
