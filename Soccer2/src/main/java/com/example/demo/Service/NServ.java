package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	
	public List<Nike> getalldetails() 
	{
		return repo.findAll();
	}
	
	
	public List<Nike> sortDesc(String name)
	{
		return repo.findAll(Sort.by(name).descending());
	}
	public List<Nike> page(int num, int size) 
	{
		Page<Nike> p=repo.findAll(PageRequest.of(num, size));
		return p.getContent();
	}
	public List<Nike> pagesort(int num, int size, String name) {
		Page<Nike> p=repo.findAll(PageRequest.of(num, size, Sort.by(name).descending()));
		return p.getContent()
				;
	}
}
