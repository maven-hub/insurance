package sda.sapiens.insurance.model;

public enum InsuranceType {
    LIFE("Life Insurance"),
    HOUSE("House Insurance"),
    CAR("Car Insurance");

    private final String fullName;

    InsuranceType(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
