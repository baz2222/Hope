package com.juniorgames.hope;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector3;

public class Game extends ApplicationAdapter
{
    private OrthographicCamera cam;
    private ShapeRenderer sr;
    private Vector3 pos;
    @Override
    public void create()
    {
        sr = new ShapeRenderer();
        cam = new OrthographicCamera();
        cam.setToOrtho(false, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        pos = new Vector3(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2,0);
    }//create
    @Override
    public void render()
    {
        //logic
        cam.update();
        if(Gdx.input.isTouched())
        {
            pos.set(Gdx.input.getX(),Gdx.input.getY(),0);
            cam.unproject(pos);
        }
        //drawing
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.setColor(Color.BLUE);
        sr.circle(pos.x,pos.y,64);
        sr.end();
    }//render
    @Override
    public void dispose()
    {
        sr.dispose();
    }//dispose
}//application adapter