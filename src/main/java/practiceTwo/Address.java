package practiceTwo;

public class Address {
    private String streetAddress;
    private int houseNumber;
    private String city;
    private String province;
    private String zipCode;

    public Address(String streetAddress, int houseNumber, String city, String province, String zipCode) {
        this.streetAddress = streetAddress;
        this.houseNumber = houseNumber;
        this.city = city;
        this.province = province;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address: "
                + this.getHouseNumber() + " "
                + this.getStreetAddress() + ", "
                + this.getCity() + ", "
                + this.getProvince() + ", "
                + this.getZipCode();
    }

    public String getHouseNumber() {
        return Integer.toString(houseNumber);
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getZipCode() {
        return zipCode;
    }


}
