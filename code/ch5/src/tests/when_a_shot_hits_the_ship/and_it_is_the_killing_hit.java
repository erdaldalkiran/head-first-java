package tests.when_a_shot_hits_the_ship;

import com.erdaldalkiran.Ship;
import com.erdaldalkiran.ShotResult;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

public class and_it_is_the_killing_hit {
    @Test
    public void should_return_KILL(){
        Ship ship = new Ship(Arrays.asList(2,3,4));
        ship.checkShot(2);
        ship.checkShot(3);

        ShotResult result = ship.checkShot(4);

        Assert.assertEquals(ShotResult.KILL, result);
    }
}
