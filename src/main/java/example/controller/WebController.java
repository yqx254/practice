package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fstar
 */
@Controller
@RequestMapping("/login")
public class WebController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "login/index";
    }

    @RequestMapping(value = "/redirect" ,method = RequestMethod.GET)
    public String redirect(){
        return "redirect:/pages/final.htm";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage(){
        return "login/final";
    }
}
