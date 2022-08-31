package case_study.models;

public class Contract {
    private int contractNumber;
    private int bookingCode;
    private double deposit;
    private double totalAmountToPay;
    private int customerId;

    public Contract() {
    }

    public Contract(int contractNumber, int bookingCode, double deposit, double totalAmountToPay, int customerId) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalAmountToPay = totalAmountToPay;
        this.customerId = customerId;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalAmountToPay() {
        return totalAmountToPay;
    }

    public void setTotalAmountToPay(double totalAmountToPay) {
        this.totalAmountToPay = totalAmountToPay;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
