
package hospital1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Hospital1 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    try{
       Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
       Statement stmt = (Statement) conn.createStatement();
       
       System.out.println("please enter pid to serach:");
       int pid=sc.nextInt();
       
       String sql="SELECT * FROM patient WHERE p_id='" + pid + "'";
       
       ResultSet rs= stmt.executeQuery(sql);
       
       while(rs.next()){
           System.out.println("Pid: " + rs.getInt("p_id"));
           System.out.println("Name: " + rs.getString("p_name"));
       }
               
        
        
    }
    catch(Exception e)
    {
        System.out.println("ERROR:" + e.getMessage());
    }    
                
    
    }
    
}
