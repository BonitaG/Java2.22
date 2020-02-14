public class Triangle extends Figure{
    private int a;

    public Triangle(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
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
