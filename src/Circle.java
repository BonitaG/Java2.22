public class Circle extends Figure{
    private int r;
    public final double PI = 3.14;

    public Circle(String name, int r) {
        this.r = r;
        super.setName(name);
    }

    public Circle(int i) {
        super();
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*r;
    }

    @Override
    public String draw() {
        return "🔴";
    }
}
