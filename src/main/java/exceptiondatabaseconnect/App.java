package exceptiondatabaseconnect;
import java.util.logging.*;
import java.util.*;

public class App 
{
    private static Scanner scan;

	public static void main( String[] args )
    {
    scan = new Scanner(System.in);
	Logger log=Logger.getLogger("hi");
        log.info("Enter URL");
        String url=scan.nextLine();
        log.info("Enter Username");
        String username=scan.nextLine();
        log.info("Enter Password");
        String password=scan.nextLine();
        Database s2=Database.s1(url, username, password);
        System.out.println(s2);
        int option = 0;
		while(option<3)
        {
        log.info("1.connect  2.close  3.exit");
        option=scan.nextInt();
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
}
