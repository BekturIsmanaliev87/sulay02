package service;
import Products.MeatSection.MeatSection;
import Products.Products;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
    public class Service {
        List<Products> vitrina = new ArrayList<>();
        List<Products> vitrinaskidok = new ArrayList<>();
        List<Products> Othod = new ArrayList<>();
        public <T> void acceptanceOfProduct(List<? extends Products> productsList) {
            for (int i = 0; i < productsList.size(); i++) {
                if (productsList.get(i).getDate().isBefore(LocalDate.now())) {
                    Othod.add(productsList.get(i));

                } else if ((productsList.get(i).getManufacturer().equals("NUR") ||
                        productsList.get(i).getManufacturer().equals("MILKA") ||
                        productsList.get(i).getManufacturer().equals("TOIBOS"))
                        && productsList.get(i).getDate().minusDays(7).equals(LocalDate.now())
                        ||productsList.get(i).getDate().minusDays(7).isBefore(LocalDate.now())
                        && productsList.get(i).getDate().isAfter(LocalDate.now())
                ){
                    vitrinaskidok.add(productsList.get(i));
                }
                else if ((productsList.get(i).getManufacturer().equals("NUR") ||
                        productsList.get(i).getManufacturer().equals("MILKA") ||
                        productsList.get(i).getManufacturer().equals("TOIBOS")) &&
                        productsList.get(i).getDate().minusDays(7).isAfter(LocalDate.now()))
                {
                    vitrina.add(productsList.get(i));
                }
                else {
                    Othod.add(productsList.get(i));
                }
            }
            System.out.println("othody:" + Othod);
            System.out.println("vitrina:" + vitrina);
            System.out.println("vitrinaskidok: "+vitrinaskidok);
        }
}