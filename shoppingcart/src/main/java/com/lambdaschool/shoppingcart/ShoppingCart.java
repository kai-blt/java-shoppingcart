package com.lambdaschool.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;



/**
 * Main class to start the application.
 */
@EnableJpaAuditing
@SpringBootApplication
public class ShoppingCart
{

    /**
     * Main method to start the application.
     *
     * @param args Not used in this application.
     */
    public static void main(String[] args)
    {
        SpringApplication.run(ShoppingCart.class,
                args);
    }

}
