/*
 * 2) Solve below

2.1) Add a new Shoe record to the collection. (Add at least 4 new records in Collection)
2.2) Display all Shoe details.
2.3) Display all Shoe details sorted by Shoe id.
2.4) Search Shoe which is most expensive in Gallery.
2.5) Remove Shoe that are not available in the Gallery.
2.6) Update Shoe price based on brand.
2.7) Sort Shoe data as per price in descending order.
2.8) Exit from application.
*/


package com.ShoeGalleryServices;

import com.CustomShoeException.InvalidRatingException;
import com.CustomShoeException.InvalidShoeNameLengthException;
import com.CustomShoeException.InvalidShoeTypeException;
import com.ShoeCore.Shoe_Type;

public interface ShoeGalleryServicesInterface {
	
	public void AddShoeInGallery(String name, String brand, int ratings, double price, 
			 String type) throws InvalidShoeTypeException, InvalidShoeNameLengthException,
								 InvalidRatingException;
	
	public void DisplayAllShoes();
	
	public void DisplayAllShoesByIdSorted();
	
	public void MostExpensiveShoe();
	
	public void RemoveShoeNotInGallery();
	
	public void UpdateShoePrice();
	
	public void ShoesAsPerPriceDescending();
	
	
}
