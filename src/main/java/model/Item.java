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
 * Item item = new Item(1, "item1", "A legjobb árú", 100,  1000);
 * System.out.println(item.toString());
 * }
 * </pre>
 */
public class Item {
	
	/**
	 * Az item id-t tárolja.
	 */
	public IntegerProperty itemId;
	
	/**
	 * Az item nevét tárolja.
	 */
	public StringProperty itemName;
	
	/**
	 * Az item leirását tárolja.
	 */
	public StringProperty desc;
	
	/**
	 * Az item árát tárolja.
	 */
	public IntegerProperty price;
	
	/**
	 * A item mennyiségét tárolja.
	 */
	public IntegerProperty quantity;
	
	
	/**
	 * A konstruktor, itt példányosítunk itemet.
	 * @param itemId az item azonosítója 
	 * @param itemName az item neve 
	 * @param desc az item leírása
	 * @param price az item ára
	 * @param quantity az item mennyisége
	 * 
	 * @see javafx.beans.property.SimpleIntegerProperty
	 * @see javafx.beans.property.SimpleStringProperty
	 */
	public Item(int itemId, String itemName, String desc, int price, int quantity) {
		super();
		this.itemId = new SimpleIntegerProperty(itemId);
		this.itemName = new SimpleStringProperty(itemName);
		this.desc = new SimpleStringProperty(desc);
		this.price = new SimpleIntegerProperty(price);
		this.quantity = new SimpleIntegerProperty(quantity);
	}
	

	/**
	 * A függvény visszaadja az item azonosítóját.
	 * @return az item azonosítója
	 * @see IntegerProperty
	 */
	public IntegerProperty getItemId() {
		return itemId;
	}
	
	/**
	 * Beállítija az item azonosítóját.
	 * @param itemId a item azonosítója.
	 */
	public void setItemId(IntegerProperty itemId) {
		this.itemId = itemId;
	}

	/**
	 * A függvény visszaadja az item nevét.
	 * @return az item neve
	 * @see StringProperty
	 */
	public StringProperty getItemName() {
		return itemName;
	}

	/**
	 * Beállítija az item nevét.
	 * @param itemName az item neve
	 */
	public void setItemName(StringProperty itemName) {
		this.itemName = itemName;
	}

	/**
	 * A függvény visszaadja az item leirasát.
	 * @return az item leirasa
	 * @see StringProperty
	 */
	public StringProperty getDesc() {
		return desc;
	}

	/**
	 * Beállítija az item leirasát.
	 * @param desc az item leirasa.
	 */
	public void setDesc(StringProperty desc) {
		this.desc = desc;
	}

	/**
	 * A függvény visszaadja az item árát.
	 * @return az item ára.
	 * @see IntegerProperty
	 */
	public IntegerProperty getPrice() {
		return price;
	}

	/**
	 * Beállítija az item árát.
	 * @param price az item ára.
	 */
	public void setPrice(IntegerProperty price) {
		this.price = price;
	}

	/**
	 * A függvény visszaadja az item mennyiségét
	 * @return az item mennyisége
	 * @see IntegerProperty
	 */
	public IntegerProperty getQuantity() {
		return quantity;
	}

	/**
	 * Beállítija az item mennyiségét.
	 * @param quantity az item mennyisége.
	 */
	public void setQuantity(IntegerProperty quantity) {
		this.quantity = quantity;
	}

	/**
	 * Kiírja egy Item objektum atributumainak szövegét.
	 * @return az Item okjektum szöveges alakja
	 */
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", desc=" + desc + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	

	
}