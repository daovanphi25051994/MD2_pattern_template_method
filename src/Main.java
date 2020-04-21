public class Main {
    public static void main(String[] args) {
        Meal hamburgerMeal = new HamburgerMeal();
        Meal tacoMeal = new TacoMeal();
        hamburgerMeal.doMeal();
        System.out.println();
        tacoMeal.doMeal();
    }

}
