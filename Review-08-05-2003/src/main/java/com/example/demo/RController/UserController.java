package com.example.demo.RController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RModel.UserModel;
import com.example.demo.RService.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class UserController 
{
	@Autowired
	UserService userv;
	
	@Tag(name = "Post Method",description = "Post Validation")
	@PostMapping("/postU")
	public UserModel postDetails(@RequestBody UserModel um)
	{
		return userv.postData(um);
	}
	
	@Tag(name = "Get Method",description = "Get Validation")
	@GetMapping("/getallU")
	public List<UserModel> getAllDetails()
	{
		return userv.getAllData();
	}
	
	@Tag(name = "Get by Id Method",description = "Get Validation")
	@GetMapping("/getU/{id}")
	public Optional<UserModel> getDetailsById(@PathVariable("id")int id,@RequestBody UserModel am)
	{
		return userv.getDataById(id);
	}
	
	@Tag(name = "Update Method",description = "Update Validation")
	@PutMapping("/updateU/{id}")
	public UserModel putDetails(@RequestBody UserModel um)
	{
		return userv.updateData(um);
	}
	
	@Tag(name = "Delete Method",description = "Delete Validation")
	@DeleteMapping("/deleteU/{id}")
	public String deleteDetails(int id)
	{
		userv.deleteData(id);
		return id+" was deleted successfully";
	}
}
