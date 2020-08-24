package org.example.client;

import java.util.List;

import org.example.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProdcuts() {
        //  product-data-service 既不是域名也不是ip地址，而是 数据服务在 eureka 注册中心的名称
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }

}