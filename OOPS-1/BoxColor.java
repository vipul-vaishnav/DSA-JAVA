public class BoxColor extends BoxWeight {
    String color;

    public BoxColor() {
        super();
        this.color = "black";
    }

    public BoxColor(String color) {
        super();
        this.color = color;
    }

    public BoxColor(double weight, String color) {
        super(weight);
        this.color = color;
    }

    public BoxColor(double size, double weight, String color) {
        super(size, weight);
        this.color = color;
    }

    public BoxColor(double length, double width, double height, double weight, String color) {
        super(length, width, height, weight);
        this.color = color;
    }

    void information() {
        System.out.println("length: " + this.length + "\n");
        System.out.println("width: " + this.width + "\n");
        System.out.println("height: " + this.height + "\n");
        System.out.println("weight: " + this.weight + "\n");
        System.out.println("color: " + this.color + "\n");
    }
}
