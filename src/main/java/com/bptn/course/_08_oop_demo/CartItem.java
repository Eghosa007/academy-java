package com.bptn.course._08_oop_demo;

class CartItem {
	
	private Product product;
	private int cartQuantity;
	
	public CartItem(Product product, int quantity) {
		
		if(quantity > product.getProductQuantity()) {
			throw new IllegalArgumentException("Insufficient stock!");
	}
		
		this.product = product;
		this.cartQuantity = quantity;
	}

        public Product getProduct() {
	    return this.product;
	    
    }
        
        public int getCartQuantity() {
    		return this.cartQuantity;
    		
    }

        
        public double getTotalprice() {
        	return product.getProductPrice() * this.cartQuantity;
        	
    }
}
