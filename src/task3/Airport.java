package task3;

public class Airport {
    private String country;
    private String city;
    public Airport(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}