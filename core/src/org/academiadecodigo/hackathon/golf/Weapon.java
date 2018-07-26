package org.academiadecodigo.hackathon.golf;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by codecadet on 26/07/2018.
 */
public class Weapon {

    private Rectangle weapon;
    private Texture weaponTexture;


    private boolean moving = false;

    public Weapon(Toy toy){


        int i = (int) Math.floor(Math.random() * 2) + 1;


        this.weapon = new Rectangle();
        weapon.x = toy.getToy().getX();

        weapon.y = toy.getToy().getY();
        weapon.width = 30;
        weapon.height = 30;
        weaponTexture = new Texture(Gdx.files.internal("weapon" + i + ".png"));

    }

    public void move(Toy toy){

        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            moving = true;
            System.out.println("weapon created");
        }

        if(weapon.x > 1024){
            moving = false;
        }

        if(moving) {
            weapon.x += 200 * Gdx.graphics.getDeltaTime();
            return;

        }

        weapon.x = toy.getToy().getX();
        weapon.y = toy.getToy().getY();

    }

    public Texture getWeaponTexture() {
        return weaponTexture;
    }

    public Rectangle getWeapon() {
        return weapon;
    }
}
