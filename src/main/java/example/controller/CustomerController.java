package example.controller;

import example.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Administrator
 */
@Controller
public class CustomerController {
    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ModelAndView customer(){
        return new ModelAndView("customer","command",new Customer());
    }
    @RequestMapping(value = "/addCustomer" , method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("SpringWeb")Customer customer, ModelMap modelMap){
        modelMap.addAttribute("username",customer.getUsername());
        modelMap.addAttribute("mobile",customer.getMobile());
        modelMap.addAttribute("cityCode",customer.getCityCode());
        return "result";
    }
}
