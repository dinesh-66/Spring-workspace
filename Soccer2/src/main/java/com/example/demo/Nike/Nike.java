package com.example.demo.Nike;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pstats")
public class Nike 
{
	@Id
	private int sno;
	private String player;
	private int age;
	private String country;
	private String club;
	private String role;
	private long matches;
	private long goals;
	private long assist;
	private int trophies;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getMatches() {
		return matches;
	}
	public void setMatches(long matches) {
		this.matches = matches;
	}
	public long getGoals() {
		return goals;
	}
	public void setGoals(long goals) {
		this.goals = goals;
	}
	public long getAssist() {
		return assist;
	}
	public void setAssist(long assist) {
		this.assist = assist;
	}
	public int getTrophies() {
		return trophies;
	}
	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}
	
	
}
