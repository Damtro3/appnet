package com.internetowa.appnet;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




public class Time extends  Application  {
    ConfigurableApplicationContext app;
    public void init() throws Exception
    {
        app= new SpringApplicationBuilder(AppnetApplication.class).run();
    }
    @Override
    public void start (Stage stage)
    {
       app.publishEvent(new StageReadeEvent(stage));
    }
    public void stop() throws  Exception
    {
        app.close();
        Platform.exit();
    }
    static class StageReadeEvent extends ApplicationEvent {

        public StageReadeEvent(Stage stage)
        {
            super(stage);
        }
        public Stage getStage()
        {
            return ((Stage) getSource());
        }
    }

}
