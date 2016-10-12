/**
 * Created by lduan on 10/12/16.
 */
class Rectangle {
    private final int height;
    private final int width;

    private Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        if (height<=0 || width <=0) {
            throw new IllegalArgumentException();
        }
    }


    int calculateArea() {
        return height * width;
    }
     static Rectangle square(int side) {
        return new Rectangle(side, side);
    }

     static Rectangle rectangle(int height, int width) {
        return new Rectangle(height, width);
    }

    int perimeter() {
        return 2 * height + 2 * width;
    }
}
