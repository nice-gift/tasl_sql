package by.it_academy.jd2.task_sql.dao_hibernate.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "bookings", name = "airports_data")
public class AirportEntity {
    @Id
    @Column(name = "airport_code")
    private String airportСode;
    @Column(name = "airport_name")
    private String airportName;
    private String city;
    private String coordinates;
    private String timezone;

    public AirportEntity() {
    }

    public AirportEntity(String airportСode, String airportName, String city, String coordinates, String timezone) {
        this.airportСode = airportСode;
        this.airportName = airportName;
        this.city = city;
        this.coordinates = coordinates;
        this.timezone = timezone;
    }

    public String getAirportСode() {
        return airportСode;
    }

    public void setAirportСode(String airportСode) {
        this.airportСode = airportСode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirportEntity airport = (AirportEntity) o;

        if (airportСode != null ? !airportСode.equals(airport.airportСode) : airport.airportСode != null) return false;
        if (airportName != null ? !airportName.equals(airport.airportName) : airport.airportName != null) return false;
        if (city != null ? !city.equals(airport.city) : airport.city != null) return false;
        if (coordinates != null ? !coordinates.equals(airport.coordinates) : airport.coordinates != null) return false;
        return timezone != null ? timezone.equals(airport.timezone) : airport.timezone == null;
    }

    @Override
    public int hashCode() {
        int result = airportСode != null ? airportСode.hashCode() : 0;
        result = 31 * result + (airportName != null ? airportName.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        result = 31 * result + (timezone != null ? timezone.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportСode=" + airportСode +
                ", airportName='" + airportName + '\'' +
                ", city='" + city + '\'' +
                ", coordinates='" + coordinates + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';
    }
}