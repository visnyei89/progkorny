package model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Visnyei György
 *
 *
 *
 * Az {@link model.User} osztály egy felhasználót reprezentál.
 * Egy {@link model.User} példány egy felhasználót szemléltet.
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
	 * A user id-t tárolja.
	 */
	public IntegerProperty userId;
	
	/**
	 * A user felhasználó nevét tárolja.
	 */
	public StringProperty userName;
	
	/**
	 * A user teljes nevét tárolja.
	 */
	public StringProperty fullName;
	
	/**
	 * A user jelszavát tárolja.
	 */
	public StringProperty password;
	
	/**
	 * A user egyenlegét tárolja.
	 */
	public IntegerProperty coins;
	
	/**
	 * Az osztály konstruktora itt példányosítunk felhasználót.
	 * @param userId a felhasználó azonosítója 
	 * @param userName a felhasználó userneve 
	 * @param fullName a felhasználó teljes neve
	 * @param password a felhasználó jelszava
	 * @param coins a felhasználó egyenlege
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
	 * A függvény visszaadja a felhasználó azonosítóját.
	 * @return a felhasználó azonosítója
	 * @see IntegerProperty
	 */
	public IntegerProperty getUserId() {
		return userId;
	}
	
	/**
	 * Beállítija a felhasználó azonosítóját.
	 * @param userId a felhasználó azonosítója.
	 */
	public void setUserId(IntegerProperty userId) {
		this.userId = userId;
	}
	
	/**
	 * A függvény visszaadja a felhasználó nevét.
	 * @return a felhasználó neve
	 * @see StringProperty
	 */
	public StringProperty getUserName() {
		return userName;
	}
	
	/**
	 * Beállítija a felhasználó nevét.
	 * @param userName a felhasználó neve.
	 */
	public void setUserName(StringProperty userName) {
		this.userName = userName;
	}
	
	/**
	 * A függvény visszaadja a felhasználó teljes nevét.
	 * @return a felhasználó teljes neve
	 * @see StringProperty
	 */
	public StringProperty getFullName() {
		return fullName;
	}
	
	/**
	 * Beállítija a felhasználó teljes nevét.
	 * @param fullName a felhasználó teljes neve.
	 */
	public void setFullName(StringProperty fullName) {
		this.fullName = fullName;
	}
	
	/**
	 * A függvény visszaadja a felhasználó jelszavát.
	 * @return a felhasználó jelszava
	 * @see StringProperty
	 */
	public StringProperty getPassword() {
		return password;
	}
	
	/**
	 * Beállítija a felhasználó jelszavát.
	 * @param password a felhasználó jelszava.
	 */
	public void setPassword(StringProperty password) {
		this.password = password;
	}
	
	/**
	 * A függvény visszaadja a felhasználó egyenlegét.
	 * @return a felhasználó egyenlege
	 * @see IntegerProperty
	 */
	public IntegerProperty getCoins() {
		return coins;
	}
	
	/**
	 * Beállítija a felhasználó egyenlegét.
	 * @param coins a felhasználó egyenlege.
	 */
	public void setCoins(IntegerProperty coins) {
		this.coins = coins;
	}
	
	/**
	 * Kiírja egy User objektum atributumainak szövegét.
	 * @return a User objektum szöveges alakja
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", fullName=" + fullName + ", password=" + password
				+ ", coins=" + coins + "]";
	}

	
	
}