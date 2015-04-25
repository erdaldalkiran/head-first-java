package tests.when_a_shot_hits_the_ship;

import com.erdaldalkiran.Ship;
import com.erdaldalkiran.ShotResult;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

public class and_it_is_not_the_killing_hit {

    @Test
    public void should_return_HIT(){
        Ship ship = new Ship(Arrays.asList(1,2,3));

        ShotResult result = ship.checkShot(2);

        Assert.assertEquals(ShotResult.HIT,result);
    }

}
