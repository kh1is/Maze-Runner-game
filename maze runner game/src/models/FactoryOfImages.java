package models;

import javax.swing.ImageIcon;

public class FactoryOfImages extends AbstractFactory {
	public  ImageIcon getImage(String imageType) {
		
		if(imageType.equalsIgnoreCase("GIFT")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//Gift-icon.png");
		}
		if(imageType.equalsIgnoreCase("gun")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//Gun-icon.png");
		}
		if(imageType.equalsIgnoreCase("Door")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//door-icon.png");
		}
		if(imageType.equalsIgnoreCase("rightman")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//Man-icon.png");
		}
		if(imageType.equalsIgnoreCase("leftman")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//left-icon.png");
		}
		if(imageType.equalsIgnoreCase("upman")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//up-icon.png");
		}
		if(imageType.equalsIgnoreCase("downman")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//down-icon.png");
		}
		if(imageType.equalsIgnoreCase("Brick")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//brick-wall-icon.png");
		}
		if(imageType.equalsIgnoreCase("TREE")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//Tree-icon.png");
		}
		if(imageType.equalsIgnoreCase("greenBomb")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//Bomb-icon.png");
		}
		if(imageType.equalsIgnoreCase("REDBOMB")) {
			return new ImageIcon("C://Users//HP//workspace//game maze SaveAndLoad//src//Gui//TNT-icon.png");
		}
		else return null;
		
	}

	@Override
	public Object getModel(String modelType) {
		return null;
	}
}
