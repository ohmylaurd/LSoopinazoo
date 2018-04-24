public class Giraffe extends Animal {

    public Giraffe(String name){
        super(name,"leaves");
    }

    @Override
    public void eat(String food){
        System.out.println(name + " eats " + food);
        if(food==favoriteFood){
            System.out.println("YUM!! " + name +" wants more " + food);

        } else{
            System.out.println("YUCK " + name + " will not eat "+ food);
        }
    }
}
