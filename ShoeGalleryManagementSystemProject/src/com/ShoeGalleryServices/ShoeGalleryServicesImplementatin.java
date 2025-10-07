package com.ShoeGalleryServices;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

import com.CustomShoeException.InvalidRatingException;
import com.CustomShoeException.InvalidShoeNameLengthException;
import com.CustomShoeException.InvalidShoeTypeException;
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
						ShoeDetails shoe = new ShoeDetails(name, brand, ratings, price, var);
						ShoeGalleryMap.put(
								shoe.getShoe_Id(), 
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
		ShoeGalleryMap.values().stream()
		.sorted(Comparator.comparing(ShoeDetails::getShoe_Id)).forEach(s->System.out.println(s));
		
	}

	@Override
	public void MostExpensiveShoe() {
		ShoeDetails price  = ShoeGalleryMap.values()
		.stream().max(Comparator.comparing(ShoeDetails::getPrice)).orElse(null);
		System.out.println(price);
		
	}

	@Override
	public void RemoveShoeNotInGallery(int id) {
		if(ShoeGalleryMap.containsKey(id)) {
			ShoeGalleryMap.remove(id);
		}
		System.out.println("Deleted");
		
	}

	@Override
	public void UpdateShoePrice(double price) {
		ShoeGalleryMap.values().stream().filter(s->s.getPrice()==price).findFirst().ifPresent(s->s.setPrice(price));
		
	}

	@Override
	public void ShoesAsPerPriceDescending() {
		ShoeGalleryMap.values().stream().sorted(Comparator.comparing(ShoeDetails::getPrice).reversed())
		.forEach(s->System.out.println(s));
		
	}

}
