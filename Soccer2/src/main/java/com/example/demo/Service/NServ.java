package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Nike.Nike;
import com.example.demo.Repository.NRepo;
@Service
public class NServ 
{
	@Autowired
	public NRepo repo;
	public Nike saveInfo(Nike nik)
	{
		return repo.save(nik);
	}
	public void deleteInfo(int id)
	{
		repo.deleteById(id);
	}
	public Nike updateDetails(Nike nik)
	{
		return repo.saveAndFlush(nik);
	}
	public Nike getDetails(int id)
	{
		return repo.findById(id).get();
	}
	
	public List<Nike> getalldetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
