public class Animal {
    public String name;
    public String favoriteFood;
    public static int population;

 public Animal(String name, String favoriteFood) {
     this.name=name;
     this.favoriteFood=favoriteFood;
     population ++;
 }
    public void sleep() {
        System.out.println(name + " sleeps for 8 hours a day.");

    }

    public void eat(String food) {
        System.out.println(name + " eats " + food );
        if(food==favoriteFood){
            System.out.println("YUM!! " + name +" wants more " + food);

        } else{
            sleep();
        }
    }
}