package ecochef_proto;
import java.sql.*;


public class EcoChefDB {
	
	private String dbName;
	private String dbUser;
	private String userPassword;
	private String url;
	
	
	public EcoChefDB() {
		
		this.dbName = "ecochef";
		this.dbUser = "postgres";
		this.userPassword = "password";
		this.url = "jdbc:postgresql://localhost:5432/" + dbName;
	}
	
	public void addToList(String type, String name, double cost, int consumption) {
		
		Statement statement;
	    ResultSet resultSet = null;
	        try {
	        	Connection conn = DriverManager.getConnection(url, dbUser, userPassword);
	            statement = conn.createStatement();
	            resultSet = statement.executeQuery("INSERT INTO Appliances (type, name, cost, consumption)\r\n"
	            		+ "VALUES ('"+type+"', '"+name+"', "+cost+", "+consumption+");");
	            conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
	public String getFromList(String appliance) {
		Statement statement;
	    ResultSet resultSet = null;
	    String prepStatement = "SELECT *\r\n"
        		+ "FROM Appliances\r\n"
        		+ "WHERE type = '"+appliance+"'"
				+ "LIMIT 5;";
	    
	        try {
	        	Connection conn = DriverManager.getConnection(url, dbUser, userPassword);
	            statement = conn.createStatement();
	            resultSet = statement.executeQuery(prepStatement);
	            
	            
	            ResultSetMetaData rsmd = resultSet.getMetaData();
	            int columnCount = rsmd.getColumnCount();

	            
	            while (resultSet.next()) {
	                for (int i = 1; i <= columnCount; i++) {
	                    String columnName = rsmd.getColumnName(i);
	                    String columnValue = resultSet.getString(i);
	                    System.out.print(columnName + ": " + columnValue + " | ");
	                }
	                System.out.println();
	            }
	            
	            conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    return null;
	}
	
	public String search(String str){
		SearchFunctions search = new SearchFunctions();
		str = search.inputFix(str);
		
	    switch (str) {
			case "stove":
				getFromList(str);
				break;
			case "dishwasher":
				getFromList(str);
				break;
			case "freezer":
			    // code block
				getFromList(str);
					break;
			case "fridge":
			    // code block
				getFromList(str);
					break;
			case "grill":
		    // code block
				getFromList(str);
				break;	
			case "oven":
			    // code block
				getFromList(str);
					break;
			case "deepfryer":
		    // code block
				getFromList(str);
				break;	
			case "steamtable":
			    // code block
				getFromList(str);
					break;	
				
		  default:
			  System.out.println("Sorry, no such appliance.");
		
		
		}
		return null;
	}
	
	
	
}


