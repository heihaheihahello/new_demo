import static org.junit.Assert.*;
import org.junit.*;


public class divideTest {
    @Test
    public void test1(){
        divide div1 = new divide();
        assertEquals(String.valueOf(4.0/3), div1.div("4/3"));
    }    
}
