package Chap_08;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if(width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and Height must be non-negative");
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
