package example.controller;

import example.dao.CustomerJdbcTemplateImpl;
import example.models.Customer;
import example.service.IllegalException;
import example.service.InputException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Administrator
 */
@Controller
public class CustomerController {
    Log log = LogFactory.getLog(CustomerController.class);
    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ModelAndView customer(){
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        CustomerJdbcTemplateImpl customerJdbcTemplate = (CustomerJdbcTemplateImpl) wac.getBean("customerJdbcTemplateImpl");
        Customer customer = customerJdbcTemplate.getCustomer("73bb82109ead3758a8b876703993d02b");
        return new ModelAndView("customer","command",customer);
    }

    @RequestMapping(value = "/addCustomer" , method = RequestMethod.POST)
    @ExceptionHandler({InputException.class, IllegalException.class})
    public String addCustomer(@ModelAttribute("SpringWeb")Customer customer, ModelMap modelMap){
        if(customer.getMobile().length() < 11){
            log.error("Invalid mobile: " +customer.getMobile());
            throw new InputException("Mobile is too short");
        }
        if(customer.getCityCode() != 530100){
            log.error("Invalid city code" + customer.getCityCode());
            throw new IllegalException("Service unavailable in your city");
        }
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        CustomerJdbcTemplateImpl customerJdbcTemplate = (CustomerJdbcTemplateImpl) wac.getBean("customerJdbcTemplateImpl");
        customerJdbcTemplate.setCustomer(customer);

        modelMap.addAttribute("username",customer.getUsername());
        modelMap.addAttribute("mobile",customer.getMobile());
        modelMap.addAttribute("cityCode",customer.getCityCode());
        return "result";
    }
}
