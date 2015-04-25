package tests;

import com.erdaldalkiran.Ship;
import com.erdaldalkiran.ShotResult;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

public class when_a_shot_misses_the_ship {

    @Test
    public void should_return_miss(){
        Ship ship = new Ship(Arrays.asList(1,2,3));

        ShotResult result = ship.checkShot(5);

        Assert.assertEquals(ShotResult.MISS, result);
    }
}
