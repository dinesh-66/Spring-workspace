package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Nike.LoginModel;
import com.example.demo.Repository.LapRepository;

@Service
public class LogService 
{
	@Autowired
	public LapRepository lrepo;
	public String loginCheckData(String username,String password)
	{
		LoginModel user = lrepo.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public LoginModel addUser(LoginModel lm)
	{
		return lrepo.save(lm);
	}
	public List<LoginModel> getData()
	{
		return lrepo.findAll();
	}
}
