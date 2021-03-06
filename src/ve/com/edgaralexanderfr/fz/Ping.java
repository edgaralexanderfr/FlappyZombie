package ve.com.edgaralexanderfr.fz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import ve.com.edgaralexanderfr.game.GameObject;

public class Ping extends GameObject {
	Font font   = new Font("Arial", Font.BOLD, 24);
	Color color = new Color(24, 38, 54);

	@Override
	public void onTextFormatting (Graphics g) {
		g.setFont(font);
		g.setColor(color);
	}

	@Override
	public void start () {
		setTextOffsetX(10);
		setTextOffsetY(-40);
		setTextPivot(PIVOT_BOTTOM_LEFT);
		y      = configi("windowHeight");
		zIndex = 500;
	}

	@Override
	public void update () {
		text = "PING: 0 SERVER: 127.0.0.1:55555";
	}
}
