package LibGlobalPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlTableCollections {
public static String getActivationToken(String mail) throws SQLException {
		
		
		String url ="jdbc:mysql://162.55.48.199:3306/careonline_portal";
		
		String Username="colqa";
		
		String password="Mavens123";
		
		Connection connection= DriverManager.getConnection(url,Username, password);	
		
		System.out.println("Dp connected");
		
		String sql="SELECT token FROM users WHERE username='"+ mail +"'";
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(sql);
		
		result.next();
		String token=result.getString("token");
		System.out.println("token-->"+token);
		return token;
		
		
		
	}

}
