import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sniper implements Shooting {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sniper.class);

    @Override
    public void shoot() {
        Logger.info("Sniper is shooting (Hash={})", System.identityHashCode(this));
    }
}