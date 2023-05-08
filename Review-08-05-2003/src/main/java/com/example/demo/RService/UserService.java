package com.example.demo.RService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.RModel.UserModel;
import com.example.demo.RRepository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	UserRepository urepo;
	
	public UserModel postData(UserModel um)
	{
		return urepo.save(um);
	}
	
	public List<UserModel> getAllData()
	{
		return urepo.findAll();
	}
	
	public Optional<UserModel> getDataById(int id)
	{
		return urepo.findById(id);
	}
	
	public UserModel updateData(UserModel um)
	{
		return urepo.saveAndFlush(um);
	}
	
	public void deleteData(int id)
	{
		urepo.deleteById(id);
	}
}
