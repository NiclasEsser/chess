
/**
* Beschreiben Sie hier die Klasse main.
* 
* @author (Ihr Name) 
* @version (eine Versionsnummer oder ein Datum)
*/

import java.awt.*; 
import java.awt.event.*;

public class main extends Ui
{     
private int fieldRenderSize;
private int boardFieldLengthX;
private int boardFieldLengthY;
//private Frame window;
private board spielbrett;
private Frame window;

public main()
{
       //Chess is played on 8x8 Field Board
       this.boardFieldLengthX    = 8;
       this.boardFieldLengthY    = 8;
       //Dimension of one field (in pixels)
       this.fieldRenderSize      = 36;
       
       this.spielbrett = new board(fieldRenderSize, fieldRenderSize);
       
       //Render Window with frame 
       this.window = this.render(this.boardFieldLengthX*this.fieldRenderSize+(2*fieldRenderSize), this.boardFieldLengthY*this.fieldRenderSize+(2*fieldRenderSize));
       
       //Board offset by one fieldRenderSize
       this.spielbrett.render(fieldRenderSize, fieldRenderSize, this.window);
       
       spielbrett.reset();
       
       player player1   = new player(false, "Schwarz");
       player player2   = new player(true, "Weiss");
       rules ruleset    = new rules();
       
       while(! ruleset.gameOver() ){
            
       }
    }
     
    
    public Frame render(int x, int y){
       Frame f = new Frame("Chess Game");
       f.setLayout(null);  
       f.setSize(x, y);  
       f.setVisible(true);
       
       return f;
    }
}
