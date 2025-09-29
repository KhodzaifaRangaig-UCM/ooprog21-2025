public class DebugBox {
    private int width;
    private int length;
    private int height;

    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;  // fixed
        this.height = height;  // fixed
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public double getVolume() {
        return length * width * height;
    }
}
