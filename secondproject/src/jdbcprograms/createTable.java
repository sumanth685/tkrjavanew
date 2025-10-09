package jdbcprograms;




	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;


	public class createTable {
	    public static void main(String[] args) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/new", "root", "1234");

	            Statement stmt = con.createStatement();
	            String sql = "CREATE TABLE childrens (" +
	                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
	                         "name VARCHAR(50), " +
	                         "age INT)";
	            stmt.executeUpdate(sql);

	            System.out.println("✅ Table Created Successfully!");
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	