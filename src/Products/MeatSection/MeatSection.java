package Products.MeatSection;
import Products.Products;
import java.time.LocalDate;

public abstract class MeatSection extends Products {
    public MeatSection(int id, String name, String manufacturer, LocalDate date) {
        super(id, name, manufacturer, date);
    }
}
