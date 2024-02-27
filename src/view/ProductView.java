package view;

import builder.ProductBuilder;
import model.ProductDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {

    public static void main(String[] args) {

        List<ProductDto> companies = new ArrayList<>();

        UtilService util = UtilServiceImpl.getInstance();

        ProductDto company = new ProductBuilder()
                .pno(util.createRandomInterger(0,5))
                .name(util.createRandomName())
                .company(util.createRandomCompany())
                .price(util.createRandomInterger(0,5))
                .build();

        for (int i = 0; i < 5; i++) {
            companies.add(new ProductBuilder()
                    .pno(util.createRandomInterger(0,5))
                    .name(util.createRandomName())
                    .company(util.createRandomCompany())
                    .price(util.createRandomInterger(0,5))
                    .build());
        }

        for (ProductDto productDto : companies) {
            System.out.println(productDto.toString());
        }

    }

}
