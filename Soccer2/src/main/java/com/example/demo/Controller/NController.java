package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Nike.Nike;
import com.example.demo.Service.NServ;
@RestController
public class NController 
{
	@Autowired
	public NServ ser;
	@PostMapping("/post")
	public Nike saveDetails(@RequestBody Nike nik)
	{
		return ser.saveInfo(nik);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		ser.deleteInfo(id);
		return id+" was deleted successfully";
	}
	@PutMapping("/put")
	public Nike updateDetails(@RequestBody Nike nik)
	{
		return ser.updateDetails(nik);
	}
	@GetMapping("/get/{id}")
	public Nike getDetails(@PathVariable("id")int id)
	{
		return ser.getDetails(id);
	}
	@GetMapping("/get")
	public List<Nike> getalldetails()
	{
		return ser.getalldetails();
	}
	@DeleteMapping("/delete")
	public String deletebyreqparam(@RequestParam("id") int id)
	{
				ser.deleteInfo(id);
				return"Delete by req param was successful";
	}
	@GetMapping("/sortdesc/{name}")
	public List<Nike> sort(@PathVariable("name") String name)
	{
		return ser.sortDesc(name); 
	}
	
	@GetMapping("/page/{pnum}/{psize}")
	public List<Nike> page(@PathVariable("pnum")int num,@PathVariable("psize")int size)
	{
		return ser.page(num, size);
	}
	
	@GetMapping("/pagesort/{pnum}/{psize}/{name}")
	public List<Nike> pagesort(@PathVariable("pnum")int num,@PathVariable("psize")int size,@PathVariable("name")String name)
	{
		return ser.pagesort(num,size,name);
	}
	
}
     