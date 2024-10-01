package com.bptn.course._08_oop_demo;

class ShoppingCart {

	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {
		items = new CartItem[5];
		itemCount = 0;
	}
	
	//add product to cart
	public void addProducttoCart(Product product, int quantity) {
		if(itemCount<=4) {
		
		CartItem newItem = new CartItem(product, quantity);
		items[itemCount] = newItem;
		itemCount++;
		product.reduceStock(quantity);
	} else {
		throw new IllegalArgumentException("cart full!");
		
	    }
	}
	
	
	//show product in cart

	//showProductsInCart
	public CartItem[] showProductsInCart() {
		CartItem[] currentItems = new CartItem[itemCount];
		// loop through the array to get the item data
		for(int i=0; i<itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;
	}
	

}
