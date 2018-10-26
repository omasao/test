package com.internousdev.template1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template1.dto.BuyItemDTO;
import com.internousdev.template1.util.DBConnector;


public class BuyItemDAO {
	public BuyItemDTO getBuyItemInfo(){

		BuyItemDTO dto=new BuyItemDTO();
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="select id,item_name,item_price from item_info_transaction";


		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemName(rs.getString("itemPrice"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return dto;

	}

}
