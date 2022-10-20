package case_study.models;

import java.util.Date;
import java.util.Objects;

public class Booking {
    private int bookingCode;
    private Date checkInDay;
    private Date checkOutDay;
    private int customerId;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(int bookingCode, Date checkInDay, Date checkOutDay, int customerId, String serviceName, String serviceType) {
        this.bookingCode = bookingCode;
        this.checkInDay = checkInDay;
        this.checkOutDay = checkOutDay;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public Date getCheckInDay() {
        return checkInDay;
    }

    public Date getCheckOutDay() {
        return checkOutDay;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public void setCheckInDay(Date checkInDay) {
        this.checkInDay = checkInDay;
    }

    public void setCheckOutDay(Date checkOutDay) {
        this.checkOutDay = checkOutDay;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", checkInDay='" + '\'' + checkInDay.getDate() + '/' +  (checkInDay.getMonth() + 1) + '/' + (checkInDay.getYear() + 1900) + '\'' +
                ", checkOutDay='" + '\'' + checkOutDay.getDate() + '/' +  (checkOutDay.getMonth() + 1) + '/' + (checkOutDay.getYear() + 1900) + '\'' +
                ", customerId=" + customerId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingCode == booking.bookingCode && customerId == booking.customerId && checkInDay.equals(booking.checkInDay) && checkOutDay.equals(booking.checkOutDay) && serviceName.equals(booking.serviceName) && serviceType.equals(booking.serviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingCode, checkInDay, checkOutDay, customerId, serviceName, serviceType);
    }
}
