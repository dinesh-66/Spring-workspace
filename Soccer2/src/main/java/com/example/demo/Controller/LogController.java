package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Nike.LoginModel;
import com.example.demo.Service.LogService;

@RestController
public class LogController 
{
	@Autowired
	public LogService lser;
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String password = loginDataMap.get("password");
		String result = lser.loginCheckData(username, password);
		return result;
	}
	@PostMapping("/add")
	public LoginModel addUser(@RequestBody LoginModel lm)
	{
		return lser.addUser(lm);
	}
	@GetMapping("/get")
	public List<LoginModel> getDeatils()
	{
		return lser.getData();
	}

}
