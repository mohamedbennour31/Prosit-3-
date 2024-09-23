public class Zoo {
    Animal [] animals;
    String name;
    String city;
    final int nbrCages=25;
    int nbrAnimal;
    public Zoo( String name, String city){
        this.animals=new Animal[nbrCages];
        this.name=name;
        this.city=city;

    };
    public boolean addAnimal(Animal animal) {

        if(nbrAnimal<nbrCages && searchAnimal(animal) == -1)
        {
            animals[nbrAnimal]=animal;
            nbrAnimal++;
            return true;
        }
        else
        {
            System.out.println("Vous avez dépassé la limite de nombre maximal d'animaux ou l'animal existe déjà");
            return false;
        }
    }
    public void displayAnimals(){
        for(int i=0;i<nbrCages;i++)
        {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal){
        if(searchAnimal(animal)!=-1)
        {
            animals[searchAnimal(animal)]=null;
            System.out.println("L'animal " + animal.name + " a été supprimé");
            nbrAnimal--;
            return true;
        }
        else return false;
    }
    public boolean isZooFull()
    {
        return nbrAnimal >= nbrCages;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if (z1.nbrAnimal>z2.nbrAnimal)
        {
            System.out.println("Le zoo "+z1.name+ " contient plus d'animaux que le zoo " + z2.name);
        }
        else if (z1.nbrAnimal==z2.nbrAnimal)
        {
            System.out.println("Le zoo "+z1.name+ " contient le meme nombre d'animaux que le zoo " + z2.name);
        }
        else
        {
            System.out.println("Le zoo "+z2.name+ " contient plus d'animaux que le zoo " + z1.name);
        }
        return this;
    }

}
