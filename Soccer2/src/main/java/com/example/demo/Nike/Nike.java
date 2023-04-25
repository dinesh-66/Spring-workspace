package com.example.demo.Nike;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pstats")
public class Nike 
{
	@Id
	private int Sno;
	private String Player;
	private int Age;
	private String Country;
	private String Club;
	private String Role;
	private long Matches;
	private long Goals;
	private long Assist;
	private int Trophies;
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getPlayer() {
		return Player;
	}
	public void setPlayer(String player) {
		Player = player;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getClub() {
		return Club;
	}
	public void setClub(String club) {
		Club = club;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public long getMatches() {
		return Matches;
	}
	public void setMatches(long matches) {
		Matches = matches;
	}
	public long getGoals() {
		return Goals;
	}
	public void setGoals(long goals) {
		Goals = goals;
	}
	public long getAssist() {
		return Assist;
	}
	public void setAssist(long assist) {
		Assist = assist;
	}
	public int getTrophies() {
		return Trophies;
	}
	public void setTrophies(int trophies) {
		Trophies = trophies;
	}
	
}
