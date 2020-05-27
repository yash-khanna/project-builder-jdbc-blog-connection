package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class ConnectionManager{
	
	public static Connection getConnection() throws Exception{
		
		Properties prop=loadPropertiesFile();
		Connection con=null;
		
		
		try {
		Class.forName(prop.getProperty("driver"));
		con=DriverManager.getConnection(prop.getProperty("url"),"system","oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	}
	
}
