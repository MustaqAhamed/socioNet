package com.vi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vi.beans.Users;

public class DBHelper {

	public int getLoginStatus(String uname, String pword) {
		int status= 0;
		System.out.println("entered name "+uname);
		ArrayList<Users> a = new ArrayList<>();
		DatabaseConnection db = new DatabaseConnection();
		Users u = null;
		Connection con= db.getConnection();
		String query= "select username,password from usersinfo" ;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
			ResultSet rs= ps.executeQuery();

			while(rs.next()) {
			u = new Users();
			u.setUsername(rs.getString(1));
			u.setPassword(rs.getString(2));
			if(u.getUsername().equals(uname)) {
				if(u.getPassword().equals(pword)) {
					status= 1; // successful login
					break;
				}else {
					status= -2;//password did not match
				}
			}else {
				status=-1; //user not found
			}
//			a.add(u);
			System.out.println("users "+u.toString());;
			}
			
			/*for(Users u1 :a) {
				if(u1.getUsername().equals(uname)) {
					if(u1.getPassword().equals(pword)) {
						status= 1; // successful login
					}else {
						status= -2;//password did not match
					}
				}else {
					status=-1; //user not found
				}
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return status;
	}

	public int newUser(String fname, String lname, String uname, String pword , String department ,String year, String dob, String gender) {
		int status=0;
		DatabaseConnection db = new DatabaseConnection();
		Users u = null;
		Connection con= db.getConnection();
		String query="insert into usersinfo values('"+fname+"','"+lname+"','"+uname+"','"+pword+"','"+department+"','"+year+"','"+dob+"','"+gender+"')";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
			status=ps.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Server Error..!!");
		}		
		return status;
	}

	public ArrayList<Users> getUsers() {
		ArrayList<Users> au = new ArrayList<>();
		DatabaseConnection db = new DatabaseConnection();
		Connection con= db.getConnection();
		String query = "select firstname,lastname,branch,year from usersinfo";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
			ResultSet rs= ps.executeQuery();

			while(rs.next()) {
			Users u1 = new Users();
u1.setFirstname(rs.getString(1));
u1.setLastname(rs.getString(2));
u1.setDepartment(rs.getString(3));
u1.setYear(rs.getString(4));
au.add(u1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Server Error..!!");
		}		
		return au;
	}
}
