package com.ltts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.model.Player;

public class PlayerDao {
	List<Player> li= new ArrayList<Player>();
	

public Player getPlayerId(int id) {
	Player p = new Player(null, null, null, id, id, id, null, id);
	return p;
}


public boolean insertPlayer (Player p) throws Exception{
	Connection mc = Myconnection.getConnection();
	PreparedStatement ps =mc.prepareStatement("Insert into Player values()");
}
}