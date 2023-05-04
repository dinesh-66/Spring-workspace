package com.example.demo.SController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SRepository.PlayerRepo;
import com.example.demo.SService.PlayerService;
import com.example.demo.Soccer.Players;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class PlayerControl 
{
	@Autowired
	PlayerRepo prepo;
	
	@Autowired
	PlayerService pser;
	
	@Tag(name = "Post Method for Players",description = "Post Details")
	@PostMapping("/ipost")
	public Players postDetails(@RequestBody Players sh)
	{
		return pser.postData(sh);
	}
	
	@Tag(name = "Get Method for Players",description = "Get All Details")
	@GetMapping("/iget")
	public List<Players> getAllDetails(Players si)
	{
		return prepo.getAllData();
	}
	
	@Tag(name = "Get by ID Method for Players",description = "Get All Details")
	@GetMapping("/iget/{id}")
	public List<Players> getById(@PathVariable("id")int id)
	{
		return prepo.getDataById(id);
	}
	
	@Tag(name = "Update by ID Method for Players",description = "Update Details")
	@PutMapping("/iput/{name}/{id}")
	public String updateInfo(@PathVariable("name")String name,@PathVariable("id")int  id)
	{
		prepo.updatePlayerDetails(name, id);
		return id+" was updated";
	}
	
	@Tag(name = "Get between two data Method for Players",description = "Get Details between two data")
	@GetMapping("/iget/{start}/{end}")
	public List<Players> getDataBetween(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return prepo.getPlayerDataBetween(start, end);
	}
	
	@Tag(name = "Delete by Id Method for Players",description = "Delete Details")
	@DeleteMapping("/idelete/{num}")
	public String deleteData(@PathVariable("num")int num)
	{
		prepo.deletePlayerData(num);
		return num+" was Deleted";
	}
	
	@Tag(name = "Get by Id Query Method for Players",description = "Get Details by Id")
	@GetMapping("/igetquery/{name}")
	public Players getQueryId(@PathVariable("name")String name)
	{
		return prepo.queryByName(name);
	}
	
	@Tag(name = "Get by Id between two data Query Method for Players",description = "Get Details by Id between")
	@GetMapping("/igetquery/{start}/{end}")
	public List<Players> queryBetween(@PathVariable("start")int Start,@PathVariable("end")int end)
	{
		return prepo.queryBetween(Start, end);
	}
	
	@Tag(name = "Update Data by Id Query Method for Players",description = "Update Details by Id using JPQL Query")
	@PutMapping("/iputquery/{club}/{id}")
	public Players queryUpdate(@PathVariable("club")String club,@PathVariable("id")int id)	
	{
		return prepo.queryPlayerUpdate(club,id);
	}
	
	@Tag(name = "Delete by Id Query Method for Players",description = "Delete Details by Id")
	@DeleteMapping("/ideletequery/{colour}")
	public String queryDelete(@PathVariable("id")int id)
	{
		prepo.queryPlayerDelete(id);
		return id+" was deleted successfully";
	}
	
	@Tag(name = "Get Like Query Method for Players",description = "Get Data by Like Method")
	@GetMapping("/ilike")
	public List<Players> queryLike()
	{
		return prepo.playerLike();
	}
}
