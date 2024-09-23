import java.util.Scanner;

public class ZooManagement
{
    //int nbrCages=20;
    //String zooName="my zoo";

    public static void main(String[] args) {


        Animal lion= new Animal("lion","Alex",10,true);
        Animal tiger= new Animal("Tiger","John",5,true);
        Zoo zoo=new Zoo("Zoo Africa", "Mourouj");
            zoo.addAnimal(lion);
        zoo.addAnimal(tiger);


        System.out.println("Le nombre d'animaux est : " +zoo.nbrAnimal);

        Animal singe=new Animal("singe","Bob",5,true);
        zoo.addAnimal(singe);
        System.out.println("L'index de l'animal est : "+zoo.searchAnimal(singe));
        zoo.displayAnimals();
        Animal singe1=new Animal("singe","Bob",5,true);
        zoo.addAnimal(singe1);
        System.out.println("L'index de l'animal identique est : "+zoo.searchAnimal(singe1));
        zoo.removeAnimal(singe);
        zoo.displayAnimals();
        if(zoo.isZooFull())
        {
            System.out.println("Le zoo est plein");
        }
        else
        {
            System.out.println("Le zoo contient " + zoo.nbrAnimal + " animaux");
        }
        Zoo z1= new Zoo("Excellence", "Mourouj");
        Zoo z2= new Zoo("Belvedere", "Mourouj");
        z1.addAnimal(tiger);
        z1.addAnimal(lion);
        z2.addAnimal(lion);

        zoo.comparerZoo(z1,z2);





       // ZooManagement zm=new ZooManagement();
       // Scanner sc=new Scanner(System.in);

        /*Animal lionn=new Animal();
        Zoo zooo.new Zoo();
        lionn.family="Carnivore";
        lionn.name="Alex";
        lionn.age="15";
        lionn.isMammal=true;
        zooo.name="Belvedere";
        zooo.nbrCages=25;
        zooo.city="Tunis";
        Animal lion=new Animal("Carnivore","Alex",10,true);
        Zoo myZoo=new Zoo("Zoo Africa", "Mourouj", 25);
        System.out.println(lion.toString());*/

        /*System.out.println("Donnez le nombre de cages");
        while (!sc.hasNextInt()) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
            sc.nextInt();
        }
        zm.nbrCages = sc.nextInt();
        sc.nextLine();


        System.out.println("Donnez le nom du zoo");
        while (true) {
            zm.zooName = sc.nextLine();
            if (zm.zooName.trim().isEmpty()) {
                System.out.println("Entrée invalide. Veuillez entrer un nom valide.");
            } else {
                break;
            }
        }

        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages");
*/
    }

}

