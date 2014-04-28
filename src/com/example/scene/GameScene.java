package com.example.scene;




import org.andengine.engine.camera.hud.HUD;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.text.Text;
import org.andengine.entity.text.TextOptions;
import org.andengine.util.adt.align.HorizontalAlign;
import org.andengine.util.adt.color.Color;

import com.example.base.BaseScene;
import com.example.manager.SceneManager.SceneType;

public class GameScene extends BaseScene
{
	private HUD gameHUD;
	private Text scoreText;
	
	@Override
	public void createScene()
	{
		
		
	}
	

	@Override
	public void onBackKeyPressed()
	{

		
	}

	@Override
	public SceneType getSceneType()
	{
		return SceneType.SCENE_GAME;
	}

	@Override
	public void disposeScene()
	{
		// TODO Auto-generated method stub
		
	}
	
	public void createBackground()
	{
		setBackground(new Background(Color.BLUE));
	}
	
	private void createHUD()
	{
		gameHUD = new HUD();
		
		//CREATE SCORE TEXT
		scoreText = new Text(20, 420, resourcesManager.font, "Score: 0123456789", new TextOptions(HorizontalAlign.LEFT), vbom);
		scoreText.setAnchorCenter(0, 0);
		scoreText.setText("Score: 0");
		camera.setHUD(gameHUD);
	}

}
