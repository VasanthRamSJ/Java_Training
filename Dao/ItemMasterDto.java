package Dao;

public class ItemMasterDto {
	   private String itemName;
	   private int itemcost;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemcost() {
		return itemcost;
	}
	public void setItemcost(int itemcost) {
		this.itemcost = itemcost;
	}
	public ItemMasterDto(String itemName, int itemcost) {
		super();
		this.itemName = itemName;
		this.itemcost = itemcost;
	}
	public ItemMasterDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
}
