import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HandGun implements Shooting {

    private static final Logger LOGGER = LoggerFactory.getLogger(HandGun.class);

    @Override
    public void shoot() {
        LOGGER.info("HandGun is shooting (Hash={})", System.identityHashCode(this));
    }
}
