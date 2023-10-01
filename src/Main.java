public class Main {
    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.name = "mohsen";
        lion.age = 8;
        lion.family = "monster";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "esprit";
        myZoo.city = "Ariana";
        //myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];


        Animal dog = new Animal("dog1", "dog2", 4, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("dog1", "dog2", 4, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

    }

}