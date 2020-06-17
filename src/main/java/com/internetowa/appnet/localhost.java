package com.internetowa.appnet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class localhost {

    @GetMapping
    public String czas()
    {
        Date date = new Date();
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dt1.format(date);
    }
}
