package com.ShoeGalleryServices;
import com.CustomShoeException.*;
import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

import com.ShoeCore.ShoeDetails;
import com.ShoeCore.Shoe_Type;

public class ShoeGalleryServicesImplementatin implements ShoeGalleryServicesInterface{

	
	Map<Integer, ShoeDetails> ShoeGalleryMap = new HashMap<>();
//	Set<Integer> ids = ShoeGalleryMap.keySet();
	
	
	@Override
	public void AddShoeInGallery(String name, String brand, int ratings, double price, String type) 
	throws InvalidShoeTypeException, InvalidShoeNameLengthException, InvalidRatingException{
		
		
		if(name.length()>1 && name.length()<20) {
			
			
			
			if(ratings>=1 && ratings<=5) {
				
				try{
					Shoe_Type var;
					var = Shoe_Type.valueOf(type);
					if(var == Shoe_Type.CASUAL || var == Shoe_Type.FORMAL
							|| var == Shoe_Type.SPORTS ) {
						
						ShoeGalleryMap.put(
								ShoeDetails.getShoe_Id(), 
								new ShoeDetails(name, brand, ratings, price, Shoe_Type.valueOf(type)));
					}
					
				}
				catch(IllegalArgumentException e) {
					throw new InvalidShoeTypeException("Invalid Shoe Type Plz enter Type again!!!!");
				}
				
			}
			else {
				throw new InvalidRatingException("Your Rating either less than 1 or greater than 5");
			}
		}
		
		else {
			throw new InvalidShoeNameLengthException("Invalid Length of name!!!!");
		}
		
		
		
	}

	@Override
	public void DisplayAllShoes() {
		
		for(ShoeDetails id : ShoeGalleryMap.values()) {
			System.out.println(id);
		}
		
	}

	@Override
	public void DisplayAllShoesByIdSorted() {
		
		
	}

	@Override
	public void MostExpensiveShoe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveShoeNotInGallery() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateShoePrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShoesAsPerPriceDescending() {
		// TODO Auto-generated method stub
		
	}

}
