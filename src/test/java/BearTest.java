import com.codebase.Bear;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;


    @Before
    public void before() {
        bear = new Bear("Baloo", 20, 523.12);
    }


    @Test
    public void hasName() {
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(20, bear.getAge());
    }

    @Test
    public void hasWeight() {
        assertEquals(523.12, bear.getWeight(), 0.0);
    }

    @Test
    public void canSetWeight() {
        bear.setWeight(600);
        assertEquals(600, bear.getWeight(), 0.0);
    }

    @Test
    public void canEatPeacock() {
        bear.eatPeacock(4);
        assertEquals(577, bear.getWeight(),0.0);
    }
}
