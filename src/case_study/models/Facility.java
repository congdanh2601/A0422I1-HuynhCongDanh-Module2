package case_study.models;

public abstract class Facility {
    private String name;
    private double usageArea;
    private double rentPrice;
    private int maxPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String name, double usageArea, double rentPrice, int maxPeople, String rentType) {
        this.name = name;
        this.usageArea = usageArea;
        this.rentPrice = rentPrice;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUsageArea() {
        return usageArea;
    }

    public void setUsageArea(double usageArea) {
        this.usageArea = usageArea;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", usageArea=" + usageArea +
                ", rentPrice=" + rentPrice +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'';
    }
}
