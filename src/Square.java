public class Square extends Figure{
    private int c;

    public Square(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public String draw() {
        return null;
    }
}
