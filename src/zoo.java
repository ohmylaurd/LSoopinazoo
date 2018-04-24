import java.util.ArrayList;

public class zoo {

    public static void main(String[] args) {
        zoo animal = new zoo();
        animal.sleep("Koala");
        Tiger tigger = new Tiger("Tigger");
        tigger.sleep();
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("honey");
        pooh.eat("fish");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        Bee stinger = new Bee("Stinger");
        stinger.eat("pollen");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");
        ArrayList<Animal> animals= new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(pooh);
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals( animals, "Spring Rolls" );
    }
    public void sleep(String name) {

        System.out.println(name + " sleeps for 8 hours");
    }

    String favoriteFood = "animal crackers";

    public void eat(String name, String food){
        System.out.print(name +" eats "+ food);
        if(food==favoriteFood){
           System.out.print("YUM!!" + name +" wants more " + food);

        } else{
            System.out.println(name + " sleeps for 8 hours");
        }
    }
    }


