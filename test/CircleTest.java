
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by lduan on 10/12/16.
 */
public class CircleTest {
    @Test
    public void shouldCreateCircle() throws Exception {
        float radius = 1;
        Circle circle = new Circle(radius);
        assertNotNull(circle);
    }

    @Test
    public void areaOfCircleWithRadiusSevenIsOneFiFtyFour() throws Exception {
        float radius = 7;
        Circle circle = new Circle(radius);
        float expectedArea = 153.8f;
        assertEquals(expectedArea, circle.area(),.1);
    }
    @Test
    public void areaOfCircleWithRadiusOneIsThreePointOneFour() throws Exception {
        float radius = 1;
        Circle circle = new Circle(radius);
        float expectedArea = 3.14f;
        assertEquals(expectedArea, circle.area(),.1);
    }

    @Test
    public void perimeterIsSixPointTwoEightWhenRadiusIsOne() throws Exception {
        float radius = 1;
        Circle circle = new Circle(radius);
        float expectedPerimeter = 6.28f;
        assertEquals(expectedPerimeter, circle.perimeter(), .1);

    }
    @Test
    public void perimeterIsTwelvePointFiveSixTwoEightWhenRadiusIsTwo() throws Exception {
        float radius = 2;
        Circle circle = new Circle(radius);
        float expectedPerimeter = 12.56f;
        assertEquals(expectedPerimeter, circle.perimeter(), .1);

    }
}
