/*
 * Copyright (c) <%= new Date().format('yyyy') %> <%= author  %>
 *
 * This work is licensed under the terms of the MIT license.
 */
package <%= packageName %>;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
