package com.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class Controller {

    @GetMapping("")
    @CrossOrigin(origins = "http://localhost:4200")
    public String coolCars() {
//    	String s="helloo";
//    	return s;
//    
    	String sql="";
    	String sql2="";
    	try {

    		Class.forName("oracle.jdbc.driver.OracleDriver");

    		}catch (Exception e) {

    			// TODO: handle exception

    			System.out.println(e);



    		}

    		try {

    		Connection connection = null;

    		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys "
    				+ "as sysdba","randomPass123");

    		System.out.println("It's working!");

    		Statement stmt = connection.createStatement();  
    		  
    		//execute query  
    		//TYPE QUERY HERE
    		ResultSet rs=stmt.executeQuery("select * from student");
    		while(rs.next()) { 
    		sql2=rs.getString(1)+" "+rs.getString(2);  
    		sql=sql.concat(sql2);
    		}
    		
    		

    		
    		System.out.println("Query executed!");
    		connection.close();

    		}catch (Exception e) {

    			// TODO: handle exception

    			System.out.println(e);

    				

    		}
    		
    		return sql;
    }
    public static void main(String args[]){
    	

    }
}
