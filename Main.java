package main;

import game.component.MPanelGame;
import game.component.PanelGame;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Main extends JFrame{
    public Main(){
        init();
    }



    private void init() {
       setTitle("SPACE WAR ARENA");
       setSize(1366,768);
       setLocationRelativeTo(null);
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new BorderLayout());
       PanelGame panelGame = new PanelGame();
      // MPanelGame mpanelGame = new MPanelGame();
       add(panelGame);
      // add(mpanelGame);
       addWindowListener(new WindowAdapter(){
           @Override
           public void windowOpened(WindowEvent e){
               panelGame.start();
           }
       });
    }
        /**
   public static void main(String[] args){
        Main main = new Main();
        main.setVisible(true);
    }   *
     * @param args
     */
    public static void main(String[] args){
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
    }
}
