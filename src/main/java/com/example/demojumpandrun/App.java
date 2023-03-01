package com.example.demojumpandrun;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;

/**
 * Willkommen in der Codewelt von Platformus
 * @author David Hinkelmann
 * @author Julian Vogel
 */
public class App extends GameApplication {

    // anzahl der Level
    private static final int MAX_LEVEL = 1;

    // im welchen level startet der spieler
    private static final int STARTING_LEVEL = 0;

    private Entity player;

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(1280);
        settings.setHeight(720);
        settings.setTitle("Platformu's The Floor ist java");
    }

    protected void intGame(){
        FXGL.getGameWorld().addEntityFactory(new SimpleFactory());

        FXGL.spawn("enemy",100,100);
    }

    public static void main(String[] args) {
        launch(args);
    }
}