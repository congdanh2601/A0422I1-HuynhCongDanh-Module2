package case_study.services;

import case_study.models.Facility;

public interface BookingService extends Service {
    public Facility findServiceByName();
}
