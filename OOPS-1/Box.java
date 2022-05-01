public class Box {
    double length;
    double width;
    double height;

    public Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this.length = size;
        this.width = size;
        this.height = size;
    }

    void information() {
        System.out.println("length: " + this.length + "\n");
        System.out.println("width: " + this.width + "\n");
        System.out.println("height: " + this.height + "\n");
    }
}
