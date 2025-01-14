import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;

public class LittleGhost extends JPanel implements ActionListener, KeyListener {
    int framWidth = 360;
    int framHeight = 640;
    JButton MoonButton;
    JButton SunButton;
    JButton exitButton;
    Bird ghost;
    int speedX = -4;
    int speedY = 0; 
    int gravity = 1;
    ArrayList<Pipe> pipes;
    Random random = new Random();
    Timer gameLoop;
    Timer PipeTimer;
    boolean gameOver = true; 
    double score = 0;
    
    Image backgroundImg;
    Image ghostImg;
    Image topPipeImg;
    Image bottomPipeImg;
    Image bg;
    Image bg2;
    Image bg3;

    int ghostX = framWidth/8;
    int ghostY = framWidth/2;
    int ghostWidth = 34;
    int ghostHeight = 24;

    class Bird 
    {
        int x = ghostX;
        int y = ghostY;
        int width = ghostWidth;
        int height = ghostHeight;
        Image img;

        Bird(Image img) {
            this.img = img;
        }
    }

    int pipeX = framWidth;
    int pipeY = 0;
    int pipeWidth = 64; 
    int pipeHeight = 512;
    
    class Pipe 
    {
        int x = pipeX;
        int y = pipeY;
        int width = pipeWidth;
        int height = pipeHeight;
        Image img;
        boolean passed = false;

        Pipe(Image img) {
            this.img = img;
        }
    }

    public LittleGhost() 
    {
        setPreferredSize(new Dimension(framWidth, framHeight));
        setFocusable(true);
        addKeyListener(this);

        backgroundImg = new ImageIcon(getClass().getResource("./bg.png")).getImage(); 
        ghostImg = new ImageIcon(getClass().getResource("./littleghost.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
     
        ghost = new Bird(ghostImg);
        pipes = new ArrayList<Pipe>();


        PipeTimer = new Timer(1600, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              placePipes();
            }
        });

		gameLoop = new Timer(1000/60, this); 
        createButtons();
	}
    
    void placePipes() 
    {
        int randomPipeY = (int) (pipeY - pipeHeight/4 - Math.random()*(pipeHeight/2));
        int space = framHeight/4;
        
        Pipe topPipe = new Pipe(topPipeImg);
        topPipe.y = randomPipeY;
        pipes.add(topPipe);
    
        Pipe bottomPipe = new Pipe(bottomPipeImg);
        bottomPipe.y = topPipe.y  + pipeHeight + space;
        pipes.add(bottomPipe);
    }
    
    public void paintComponent(Graphics g) 
    {
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) 
    {
        g.drawImage(backgroundImg, 0, 0, this.framWidth, this.framHeight, null);
        g.drawImage(bg, 0, 0, this.framWidth, this.framHeight, null);

        if (bg3 != null) {
            g.drawImage(bg3, 0, 0, this.framWidth, this.framHeight, null);
        }
        if (!gameOver) {  
            g.drawImage(ghostImg, ghost.x, ghost.y, ghost.width, ghost.height, null);
        }
        for (int i = 0; i < pipes.size(); i++) {
            Pipe pipe = pipes.get(i);
            g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
        }
        g.setColor(Color.white);

        g.setFont(new Font("Haettenschweiler", Font.PLAIN, 32));
        if (gameOver) {
            g.drawString("" + (int) score, 20, 50);
        } else {
            g.drawString(String.valueOf((int) score), 20, 50);
        }
        
	}

    public void move() 
    {
        speedY += gravity;
        ghost.y += speedY;
        ghost.y = Math.max(ghost.y, 0); 

        for (int i = 0; i < pipes.size(); i++) {
            Pipe pipe = pipes.get(i);
            pipe.x += speedX;

            if (!pipe.passed && ghost.x > pipe.x + pipe.width) {
                score += 0.5;
                pipe.passed = true;
            }

            if (collision(ghost, pipe)) {
                gameOver = true;
            }
            if (collision(ghost, pipe)) {
                gameOver();
            }

        }

        if (ghost.y > framHeight) {
            gameOver();
        }
    }
    
    boolean collision(Bird i, Pipe b) 
    {
        return i.x < b.x + b.width &&   
               i.x + i.width > b.x &&   
               i.y < b.y + b.height &&  
               i.y + i.height > b.y;   
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (!gameOver) { 
            move();
            repaint();
        }
    } 

    @Override
    public void keyPressed(KeyEvent e) 
    {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (gameOver) {
                sunGame();
            } else {
                speedY = -9;
            }
            
            if (gameOver) {
                moonGame();
            } else {
                speedY = -9; 
            }
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public void createButtons() 
    {
        MoonButton = new JButton("Moon Night");
        SunButton = new JButton("Sun Set");
        exitButton = new JButton("Exit Game");

        Font buttonFont = new Font("Haettenschweiler", Font.PLAIN, 16); 
        MoonButton.setFont(buttonFont);
        SunButton.setFont(buttonFont);
        exitButton.setFont(buttonFont);

        int buttonWidth = 120;
        int buttonHeight = 45;
        int buttonX = (framWidth - buttonWidth) / 2;  
        int buttonY = (framHeight - buttonHeight) / 2;

        MoonButton.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
        SunButton.setBounds(buttonX, buttonY + buttonHeight + 20, buttonWidth, buttonHeight);
        exitButton.setBounds(buttonX, buttonY + 2 * (buttonHeight + 20), buttonWidth, buttonHeight);

        SunButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sunGame();
            }
        });
        MoonButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moonGame();
            }
        });

        exitButton.addActionListener(new ActionListener() {        
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.setLayout(null);
        this.add(MoonButton);
        this.add(SunButton);
        this.add(exitButton);
    }

    public void sunGame() 
    {
        bg = new ImageIcon(getClass().getResource("./sunSetbg.png")).getImage();
        ghost.x = framWidth / 8;
        ghost.y = framHeight / 2;
        speedY = 0;
        pipes.clear();
        gameOver = false;
        score = 0;
        gameLoop.start();
        PipeTimer.start();
        MoonButton.setVisible(false);
        SunButton.setVisible(false);
        exitButton.setVisible(false);
        this.requestFocus();
        repaint();
    }

    public void moonGame() 
    {
        bg3 = new ImageIcon(getClass().getResource("./bg3.png")).getImage();
        ghost.x = framWidth / 8;
        ghost.y = framHeight / 2;
        speedY = 0;
        pipes.clear();
        gameOver = false;
        score = 0;
        gameLoop.start();
        PipeTimer.start();
        MoonButton.setVisible(false);
        SunButton.setVisible(false);
        exitButton.setVisible(false);
        this.requestFocus();
        repaint();
    }
    
    public void gameOver() 
    {  
        MoonButton.setVisible(true); 
        SunButton.setVisible(true);
        exitButton.setVisible(true); 
        repaint();
    }
}
