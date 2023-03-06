package com.example.demojumpandrun;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.entity.Entity;

import java.util.Map;



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
        settings.setVersion("0.01");
        settings.setTitle("Platformu's The Floor ist java");
    }

    @Override
    protected void initGameVars(Map<String, Object> vars) {
        vars.put("level", STARTING_LEVEL);
        vars.put("levelTime", 0.0);
        vars.put("score", 0);
    }

    @Override
    protected void initGame(){

    }

    public static void main(String[] args) {
        launch(args);
    }
}