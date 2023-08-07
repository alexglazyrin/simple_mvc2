public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Coffe", 1500, 1, 1000);
        basket.add("Garlic", 500, 1, 275);
        basket.add("Magazine", 250);
        basket.print("Alex");
        System.out.println("Итоговый вес корзины: " + basket.getTotalWeight() + " гр.");
        System.out.println("Итоговая сумма покупок в корзине: " + basket.getTotalPrice() + " руб.");

        Basket basket1 = new Basket(100000);
        basket1.add("Milk", 80, 2,2000);
        basket1.add("Chokolate", 1200, 1, 200);
        basket1.add("Cake", 500, 3, 475);
        basket1.print("John");
        System.out.println("Итоговый вес корзины: " + basket1.getTotalWeight() + " гр.");
        System.out.println("Итоговая сумма покупок в корзине: " + basket1.getTotalPrice() + " руб.");

        Basket basket2 = new Basket();
        basket2.add("product1",450,5, 100);
        basket2.add("product2", 1234);
        basket2.print("Siera");
        System.out.println("Итоговый вес корзины: " + basket2.getTotalWeight() + " гр.");
        System.out.println("Итоговая сумма покупок в корзине: " + basket2.getTotalPrice() + " руб.");

        System.out.println();
        System.out.println("Cредняя сумма покупок в корзине: " + Basket.calcAveragePricePerBasket());
        System.out.println("Cредняя цена товара в корзине: " + Basket.calcAveragePrice());
        System.out.println("Количество созданных корзин: " + Basket.getCount());
        System.out.println("Сумма всех покупок: " + Basket.getTotalPriceAll());
        System.out.println("Количество купленных товаров: " + Basket.getTotalProductCount());
    }
}
