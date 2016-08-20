package ux.Screens;

import java.awt.Component;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class FrameGame extends FrameMain {
	public FrameGame() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	@Override
	public Component add(Component comp) {
		// TODO Auto-generated method stub
		super.add(comp);
		if(comp instanceof ScrGame){
			ScrGame sg = (ScrGame)comp;
			this.setTitle(sg.game.name + ": (" +sg.game.p1.getName() + " vs " + sg.game.p2.getName()+")");
		}
		
		return(comp);
	}
}
