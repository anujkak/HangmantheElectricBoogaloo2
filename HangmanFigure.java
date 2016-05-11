import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.*;
import java.lang.Math;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.GeneralPath;



import javax.swing.JPanel;
//Name: Rattil Chowdhury and Anuj Kak
//Description: codes in a boxer for a hangman figure
//Author for boxer code: Rattil Chowdhury
public class HangmanFigure extends JPanel {
	
	private int guesses;

	public HangmanFigure() {
		super();
		guesses = 0;
		setPreferredSize(new Dimension(800, 500));
		setOpaque(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        AffineTransform old = g2d.getTransform();
        
        g2d.setTransform(old); //example code
        //things you draw after here will not be rotated, or translated, or scaled
        g2d.scale(0.85,0.85);
        g2d.translate(255, 90);
		 g2d.scale(450/434,500/434);
		g2d.setColor(Color.black);
		//g2d.;
		
		// base
		if(guesses > 0) {
			g2d.drawLine(100, 450, 660, 500);
		}
		
		// right wall
		if(guesses > 1) {
			g2d.drawLine(660, 500, 660, -50);
		}
		
		// top line
		if(guesses > 2) {
			g2d.drawLine(660, -50, 270, -50);
		}
		
		// hanging line
		if(guesses > 3) {
			g2d.drawLine(270, -50, 270, 60);
		}
		
		// face
		if(guesses > 4) {
			//g2d.fill(new Ellipse2D.Double(150-25, 70, 33.3, 50));
			
			 g2d.setColor(new Color(99,35,0));
			 GeneralPath polyline = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);
			 
 polyline.moveTo(227,87);
 polyline.quadTo(227,87,227,84);
 polyline.quadTo(228,82,229,81);
 polyline.lineTo(231,79);
 polyline.lineTo(231,79);
 polyline.lineTo(231,74);
 polyline.quadTo(231,74,229,72);
 polyline.quadTo(227,70,226,68);
 polyline.quadTo(225,66,226,64);
 polyline.quadTo(228,62,228,59);
 polyline.lineTo(228,59);
 polyline.lineTo(229,57);
 polyline.quadTo(229,57,227,55);
 polyline.quadTo(227,53,229,51);
 polyline.lineTo(231,49);
 polyline.lineTo(231,49);
 polyline.quadTo(231,49,231,46);
 polyline.quadTo(232,45,234,45);
 polyline.lineTo(236,44);
 polyline.lineTo(236,44);
 polyline.quadTo(236,44,237,41);
 polyline.quadTo(238,39,240,39);
 polyline.lineTo(243,39);
 polyline.lineTo(243,39);
 polyline.quadTo(243,39,244,36);
 polyline.quadTo(246,35,248,34);
 polyline.quadTo(249,35,251,36);
 polyline.lineTo(251,36);
 polyline.quadTo(251,36,253,34);
 polyline.quadTo(255,34,257,35);
 polyline.lineTo(260,36);
 polyline.lineTo(260,36);
polyline.quadTo(260,36,262,36);
polyline.quadTo(263,35,265,36);
 polyline.quadTo(266,37,266,39);
 polyline.lineTo(266,39);
polyline.quadTo(266,39,268,39);
 polyline.quadTo(271,39,272,40);
 polyline.lineTo(272,42);
 polyline.lineTo(272,42);
 polyline.quadTo(272,42,275,43);
 polyline.quadTo(277,44,278,46);
 polyline.quadTo(281,48,282,49);
 polyline.lineTo(283,52);
 polyline.lineTo(283,52);
 polyline.lineTo(286,56);
 polyline.lineTo(286,60);
 polyline.quadTo(286,60,289,62);
polyline.quadTo(291,62,295,64);
 polyline.quadTo(299,65,302,67);
polyline.quadTo(306,69,310,73);
polyline.lineTo(310,73);
polyline.quadTo(310,73,313,73);
polyline.quadTo(318,74,323,76);
 polyline.lineTo(334,84);
 //RightShoulder***
 polyline.lineTo(334,84);
polyline.closePath();
 g2d.fill(polyline);
			 
		}
		
		// body
		if(guesses > 5) {
			//g2d.drawLine(150, 120, 150, 200);
			
			  GeneralPath polyline = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);
			 polyline.moveTo(245,240);
 polyline.quadTo(245,240,242,233);
 polyline.quadTo(241,225,240,213);
 polyline.lineTo(239,202);
 polyline.lineTo(239,202);
 polyline.quadTo(239,202,239,192);
 polyline.quadTo(231,183,229,173);
 polyline.lineTo(229,163);
 polyline.lineTo(229,163);
 polyline.quadTo(229,163,226,158);
 polyline.quadTo(225,153,224,148);
 polyline.lineTo(223,142);
 polyline.quadTo(223,142,222,138);
 polyline.quadTo(220,135,214,134);
 polyline.lineTo(216,132);
 //LeftShoulder
 polyline.lineTo(216,132);
 polyline.lineTo(227,87);
 //RightShoulder
 polyline.lineTo(334,84);
 polyline.lineTo(351,153);
 //RightSide Base Body
polyline.lineTo(319,232);
 polyline.lineTo(317,237);
 // (PantBodyCurve)
 polyline.quadTo(317,237,314,239);
polyline.quadTo(309,242,305,244);
 polyline.lineTo(302,245);
 polyline.lineTo(302,245);
 polyline.lineTo(257,246);
 polyline.quadTo(257,246,252,245);
 polyline.quadTo(248,244,246,242);
 polyline.lineTo(245,240);
 polyline.lineTo(245,240);
 polyline.closePath();
 g2d.fill(polyline);
 
  //pants

 g2d.setColor(new Color(64,127,178));
 GeneralPath polyline2 = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);

 polyline2.moveTo(245,240);
 polyline2.lineTo(241,249);
 polyline2.quadTo(241,249,231,255);
 polyline2.quadTo(218,262,209,270);
 polyline2.lineTo(195,281);
 polyline2.lineTo(195,281);
 polyline2.lineTo(245,330);
 polyline2.lineTo(265,314);
 polyline2.quadTo(265,314,269,312);
 polyline2.quadTo(271,313,273,315);
 polyline2.lineTo(274,316);
 polyline2.lineTo(274,316);
 polyline2.lineTo(279,344);
 polyline2.lineTo(335,339);
 polyline2.lineTo(333,315);
 polyline2.quadTo(333,315,337,302);
 polyline2.quadTo(337,278,331,261);
 polyline2.lineTo(323,249);
 polyline2.lineTo(323,249);
 polyline2.lineTo(317,237);
 // (PantBodyCurve)
 polyline2.quadTo(317,237,314,239);
 polyline2.quadTo(309,242,305,244);
 polyline2.lineTo(302,245);
 polyline2.lineTo(302,245);
 polyline2.lineTo(257,246);
 polyline2.quadTo(257,246,252,245);
 polyline2.quadTo(248,244,246,242);
 polyline2.lineTo(245,240);
 polyline2.lineTo(245,240);
 
 polyline2.closePath();
 g2d.fill(polyline2);
 g2d.setColor(new Color(99,35,0));
  
			 
		}
		
		// left hand
		if(guesses > 6) {
			//g2d.drawLine(150, 150, 110, 140);
			
			 GeneralPath polyline = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);
        
        
 polyline.moveTo(227,87);
 polyline.lineTo(216,134);
 polyline.quadTo(216,134,197,131);
 polyline.quadTo(187,132,175,131);
 polyline.lineTo(166,131);
 polyline.lineTo(166,131);
 polyline.lineTo(163,93);
 polyline.quadTo(163,93,167,91);
 polyline.quadTo(171,90,177,89);
 polyline.lineTo(184,89);
 polyline.lineTo(184,89);
 polyline.lineTo(227,87);

 //leftforearm
 polyline.moveTo(163,93);
 polyline.lineTo(166,131);
 polyline.quadTo(166,131,135,130);
 polyline.quadTo(123,129,113,127);
 polyline.quadTo(100,123,92,121);
 polyline.lineTo(92,121);
 polyline.lineTo(93,93);
 polyline.quadTo(93,93,119,92);
 polyline.quadTo(133,91,140,90);
 polyline.quadTo(149,91,157,92);
 polyline.lineTo(163,93);
 polyline.lineTo(163,93);
        
        polyline.closePath();
 g2d.fill(polyline);
 
 g2d.setColor(new Color(227,56,0));
 //leftglove
 
			 GeneralPath polyline2 = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);
 polyline2.moveTo(93,93);
 polyline2.lineTo(92,121);
 polyline2.quadTo(92,121,87,121);
 polyline2.quadTo(84,124,80,128);
 polyline2.quadTo(76,131,69,133);
 polyline2.quadTo(63,131,57,131);
 polyline2.lineTo(57,131);
 polyline2.lineTo(60,122);
 polyline2.lineTo(68,121);
 polyline2.lineTo(71,120);
 polyline2.lineTo(71,117);
 polyline2.lineTo(62,117);
 polyline2.lineTo(60,122);
 polyline2.lineTo(57,131);
 polyline2.quadTo(57,131,51,133);
 polyline2.quadTo(43,132,37,129);
 polyline2.quadTo(32,125,29,119);
 polyline2.lineTo(29,113);
 polyline2.lineTo(29,113);
 polyline2.quadTo(29,113,29,106);
 polyline2.quadTo(31,101,35,96);
 polyline2.quadTo(40,93,43,91);
 polyline2.quadTo(45,91,48,91);
 polyline2.lineTo(48,91);
polyline2.lineTo(93,93);
  polyline2.closePath();
  
 g2d.fill(polyline2);
 
 g2d.setColor(Color.black);
 g2d.drawLine(95, -30, 95, 95);
 g2d.drawLine(270, -50, 95, -30);
			 
		}
		
		// right hand
		if(guesses > 7) {
			//g2d.drawLine(150, 150, 190, 140);
			g2d.setColor(new Color(99,35,0));
			  GeneralPath polyline = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);
        
        //rightshoulder
 polyline.moveTo(351,153);
 polyline.lineTo(334,84);
 polyline.quadTo(334,84,348,83);
 polyline.quadTo(360,87,368,92);
 polyline.quadTo(374,98,379,106);
 polyline.quadTo(382,114,387,121);
 polyline.lineTo(387,121);
 polyline.quadTo(387,121,396,131);
 polyline.quadTo(400,137,404,145);
 polyline.quadTo(405,153,409,165);
 polyline.quadTo(411,175,410,185);
 polyline.lineTo(410,185);
 polyline.lineTo(367,162);
 polyline.quadTo(367,162,361,161);
 polyline.quadTo(356,158,354,155);
 polyline.lineTo(351,153);
 polyline.lineTo(351,153);

 //rightforearm
 polyline.moveTo(338,203);
 polyline.lineTo(337,171);
 polyline.quadTo(337,171,345,170);
 polyline.quadTo(351,170,357,166);
 polyline.quadTo(362,164,367,162);
 polyline.lineTo(367,162);
 polyline.lineTo(410,185);
 polyline.quadTo(410,185,402,191);
 polyline.quadTo(394,196,385,200);
 polyline.quadTo(371,202,349,202);
 polyline.lineTo(338,203);
 polyline.lineTo(338,203);
			 
			polyline.closePath();
 g2d.fill(polyline);
 g2d.setColor(new Color(227,56,0));
 GeneralPath polyline2 = 
	        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);

 polyline2.moveTo(337,171);
 polyline2.lineTo(338,203);
 polyline2.quadTo(338,203,331,203);
 polyline2.quadTo(323,205,313,207);
 polyline2.quadTo(307,208,302,209);
 polyline2.lineTo(302,209);
 polyline2.quadTo(302,209,293,208);
 polyline2.quadTo(284,207,277,203);
 polyline2.quadTo(272,198,269,193);
 polyline2.quadTo(268,190,268,187);
 polyline2.lineTo(268,187);
 polyline2.quadTo(268,187,268,183);
 polyline2.quadTo(269,177,271,174);
 polyline2.quadTo(275,170,280,168);
 polyline2.lineTo(280,168);
 polyline2.quadTo(280,168,285,169);
 polyline2.quadTo(288,170,289,173);
 polyline2.lineTo(292,176);
 polyline2.lineTo(292,176);
 polyline2.lineTo(305,177);
 polyline2.lineTo(305,173);
 polyline2.lineTo(292,171);
 polyline2.quadTo(292,171,290,169);
 polyline2.quadTo(289,166,290,164);
 polyline2.lineTo(292,162);
 polyline2.lineTo(292,162);
 polyline2.lineTo(309,162);
 polyline2.quadTo(309,162,314,165);
 polyline2.quadTo(319,167,324,170);
 polyline2.quadTo(328,172,332,172);
 polyline2.lineTo(337,171);
 polyline2.lineTo(337,171);
 
 polyline2.closePath();
 g2d.fill(polyline2);
 g2d.setColor(Color.black);
 g2d.drawLine(335, -50, 335, 175);
		}
		
		// left leg
		if(guesses > 8) {
			//g2d.drawLine(150, 200, 120, 250);
			g2d.setColor(new Color(99,35,0));
			 GeneralPath polyline = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);
			 
 polyline.moveTo(195,281);
 polyline.lineTo(195,281);
 polyline.quadTo(182,293,172,305);
 polyline.quadTo(168,314,166,324);
 polyline.lineTo(168,331);
 polyline.lineTo(168,331);
 polyline.lineTo(186,386);
 polyline.lineTo(208,386);
 polyline.quadTo(208,386,214,364);
 polyline.quadTo(213,350,211,342);
 polyline.lineTo(209,337);
 polyline.lineTo(209,337);
 polyline.lineTo(230,316);
			 polyline.closePath();
 g2d.fill(polyline);
 
 g2d.setColor(new Color(227,56,0));
 GeneralPath polyline2 = 
	        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);
 
 polyline2.moveTo(186,386);
 polyline2.quadTo(186,386,185,392);
 polyline2.quadTo(182,394,179,395);
 polyline2.lineTo(175,396);
 polyline2.lineTo(175,396);
 polyline2.lineTo(159,396);
 polyline2.quadTo(159,396,154,400);
 polyline2.quadTo(153,405,154,412);
 polyline2.lineTo(155,415);
 polyline2.lineTo(155,415);
 polyline2.lineTo(209,411);
 polyline2.lineTo(208,386);
 
 polyline2.closePath();
 g2d.fill(polyline2);	
 g2d.setColor(Color.black);
 g2d.drawLine(95, 20, 190, 400);
 g2d.drawLine(270, -50, 95, 20);
		}
		
		// right leg
		if(guesses > 9) {
			//g2d.drawLine(150, 200, 180, 250);
			g2d.setColor(new Color(99,35,0));
			 GeneralPath polyline = 
        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);
			
 polyline.moveTo(286,344);
 polyline.quadTo(268,344,287,355);
 polyline.quadTo(292,363,297,368);
 polyline.lineTo(303,372);
 polyline.lineTo(303,372);
 polyline.quadTo(303,372,319,377);
 polyline.quadTo(331,378,347,379);
 polyline.lineTo(359,379);
 polyline.lineTo(359,379);
 polyline.quadTo(359,379,363,374);
 polyline.quadTo(367,369 ,368 ,365);
 polyline.lineTo(368,361);
 polyline.lineTo(368,361);
 polyline.quadTo(368,361,354,351);
 polyline.quadTo(348,346,339,341);
 polyline.lineTo(335,339);
 polyline.lineTo(335,339);
			 
			 polyline.closePath();
 g2d.fill(polyline);
 
 
 g2d.setColor(new Color(227,56,0));
 GeneralPath polyline2 = 
	        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 200);
 polyline2.moveTo(359,379);
 polyline2.quadTo(359,379,363,374);
 polyline2.quadTo(367,369,368,365);
 polyline2.lineTo(368,361);
 polyline2.lineTo(368,361);
 polyline2.lineTo(382,366);
 polyline2.lineTo(378,402);
 polyline2.quadTo(378,402,377,405);
 polyline2.quadTo(376,407,374,408);
 polyline2.lineTo(372,408);
 polyline2.lineTo(372,408);
 polyline2.lineTo(349,407);
 polyline2.quadTo(349,407,346,405);
 polyline2.quadTo(344,400,346,395);
 polyline2.lineTo(349,392);
 polyline2.lineTo(349,392);
 polyline2.lineTo(359,391);
 
 polyline2.closePath();
 g2d.fill(polyline2);	
 g2d.setColor(Color.black);
 g2d.drawLine(360, 380, 360, 280);
 g2d.drawLine(360, 280, 340, -50);	 
		}
	}
	
	public void set() {
		guesses++;
		paintComponent(getGraphics());
	}
	
}