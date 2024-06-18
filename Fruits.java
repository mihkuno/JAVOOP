// parent class
class Fruit {
    public void showDetails() {
        System.out.println("This is a fruit.");
    }
}

// subclass apple
class Apple extends Fruit {
    public void showDetails() {
        System.out.println("This is an apple.");
    }
}

// subclass orange
class Orange extends Fruit {
    public void showDetails() {
        System.out.println("This is an orange.");
    }
}

// subclass mango
class Mango extends Fruit {
    public void showDetails() {
        System.out.println("This is a mango.");
    }
}

// main class
public class Fruits {
    public static void main(String[] args) {

        // creating objects of each subclass
        Fruit myApple  = new Apple();
        Fruit myOrange = new Orange();
        Fruit myMango  = new Mango();
        
        myApple.showDetails();
        myOrange.showDetails();
        myMango.showDetails();
    }
}
