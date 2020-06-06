package spring.core.bean.collaboration;

public class Address {

    private String unit;
    private String street;
    private String district;
    private String country;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "unit='" + unit + '\'' +
                ", street='" + street + '\'' +
                ", district='" + district + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
