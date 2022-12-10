package Products.FlourSection;
import Products.Products;
import java.time.LocalDate;

public abstract class FlourSection extends Products {
    public FlourSection(int id, String name, String manufacturer, LocalDate date) {
        super(id, name, manufacturer, date);
    }
}
