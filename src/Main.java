import Products.FlourSection.Bread;
import Products.FlourSection.FlourSection;
import Products.FlourSection.Pasta;
import Products.FlourSection.Wheat;
import Products.MeatSection.Meat;
import Products.MeatSection.MeatSection;
import Products.MeatSection.Sausage;
import Products.MilkySection.Kefir;
import Products.MilkySection.Milk;
import Products.MilkySection.MilkySection;
import Products.MilkySection.Yogurt;
import Products.Products;
import service.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MilkySection> milkySectionList = new ArrayList<>();
        milkySectionList.add(new Milk(1, "Milk", "MILKA", LocalDate.of(2023, 01, 10)));
        milkySectionList.add(new Yogurt(2, "Yogurt", "MILKA", LocalDate.of(2022, 12, 17)));
        milkySectionList.add(new Kefir(3, "Kefir", "Prostokvashino", LocalDate.of(2022, 11, 15)));
        List<MeatSection> meatSectionList = new ArrayList<>();
        meatSectionList.add(new Meat(1, "Meat", "TOIBOS", LocalDate.of(2022, 10, 11)));
        meatSectionList.add(new Sausage(2, "Sausage", "TOIBOS", LocalDate.of(2022, 12, 17)));
        meatSectionList.add(new Meat(3, "Meat", "TOIBoS", LocalDate.of(2023, 01, 17)));
        List<FlourSection> flourSectionList = new ArrayList<>();
        flourSectionList.add(new Bread(1, "Bread", "NUR", LocalDate.of(2022, 11, 17)));
        flourSectionList.add(new Pasta(2, "Pasta", "NUR", LocalDate.of(2022, 12, 16)));
        flourSectionList.add(new Wheat(3, "Wheat", "NUR", LocalDate.of(2022, 12, 18)));
        login(meatSectionList, milkySectionList, flourSectionList);
    }

    public static void login(List<MeatSection> meatSectionList, List<MilkySection> milkySectionList, List<FlourSection> flourSectionList) {
        User Manager = new User("qwerty", "12345");
        List<Products> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
        String login = sc.nextLine().toLowerCase();
        System.out.println("Password: ");
        String password = sc.nextLine();
        for (MeatSection meatSection : meatSectionList) {
            products.add(meatSection);
        }
        for (MilkySection milkySection : milkySectionList) {
            products.add(milkySection);
        }
        for (FlourSection flourSection : flourSectionList) {
            products.add(flourSection);
        }
        if (login.equals(Manager.getLogin()) && password.equals(Manager.getPassword())) {
            Service service1 = new Service();
            Service service11 = new Service();
            Service service111 = new Service();
            System.out.println("Vse produkty");
            System.out.println("Produkty posle priemki!");
            System.out.println();
            System.out.println("-------------------------");
            service1.acceptanceOfProduct(flourSectionList);
            System.out.println("_________________________");
            service11.acceptanceOfProduct(meatSectionList);
            System.out.println("_________________________");
            service111.acceptanceOfProduct(milkySectionList);
            System.out.println();
            System.out.println("_________________________");

        } else {
            System.out.println("Nepravilno vvedeny dannye,");
            System.out.println(" Please repeat");

        }
    }
}