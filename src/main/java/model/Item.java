package model;



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
 * Item item = new Item(1, "item1", "A legjobb �r�", 100,  1000);
 * System.out.println(item.toString());
 * }
 * </pre>
 */
public class Item {
	
	/**
	 * Az item id-t t�rolja.
	 */
	public int itemId;
	
	/**
	 * Az item nev�t t�rolja.
	 */
	public String itemName;
	
	/**
	 * Az item leir�s�t t�rolja.
	 */
	public String desc;
	
	/**
	 * Az item �r�t t�rolja.
	 */
	public int price;
	
	/**
	 * A item mennyis�g�t t�rolja.
	 */
	public int quantity;
	
	
	/**
	 * A konstruktor, itt p�ld�nyos�tunk itemet.
	 * @param itemId az item azonos�t�ja 
	 * @param itemName az item neve 
	 * @param desc az item le�r�sa
	 * @param price az item �ra
	 * @param quantity az item mennyis�ge
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
	 * A f�ggv�ny visszaadja az item azonos�t�j�t.
	 * @return az item azonos�t�ja
	 * @see int
	 */
	public int getItemId() {
		return itemId;
	}
	
	/**
	 * Be�ll�tija az item azonos�t�j�t.
	 * @param itemId a item azonos�t�ja.
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * A f�ggv�ny visszaadja az item nev�t.
	 * @return az item neve
	 * @see String
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * Be�ll�tija az item nev�t.
	 * @param itemName az item neve
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * A f�ggv�ny visszaadja az item leiras�t.
	 * @return az item leirasa
	 * @see String
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Be�ll�tija az item leiras�t.
	 * @param desc az item leirasa.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * A f�ggv�ny visszaadja az item �r�t.
	 * @return az item �ra.
	 * @see int
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Be�ll�tija az item �r�t.
	 * @param price az item �ra.
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * A f�ggv�ny visszaadja az item mennyis�g�t
	 * @return az item mennyis�ge
	 * @see int
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Be�ll�tija az item mennyis�g�t.
	 * @param quantity az item mennyis�ge.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Ki�rja egy Item objektum atributumainak sz�veg�t.
	 * @return az Item okjektum sz�veges alakja
	 */
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", desc=" + desc + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	

	
}