import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Musket implements Shooting {

    private static final Logger LOGGER = LoggerFactory.getLogger(Musket.class);

    @Override
    public void shoot() {
        LOGGER.info("Musket is shooting (Hash={})", System.identityHashCode(this));
    }
}
