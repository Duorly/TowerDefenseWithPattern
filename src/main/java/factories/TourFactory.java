package factories;

import enums.TourType;
import interfaces.TourFactoryInterface;
import models.Tour;
import models.TourArcher;
import models.TourCanon;
import models.TourMage;

public class TourFactory implements TourFactoryInterface {
    @Override
    public Tour createTour(TourType type) {
        return switch(type) {
            case TourType.ARCHER -> new TourArcher();
            case TourType.CANON -> new TourCanon();
            case TourType.MAGE -> new TourMage();
            default -> throw new RuntimeException( "TOUR INVALID EXCEPTION" );
        };
    }
}
