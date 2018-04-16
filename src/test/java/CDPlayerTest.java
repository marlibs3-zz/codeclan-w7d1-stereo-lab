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
    public void canGetMakeAndModel(){
        assertEquals("Panasonic", cdplayer.getMake());
        assertEquals("SC-HC297", cdplayer.getModel());
    }

    @Test
    public void canSetMakeAndModel(){
        cdplayer.setMake("DENON");
        cdplayer.setModel("AAAAAAGGGGHHH");
        assertEquals("DENON", cdplayer.getMake());
        assertEquals("AAAAAAGGGGHHH", cdplayer.getModel());
    }

    @Test
    public void canSetNumOfCDs(){
        cdplayer.setNumOfCDs(2);
        assertEquals(2, cdplayer.getNumOfCDs());
    }

    @Test
    public void canPlay(){
        assertEquals("You are listening to All Hail West Texas!", cdplayer.play("All Hail West Texas"));
    }

    @Test
    public void canConnect(){
        assertEquals("CD player is now connected.", cdplayer.connect());
    }

}
