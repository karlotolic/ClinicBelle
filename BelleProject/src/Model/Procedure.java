package Model;

public class Procedure {
private int id;
private String name; 
private String price; 
private int x;
public Procedure(int id, String name, String price, int x) {
	
	this.id = id;
	this.name = name;
	this.price = price;
	this.x = x;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}


}
