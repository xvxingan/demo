package com.xvxingan.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xvxingan.demo.entity.User;

@Repository
@Transactional(rollbackFor=Exception.class)
public class UserDao {
	
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	//@Resource(name="myDataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	 
	public void addUser(User user){
		try {
			Connection conn = dataSource.getConnection();
 			PreparedStatement preparedSt = conn.prepareStatement("insert into user values(?,?)");
			preparedSt.setInt(1, user.getAge());
			preparedSt.setString(2, user.getName());
			preparedSt.executeUpdate();
			
			preparedSt = conn.prepareStatement("insert into teacher1 values(?,?)");
			preparedSt.setInt(1, user.getAge());
			preparedSt.setString(2, user.getName());
			preparedSt.executeUpdate();
 			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
