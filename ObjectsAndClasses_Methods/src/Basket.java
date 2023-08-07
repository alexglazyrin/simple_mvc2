public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    public static int totalPriceAll = 0;
    public static int totalProductCount = 0;

    public static int getTotalPriceAll() {
        return totalPriceAll;
    }

    public static int getTotalProductCount() {
        return totalProductCount;
    }

    public static void increaseTotalPriceAll(int price){
        Basket.totalPriceAll = Basket.totalPriceAll + price;
    }

    public static void increaseTotalCount(int count){
        Basket.totalProductCount = Basket.totalProductCount + count;
    }

    public static double calcAveragePrice(){
        return (double) Basket.totalPriceAll / Basket.totalProductCount;
    }
    public static double calcAveragePricePerBasket(){
        return (double) Basket.totalPriceAll / Basket.count;
    }


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count, double weight){
        add(name, price, count);
        totalWeight = totalWeight + weight;

    }

    public double getTotalWeight(){
        return totalWeight;
    }


    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        increaseTotalCount(count);
        increaseTotalPriceAll(price * count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println("===================");
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
        System.out.println("===================");
    }
}
