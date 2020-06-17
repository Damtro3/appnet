package com.internetowa.appnet;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@Component
public class Initialazer implements ApplicationListener<Time.StageReadeEvent> {
    @Value("classpath:/1.fxml")
    private Resource resource;
    private String applicationTitle;
    public Initialazer(@Value("Hej")String applicationTitle)
    {
        this.applicationTitle=applicationTitle;
    }


    @Override
    public void onApplicationEvent(Time.StageReadeEvent event)
    {
        try {
            FXMLLoader fx= new FXMLLoader(resource.getURL());
            Parent parent = fx.load();
            Stage stage = event.getStage();
            stage.setScene(new Scene(parent, 800, 800));
            stage.setTitle(applicationTitle);
            stage.show();
        }
         catch (IOException e) {
        e.printStackTrace();
    }
    }
}
