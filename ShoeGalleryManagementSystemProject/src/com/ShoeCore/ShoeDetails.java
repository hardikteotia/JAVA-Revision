/*
 * Shoe_Gallery Details:
Shoe_Id (int) (unique should be generated automatically),
Name (String),
Brand (String),
Ratings (int) (scale between 1 to 10),
Price (double),
availableInGallery (boolean: True/False),*/

package com.ShoeCore;

public class ShoeDetails {
	public static int NextShoe_Id = 100;
	private static int totalShoes = 0;
	private int Shoe_Id;
	private String Name;
	private String Brand;
	private int Ratings;
	private double Price;
	private boolean isAvailableInGallery = true;
	private Shoe_Type type;
	
	//constructor
	public ShoeDetails(String Name, String Brand, int Ratings, double Price, 
			 Shoe_Type type) {
		this.Shoe_Id = NextShoe_Id++;
		this.Name = Name;
		this.Brand = Brand;
		this.Ratings = Ratings;
		this.Price = Price;
		this.type = type;
		totalShoes++;
			
	}
	
	
	//To get shoe Id
	public int getShoe_Id() {
		return NextShoe_Id;
	}


	public String getName() {
		return Name;
	}

	public Shoe_Type getType() {
		return type;
	}

	public void setType(Shoe_Type type) {
		this.type = type;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getRatings() {
		return Ratings;
	}

	public void setRatings(int ratings) {
		Ratings = ratings;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public boolean isAvailableInGallery() {
		return isAvailableInGallery;
	}

	public void setAvailableInGallery(boolean isAvailableInGallery) {
		this.isAvailableInGallery = isAvailableInGallery;
	}

	public int getTotalShoes() {
		return totalShoes;
	}

	public void setTotalShoes(int totalShoes) {
		this.totalShoes = totalShoes;
	}


	@Override
	public String toString() {
		return "ShoeDetails [Shoe_Id=" + Shoe_Id + ", Name=" + Name + ", Brand=" + Brand + ", Ratings=" + Ratings
				+ ", Price=" + Price + ", isAvailableInGallery=" + isAvailableInGallery + ", type=" + type + "]";
	}

//	@Override
//	public String toString() {
//		return "ShoeDetails [ShoeID= "+ShoeDetails.getShoe_Id()+", Name=" + Name + ", Brand=" + Brand + ", Ratings=" + Ratings + ", Price=" + Price
//				+ ", isAvailableInGallery=" + isAvailableInGallery + ", totalShoes=" + totalShoes + ", type=" + type
//				+ "]";
//	}
	

	

	
	
	
	
	
	
	
}
