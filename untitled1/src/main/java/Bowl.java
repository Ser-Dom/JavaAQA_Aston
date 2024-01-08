public class Bowl {
    private int foodAmount;

    public int getFoodAmount() {
        return foodAmount;
    }

    public Bowl(int initialFood) {
        if (initialFood < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = initialFood;
        }
    }



    public void addFood(int amount) {
        if (amount >= 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды в миску.");
        } else {
            System.out.println("Некорректное количество еды.");
        }
    }

    public boolean feedCat(Cat cat, int amount) {
        if (amount <= 0) {
            System.out.println("Мало еды.");
            return false;
        }

        if (foodAmount >= amount && cat.eat(amount)) {
            foodAmount -= amount;
            return true;
        } else {
            System.out.println("В миске недостаточно еды.");
            return false;
        }
    }
}
