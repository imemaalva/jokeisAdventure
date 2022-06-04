import greenfoot.*; 
import java.util.List;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ScoreMenu extends Menu
{
    public ScoreMenu()
    {
        if(menuMusic==null)
        {
            menuMusic = new GreenfootSound("sounds/Sweet Child O' Mine.mp3");

            menuMusic.playLoop();
        }
        Scanner dato, datoNombres;
        int x=300,y=130;
        bg = new GreenfootImage("images/Menu_Score.png");
        File archivo = new File("highscores.txt");
        File archivoNombres = new File("highscores-names.txt");
        ArrayList<Integer>HighScoreList = new ArrayList<Integer>();
        ArrayList<String>HighScoreNameList = new ArrayList<String>();
        bg.scale(600,400);
        setBackground(bg);
        addObject(new MenuButton(3,1), 508, 360);
        
        try {
            dato = new Scanner(archivo);
            datoNombres = new Scanner(archivoNombres);
            while(dato.hasNextInt()){
                HighScoreList.add(dato.nextInt());
            }
            while(datoNombres.hasNextLine()){
                HighScoreNameList.add(datoNombres.nextLine());
            }
            dato.close();
            datoNombres.close();
        } catch(FileNotFoundException e) {
            showText("" + e, 300,200);
        } catch(InputMismatchException e) {
            showText("" + e, 300,200);
        } catch(NoSuchElementException e) {
        }
        
        for(int i=0; i<HighScoreList.size(); i++) {
            showText(HighScoreNameList.get(i) + " - " + HighScoreList.get(i) + "\n", x,y);
            y += 30;
        }
    }
}
