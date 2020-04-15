package example.controller;

import example.dao.KeyWordJdbcTempateImpl;
import example.models.KeyWord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
/**
 * @author fstar
 */
@RequestMapping("/key")
@Controller
public class KeyWordController {
    KeyWordJdbcTempateImpl jdbcTempate;
    KeyWordController(){

    }
    @RequestMapping(value="/keyword", method = RequestMethod.GET)
    public ModelAndView getSearch(){
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        jdbcTempate = (KeyWordJdbcTempateImpl) wac.getBean("keywordJdbcTemplateImpl");
        int id = 2;
        KeyWord keyWord = jdbcTempate.getKeyWord(id);
        return  new ModelAndView("search/detail","command",keyWord);
    }

    @RequestMapping(value="/keyword-update", method=RequestMethod.POST)
    public void updateKeyword(KeyWord keyword){
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        jdbcTempate = (KeyWordJdbcTempateImpl) wac.getBean("keywordJdbcTemplateImpl");
        jdbcTempate.setKeyWord(keyword);
    }
}
