public abstract class Figure{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract  double calculatePerimeter();

    public abstract String draw();

}
