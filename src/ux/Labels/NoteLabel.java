package ux.Labels;

import javax.swing.JLabel;

import ux.Screens.STRINGS;
import ux.Screens.STYLE;

public class NoteLabel extends LabelFactory {

	public NoteLabel(String label) {
		super(label);
		// TODO Auto-generated constructor stub
		this.setFont(STYLE.NOTELABELFONT);
		this.setHorizontalAlignment(this.CENTER);
		this.setHorizontalTextPosition(this.CENTER);
		
	}
}
