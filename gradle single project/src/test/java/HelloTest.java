import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
     public void testBar() {
         var result = HelloWorld.bar();
         assertEquals("bar", result);
    }
}
