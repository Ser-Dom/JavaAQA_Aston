public class Cat extends Animal {

    private static int catCount = 0;
    private boolean catIsHungry;

    public Cat() {
        super();
        catCount++;
        catIsHungry = true;
    }

    public boolean getCatIsHungry() {
        return catIsHungry;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int s) {
        if (s <= 200) {
            super.run(s);
        } else {
            System.out.println(super.name + " может пробежать не больше 200м");
        }
    }

    @Override
    public void swim(int s) {
        System.out.println(super.name + " не умеет плавать");
    }

    public boolean eat(int amount) {
        if (amount <= 0) {
            System.out.println("Мало еды.");
            return false;
        }

        if (catIsHungry) {
            System.out.println("Кот поел " + amount + " еды.");
            catIsHungry = false;
            return true;
        } else {
            System.out.println("Кот не голоден.");
            return false;
        }
    }

}
