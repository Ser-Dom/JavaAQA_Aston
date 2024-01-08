public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog() {
        super();
        dogCount++;
    }


    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int s) {
        if (s <= 500) {
            super.run(s);
        } else {
            System.out.println(super.name + " может пробежать не больше 500м");
        }
    }

    @Override
    public void swim(int s) {
        if (s <= 10) {
            super.swim(s);
        } else {
            System.out.println(super.name + " может проплыть не больше 10м");
        }
    }
}
