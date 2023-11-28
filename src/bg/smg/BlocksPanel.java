package bg.smg;

import javax.swing.*;
import java.awt.*;

public class BlocksPanel extends JPanel {
    private Image[] blocks;
    private int xCoord;
    private int yCoord;
    private Image currentBlock;
    private int currentIndex;

    BlocksPanel(){
        this.blocks = new Image[7];
        for(int i=0;i<7;i++)
            blocks[i] = new ImageIcon("resources/block"+i+".png").getImage();
        this.currentIndex=0;
        this.currentBlock=blocks[currentIndex];
        this.xCoord = 150;
        this.yCoord = 0;
    }

    private void nextBlock(){
        if(this.currentIndex==6){
            this.currentIndex=0;
        } else {
            this.currentIndex++;
        }
        this.currentBlock = blocks[currentIndex];
        this.xCoord = 100;
        this.yCoord = 0;
        repaint();
    }

    public void left() {
        xCoord -= 15;
        repaint();
    }
    public void right() {
        xCoord += 15;
        repaint();
    }
    public void down() {
        yCoord += 15;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics block) {
        super.paintComponent(block);
        block.drawImage(currentBlock, xCoord, yCoord, this);
    }

    public void move(){
        while(true) {
            down();
            if(yCoord>getHeight()){
                nextBlock();
            }
            try {
                Thread.sleep(150);
            }catch (InterruptedException e){
            }
        }
    }
}
