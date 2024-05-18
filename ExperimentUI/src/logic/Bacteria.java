package logic;

import java.util.Random;

public class Bacteria {
    private int x;
    private int y;
    private int foodConsumed;

    public Bacteria(int x, int y) {
        this.x = x;
        this.y = y;
        this.foodConsumed = 0;
    }

    public void simulateDay(int[][] foodGrid) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            if (foodGrid[x][y] >= 100) {
                foodGrid[x][y] -= 20;
                foodConsumed += 20;
                int num = rand.nextInt(100);
                if (num < 3) {
                    // Bacteria dies
                    return;
                } else if (num < 60) {
                    // Bacteria stays
                    continue;
                } else {
                    moveBacteria(num);
                }
            } else if (foodGrid[x][y] > 9) {
                foodGrid[x][y] -= 10;
                foodConsumed += 10;
                int num = rand.nextInt(100);
                if (num < 6) {
                    // Bacteria dies
                    return;
                } else if (num < 20) {
                    // Bacteria stays
                    continue;
                } else {
                    moveBacteria(num);
                }
            } else {
                int num = rand.nextInt(100);
                if (num < 20) {
                    // Bacteria dies
                    return;
                } else if (num < 60) {
                    // Bacteria stays
                    continue;
                } else {
                    moveBacteria(num);
                }
            }
        }
        reproduceBacteria();
    }

    private void moveBacteria(int num) {
    }

    private void reproduceBacteria() {

    }

    // Getters y setters
}
