package model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Visnyei Gy�rgy
 *
 *
 *
 * Az {@link model.User} oszt�ly egy felhaszn�l�t reprezent�l.
 * Egy {@link model.User} p�ld�ny egy felhaszn�l�t szeml�ltet.
 * 
 * <pre>
 * {@code
 * User user = new User(1, "felh1", "Kiss Pista", "Pontaz1",  15000);
 * System.out.println(user.toString());
 * }
 * </pre>
 */
public class User {
	
	/**
	 * A user id-t t�rolja.
	 */
	public IntegerProperty userId;
	
	/**
	 * A user felhaszn�l� nev�t t�rolja.
	 */
	public StringProperty userName;
	
	/**
	 * A user teljes nev�t t�rolja.
	 */
	public StringProperty fullName;
	
	/**
	 * A user jelszav�t t�rolja.
	 */
	public StringProperty password;
	
	/**
	 * A user egyenleg�t t�rolja.
	 */
	public IntegerProperty coins;
	
	/**
	 * Az oszt�ly konstruktora itt p�ld�nyos�tunk felhaszn�l�t.
	 * @param userId a felhaszn�l� azonos�t�ja 
	 * @param userName a felhaszn�l� userneve 
	 * @param fullName a felhaszn�l� teljes neve
	 * @param password a felhaszn�l� jelszava
	 * @param coins a felhaszn�l� egyenlege
	 * 
	 * @see javafx.beans.property.SimpleIntegerProperty
	 * @see javafx.beans.property.SimpleStringProperty
	 */
	public User(int userId, String userName, String fullName, String password, int coins) {
		super();
		this.userId = new SimpleIntegerProperty(userId);
		this.userName = new SimpleStringProperty(userName);
		this.fullName = new SimpleStringProperty(fullName);
		this.password = new SimpleStringProperty(password);
		this.coins = new SimpleIntegerProperty(coins);
		
	}
	
	/**
	 * A f�ggv�ny visszaadja a felhaszn�l� azonos�t�j�t.
	 * @return a felhaszn�l� azonos�t�ja
	 * @see IntegerProperty
	 */
	public IntegerProperty getUserId() {
		return userId;
	}
	
	/**
	 * Be�ll�tija a felhaszn�l� azonos�t�j�t.
	 * @param userId a felhaszn�l� azonos�t�ja.
	 */
	public void setUserId(IntegerProperty userId) {
		this.userId = userId;
	}
	
	/**
	 * A f�ggv�ny visszaadja a felhaszn�l� nev�t.
	 * @return a felhaszn�l� neve
	 * @see StringProperty
	 */
	public StringProperty getUserName() {
		return userName;
	}
	
	/**
	 * Be�ll�tija a felhaszn�l� nev�t.
	 * @param userName a felhaszn�l� neve.
	 */
	public void setUserName(StringProperty userName) {
		this.userName = userName;
	}
	
	/**
	 * A f�ggv�ny visszaadja a felhaszn�l� teljes nev�t.
	 * @return a felhaszn�l� teljes neve
	 * @see StringProperty
	 */
	public StringProperty getFullName() {
		return fullName;
	}
	
	/**
	 * Be�ll�tija a felhaszn�l� teljes nev�t.
	 * @param fullName a felhaszn�l� teljes neve.
	 */
	public void setFullName(StringProperty fullName) {
		this.fullName = fullName;
	}
	
	/**
	 * A f�ggv�ny visszaadja a felhaszn�l� jelszav�t.
	 * @return a felhaszn�l� jelszava
	 * @see StringProperty
	 */
	public StringProperty getPassword() {
		return password;
	}
	
	/**
	 * Be�ll�tija a felhaszn�l� jelszav�t.
	 * @param password a felhaszn�l� jelszava.
	 */
	public void setPassword(StringProperty password) {
		this.password = password;
	}
	
	/**
	 * A f�ggv�ny visszaadja a felhaszn�l� egyenleg�t.
	 * @return a felhaszn�l� egyenlege
	 * @see IntegerProperty
	 */
	public IntegerProperty getCoins() {
		return coins;
	}
	
	/**
	 * Be�ll�tija a felhaszn�l� egyenleg�t.
	 * @param coins a felhaszn�l� egyenlege.
	 */
	public void setCoins(IntegerProperty coins) {
		this.coins = coins;
	}
	
	/**
	 * Ki�rja egy User objektum atributumainak sz�veg�t.
	 * @return a User objektum sz�veges alakja
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", fullName=" + fullName + ", password=" + password
				+ ", coins=" + coins + "]";
	}

	
	
}