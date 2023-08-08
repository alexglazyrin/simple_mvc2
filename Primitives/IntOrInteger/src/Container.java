public class Container {
    private Integer count = 0; // у меня тут два варианта было: либо тип поменять на примитив, либо присвоить значение обертке.

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}
