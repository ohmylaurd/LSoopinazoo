public class Tiger {
   public String name;
   public String favoriteFood;

    public Tiger(String name){
        this.name=name;
        this.favoriteFood="meat";

    }

        public void sleep() {
            System.out.println(name + " sleeps for 8 hours a day.");

        }


        public void eat(String food) {
            System.out.println(name + " eats " + food );
            if(food==favoriteFood){
                System.out.print("YUM!! " + name +" wants more " + food);

            }
        }

}





