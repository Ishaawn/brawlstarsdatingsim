package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.buttons;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private Texture melo;
    Sprite shelly;
    Sprite melody;
    Game drop;
    @Override
    public void create() {
        drop = new Drop();
        /*batch = new SpriteBatch();
        input();
        image = new Texture("shelly.png");
        shelly = new Sprite(image);
        melo = new Texture("melody.png");
        melody = new Sprite(melo);
        melody.setPosition(300,300);

        resize(40, 40);*/
        drop.create();

    }
    public void input(){
        /*if(Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)){

        }*/


    }
    @Override
    public void render() {
        /*ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        shelly.draw(batch);
        melody.draw(batch);
        batch.end();*/
        drop.render();
    }

    @Override
    public void dispose() {
        /*batch.dispose();
        image.dispose();*/
        drop.dispose();
    }
}
