package model;



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
	public int itemId;
	
	/**
	 * Az item nevét tárolja.
	 */
	public String itemName;
	
	/**
	 * Az item leirását tárolja.
	 */
	public String desc;
	
	/**
	 * Az item árát tárolja.
	 */
	public int price;
	
	/**
	 * A item mennyiségét tárolja.
	 */
	public int quantity;
	
	
	/**
	 * A konstruktor, itt példányosítunk itemet.
	 * @param itemId az item azonosítója 
	 * @param itemName az item neve 
	 * @param desc az item leírása
	 * @param price az item ára
	 * @param quantity az item mennyisége
	 * 
	 * @see javafx.beans.property.Simpleint
	 * @see javafx.beans.property.SimpleString
	 */
	public Item(int itemId, String itemName, String desc, int price, int quantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.desc = desc;
		this.price = price;
		this.quantity = quantity;
	}
	

	/**
	 * A függvény visszaadja az item azonosítóját.
	 * @return az item azonosítója
	 * @see int
	 */
	public int getItemId() {
		return itemId;
	}
	
	/**
	 * Beállítija az item azonosítóját.
	 * @param itemId a item azonosítója.
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * A függvény visszaadja az item nevét.
	 * @return az item neve
	 * @see String
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * Beállítija az item nevét.
	 * @param itemName az item neve
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * A függvény visszaadja az item leirasát.
	 * @return az item leirasa
	 * @see String
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Beállítija az item leirasát.
	 * @param desc az item leirasa.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * A függvény visszaadja az item árát.
	 * @return az item ára.
	 * @see int
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Beállítija az item árát.
	 * @param price az item ára.
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * A függvény visszaadja az item mennyiségét
	 * @return az item mennyisége
	 * @see int
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Beállítija az item mennyiségét.
	 * @param quantity az item mennyisége.
	 */
	public void setQuantity(int quantity) {
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