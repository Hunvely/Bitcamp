package view;

import model.Product;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {

    public static void main(String[] args) {

        List<Product> companies = new ArrayList<>();

        UtilService util = UtilServiceImpl.getInstance();

        Product company = Product.builder()
                .pno(util.createRandomInterger(0,5))
                .name(util.createRandomName())
                .company(util.createRandomCompany())
                .price(util.createRandomInterger(0,5))
                .build();

        for (int i = 0; i < 5; i++) {
            companies.add(Product.builder()
                    .pno(util.createRandomInterger(0,5))
                    .name(util.createRandomName())
                    .company(util.createRandomCompany())
                    .price(util.createRandomInterger(0,5))
                    .build());
        }

        for (Product productDto : companies) {
            System.out.println(productDto.toString());
        }

    }

}
