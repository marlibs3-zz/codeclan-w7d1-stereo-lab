import components.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    private RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Audio-Technica", "AT-LP120", 70);
    }

    @Test
    public void canGetMakeAndModel(){
        assertEquals("Audio-Technica", recordDeck.getMake());
        assertEquals("AT-LP120", recordDeck.getModel());
    }

    @Test
    public void canSetMakeAndModel(){
        recordDeck.setMake("DENON");
        recordDeck.setModel("AAAAAAGGGGHHH");
        assertEquals("DENON", recordDeck.getMake());
        assertEquals("AAAAAAGGGGHHH", recordDeck.getModel());
    }

    @Test
    public void canSetSpeed(){
        recordDeck.setSpeed(2);
        assertEquals(2, recordDeck.getSpeed(), 0);
    }

    @Test
    public void canPlay(){
        assertEquals("You are listening to Goths on vinyl.", recordDeck.play("Goths"));
    }

    @Test
    public void canConnect(){
        assertEquals("Record deck is now connected.", recordDeck.connect());
    }

}
