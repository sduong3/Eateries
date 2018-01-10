/**
 * Lab 8: Eateries.java
 * Gathers restaurant data found in the San Jose and San Diego region.
 * Inserts more detailed information about the restaurant into a restaurant.txt file
 * CS108-2
 * 5/1/2016
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import realtimeweb.simplebusiness.SimpleBusiness;
import realtimeweb.simplebusiness.domain.Business;


public class Eateries {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Program 8, Steven Duong, masc1528\n");
		// Basic line. Start with just this. Compile.
		//SimpleBusiness yelp = new SimpleBusiness("cache.json");  //OFFLINE
		SimpleBusiness yelp = new SimpleBusiness(); // REALTIME
		// Using library offline limitation!! This is the way we avoid crazy stuff,
		// so work OFFLINE yelp.search() takes two inputs.
		//System.out.println(yelp.search("Chinese food", "Kansas City, MO"));
		
	
		// Criteria
		String[] kinds = {"Mexican food", "Thai food", "Vietnamese food", "Breakfast food"};
		//String[] cities = {"Kansas City, MO", "Blacksburg, VA", "Atlanta, GA"}; // OFFLINE
		String[] cities = {"San Diego, CA", "San Jose, CA"}; // ONLINE
		double total = 0.0; 
		int count = 0;
		double max = 0.0;
		double threshold = 3.0;
		
		File inputFile = null;						
		Scanner fileReader = null;
		PrintWriter printWrite = null;	
		String fileName = "restaurants.txt";					//name of file
		
		System.out.println("Searching for restaurants with rating over threshold...");
		for (String city: cities) {
			for (String kind: kinds) {
				List<Business> businesses = yelp.search(kind, city);
				//Reset total, count, and max to 0
				total = 0.0; 
				count = 0;
				max = 0.0;
				
				System.out.println();
				try {
					inputFile = new File(fileName);				//create file object of input name
					fileReader = new Scanner(inputFile);		//open file and read it
					printWrite = new PrintWriter(inputFile);	//allows program to write into the file
					
					printWrite.println("Obtaining restaurant name, contact information, description and rating:\n");
					System.out.println(kind + " in " + city);
					for (Business b: businesses) {
						if (b.getRating() > threshold) {					//looking for restaurants that have ratings over 3.0
							total += b.getRating();
							count++;
							max = Math.max(b.getRating(), max);				//used math function to find the highest restaurant rating
							System.out.println("\t" + b.getRating() + "\t" + b.getName());
							//write into file for more in depth information such as contact number and description of restaurant
							printWrite.println(b.getName() + "\n\t" + b.getPhone() + "\n\t" + b.getDescription() + "\n\t" + b.getLocation() + "\n\t" + b.getRating() + "\n\n");
						}
					}
					System.out.println("Total restaurants of " + kind + " found: " + count);		
					System.out.println("Average Rating: " + total / businesses.size());	
					System.out.println("Highest rating: " + max);
				}
				
				catch (FileNotFoundException fnfe) {			//catch exception if file is not found
					System.out.println("File " + fileName + " not found.");
					System.exit(0);
				}
				
				finally {										//close everything
					fileReader.close();
					printWrite.close();
				}		
			}
		}
	}
}
