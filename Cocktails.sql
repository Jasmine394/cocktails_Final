CREATE Database Cocktails;
use cocktails;
CREATE TABLE cocktails (
	
	cocktail_id INT AUTO_INCREMENT PRIMARY KEY,
	cocktail_name VARCHAR(50) NOT NULL,
	instructions text NOT NULL,
	drink_thumb text NOT NUll
);
insert into cocktails (cocktail_name, instructions, drink_thumb) 
values ('Moscow Mule', 'If you would like to garnish the rim of the glass, run a lime wedge around the rim, then dip the rim in salt or Tajin. Combine the ingredients: Combine the tequila, lime juice, triple sec, and agave nectar in a cocktail shaker. <br /><br /><strong>Shake!:Add ice and shake vigorously until condensation forms on outside of shaker. Strain and serve: Add fresh ice to glass and strain drink into prepped glass and garnish with a lime slice.', 'https://www.thecocktaildb.com/images/media/drink/3pylqc1504370988.jpg');
insert into cocktails (cocktail_name, instructions, drink_thumb) 
values ('Margarita', 'Prep the glass: Fill the glass with ice and set aside to chill. Combine the ingredients: Combine the gin and dry vermouth in a cocktail shaker. Shake!: Add ice and shake vigorously until condensation forms on outside of shaker. Strain and serve: Toss out the ice in the prepped glass and strain the drink into it and garnish with an olive.', 'https://www.thecocktaildb.com/images/media/drink/5noda61589575158.jpg');
insert into cocktails (cocktail_name, instructions, drink_thumb)
 values ('Daiquiri', 'Prep the glass: Fill the glass with ice and set aside to chill. Combine the ingredients: Combine the rum, lime juice and simple syrup in a cocktail shaker. Shake!: Add ice and shake vigorously until condensation forms on outside of shaker. Strain and serve:Toss out the ice in the prepped glass and strain the drink into it and garnish with a lime wedge.', 'https://www.thecocktaildb.com/images/media/drink/mrz9091589574515.jpg');
insert into cocktails (cocktail_name, instructions, drink_thumb) 
values ('Martini', 'Prep the glass: Fill the glass with ice and set aside to chill. Combine the ingredients: Combine the gin and dry vermouth in a cocktail shaker. Shake!: Add ice and shake vigorously until condensation forms on outside of shaker. Strain and serve: Toss out the ice in the prepped glass and strain the drink into it and garnish with an olive.', 'https://www.thecocktaildb.com/images/media/drink/6ck9yi1589574317.jpg');
insert into cocktails (cocktail_name, instructions, drink_thumb) 
values ('Whiskey Sour', 'Prep the glass: Fill the glass with ice and set aside to chill. Combine the ingredients: Combine the bourbon, lemon juice, simple syrup, and egg white in a cocktail shaker. Dry shake!:Seal the shaker and shake vigorously for 10 seconds without ice. Shake again!: Add ice and shake vigorously until condensation forms on outside of shaker. Strain and serve: Toss out the ice in the prepped glass and strain the drink into it and garnish with a maraschino cherry.', 'https://www.thecocktaildb.com/images/media/drink/qgdu971561574065.jpg');
insert into cocktails (cocktail_name, instructions, drink_thumb) 
values ('Long Island', 'Combine the ingredients:Combine all ingredients (except the coke) in a cocktail shaker. Shake!: Add ice and shake vigorously until condensation forms on outside of shaker. Strain and serve: Add fresh ice to glass and strain drink into glass and top with coke. Stir and serve. Garnish with lemon wedge.', 'https://www.thecocktaildb.com/images/media/drink/nkwr4c1606770558.jpg');
insert into cocktails (cocktail_name, instructions, drink_thumb) 
values ('Manhattan', 'Prep the glass: Fill the glass with ice and set aside to chill. Combine the ingredients: Combine the rye whiskey, sweet vermouth, and bitters in a cocktail shaker.  Stirred not shaken!: Add a few cubes of ice and stir for 20 seconds. Strain and serve: Toss out the ice in the prepped glass and strain the drink into it and garnish with a maraschino cherry.', 'https://www.thecocktaildb.com/images/media/drink/yk70e31606771240.jpg');
insert into cocktails (cocktail_name, instructions, drink_thumb) 
values ('Negroni', 'Prep the glass: Fill the glass with ice and set aside to chill. Combine ingredients: After a few minutes, toss out the ice in the glass and pour in the gin, Campari, and sweet vermouth. Add a large cube of ice or a few ice cubes and stir to dilute the mixture slightly. Garnish and serve: Twist the orange peel to release the oils and flavors. Add the orange peel and a marschino cherry for garnish and serve.', 'https://www.thecocktaildb.com/images/media/drink/qgdu971561574065.jpg');
select * from cocktails;

CREATE TABLE ingredient (
	ingredient_id INT AUTO_INCREMENT PRIMARY KEY,
	ingredient_name VARCHAR(50) NOT NULL,
	category VARCHAR(50) NOT NULL
);
insert into ingredient (ingredient_name, category) values ('Brandy', 'Spirits');
insert into ingredient (ingredient_name, category) values ('Strawberry', 'Fruit');
insert into ingredient (ingredient_name, category) values ('Vodka', 'Spirints');
insert into ingredient (ingredient_name, category) values ('Gin', 'Spirits');
insert into ingredient (ingredient_name, category) values ('Pineapple', 'Fruit');
insert into ingredient (ingredient_name, category) values ('bourbon', 'Spirits');
insert into ingredient (ingredient_name, category) values ('Tequila', 'Spirits');
insert into ingredient (ingredient_name, category) values ('Rum', 'Spirits');
insert into ingredient (ingredient_name, category) values ('Whiskey', 'Spirits');
select * from ingredient;

CREATE TABLE measure (
	measure_id INT AUTO_INCREMENT PRIMARY KEY,
	measure_name VARCHAR(25) NOT NULL
);
insert into measure (measure_name) values ('oz');
insert into measure (measure_name) values ('tsp');
insert into measure (measure_name) values ('garnish');
insert into measure (measure_name) values ('dash');

select * from measure;


CREATE TABLE cocktailingredient (
    cocktailingredient_id INT AUTO_INCREMENT PRIMARY KEY,
    cocktail_id INT NOT NULL,
    ingredient_id INT NOT NULL,
	FOREIGN KEY (cocktail_id) REFERENCES cocktails (cocktail_id),
    FOREIGN KEY (ingredient_id) REFERENCES ingredient (ingredient_id)
   
);

INSERT INTO cocktailingredient (cocktail_id, ingredient_id)
values (1,3);
INSERT INTO cocktailingredient (cocktail_id, ingredient_id) values (2,7);
INSERT INTO cocktailingredient (cocktail_id, ingredient_id) values (4,4);
INSERT INTO cocktailingredient (cocktail_id, ingredient_id) values (5,6);
INSERT INTO cocktailingredient (cocktail_id, ingredient_id) values (6,3);
INSERT INTO cocktailingredient (cocktail_id, ingredient_id) values (7,9);
INSERT INTO cocktailingredient (cocktail_id, ingredient_id) values (8,4);
INSERT INTO cocktailingredient (cocktail_id, ingredient_id) values (6,4);

select * From cocktails





