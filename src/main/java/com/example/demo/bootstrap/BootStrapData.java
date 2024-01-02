package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entity.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Customer eric = new Customer();
        eric.setFirstName("Eric");
        eric.setLastName("Jones");
        eric.setAddress("5890 Grover Street");
        eric.setPostal_code("98807");
        eric.setPhone("4123567620");
        customerRepository.save(eric);

        Customer olivia = new Customer();
        olivia.setFirstName("Olivia");
        olivia.setLastName("Coker");
        olivia.setAddress("0563 East Avenue Street");
        olivia.setPostal_code("63846");
        olivia.setPhone("9086538297");
        customerRepository.save(olivia);

        Customer ellie = new Customer();
        ellie.setFirstName("Ellie");
        ellie.setLastName("Kool");
        ellie.setAddress("5364 Ark Street");
        ellie.setPostal_code("64820");
        ellie.setPhone("3527495639");
        customerRepository.save(ellie);

        Customer brandon = new Customer();
        brandon.setFirstName("Brandon");
        brandon.setLastName("Pike");
        brandon.setAddress("3449 Jude Lane");
        brandon.setPostal_code("64944");
        brandon.setPhone("0284549361");
        customerRepository.save(brandon);

        Customer keanu = new Customer();
        keanu.setFirstName("Keanu");
        keanu.setLastName("Malik");
        keanu.setAddress("9037 Jamison Road");
        keanu.setPostal_code("96393");
        keanu.setPhone("7463720986");
        customerRepository.save(keanu);

    }
}
