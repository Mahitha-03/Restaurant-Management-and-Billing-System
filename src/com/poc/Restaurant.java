package com.poc;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalPrice =0;
		String item=" ";
		String yn= "";
		do {
		System.out.println("--- Category List --");
		System.out.println("Veg");
		System.out.println("Non-Veg");
		System.out.println("Starters");
		System.out.println("Drinks");
		System.out.println("Naan");
		System.out.println("Desserts");
		System.out.println("Enter category :");
		String category = sc.next();
		
		switch(category) {
		case "Veg" ->{
			double veg_tp =0;
			
			do {
			System.out.println("\n--VEG MENU--");
			System.out.println("Panner Butter Masala");
			System.out.println("Veg Biryani ");
			System.out.println("Panner Tikka Masala ");
			System.out.println("Veg pulao");
			System.out.println("Dal Tadka");
		
			
			System.out.println("Enter the Item :");
			item = sc.next();
			switch(item) {
			case "PBM" ->{
				System.out.println("Panner Butter Masala - Rs.220");
				double pbm_price = 220;
				veg_tp += pbm_price;
			}
			case "VB" ->{
				System.out.println("Veg Biryani - Rs.180");
				double vegBir_price= 180;
				veg_tp += vegBir_price;
				
			}
			case "PTM" ->{
				System.out.println("Panner Tikka Masala -Rs.300");
				double ptm_price= 300;
				veg_tp += ptm_price;
			}
			case "VegPulao" ->{
				System.out.println("Veg Pulao - Rs.170");
				double vegPul_price = 170;
				veg_tp += vegPul_price;
			}
			case "DalTadka" ->{
				System.out.println("Dal Tadka - Rs.150");
				double dal_price = 150;
				veg_tp += dal_price;
			}
			default -> System.out.println("Invalid veg item");
			
			}
			System.out.println("Do you want to continue veg items ? (Y/N)");
			 yn = sc.next();
			}
			while(yn.equalsIgnoreCase("Y"));
			 System.out.println("Total veg Price: Rs." + veg_tp);
			 totalPrice += veg_tp;
			
		}
		case "Non-Veg"->{
			  double nonveg_tp =0;
			do{
                System.out.println("\n--- NON-VEG MENU ---");
                System.out.println("Chicken Biryani - Rs.250");
                System.out.println("Mutton Biryani - Rs.320");
                System.out.println("Fish Fry - Rs.200");
                System.out.println("Chicken Curry - Rs.240");
                System.out.println("Chicken 65 - Rs.220");
                System.out.println("Egg Fried Rice - Rs.180");
                
                System.out.println("Choose an item");
                item = sc.next();
                switch(item) {
                case "ChickenBiryani" ->{
                	System.out.println("Chicken Biryani - Rs.250");
                	double cb_price = 250;
                	nonveg_tp += cb_price;
                	   }
                case "MuttonBiryani" ->{
                	System.out.println("Mutton Biryani - Rs.320");
                	double mb_price = 320;
                	nonveg_tp += mb_price;
                	   }
                case "FishFry" ->{
                	System.out.println("Fish Fry - Rs.200");
                	double fish_price = 200;
                	nonveg_tp += fish_price;
                	   }
                case "ChickenCurry" ->{
                	System.out.println("Chicken Curry - Rs.240");
                	double chicur_price = 240;
                	nonveg_tp += chicur_price;
                	   }
                case "Chicken65" ->{
                	System.out.println("Chicken 65 - Rs.250");
                	double chi65_price = 220;
                	nonveg_tp += chi65_price;
                	   }
                case "EggFriedRice" ->{
                	System.out.println("Egg Fried Rice - Rs.180");
                	double egg_price = 180;
                	nonveg_tp += egg_price;
                	   }
                default -> System.out.println("Item Not found");
                }
                System.out.println("Do you want to continue ? (Y/N)");
                 yn = sc.next();
				
			}
			while(yn.equalsIgnoreCase("Y"));
			 System.out.println("Total Non_veg Price: Rs." + nonveg_tp);
			 totalPrice += nonveg_tp;
		}
		case "Starters" ->{
			double startersPrice =0;
			do{
                System.out.println("\n--- STARTERS ---");
                System.out.println("1. Veg Manchuria ");
                System.out.println("2. French Fries");
                System.out.println("3. Paneer Tikka ");
                System.out.println("4. Gobi 65 ");
                System.out.println("5. Chicken Lollipop ");
                System.out.println("6. Crispy Corn");
              
                System.out.println("Enter the item:");
                item = sc.next();
                switch(item)
                {
                case "VegManchuria" ->{
                	System.out.println("Veg Manchuria - Rs.150");
                	double vegman_price = 150;
                	startersPrice += vegman_price;
                	
                }
                case "FrenchFries" -> {
                    System.out.println("French Fries - Rs.100");
                    double fries_price = 100;
                    startersPrice += fries_price;
                }

                case "PaneerTikka" -> {
                    System.out.println("Paneer Tikka - Rs.200");
                    double paneer_price = 200;
                    startersPrice += paneer_price;
                }

                case "Gobi65" -> {
                    System.out.println("Gobi 65 - Rs.120");
                    double gobi_price = 120;
                    startersPrice += gobi_price;
                }

                case "ChickenLollipop" -> {
                    System.out.println("Chicken Lollipop - Rs.250");
                    double chicken_price = 250;
                    startersPrice += chicken_price;
                }

                case "CrispyCorn" -> {
                    System.out.println("Crispy Corn - Rs.150");
                    double corn_price = 150;
                    startersPrice += corn_price;
                }
                default -> System.out.println("Item not found ");
                
                }
				System.out.println("Do you want to continue with starters ? (Y/N)");
				yn = sc.next();
				
			}while(yn.equalsIgnoreCase("Y"));
			 System.out.println("Total Starters Price: Rs." + startersPrice);
			 totalPrice += startersPrice;
		}
		case "Drinks" ->
		{
			double juicePrice =0;
			do{
                System.out.println("\n--- DRINKS ---");
                System.out.println("1. Orange Juice ");
                System.out.println("2. Coffee ");
                System.out.println("3. Milkshake");
                System.out.println("4. Fresh Lime Soda");
                System.out.println("5. Tea ");
              
                System.out.println("Enter the item:");
                item = sc.next();
                switch (item) {
                case "OrangeJuice" -> {
                	System.out.println("Orange Juice - Rs.80");
                	double orangePrice = 80;
                	juicePrice += orangePrice;
                }
                case "Coffee" -> {
                    System.out.println("Coffee - Rs.50");
                    double coffeePrice = 50;
                    juicePrice += coffeePrice;
                }

                case "Milkshake" -> {
                    System.out.println("Milkshake - Rs.120");
                    double milkshakePrice = 120;
                    juicePrice += milkshakePrice;
                }

                case "FreshLimeSoda" -> {
                    System.out.println("Fresh Lime Soda - Rs.60");
                    double limePrice = 60;
                    juicePrice += limePrice;
                }

                case "Tea" -> {
                    System.out.println("Tea - Rs.30");
                    double teaPrice = 30;
                    juicePrice += teaPrice;
                }
                default -> System.out.println("Item Not Found");
            }
                System.out.println("Do You want to continue with Drinks ? (Y/N):");
                yn = sc.next();
				
				
			}while(yn.equalsIgnoreCase("Y"));
			 System.out.println("Total Juice Price: Rs." + juicePrice);
			 totalPrice += juicePrice;
		}
		case "Naans" -> {
			double naanPrice =0;
			do {
			       System.out.println("\n--- NAANS ---");
			        System.out.println("Plain Naan");
			        System.out.println("Butter Naan");
			        System.out.println("Garlic Naan");
			        System.out.println("Cheese Naan");
			        System.out.println("Tandoori Roti");
			        System.out.println("Enter the item:");
			        item = sc.next();
			        switch (item) {
		            case "PlainNaan" -> {
		                System.out.println("Plain Naan - Rs.40");
		                double plainPrice = 40;
		                naanPrice += plainPrice;
		            }

		            case "ButterNaan" -> {
		                System.out.println("Butter Naan - Rs.50");
		                double butterPrice = 50;
		                naanPrice += butterPrice;
		            }

		            case "GarlicNaan" -> {
		                System.out.println("Garlic Naan - Rs.60");
		                double garlicPrice = 60;
		                naanPrice += garlicPrice;
		            }

		            case "CheeseNaan" -> {
		                System.out.println("Cheese Naan - Rs.80");
		                double cheesePrice = 80;
		                naanPrice += cheesePrice;
		            }

		            case "TandooriRoti" -> {
		                System.out.println("Tandoori Roti - Rs.30");
		                double rotiPrice = 30;
		                naanPrice += rotiPrice;
		            }

		          default -> System.out.println("Item not found");

			}
			        System.out.println("Do You want to continue with Naans?(Y/N)");
			        yn = sc.next();
			}
			while(yn.equalsIgnoreCase("Y"));
			 System.out.println("Total Naans Price: Rs." + naanPrice);
			 totalPrice += naanPrice;
	
		}
		case "Desserts" -> {
			 double dessertPrice =0;
			do {
		        System.out.println("\n--- DESSERTS ---");
		        System.out.println("1. Chocolate Ice Cream");
		        System.out.println("2. Vanilla Ice Cream");
		        System.out.println("3. Gulab Jamun");
		        System.out.println("4. Brownie");
		        System.out.println("5. Cheesecake");
		        System.out.println("Enter the item:");
		        sc.next();
		      

		        switch (item) {
		            case "ChocolateIceCream" -> {
		                System.out.println("Chocolate Ice Cream - Rs.80");
		                double chocolatePrice = 80;
		                dessertPrice += chocolatePrice;
		            }

		            case "VanillaIceCream" -> {
		                System.out.println("Vanilla Ice Cream - Rs.60");
		                double vanillaPrice = 60;
		                dessertPrice += vanillaPrice;
		            }

		            case "GulabJamun" -> {
		                System.out.println("Gulab Jamun - Rs.50");
		                double gulabPrice = 50;
		                dessertPrice += gulabPrice;
		            }

		            case "Brownie" -> {
		                System.out.println("Brownie - Rs.100");
		                double browniePrice = 100;
		                dessertPrice += browniePrice;
		            }

		            case "Cheesecake" -> {
		                System.out.println("Cheesecake - Rs.150");
		                double cheesecakePrice = 150;
		                dessertPrice += cheesecakePrice;
		            }
		            default -> System.out.println("Item not found");
		        }
		        System.out.println("Do You want to continue with desserts ? (Y/N)");
		        yn = sc.next();

				
			}
			while(yn.equalsIgnoreCase("Y"));
			 System.out.println("Total Dessert Price: Rs." + dessertPrice);
			 totalPrice += dessertPrice;
		}
		
		
		default-> System.out.println("Category not found ");
		
		}
		System.out.println("Do you want to continue with categories?(Y/N)");
		yn = sc.next();
		}
		while(yn.equalsIgnoreCase("Y")) ;
		System.out.println("Total Price :" + totalPrice);
	
}
}
