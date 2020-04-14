package example.controller;

import example.models.Customer;
import example.service.IllegalException;
import example.service.InputException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Administrator
 */
@Controller
public class CustomerController {
    private Log log = LogFactory.getLog(CustomerController.class);
    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ModelAndView customer(){
        return new ModelAndView("customer","command",new Customer());
    }
    @RequestMapping(value = "/addCustomer" , method = RequestMethod.POST)
    @ExceptionHandler({InputException.class})
    public String addCustomer(@ModelAttribute("SpringWeb")Customer customer, ModelMap modelMap){
        if(customer.getMobile().length() < 11){
            throw new InputException("Given mobile is too short");
        }
//        if(customer.getCityCode() != 530100){
//            log.error("new customer from city" + customer.getCityCode() + " consider building a sub site?");
//            throw new IllegalException("Service not available in your city");
//        }
        modelMap.addAttribute("username",customer.getUsername());
        modelMap.addAttribute("mobile",customer.getMobile());
        modelMap.addAttribute("cityCode",customer.getCityCode());
        return "result";
    }
}
