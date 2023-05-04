package com.example.demo.SService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SRepository.PlayerRepo;
import com.example.demo.Soccer.Players;

@Service
public class PlayerService 
{
	@Autowired
	public PlayerRepo prepo;
	
	public Players postData(Players pl)
	{
		return prepo.save(pl);
	}
}
