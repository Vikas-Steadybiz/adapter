package com.example.adapter;

public class OTA_AirLowFareSearchRS {


    private float PricedItinCount;
    private float BrandedOneWayItinCount;
    private float SimpleOneWayItinCount;
    private float DepartedItinCount;
    private float SoldOutItinCount;
    private float AvailableItinCount;
    private String Version;
    Success SuccessObject;
    Warnings WarningsObject;
    PricedItineraries PricedItinerariesObject;
    TPA_Extensions TPA_ExtensionsObject;


    // Getter Methods

    public float getPricedItinCount() {
        return PricedItinCount;
    }

    public float getBrandedOneWayItinCount() {
        return BrandedOneWayItinCount;
    }

    public float getSimpleOneWayItinCount() {
        return SimpleOneWayItinCount;
    }

    public float getDepartedItinCount() {
        return DepartedItinCount;
    }

    public float getSoldOutItinCount() {
        return SoldOutItinCount;
    }

    public float getAvailableItinCount() {
        return AvailableItinCount;
    }

    public String getVersion() {
        return Version;
    }

    public Success getSuccess() {
        return SuccessObject;
    }

    public Warnings getWarnings() {
        return WarningsObject;
    }

    public PricedItineraries getPricedItineraries() {
        return PricedItinerariesObject;
    }

    public TPA_Extensions getTPA_Extensions() {
        return TPA_ExtensionsObject;
    }

    // Setter Methods

    public void setPricedItinCount(float PricedItinCount) {
        this.PricedItinCount = PricedItinCount;
    }

    public void setBrandedOneWayItinCount(float BrandedOneWayItinCount) {
        this.BrandedOneWayItinCount = BrandedOneWayItinCount;
    }

    public void setSimpleOneWayItinCount(float SimpleOneWayItinCount) {
        this.SimpleOneWayItinCount = SimpleOneWayItinCount;
    }

    public void setDepartedItinCount(float DepartedItinCount) {
        this.DepartedItinCount = DepartedItinCount;
    }

    public void setSoldOutItinCount(float SoldOutItinCount) {
        this.SoldOutItinCount = SoldOutItinCount;
    }

    public void setAvailableItinCount(float AvailableItinCount) {
        this.AvailableItinCount = AvailableItinCount;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public void setSuccess(Success SuccessObject) {
        this.SuccessObject = SuccessObject;
    }

    public void setWarnings(Warnings WarningsObject) {
        this.WarningsObject = WarningsObject;
    }

    public void setPricedItineraries(PricedItineraries PricedItinerariesObject) {
        this.PricedItinerariesObject = PricedItinerariesObject;
    }

    public void setTPA_Extensions(TPA_Extensions TPA_ExtensionsObject) {
        this.TPA_ExtensionsObject = TPA_ExtensionsObject;
    }
}
