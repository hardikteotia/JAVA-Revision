/*
 * 
2.1) Add a new Shoe record to the collection. (Add at least 4 new records in Collection)
2.2) Display all Shoe details.
2.3) Display all Shoe details sorted by Shoe id.
2.4) Search Shoe which is most expensive in Gallery.
2.5) Remove Shoe that are not available in the Gallery.
2.6) Update Shoe price based on brand.
2.7) Sort Shoe data as per price in descending order.
2.8) Exit from application.*/


package com.ShoeTester;

import java.util.Scanner;

import com.CustomShoeException.InvalidRatingException;
import com.CustomShoeException.InvalidShoeNameLengthException;
import com.CustomShoeException.InvalidShoeTypeException;
import com.ShoeGalleryServices.ShoeGalleryServicesImplementatin;
import com.ShoeGalleryServices.ShoeGalleryServicesInterface;

public class ShoeGalleryTester {
	public static void main(String [] args) {
		
		ShoeGalleryServicesInterface GalleryServiceObj = new ShoeGalleryServicesImplementatin();
		boolean loopFlag = false;
		
		try(Scanner sc = new Scanner(System.in)){
				//outer try starts
			try {
				//inner try starts
				
				System.out.println("---------Shoe Gallery-------\n"
						+ "1. Add shoes to the collection\n"
						+ "2. Display All Shoes in the Gallery\n"
						+ "3. Display All shoes by id\n"
						+ "4. Search Most Expensive Shoe\n"
						+ "5. Remove Unavailable Shoe from the Gallery\n"
						+ "6. Update Shoe Price Based on Brand\n"
						+ "7. Sort Shoe as per price in desc order\n"
						+ "8. Exit the Application\n");
				while(!loopFlag) {
					//while starts
						System.out.println("ENTER YOUR CHOICES--");
						
						switch(sc.nextInt()) {
							
							case 1:
								System.out.println("Enter name, brand, ratings, price, type(Formal, Casual, Sports)");
								GalleryServiceObj.AddShoeInGallery(sc.next(), sc.next(),
										sc.nextInt(), sc.nextDouble(), sc.next().toUpperCase());
								break;
								
							case 2:
								System.out.println("All Shoes in the Gallery");
								GalleryServiceObj.DisplayAllShoes();
								break;
								
							case 3:
								System.out.println("All Shoes in the Gallery by Id");
								GalleryServiceObj.DisplayAllShoesByIdSorted();
								break;
								
							case 4:
								System.out.println("HERE IT is");
								GalleryServiceObj.MostExpensiveShoe();
								break;
							
							case 5:
								System.out.println("Enter shoe id to delete");
								GalleryServiceObj.RemoveShoeNotInGallery(sc.nextInt());
								break;
								
							case 6:
								System.out.println("Enter price: ");
								GalleryServiceObj.UpdateShoePrice(sc.nextDouble());
								break;
							
							case 7:
								System.out.println("HERE________");
								GalleryServiceObj.ShoesAsPerPriceDescending();
								break;
								
							case 8:
								loopFlag=true;
								System.out.println("Byeeeeee >_<");
								break;
								
							default:
								System.out.println("Invalid Input!!!!");
								
								break;
						
						}
					
					//while ends
				}
				
				
				//inner try ends
			}
			catch(InvalidShoeTypeException ShoeType){
				System.out.println(ShoeType.getMessage());
			}
			catch(InvalidShoeNameLengthException ShoeName) {
				System.out.println(ShoeName.getMessage());
			}
			catch(InvalidRatingException ShoeRating) {
				System.out.println(ShoeRating.getMessage());
			}
			
			//outer try ends
		}
		
		
	}
}
