package case_study.models;

public class Room extends Facility {
    private String additionalFreeService;

    public Room() {
    }

    public Room(String additionalFreeService) {
        this.additionalFreeService = additionalFreeService;
    }

    public Room(String name, double usageArea, double rentPrice, int maxPeople, String rentType, String additionalFreeService) {
        super(name, usageArea, rentPrice, maxPeople, rentType);
        this.additionalFreeService = additionalFreeService;
    }

    public String getAdditionalFreeService() {
        return additionalFreeService;
    }

    public void setAdditionalFreeService(String additionalFreeService) {
        this.additionalFreeService = additionalFreeService;
    }
}
