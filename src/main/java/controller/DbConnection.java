package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Visnyei György
 *
 */

/**
 * A {@link controller.DbConnection} Ez az osztály teszi lehetővé a db-vel való kommunikálást.
 *
 */
public class DbConnection {
	

	/**
	 * A logoláshoz szükséges változó.
	 */
	private static Logger logger = LoggerFactory.getLogger(DbConnection.class);
	
	/**
	 * Egy Connection objektum ami a db kapcsolatért felelős
	 */
	public static Connection conn = null;
	
	
	
	/**
	 * Megnyitja az adatbázis kapcsolatot.
	 * @return a megnyitott adatbázis kapcsolat
	 * @see Connection
	 */
	public static  Connection createConnection(){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	        conn =  DriverManager.getConnection("jdbc:sqlserver://progkorny.database.windows.net:1433;databaseName=webshop;user=progkorny;password=Kukimuki1"); 
			logger.info("Sikeres db connection");
			
		} catch(SQLException e){
			logger.error("Sikertelen db connection");
			e.printStackTrace();
			System.exit(-1);
		} catch (ClassNotFoundException e) {
			logger.error("Sikertelen db connection, váratlan hiba");
			e.printStackTrace();
		}
		return  conn;
	}
	
	
	/**
	 * Bezárja az adatbázis kapcsolatot.
	 * @return a bontott adatbázis kapcsolat
	 * @see Connection
	 */
	public Connection closeConnection(){
		try {
			conn.close();
			logger.error("Sikeres db connection bontás");
		} catch (SQLException e) {
			logger.error("Sikertelen db connection bontás, váratlan hiba");
			e.printStackTrace();
		}
		return conn;
	}
}
