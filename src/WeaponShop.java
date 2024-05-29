import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeaponShop {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeaponShop.class);

    private List<Shooting> shelfA;
    private List<Shooting> shelfB;

    public WeaponShop() {
        shelfA = new ArrayList<>();
        shelfB = new ArrayList<>();
        fillShelves();
    }

    private void fillShelves() {
        GunFactory factory = new GunFactory();

        shelfA.add(factory.createGun(GunType.HandGun));
        shelfA.add(factory.createGun(GunType.HandGun));
        shelfA.add(factory.createGun(GunType.Musket));
        shelfA.add(factory.createGun(GunType.Musket));
        shelfA.add(factory.createGun(GunType.SNIPER));
        shelfA.add(factory.createGun(GunType.SNIPER));
        shelfA.add(factory.createGun(GunType.Musket));
        shelfA.add(factory.createGun(GunType.HandGun));

        shelfB.add(factory.createGun(GunType.SUBMACHINE));
        shelfB.add(factory.createGun(GunType.SUBMACHINE));
        shelfB.add(factory.createGun(GunType.SUBMACHINE));
        shelfB.add(factory.createGun(GunType.SNIPER));
    }

    public final List<Shooting> getGunsOnShelfA() {
        return Collections.unmodifiableList(shelfA);
    }

    public final List<Shooting> getGunOnShelfB() {
        return Collections.unmodifiableList(shelfB);
    }

    public void enumerateShelves() {
        enumerateShelfA();
        enumerateShelfB();
    }

    private void enumerateShelfA() {
        LOGGER.info("Enumerating Shelf A:");
        for (Shooting gun : shelfA) {
            gun.shoot();
        }
    }

    private void enumerateShelfB() {
        LOGGER.info("Enumerating Shelf B:");
        for (Shooting gun : shelfB) {
            gun.shoot();
        }
    }