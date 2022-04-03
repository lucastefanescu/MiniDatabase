package com.example.minidatabase;

import java.util.ArrayList;

public class DictWord {
    public ArrayList<Word> words;

    public DictWord(){
        this.words = new ArrayList<>();
        words.add(new Word("Chocolate", "A food preparation in the form of a paste or solid block made from roasted and ground cacao seeds, typically sweetened.", "Food"));
        words.add(new Word("Cake", "An item of soft, sweet food made from a mixture of flour, shortening, eggs, sugar, and other ingredients, baked and often decorated.", "Food"));
        words.add(new Word("Banana","A long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe.", "Food"));
        words.add(new Word("Churro", "A sweet snack consisting of a strip of fried dough dusted with sugar or cinnamon.", "Food"));
        words.add(new Word("Pizza", "A dish of Italian origin consisting of a flat, round base of dough baked with a topping of tomato sauce and cheese, typically with added meat or vegetables.","Food"));

        words.add(new Word("Dog", "a domesticated carnivorous mammal that typically has a long snout, an acute sense of smell, nonretractable claws, and a barking, howling, or whining voice.", "Animals"));
        words.add(new Word("Cat", "a small domesticated carnivorous mammal with soft fur, a short snout, and retractable claws. It is widely kept as a pet or for catching mice, and many breeds have been developed.", "Animals"));
        words.add(new Word("Squirrel", "an agile tree-dwelling rodent with a bushy tail, typically feeding on nuts and seeds.  ", "Animals"));
        words.add(new Word("Monkey", "a small to medium-sized primate that typically has a long tail, most kinds of which live in trees in tropical countries.", "Animals"));
        words.add(new Word("Walrus", "a large gregarious marine mammal related to the eared seals, having two large downward-pointing tusks and found in the Arctic Ocean.", "Animals"));

        words.add(new Word("Laptop", "a computer that is portable and suitable for use while traveling.", "Technology"));
        words.add(new Word("Tablet", "A tablet computer, commonly shortened to tablet, is a mobile device, typically with a mobile operating system and touchscreen display processing circuitry, and a rechargeable battery in a single, thin and flat package.", "Technology"));
        words.add(new Word("Smartphone", "a mobile phone that performs many of the functions of a computer, typically having a touchscreen interface, internet access, and an operating system capable of running downloaded applications.", "Technology"));
        words.add(new Word("Desktop", "A desktop computer is a personal computer designed for regular use at a single location on or near a desk due to its size and power requirements.", "Technology"));
        words.add(new Word("Speakers", "A speaker is an electroacoustic transducer, that is, a device that converts an electrical audio signal into a corresponding sound.", "Technology"));

        words.add(new Word("Toronto", "Toronto, the capital of the province of Ontario, is a major Canadian city along Lake Ontario’s northwestern shore. It's a dynamic metropolis with a core of soaring skyscrapers, all dwarfed by the iconic, free-standing CN Tower.", "Cities"));
        words.add(new Word("Los Angeles", "Los Angeles is a sprawling Southern California city and the center of the nation’s film and television industry. Near its iconic Hollywood sign, studios such as Paramount Pictures, Universal and Warner Brothers offer behind-the-scenes tours.", "Cities"));
        words.add(new Word("London", "London, the capital of England and the United Kingdom, is a 21st-century city with history stretching back to Roman times. At its centre stand the imposing Houses of Parliament, the iconic ‘Big Ben’ clock tower and Westminster Abbey, site of British monarch coronations.", "Cities"));
        words.add(new Word("Budapest", "Budapest, Hungary’s capital, is bisected by the River Danube. Its 19th-century Chain Bridge connects the hilly Buda district with flat Pest. A funicular runs up Castle Hill to Buda’s Old Town, where the Budapest History Museum traces city life from Roman times onward.", "Cities"));
        words.add(new Word("New York City", "New York City comprises 5 boroughs sitting where the Hudson River meets the Atlantic Ocean. At its core is Manhattan, a densely populated borough that’s among the world’s major commercial, financial and cultural centers.", "Cities"));

        words.add(new Word("Integral", "In mathematics, an integral assigns numbers to functions in a way that describes displacement, area, volume, and other concepts that arise by combining infinitesimal data.", "Math"));
        words.add(new Word("Derivative", "In mathematics, the derivative of a function of a real variable measures the sensitivity to change of the function value with respect to a change in its argument. Derivatives are a fundamental tool of calculus.", "Math"));
        words.add(new Word("Limit", "In mathematics, a limit is the value that a function approaches as the input approaches some value. Limits are essential to calculus and mathematical analysis, and are used to define continuity, derivatives, and integrals.", "Math"));
        words.add(new Word("Summation", "In mathematics, summation is the addition of a sequence of any kind of numbers, called addends or summands; the result is their sum or total.", "Math"));
        words.add(new Word("Division", "Division is one of the four basic operations of arithmetic, the ways that numbers are combined to make new numbers. The other operations are addition, subtraction, and multiplication.", "Math"));

        words.add(new Word("Matter", "In classical physics and general chemistry, matter is any substance that has mass and takes up space by having volume.", "Chemistry"));
        words.add(new Word("Stoichiometry", "Stoichiometry refers to the relationship between the quantities of reactants and products before, during, and following chemical reactions. ", "Chemistry"));
        words.add(new Word("Acid", "An acid is a molecule or ion capable of either donating a proton, known as a Brønsted–Lowry acid, or forming a covalent bond with an electron pair, known as a Lewis acid. The first category of acids are the proton donors, or Brønsted–Lowry acids.", "Chemistry"));
        words.add(new Word("Solution", "In chemistry, a solution is a special type of homogeneous mixture composed of two or more substances. In such a mixture, a solute is a substance dissolved in another substance, known as a solvent.", "Chemistry"));
        words.add(new Word("Charity", "In chemistry, a molecule or ion is called chiral if it cannot be superposed on its mirror image by any combination of rotations, translations, and some conformational changes. This geometric property is called chirality.", "Chemistry"));

        words.add(new Word("Sedan", "A sedan or saloon is a passenger car in a three-box configuration with separate compartments for engine, passenger, and cargo. Sedan's first recorded use as a name for a car body was in 1912.", "Cars"));
        words.add(new Word("Coupe", "a car with a fixed roof, two doors, and a sloping rear.", "Cars"));
        words.add(new Word("Sports Car", "A sports car is a car designed with an emphasis on dynamic performance, such as handling, acceleration, top speed, or thrill of driving. Sports cars originated in Europe in the early 1900s and are currently produced by many manufacturers around the world.", "Cars"));
        words.add(new Word("Minivan", "Minivan (sometimes called simply as van) is a North American car classification for vehicles designed to transport passengers in the rear seating row(s), with reconfigurable seats in two or three rows. The equivalent classification in Europe is MPV (multi purpose vehicle) or a people carrier/mover.", "Cars"));
        words.add(new Word("Hatchback", "a car with a door across the full width at the back end that opens upward to provide easy access for loading.", "Cars"));

        words.add(new Word("Empire State Building", "The Empire State Building is a 102-story[c] Art Deco skyscraper in Midtown Manhattan in New York City, United States. It was designed by Shreve, Lamb & Harmon and built from 1930 to 1931. Its name is derived from Empire State, the nickname of the state of New York. The building has a roof height of 1,250 feet (380 m) and stands a total of 1,454 feet (443.2 m) tall, including its antenna.", "Buildings"));
        words.add(new Word("CN Tower", "The CN Tower is a 553.3 m-high concrete communications and observation tower located in the downtown core of Toronto, Ontario, Canada. Built on the former Railway Lands, it was completed in 1976.", "Buildings"));
        words.add(new Word("Colosseum", "The Colosseum is an oval amphitheatre in the centre of the city of Rome, Italy, just east of the Roman Forum. It is the largest ancient amphitheatre ever built, and is still the largest standing amphitheatre in the world today, despite its age.", "Buildings"));
        words.add(new Word("Eiffel Tower", "The Eiffel Tower is a wrought-iron lattice tower on the Champ de Mars in Paris, France. It is named after the engineer Gustave Eiffel, whose company designed and built the tower.", "Buildings"));
        words.add(new Word("Taj Mahal", "The Taj Mahal 'Crown of the Palace', is an ivory-white marble mausoleum on the right bank of the river Yamuna in the Indian city of Agra. It was commissioned in 1632 by the Mughal emperor Shah Jahan (r. 1628–1658) to house the tomb of his favourite wife, Mumtaz Mahal; it also houses the tomb of Shah Jahan himself.", "Buildings"));
    }

    public void addElement(Word word){
        this.words.add(word);
    }

    public String printElements(){
        for(int i = 0; i < words.size(); i++){
            System.out.println(this.words.get(i).name);
            System.out.println(this.words.get(i).category);
            System.out.println(this.words.get(i).definition);
        }
        return this.words.get(0).name;
    }
    public Word search(String name) {
        int i;
        for(i=0; i < this.words.size(); i++) {
            if(this.words.get(i).name == name) {
                break;
            }
        }
        return this.words.get(i);
    }
    public ArrayList<Word> getWords() {
        return words;
    }
}
