package case_study.models;

public class Booking {
    private int bookingCode;
    private String checkInDay;
    private String checkOutDay;
    private int customerId;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(int bookingCode, String checkInDay, String checkOutDay, int customerId, String serviceName, String serviceType) {
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

    public String getCheckInDay() {
        return checkInDay;
    }

    public String getCheckOutDay() {
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

    public void setCheckInDay(String checkInDay) {
        this.checkInDay = checkInDay;
    }

    public void setCheckOutDay(String checkOutDay) {
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
}
