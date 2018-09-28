import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 *
 */

/**
 * @author internousdev
 *
 */
public class DBConnector {

	private static String driverName="com.mysql.jdbc.Driver";

	private static String url="jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	private static String user="root";

	private static String password="mysql";


	//ーーーーーーーーーDBコネクターーーーーーーーーーーーーーーーーーーー//
public Connection getConnection(){
	Connection con=null;

try{
	Class.forName(driverName);
	con=DriverManager.getConnection(url,user,password);
}catch(ClassNotFoundException e){
	e.printStackTrace();
}catch (SQLException e){
	e.printStackTrace();
}
return con;


//-----------------DAO---------------------------------------------------------//

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestUserDAO{
	String name="";
	String password="";

public void select(String name,String password){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="select*from test_table where user_name=?and password=?";

	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, jpassword);
		ResultSet rs=ps.executeQuery();

		if(rs.next()){
			System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();

//------------------TestUserDAO 追記１------------------------------------------------//

public void selectAll(){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="select*test_table";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.excuteQuery();
		while(rs.next()){
			System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}

//----------------TestUserDAO 追記２-----------------------------------------------//
public void selectByName(String name){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="select*from test_table where user_name=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
}
//-----------------TestUserDAO 追記３-------------------------------------------------//
public void selectByPassword(String password){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="select*from test_table where password=?";
			try{

//-----------------------Test----------------------------------------------------//

public class Test{
	public static void main(String[] args){
		TestUserDAO dao=new TestUserDAO();
		dao.select("taro","123");
	}

//---------------------Test 追記１-----------------------------------------------------//
	dao.selectAll();

//---------------------Test 追記２------------------------------------------------------//
	dao.selectByName("taro");


}
}

