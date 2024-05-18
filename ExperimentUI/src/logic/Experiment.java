package logic;

import java.util.ArrayList;
import java.util.List;

public class Experiment {
    private List<Bacteria> bacteriaList;
    private int days;
    private int[][][] simulationData; // [day][x][y] contiene el número de bacterias y la comida restante

    public Experiment() {
        this.bacteriaList = new ArrayList<>();
    }

    public void addBacteria(Bacteria bacteria) {
        bacteriaList.add(bacteria);
    }

    public void simulate(int days) {
        this.days = days;
        simulationData = new int[days][20][20];
        for (int day = 0; day < days; day++) {
            int[][] foodGrid = new int[20][20];
            distributeFood(foodGrid);
            for (Bacteria bacteria : bacteriaList) {
                bacteria.simulateDay(foodGrid);
            }
            updateSimulationData(day, foodGrid);
        }
    }

    private void distributeFood(int[][] foodGrid) {
    }

    private void updateSimulationData(int day, int[][] foodGrid) {
    }

}
