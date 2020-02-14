public class Rectangle extends Figure{
    private int w;

    public Rectangle(int w) {
        this.w = w;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
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
