package com.internetowa.appnet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class localhost {

    @GetMapping
    public String czas()
    {
        Date date = new Date();
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dt1.format(date);
    }



}
