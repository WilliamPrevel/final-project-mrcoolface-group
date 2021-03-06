/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slide.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Peter
 */
public class Object {
    // instance variables
    private Texture object;
    private Vector3 position;
    private Vector3 velocity;
    private Rectangle bounds;
    
    // 
    private final float MOVEMENT = 100;
    
    
    public Object(int x, int y, int width, int height, Texture img){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(MOVEMENT, 0, 0);
        object = img;
        bounds = new Rectangle(x, y, width, height);
    }
    
    public float getPositionX(){
        return this.position.x;
    }
    
    public float getPositionY(){
        return this.position.y;
    }
    
    public void render(SpriteBatch batch) {
        batch.draw(object, position.x, position.y);
    }
    
    public void dispose() {
        object.dispose();
    }
    
    public Rectangle getBounds(){
        return this.bounds;
    }
    
    public Texture getTexture(){
        return this.object;
    }
    
}
