package com.internousdev.template.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.sql.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;


public class UserCreateCompleteDAO {
   private DBConnector dbConnector = new DBConnetor();
   private DateUtil dateUtil = new DateUtil();
   private String sql = new DateUtil();
   public void createUser(String loginUserId,String loginPassword,String userName)throws 
   SQLException{
	   try{
		   PreparedStatement preparedStatement=connection.prepareStatement(sql);
		   preparedStatement.setString(1, loginUserId);
		   preparedStatentment.setString(2,loginUserPassword);
		   preparedStatentment.setString(3,userName);
		   preparedStatement.execute()
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		   connection.close();
	   }
   }
}
