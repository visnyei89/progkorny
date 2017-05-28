package controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Item;
import model.User;



public class Controller implements Initializable {
	
	User user = null;
	
	@FXML
    private TextField textUser;
	
	public TextField getTextUser() {
		return textUser;
	}

	public void setTextUser(String textUser ) {
		this.textUser.setText(textUser);
	}
	
	@FXML
    private TextField textCredit;

	public TextField getTextCredit() {
		return textCredit;
	}

	public void setTextCredit(String textCredit) {
		this.textCredit.setText(textCredit);
	}
	
	@FXML
    private TextField textOsszeg;

	public TextField getTextOsszeg() {
		return textOsszeg;
	}

	public void setTextOsszeg(String textOsszeg) {
		this.textOsszeg.setText(textOsszeg);
	}

	@FXML
    private TextField textFeltolt;

	public TextField getTextFeltolt() {
		return textFeltolt;
	}

	public void setTextFeltolt(String textFeltolt) {
		this.textFeltolt.setText(textFeltolt);
	}
	
	
    @FXML
    private TableView<Item> keszlet;
    @FXML
    TableColumn keszletitemId;
    @FXML
    TableColumn keszletitemName;
    @FXML
    TableColumn keszletdesc;
    @FXML
    TableColumn keszletprice;
    @FXML
    TableColumn keszletquantity;
 
    @FXML
    private TableView<Item> kosar;
    @FXML
    TableColumn kosaritemId;
    @FXML
    TableColumn kosaritemName;
    @FXML
    TableColumn kosardesc;
    @FXML
    TableColumn kosarprice;
    @FXML
    TableColumn kosarquantity;
    
    @FXML
    private void kosarbarak(ActionEvent event) {
    	
    	if (keszlet.getSelectionModel().getSelectedItem()!=null)
    	{
    	String SPsql = "EXEC addItem ?,?,?,?";
	    try {
	    	int ret = 0;
	    	PreparedStatement ps = DbConnection.conn.prepareStatement(SPsql);
	    	ps.setEscapeProcessing(true);
	    	ps.setInt(1, user.getUserId().get());
	    	ps.setInt(2, keszlet.getSelectionModel().getSelectedItem().getItemId().get());
	    	ps.setInt(3, 1);
	    	ps.setInt(4, ret);
	    	ps.execute();
	    	Stockdb();
			Basketdb(user.getUserId().get());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	}
    }
	
    @FXML
    private void kosartorol(ActionEvent event) {
    	
    	if (kosar.getSelectionModel().getSelectedItem()!=null)
    	{
    	String SPsql = "EXEC addItem ?,?,?,?";
	    try {
	    	int ret = 0;
	    	PreparedStatement ps = DbConnection.conn.prepareStatement(SPsql);
	    	ps.setEscapeProcessing(true);
	    	ps.setInt(1, user.getUserId().get());
	    	ps.setInt(2, kosar.getSelectionModel().getSelectedItem().getItemId().get());
	    	ps.setInt(3, -1);
	    	ps.setInt(4, ret);
	    	ps.execute();
	    	Stockdb();
			Basketdb(user.getUserId().get());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	}
    }
	
    @FXML
    private void egyenlegfeltolt(ActionEvent event) {
    	
    	if (getTextFeltolt()!=null&& Integer.parseInt(getTextFeltolt().getText())>0 )
    	{
    	String SPsql = "EXEC coinChange ?,?,?";
	    try {
	    	PreparedStatement ps = DbConnection.conn.prepareStatement(SPsql);
	    	ps.setEscapeProcessing(true);
	    	ps.setInt(1, user.getUserId().get());
	    	ps.setInt(2, 0);
	    	ps.setInt(3, Integer.parseInt(getTextFeltolt().getText()));
	    	ps.execute();
	    	Userdb();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	}
    }
	
    @FXML
    private void fizet(ActionEvent event) {
    	
    
    	String SPsql = "EXEC payment ?";
	    try {
	    	PreparedStatement ps = DbConnection.conn.prepareStatement(SPsql);
	    	ps.setEscapeProcessing(true);
	    	ps.setInt(1, user.getUserId().get());
	    	ps.execute();
	    	Stockdb();
			Basketdb(user.getUserId().get());
			Userdb();
			setTextOsszeg(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	}
    }
    
	public User Userdb()
	{	
		
		DbConnection.createConnection();
		Statement stmt = null;  
	    String SQL = "SELECT id,username,concat(firstname,' ',lastname),password,coins FROM users where id=33";
	    try {
			stmt = DbConnection.conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
	        if(rs.next()) {
	        	user=new User(Integer.parseInt(rs.getString(1)) ,rs.getString(2),rs.getString(3),rs.getString(4),Integer.parseInt(rs.getString(5)));
	        	setTextUser(rs.getString(3));
	        	setTextCredit(rs.getString(5));
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		
	}
	
	public void Stockdb()
	{
		DbConnection.createConnection();
		Statement stmt = null;  
	    String SQL = "SELECT itemid,itemname,description,price,quantity FROM Stock where quantity!=0";
	    try {
	    	stmt = DbConnection.conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
	    	ObservableList<Item> list = FXCollections.observableArrayList();
	    	List<Item> Itemek = new ArrayList<Item>();
	    	while(rs.next()) Itemek.add(new Item(rs.getInt(1) , rs.getString(2), rs.getString(3), rs.getInt(4) , rs.getInt(5)));
	    	list.addAll(Itemek);
	        keszlet.setItems(list);
	        keszlet.refresh();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Basketdb(int userid)
	{
		DbConnection.createConnection();
		Statement stmt = null;  
	    String SQL = "SELECT itemid,itemname,description,price,quantity,orderprice FROM OrderView where userId="+userid+" and orderstatusid=1";
	    try {
	    	stmt = DbConnection.conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
	    	ObservableList<Item> list = FXCollections.observableArrayList();
	    	List<Item> Itemek = new ArrayList<Item>();
	    	while(rs.next()){
	    		Itemek.add(new Item(rs.getInt(1) , rs.getString(2), rs.getString(3), rs.getInt(4) , rs.getInt(5)));
	    		setTextOsszeg(rs.getString(6));
	    	}
	    	list.addAll(Itemek);
	    	kosar.setItems(list);
	    	kosar.refresh();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		Userdb();
		Stockdb();
		Basketdb(user.getUserId().get());
       
	}
	
	

	
	
	

}
