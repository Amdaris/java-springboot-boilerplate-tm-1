package co.devskills.springbootboilerplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Challenge1Controller {

    @GetMapping("/cat-shelves")
    public int getNumberOfJumps(
            @RequestParam("start") int start,
            @RequestParam("end") int end
    ) {

        // Write the code for Challenge 1 here
        
        return -1;
    }
}