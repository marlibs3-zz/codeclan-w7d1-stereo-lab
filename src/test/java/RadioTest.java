import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){
        radio = new Radio("Denon", "D-M40", 50);
    }

    @Test
    public void cangetMakeAndModel(){
        assertEquals("Denon", radio.getMake());
        assertEquals("D-M40", radio.getModel());
    }

    @Test
    public void cansetMakeAndModel(){
        radio.setMake("DENON");
        radio.setModel("AAAAAAGGGGHHH");
        assertEquals("DENON", radio.getMake());
        assertEquals("AAAAAAGGGGHHH", radio.getModel());
    }

    @Test
    public void canTune(){
        radio.tune(105.0);
        assertEquals(105.0, radio.getStation(), 0);
    }

    @Test
    public void canPlay(){
        radio.tune(105.0);
        assertEquals("You are listening to Dancing in the Moonlight on 105.0!", radio.play("Dancing in the Moonlight"));
    }

    @Test
    public void canConnect(){
        assertEquals("Radio is now connected.", radio.connect());
    }


}
