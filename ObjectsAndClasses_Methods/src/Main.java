public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Coffe", 1500, 1, 1000);
        basket.add("Garlic", 500, 1, 275);
        basket.add("Magazine", 250);
        basket.print("Milk");
        System.out.println("Итоговый вес корзины: " + basket.getTotalWeight() + " гр.");
        System.out.println("Итоговая сумма покупок в корзине: " + basket.getTotalPrice() + " руб.");

        Basket basket1 = new Basket(1000);
        basket1.add("Milk", 80, 2,2000);
        basket1.add("Chokolate", 1200, 1, 200);
        basket1.print("qwerty");
    }
}
