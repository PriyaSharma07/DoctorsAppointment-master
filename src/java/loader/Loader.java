

package loader;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Loader implements ServletContextListener{

    private static Connection conn;
    
    public static Connection getConnection()
    {
        return conn;
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("App Started");
        
        try
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Root", "root", "root");
            
            if( conn != null )
                System.out.println("DB Connected");
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("App Closed");
        try
        {
            conn.close();
            
            System.out.println("DB disconnected");
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
    
}
