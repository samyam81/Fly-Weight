import java.util.*;

public class GunFactory {

    private Map<GunType, Shooting> gunRepo;

    public GunFactory() {
        gunRepo = new EnumMap<>(GunType.class);
    }

    public Shooting createGun(GunType type) {
        Shooting gun = gunRepo.get(type);
        if (null == gun) {
            switch (type) {
                case HandGun: {
                    gun = new HandGun();
                    gunRepo.put(GunType.HandGun, gun);
                    break;
                }
                case Musket: {
                    gun = new Musket();
                    gunRepo.put(GunType.Musket, gun);
                    break;
                }
                case SNIPER: {
                    gun = new Sniper();
                    gunRepo.put(GunType.SNIPER, gun);
                    break;
                }
                case SUBMACHINE: {
                    gun = new Submachine();
                    gunRepo.put(GunType.SUBMACHINE, gun);
                    break;
                }
            }
        }
        return gun;
    }
}
