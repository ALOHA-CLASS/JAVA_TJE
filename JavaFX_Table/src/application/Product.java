package application;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Product {
	
	private SimpleStringProperty productName;
	private SimpleDoubleProperty productPrice;
	private SimpleIntegerProperty productQuantity;
	
	public Product(String productName, double productPrice, int productQuantity) {
		this.productName = new SimpleStringProperty(productName);
		this.productPrice = new SimpleDoubleProperty(productPrice);
		this.productQuantity = new SimpleIntegerProperty(productQuantity);
	}

	public String getProductName() {
		return productName.get();
	}

	public void setProductName(String productName) {
		this.productName = new SimpleStringProperty(productName);
	}

	public double getProductPrice() {
		return productPrice.get();
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = new SimpleDoubleProperty(productPrice);
	}

	public int getProductQuantity() {
		return productQuantity.get();
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = new SimpleIntegerProperty(productQuantity);
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + ", productQuantity="
				+ productQuantity + "]";
	}
	
	

}
