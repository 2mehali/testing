import java.sql.*;
public class DemoClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/abcd";
		String uname="";
		String pswd="root";
		String query="SELECT NAMEE FROM STUDENTS WHERE ID=3";
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url,uname,pswd);
Statement st= con.createStatement();
ResultSet rs = st.executeQuery(query);
rs.next();
String name = rs.getString(0);
System.out.println(name);
st.close();
con.close();
	}

}
