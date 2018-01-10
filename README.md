# Eateries

Utilizes Yelp API to gather restaurant data found in the San Jose and San Diego region.
Inserts more detailed information on the restaurants into a restaurant.txt file


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

```
Eclipse
```

## Running the tests

You can enter in the types of food to search for in the "kinds" object and the location in the "cities" object.
Below is a small sample of the retrieved information in the restaurant.txt file when searching for Mexican food, Thai food, Vietnamese food, Breakfast food in "San Diego, CA" and "San Jose, CA".

```
Program 8, Steven Duong, masc1528

Searching for restaurants with rating over threshold...

Mexican food in San Diego, CA
	4.5	Las Cuatro Milpas
	4.0	La Puerta
	5.0	La Vecindad
	4.0	Lucha Libre Gourmet Taco Shop
	4.5	Michos
	4.5	Oscar's Mexican Seafood
	4.5	Mexican Fiesta
	5.0	Mariscos Mi Gusto Es
	4.0	Puesto
	4.5	Ortiz's Taco Shop
	4.5	Cocina 35
	4.5	Pipirins
	4.0	El Zarape
	4.5	La Playa Taco Shop
	4.5	Amorcito Corazón Mexican Bistro
	4.0	Humberto's Taco Shop
	4.5	Matador Mexican Grill
	4.5	Salud
	4.5	Oscar's Mexican Seafood
	4.5	Super Cocina
Total restaurants of Mexican food found: 20
Average Rating: 4.425
Highest rating: 5.0

Thai food in San Diego, CA
	4.5	Bahn Thai
	4.5	Supannee House of Thai
	4.0	Amarin Thai Cuisine
	4.5	Chaba Thai Kitchen
	4.0	Pure Thai
	4.0	J&T Thai Street Food
	4.5	Mekong Cuisine Lao and Thai
	4.0	J Wok
	4.5	The Orient Thai Cafe
	4.0	Thai Taste 2
	4.0	Sang Dao
	4.5	Thai Pepper Cuisine
	4.0	Issara Thai
	4.0	Koon Thai Kitchen
	4.0	Street Side Thai Kitchen
	4.0	Thai Village
	4.0	Lotus Thai Hillcrest
	4.5	Thai Papaya
	4.0	Thai Taste
	4.0	Lanna
Total restaurants of Thai food found: 20
Average Rating: 4.175
Highest rating: 4.5

Vietnamese food in San Diego, CA
	4.0	Phuong Trang
	4.5	Phuong Nga Banh Cuon
	4.0	Saigon On Fifth
	4.0	Pho Fifth Avenue
	4.0	Pho Xpress
	4.0	Pho Point Loma & Grill Restaurant
	5.0	Pho Kitchen
	4.0	OB Noodle House
	4.0	The Pho Shop
	4.0	Hoai Hue Restaurant
	4.0	DaoFu
	4.0	Sovereign Southeast Asian Kitchen and Bar
	4.0	Seaside Pho & Grill
	4.0	Minh Ky Chinese Restaurant
	4.0	The Food shop
	4.0	Que Huong Restaurant
	4.0	Pho Hoa
	4.0	Mien Trung Restaurant
	4.0	Pho Ca Dao Restaurant
	4.0	Pho Time
Total restaurants of Vietnamese food found: 20
Average Rating: 4.075
Highest rating: 5.0

Breakfast food in San Diego, CA
	4.0	Hash House A Go Go
	4.0	Waffle Spot
	4.5	Snooze an AM Eatery
	4.0	Richard Walker's Pancake House
	4.0	The Naked Cafe
	4.0	The Mission
	4.0	The Original Pancake House
	4.0	The Mission
	4.0	Café On Park
	4.5	7 Cafe
	4.0	Perry's Cafe
	4.0	Kensington Cafe
	4.0	Cafe 21
	4.0	The Mission Cafe
	4.0	12th & Broadway Restaurant
	4.0	The Patio on Lamont Street
	3.5	Brian's 24
	4.5	Subterranean Coffee Boutique
	4.0	Mystic Mocha
	4.0	Olive Cafe
Total restaurants of Breakfast food found: 20
Average Rating: 4.05
Highest rating: 4.5

Mexican food in San Jose, CA
	4.0	Angelou's Mexican Grill
	4.5	La Costa
	4.0	Tu Mero Mole
	4.5	Las Delicias Del Mero, Mero Mexican Grill
	4.5	Mexico Bakery
	4.5	Maya's Cafe
	4.5	Tacos Santiaguito
	4.0	Dia de Pesca
	4.5	Mavericks Mexican Grill
	4.0	Araujo's Mexican Grill / El Paisa Taqueria
	4.5	Agave Mexican Grill
	4.5	Mariscos La Costa
	4.0	Los Garcias Restaurant
	4.0	Santa Fe Taqueria
	4.0	Jalisco Taqueria
	4.0	Adelita's Taqueria
	4.0	Las Cazuelas Restaurant
	4.5	Tacos El Compa Taqueria
	4.0	El Maestro
	4.0	Zona Rosa
Total restaurants of Mexican food found: 20
Average Rating: 4.225
Highest rating: 4.5

Thai food in San Jose, CA
	4.0	Siam Fine Thai Cuisine
	4.0	Sweet Mango
	4.0	Thai Spice
	4.0	Thai Elephant Express
	4.0	Oros Thai Restaurant
	4.0	Thai Lovers
	4.0	Tee Nee Thai Cuisine
	4.0	Thai Recipe
	3.5	New Krung Thai Restaurant
	4.0	Erawan Thai Cuisine
	4.0	Thaiphoon Restaurant
	3.5	Lanna Thai
	3.5	Thai Grata
	3.5	Sa-By Thai
	3.5	Sweet Basil
	3.5	The Original Krung Thai Restaurant
	3.5	Jasmine Thai
	3.5	Bangkok Boulevard
	3.5	Sa-By Thai Cuisine
Total restaurants of Thai food found: 19
Average Rating: 3.575
Highest rating: 4.0

Vietnamese food in San Jose, CA
	4.0	Vung Tau Restaurant
	4.0	Bun Bo Hue An Nam
	4.0	Thien Long Vietnamese Restaurant
	4.0	Pho Kim Long Restaurant
	4.5	Vn Grill
	4.0	Com Tam Dat Thanh
	4.0	Dalat Restaurant
	4.0	Com Ga Nam An
	4.0	Pho Cong Ly
	4.0	Huong Lan Sandwich
	4.0	Pho Tick Tock
	4.0	Hai Nam Restaurant
	4.0	Com Tam Thien Huong
	4.0	Nam Vang Restaurant
	3.5	Com Tam Thanh
	4.0	Pho Spot
	4.0	Tofoo Com Chay
	4.0	Quan Hue Restaurant
	4.0	Corner Pho
	4.0	Thanh Son Hien Khanh
Total restaurants of Vietnamese food found: 20
Average Rating: 4.0
Highest rating: 4.5

Breakfast food in San Jose, CA
	4.0	Bill's Café
	4.0	Southern Kitchen Coffee Shop
	4.0	Scrambl'z
	4.0	Fourth Street Bowl Coffee Shop
	4.5	iJava Coffee & Eatery
	4.0	Bill's Cafe
	3.5	The Breakfast Place
	4.0	Bill's Cafe
	4.0	Peanuts Deluxe Cafe
	4.0	Crema Coffee Roasting Co.
	4.0	Holder's Country Inn
	3.5	Hobee's
	4.0	Bill of Fare
	4.0	Café San Jose
	4.5	Fireside Caffe Deli & Gelato
	4.0	Cafe Gourmet
	3.5	Mini Gourmet
	3.5	A Bite of Wyoming
	4.0	Bill's Cafe
	4.0	Yeganeh Bakery & Kafe Unik
Total restaurants of Breakfast food found: 20
Average Rating: 3.95
Highest rating: 4.5
```
## Authors

* **Steven Duong**
