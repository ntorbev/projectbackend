package com.pizzabff.projectbackend.controller;


import com.pizzabff.projectbackend.model.User;
import com.pizzabff.projectbackend.model.PizzaOrder;
import com.pizzabff.projectbackend.repository.PizzaOrdersRepository;
import com.pizzabff.projectbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    UserRepository repo;

    @Autowired
    PizzaOrdersRepository pizzaOrdersRepository;

    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "api/insertUser", produces = "application/json")
    public User getDate(Principal principal) {
        User user = new User();
        user.setId(1L);
        user.setName(principal.getName());
//        repo.save(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.POST, value = "api/insertPizzaOrders", produces = "application/json")
    public Object addPizzaOrders(Principal principal, @RequestParam("pizzaOrder") String pizzaOrder,  @RequestParam("quantity") String quantity) {
        pizzaOrdersRepository.save(new PizzaOrder(pizzaOrder, principal.getName(), quantity));
        return "{\"message\":\"succes\"}";
    }

    @RequestMapping(method = RequestMethod.POST, value = "api/getPizzaOrders", produces = "application/json")
    public List<PizzaOrder> getPizzaOrders(Principal principal) {
        return pizzaOrdersRepository.getPizzaOrdersByHolderName(principal.getName());
    }


//    @RequestMapping("add/{username}/{password}")
//    public String add(@PathVariable("username") String name, @PathVariable("password") String password) {
//        inMemoryUserDetailsManager.createUser(new User(name, password, new ArrayList<GrantedAuthority>()));
//        return "added";
//    }
}
