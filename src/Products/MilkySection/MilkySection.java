package Products.MilkySection;
import Products.Products;
import java.time.LocalDate;

public abstract class MilkySection extends Products {
    public MilkySection(int id, String name, String manufacturer, LocalDate date) {
        super(id, name, manufacturer, date);
    }
}
