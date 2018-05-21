package com.naveen;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.naveen.dao.DonorDao;
import com.naveen.entities.Donor;

@Controller
public class BloodController
{
	
	@Autowired
	private DonorDao dao;
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request)
	{
		String user = request.getParameter("name");
		String password = request.getParameter("password");
		List<Donor> list =dao.login(user, password);
		if(list.size()==0||list.isEmpty())
			return new ModelAndView("invalidlogin","error","INVALID CREDENTIALS");
		else
			return new ModelAndView("success");
	}
	@RequestMapping(value="/register" , method=RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		Donor donor = new Donor();
		donor.setAge(Integer.parseInt((request.getParameter("age"))));
		donor.setMobile(request.getParameter("mobile"));
		donor.setName(request.getParameter("name"));
		donor.setPassword(request.getParameter("password"));
		donor.setPincode(request.getParameter("pin"));
	//	log.debug(donor);
		dao.saveDonor(donor);
		return new ModelAndView("success","donor",donor);
	}
	@RequestMapping("/allDonors")
	public ModelAndView allUsers()
	{
		List<Donor> list = dao.allDonors();
		return new ModelAndView("editaccount","list",list);
	}
	@RequestMapping("/timeline")
	public ModelAndView timeline(HttpServletRequest request)
	{
		String post = request.getParameter("post");
		dao.savePost(post);
		return new ModelAndView("success");
	}
	
}
