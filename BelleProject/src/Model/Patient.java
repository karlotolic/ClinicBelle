package Model;

public class Patient {
	private int cpr;
    private String name;
    private String surname;
    private String sex;
    private String address;
    private String city;
    private String areaCode;
    private String phone;
    private String status;
    private boolean hepatitis;
    private boolean aids;
    private boolean herpes;
    private boolean heart;
    private boolean diabetes;
    private boolean allergie;
	public Patient(int cpr, String name, String surname, String sex, String address, String city, String areaCode,
			String phone, String status, boolean hepatitis, boolean aids, boolean herpes, boolean heart,
			boolean diabetes, boolean allergie) {
		super();
		this.cpr = cpr;
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.address = address;
		this.city = city;
		this.areaCode = areaCode;
		this.phone = phone;
		this.status = status;
		this.hepatitis = hepatitis;
		this.aids = aids;
		this.herpes = herpes;
		this.heart = heart;
		this.diabetes = diabetes;
		this.allergie = allergie;
	}
	public int getCpr() {
		return cpr;
	}
	public void setCpr(int cpr) {
		this.cpr = cpr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isHepatitis() {
		return hepatitis;
	}
	public void setHepatitis(boolean hepatitis) {
		this.hepatitis = hepatitis;
	}
	public boolean isAids() {
		return aids;
	}
	public void setAids(boolean aids) {
		this.aids = aids;
	}
	public boolean isHerpes() {
		return herpes;
	}
	public void setHerpes(boolean herpes) {
		this.herpes = herpes;
	}
	public boolean isHeart() {
		return heart;
	}
	public void setHeart(boolean heart) {
		this.heart = heart;
	}
	public boolean isDiabetes() {
		return diabetes;
	}
	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}
	public boolean isAllergie() {
		return allergie;
	}
	public void setAllergie(boolean allergie) {
		this.allergie = allergie;
	}
    
    

}
