package interfaces;

import enums.TourType;
import models.Tour;

public interface TourFactoryInterface {
    public Tour createTour(TourType type);
}
