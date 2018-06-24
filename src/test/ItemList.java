package test;

public class ItemList {

//	private ItemList previousItem;
	private Item curItem;
	private Item head;
	
	public void add(Item itm) {
//		ItemList itl = new ItemList();
		
		//link the item
		if (curItem != null) 
			itm.next = this.curItem;
		
		this.curItem = itm;
		head = itm;
	}
	
	public void goNext() {
		curItem = curItem.next;
	}
	
	public void goHead() {
		curItem = head;
	}
	
	
//	public void next() {
//		curItem = nextItem.curItem;
//	}
//	public void pre() {
//		curItem = previousItem.curItem;
//	}
	
	public static void main(String[] args) {
		ItemList IL = new ItemList();
		Item[] it_arr = {
				new Item(9),
				new Item(8)
				};
		IL.add(it_arr[0]);
		IL.add(it_arr[1]);
		
//		IL.curItem = IL.head;
		while(IL.curItem != null) {
			System.out.println("IL.curItem: " + IL.curItem.toString());
			IL.goNext();
		}
		
		IL.goHead();
		while(IL.curItem != null) {
			System.out.println("2nd Round, IL.curItem: " + IL.curItem.toString());
			IL.goNext();
		}
		
//		System.out.println(IL.curItem.toString());
		
	}
}
