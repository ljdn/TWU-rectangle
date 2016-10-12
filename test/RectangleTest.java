import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created bye lduan on 10/12/16.
 */
public class RectangleTest {
    @Test
    public void shouldCreateRectangle() throws Exception {
        int height = 1;
        int width = 1;
        Rectangle rectangle = Rectangle.rectangle(height, width);
        assertNotNull(rectangle);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotCreateRectangleWithNegativeHeight() throws Exception {
        int height = -1;
        int width = 1;
        Rectangle.rectangle(height, width);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotCreateRectangleWithNegativeWidth() throws Exception {
        int height = 1;
        int width = -1;
        Rectangle.rectangle(height, width);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotCreateRectangleWithZeroSide() throws Exception {
        int height = 0;
        int width = 0;
        Rectangle.rectangle(height, width);
    }

    @Test
    public void shouldHaveAreaOfSixWhenHeightIsTwoAndWidthIsThree() throws Exception {
        Rectangle rectangle = Rectangle.rectangle(2, 3);
        int area = rectangle.calculateArea();
        int expectedArea = 6;
        assertEquals(expectedArea, area);
    }

    @Test
    public void shouldHaveAreaOfTenWhenHeightIsTwoAndWidthIsFive() throws Exception {
        int height = 2;
        int width = 5;
        Rectangle rectangle = Rectangle.rectangle(height, width);
        int area = rectangle.calculateArea();
        int expectedArea = 10;
        assertEquals(expectedArea, area);
    }

    @Test
    public void squareShouldHaveAreaOfOneWhenSideIsOne() throws Exception {
        int side = 1;
        Rectangle square = Rectangle.square(side);
        int area = square.calculateArea();
        int expectedArea = 1;
        assertEquals(expectedArea, area);

    }

    @Test
    public void shouldHavePerimeterOf6WhenHeightIsOneAndWidthIsTwo() throws Exception {
        int height = 1;
        int width = 2;
        Rectangle rectangle = Rectangle.rectangle(height, width);
        int perimeter = rectangle.perimeter();
        int expectedPerimeter = 6;
        assertEquals(expectedPerimeter, perimeter);

    }

    @Test
    public void shouldHavePerimeterOfTenWhenHeightIsTwoAndWidthIsThree() throws Exception {
        int height = 2;
        int width = 3;
        Rectangle rectangle = Rectangle.rectangle(height, width);
        int perimeter = rectangle.perimeter();
        int expectedPerimeter = 10;
        assertEquals(expectedPerimeter, perimeter);
    }
}
