![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | ProGrad Premier League Connection Manager


## Progression 1:

1. Create a class called as `ConnectionManager` with getConnection() method.
2. Create a Connection Object and called the getConnection() method in the SignUpController.
3. If the connection object is not null then print "Connection Established" else print "Check your connection".



### Note:

Use the below code to retreive the connection details from jdbc.properties to establish connection
```
public static Properties loadPropertiesFile() throws Exception {
	Properties prop = new Properties();	
	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	prop.load(in);
	in.close(); 
	return prop;
}
```    
```
#JDBC connection properties entry for ORACLE server
driver = oracle.jdbc.OracleDriver
url=jdbc:oracle:thin:SYSTEM/root@localhost:1521:xe
#username=SYSTEM
#password=root
```
**Sample Output**

```Connection established```

**Sample Output**

```Check your connection```
