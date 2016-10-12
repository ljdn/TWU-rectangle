/**
 * Created by lduan on 10/12/16.
 */
class Circle {
    private static final float PI = 3.14f;
    private final float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    float area() {
        return PI * radius * radius;
    }

    float perimeter() {
        return PI * 2 * radius;
    }
}
