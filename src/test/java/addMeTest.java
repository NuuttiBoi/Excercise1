import org.example.App;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class addMeTest {
    App app = new App();

    @Test
    public void addMeTest(){
        assertEquals(12.0, app.addMe(11,1), 0.001);
    }
}
