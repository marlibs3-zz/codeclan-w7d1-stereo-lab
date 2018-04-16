import components.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer cdplayer;

    @Before
    public void before(){
        cdplayer = new CDPlayer("Panasonic", "SC-HC297", 50);
    }

    @Test
    public void cangetMakeAndModel(){
        assertEquals("Denon", cdplayer.getMake());
        assertEquals("D-M40", cdplayer.getModel());
    }

    @Test
    public void cansetMakeAndModel(){
        cdplayer.setMake("DENON");
        cdplayer.setModel("AAAAAAGGGGHHH");
        assertEquals("DENON", cdplayer.getMake());
        assertEquals("AAAAAAGGGGHHH", cdplayer.getModel());
    }


}
