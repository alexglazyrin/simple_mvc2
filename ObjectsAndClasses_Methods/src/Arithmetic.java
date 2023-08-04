public class Arithmetic {
    int a;
    int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        return this.a + this.b;
    }

    public int sub(){
        return this.a - this.b;
    }

    public int mul(){
        return this.a * this.b;
    }

    public int div(){
        return this.a / this.b;
    }

}
