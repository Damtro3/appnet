package com.net.appnet;

import javafx.beans.property.SimpleDoubleProperty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class WebController {



    @RequestMapping (value="/test", method = RequestMethod.GET)
    public String test(Model model)
    {
        String a="aaaaaaaaaaa";
        System.out.println("Test");
        model.addAttribute("tekst", a);
        return "test.jsp";
    }
    test t =new test();
    public  void tescik()
    {

    }

}
