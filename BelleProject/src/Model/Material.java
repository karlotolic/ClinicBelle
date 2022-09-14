package Model;

public class Material {

	
	private String name;
private	double price;
private String supplier;
private int stock;
public Material(String name, double price, String supplier, int stock) {
	
	this.name = name;
	this.price = price;
	this.supplier = supplier;
	this.stock = stock;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getSupplier() {
	return supplier;
}
public void setSupplier(String supplier) {
	this.supplier = supplier;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}

}
