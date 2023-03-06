package com.example.demojumpandrun;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.dsl.components.ProjectileComponent;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import com.almasb.fxgl.physics.BoundingShape;
import com.almasb.fxgl.physics.HitBox;
import com.almasb.fxgl.physics.PhysicsComponent;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class SimpleFactory implements EntityFactory {

    @Spawns("enemy")
    public Entity newEnemy(){
        return (FXGL.entityBuilder()
        .view( new Rectangle(40,40 , Color.RED))
        .with( new ProjectileComponent(new Point2D(1,0), 150))
        .buildAndAttach());
    }

    @Spawns("platform")
    public Entity newPlatform(SpawnData data) {
        return FXGL.entityBuilder()
                .from(data)
                .type(EntityType.PLATFORM)
                .bbox(new HitBox(BoundingShape
                        .box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new PhysicsComponent())
                .build();
    }

    @Spawns("coin")
    public Entity newCoin(SpawnData data) {
        return FXGL.entityBuilder()
                .from(data)
                .type(EntityType.COIN).viewWithBBox(new Circle(data.<Integer>get("with") / 2,Color.GOLD))
                .build();
    }




}
