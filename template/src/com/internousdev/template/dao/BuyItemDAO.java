package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSet;
import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {
    private DBConnector dbConnector=new DBConnector();
    private Connection connection=dbConnector.getConnection();
    private BuyItemDTO buyItemDTO = new BuyItemDTO();

public BuyItemDTO getbuyitemInfo(){
	String sql="SELECT id,item_name,item_price FROM item_info_transaction";

	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()){
			buyItemDTO.setID(resultSet.getInt("id"));
		    buyItemDTO.setItemName(resultSet.getString("item_name));"
		    buyItemDTO.seItemPrice(resultSet.getString("item_price"))


		}catch(Exception e){
		}return buyItemDTO;
		}
		public BuyItemDTO getBuyItemDTO(){
			return buyitemDTO;
		}

}
