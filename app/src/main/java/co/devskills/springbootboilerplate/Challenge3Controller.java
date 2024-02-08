package co.devskills.springbootboilerplate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import co.devskills.springbootboilerplate.models.SupermarketQueueRequest;

@RestController
public class Challenge3Controller {

    @PostMapping("/supermarket-queue")
    public int getSupermarketQueueTime(@RequestBody SupermarketQueueRequest input) {
        int[] customers = input.getCustomers();
        int selfCheckoutPoints = input.getSelfCheckoutPoints();

        // Write the code for Challenge 3 here

        return -1; 
    }
} 