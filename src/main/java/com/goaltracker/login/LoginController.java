package com.goaltracker.login;

import com.goaltracker.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    LoginService service;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showHello() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLoginRequestHello(@RequestParam String name,
                                          @RequestParam String password, ModelMap model) {
        if(service.validateUser(name, password)) {
            //ModelMap will give th values from the controller to the view
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        else {
            model.put("errorMessage", "Invalid Credentials!!");
            return "login";
        }
    }
}
