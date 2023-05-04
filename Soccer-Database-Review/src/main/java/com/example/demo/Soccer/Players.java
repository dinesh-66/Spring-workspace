package com.example.demo.Soccer;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="players")
public class Players 
{
	@Id
	private int playerid;
	private String playername;
	private String playerrole;
	private String playercountry;
	private String playerclub;
	private String playersalary;
	private String favfoot;
	private String jerseyno;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	public List<PlayerInfo> info;
	
	public List<PlayerInfo> getInfo() {
		return info;
	}
	public void setInfo(List<PlayerInfo> info) {
		this.info = info;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getPlayerrole() {
		return playerrole;
	}
	public void setPlayerrole(String playerrole) {
		this.playerrole = playerrole;
	}
	public String getPlayercountry() {
		return playercountry;
	}
	public void setPlayercountry(String playercountry) {
		this.playercountry = playercountry;
	}
	public String getPlayerclub() {
		return playerclub;
	}
	public void setPlayerclub(String playerclub) {
		this.playerclub = playerclub;
	}
	public String getPlayersalary() {
		return playersalary;
	}
	public void setPlayersalary(String playersalary) {
		this.playersalary = playersalary;
	}
	public String getFavfoot() {
		return favfoot;
	}
	public void setFavfoot(String favfoot) {
		this.favfoot = favfoot;
	}
	public String getJerseyno() {
		return jerseyno;
	}
	public void setJerseyno(String jerseyno) {
		this.jerseyno = jerseyno;
	}
	
}
