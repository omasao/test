//------------------DBConector---------------------------------------------//

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



public class DBConnector {

	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
	private static String user="root";
	private static String password="mysql";



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
}

//-----------------TestUserDAO------------------------------------------------//

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
		ps.setString(2, password);
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
	}
}

//------------------TestUserDAO 追記１------------------------------------------------//

public void selectAll(){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="select*test_table";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
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
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, password);
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

//-------------------TestUserDAO 追記４-----------------------------------------//
public void updateUserNameByUserName(String oldName,String newName){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="update test_table set user_name=?where user_name=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, newName);
		ps.setString(2, oldName);
		int i=ps.executeUpdate();
		if(i>0){
			System.out.println(i+"件更新されました");
		}else{
			System.out.println("該当するデータはありませんでした");
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
//--------------------------TestUserDAO 追記５-------------------------------------------//

public void insert(int user_id,String name,String password){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="insert into test_table values(?,?,?)";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,user_id);
		ps.setString(2, name);
		ps.setString(3, password);
		int i=ps.executeUpdate();
		if(i>0){
			System.out.println(i+"件登録されました");
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

//-----------------------TestUserDAO 追記６---------------------------------------------//
public void delete(String name){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="delete from test_table "
}










//-----------------------Test----------------------------------------------------//

public class Test{
	public static void main(String[] args){
		TestUserDAO dao=new TestUserDAO();
		dao.select("taro","123");
	}
}
//---------------------Test 追記１-----------------------------------------------------//
	dao.selectAll();

//---------------------Test 追記２------------------------------------------------------//
	dao.selectByName("taro");

//------------------Test 追記３-----------------------------------------------------//
	dao.selectByPassword("123");

//--------------------Test 追記４-------------------------------------------------------//
	dao.updateUserNameByUserName("taro","suburo");

//-------------------Test 追記５-----------------------------------------------------//
	dao.insert(4,"shiro","012");





