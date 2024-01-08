public class mainAnimal {
    public static void main(String[] args) {

        Dog dogBobik = new Dog();
        dogBobik.name = "Bobik";
        dogBobik.run(23);

        Cat catVaska = new Cat();
        catVaska.name = "Vaska";
        catVaska.run(155);

        System.out.println("Общее колличество животных " + Animal.getObjCount());
        System.out.println("Общее колличество Собак " + Dog.getDogCount());
        System.out.println("Общее колличество Кошек " + Cat.getCatCount());

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        System.out.println("Общее колличество Кошек " + Cat.getCatCount());

        Bowl bowl = new Bowl(20);
        bowl.addFood(15);

        bowl.feedCat(cat1, 15);
        bowl.feedCat(cat2, 5);
        bowl.feedCat(cat3, 20);

        System.out.println("\nИнформация после кормления:");
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("кот 1 голоден: " + cat1.getCatIsHungry());
        System.out.println("кот 2 голоден: " + cat2.getCatIsHungry());
        System.out.println("кот 3 голоден: " + cat3.getCatIsHungry());
        System.out.println("Всего еды в миске " + bowl.getFoodAmount());


    }
}
