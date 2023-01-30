package databaseconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
class Database{
	String url;
	String username;
	String password;
	Connection con;
	
	private Database(String url,String username,String password) {
		this.url=url;
		this.username=username;
		this.password=password;
	}
	
	public static Database s1(String url,String username,String password){
		return new Database(url,username,password);
	}
	
	void connect() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection Successfully");
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
	void close() {
		try {
		con.close();
		System.out.println("Connection Closed");
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
	void exit() {
		System.out.println("Exit");
	}
}
public class App 
{
    private static Scanner scan;

	public static void main( String[] args )
    {
        scan = new Scanner(System.in);
        System.out.println("Enter URL");
        String url=scan.nextLine();
        System.out.println("Enter Username");
        String username=scan.nextLine();
        System.out.println("Enter Password");
        String password=scan.nextLine();
        System.out.println("1.connect  2.close  3.exit");
        int option=scan.nextInt();
        Database s2=Database.s1(url, username, password);
        if(option==1)
        {
        s2.connect();
        }
        else if(option==2)
        {
        s2.close();
        }
        else
        {
        s2.exit();	
        }
    }
}
