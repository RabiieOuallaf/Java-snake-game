import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    final int bodyParts = 6;
    int pointsEarned;
    int pointX;
    int pointY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {

    }
    public void startGame() {

    }
    public void paintComponent(Graphics g) {

    }
    public void draw(Graphics g) {

    }
    public void move() {

    }
    public void checkPoint() {

    }
    public void checkCollisions() {

    }
    public void gameOver(Graphics g) {

    }
    public class MyKeyAdabter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

