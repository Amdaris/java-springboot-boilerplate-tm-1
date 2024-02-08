package co.devskills.springbootboilerplate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import co.devskills.springbootboilerplate.models.RestaurantOrderRequest;

@RestController
public class Challenge2Controller {

    @PostMapping("/restaurant-order")
    public String formatRestaurantOrder(@RequestBody RestaurantOrderRequest input) {
        String order = input.getOrder();

        // Write the code for Challenge 2 here

        
        return ""; 
    }
}