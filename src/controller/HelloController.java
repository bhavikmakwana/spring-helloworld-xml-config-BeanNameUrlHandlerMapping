package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class HelloController  implements Controller{
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("Servelt");
        String name = httpServletRequest.getParameter("name");
        Map map = new HashMap();
        map.put("msg", "Hello From controller mr ." +name);
        ModelAndView view = new ModelAndView("success",map);
        return view;

    }
}
