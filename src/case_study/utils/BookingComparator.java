package case_study.utils;

import case_study.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking b1, Booking b2) {
        if(!b1.getCheckInDay().equals(b2.getCheckInDay())) {
            return b1.getCheckInDay().compareTo(b2.getCheckInDay());
        } else {
            return b1.getCheckOutDay().compareTo(b2.getCheckOutDay());
        }
    }
}
