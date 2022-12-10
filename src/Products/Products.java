package Products;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Products {
    private int id;
    private String name;
    private String manufacturer;
    private LocalDate date;

    public Products(int id, String name, String manufacturer, LocalDate date) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return id == products.id && Objects.equals(name, products.name) && Objects.equals(manufacturer, products.manufacturer) && Objects.equals(date, products.date);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, manufacturer, date);
    }
}
