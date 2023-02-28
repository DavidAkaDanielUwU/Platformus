package com.example.demojumpandrun;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;

/**
 * @author David Hinkelmann
 * @author Julian Vogel
 */
public class App extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("Standard Game App");
    }

    protected void intGame(){
        FXGL.getGameWorld().addEntityFactory(new SimpleFactory());

        FXGL.spawn("enemy",100,100);
    }

    public static void main(String[] args) {
        launch(args);
    }
}