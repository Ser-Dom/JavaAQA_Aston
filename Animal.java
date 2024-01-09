public class Animal {

    String name;
    private static int objCount = 0;

    public Animal() {
        objCount++;
    }

    public static int getObjCount() {
        return objCount;
    }

    public void swim(int s) {
        System.out.println(this.name + " проплыл " + s + " метров");
    }

    public void run(int s) {
        System.out.println(this.name + " пробежал " + s + " метров");
    }


}
