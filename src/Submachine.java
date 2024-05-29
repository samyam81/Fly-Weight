import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Submachine implements Shooting {

    private static final Logger LOGGER = LoggerFactory.getLogger(Submachine.class);

    @Override
    public void shoot() {
        LOGGER.info("Submachine is shooting (Hash={})", System.identityHashCode(this));
    }
}
