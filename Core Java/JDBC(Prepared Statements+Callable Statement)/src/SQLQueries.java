import java.sql.*;

public class SQLQueries{
    
    static public Connection c;
    static public Statement s;
 
    public static void main(String[] args) throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employee","root","");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Printing the first row of table using ResultSet interface");
        ResultSet rs=s.executeQuery("select * from employee_details");  
        rs.absolute(1);  
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
        
        System.out.println("Inserting values using prepared statement");
        PreparedStatement prepstmt = c.prepareStatement("insert into employee_details values(?,?,?,?,?)");
        prepstmt.setInt(1, 3);
        prepstmt.setString(2,"Diana");
        prepstmt.setString(3,"Prince");
        prepstmt.setInt(4,15000);
        prepstmt.setString(5,"Advertising");
        int numRecords = prepstmt.executeUpdate();
        System.out.println(numRecords+" inserted");
        rs=s.executeQuery("select * from employee_details");  
        rs.absolute(3);  
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
        
        System.out.println("Inserting values by using CallableStatement(Calling stored procedure InsertRecords)");
        CallableStatement stmt=c.prepareCall("{call InsertRecords(?,?,?,?,?)}");  
        stmt.setInt(1,4);  
        stmt.setString(2,"Amit");
        stmt.setString(3,"Joshi");  
        stmt.setInt(4,10000);  
        stmt.setString(5,"Sales");  
        stmt.execute();  
        
    }
}
 
