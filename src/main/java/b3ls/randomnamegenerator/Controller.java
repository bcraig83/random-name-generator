package b3ls.randomnamegenerator;

import org.apache.commons.text.RandomStringGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @RequestMapping("/random")
  public Customer getRandomCustomer() {
    RandomStringGenerator generator = new RandomStringGenerator.Builder()
        .withinRange('a', 'z').build();

    String firstName = generator.generate(5);
    String surname = generator.generate(8);

    Customer customer = new Customer(firstName, surname);

    return customer;

  }
}
