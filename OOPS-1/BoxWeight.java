public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super();
        this.weight = -1.0;
    }

    public BoxWeight(double weight) {
        super();
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    void information() {
        System.out.println("length: " + this.length + "\n");
        System.out.println("width: " + this.width + "\n");
        System.out.println("height: " + this.height + "\n");
        System.out.println("weight: " + this.weight + "\n");
    }
}
