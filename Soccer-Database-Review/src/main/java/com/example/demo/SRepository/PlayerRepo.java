package com.example.demo.SRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Soccer.Players;

import jakarta.transaction.Transactional;

public interface PlayerRepo extends JpaRepository<Players, Integer> 
{
	//Get All Details
		@Query(value="select * from players",nativeQuery = true)
		public List<Players> getAllData();
		
		//Get one particular data
		@Query(value="select * from players where playerid=:id",nativeQuery = true)
		public List<Players> getPlayerById(@Param("id")int id);
		
		//Get between two data
		@Query(value="select * from players where playerid between :start and :end",nativeQuery = true)
		public List<Players> getPlayerDataBetween(@Param("start")int start,@Param("end")int end);
		
		//Delete By ID
		@Modifying
		@Transactional
		@Query(value="delete from players where playerid=:num",nativeQuery = true)
		public void deletePlayerData(@Param("num")int num);
		
		//Update Data
		@Modifying
		@Transactional
		@Query(value="update players set favfoot=:value where playerid=:id",nativeQuery = true)
		public void updatePlayerDetails(@Param("value")String value,@Param("id")int id);
		
		//JPQL QUERY STATEMENT
		
		//Get By ID
		@Query("select i from Players i where i.playername=?1")
		public Players queryByName(@Param("name")String name);
		
		//Get Between
		@Query("select i from Players i where i.playerid between :start and :end")
		public List<Players> queryBetween(@Param("start")int start,@Param("end")int end);
		
		//Get method using like
		@Query(value="select s from Players s where s.playername like 'T%'")
		public List<Players> playerLike();
		
		//Update using JPQL Query
		@Modifying
		@Transactional
		@Query(value="update Players s set s.playerclub=?1 where s.playerid=?2")
		public Players queryPlayerUpdate(@Param("club")String club,@Param("id")int id);
		
		//Delete using JPQL Query
		@Modifying
		@Transactional
		@Query(value="delete from Players i where i.playerid=?1")
		public void queryPlayerDelete(@Param("colour")int id);
		
		@Query(value="select * from players where playerid=:id",nativeQuery = true)
		public List<Players> getDataById(int id);
}
