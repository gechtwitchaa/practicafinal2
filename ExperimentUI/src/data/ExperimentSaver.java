package data;

import logic.Experiment;
import java.io.*;

public class ExperimentSaver {
    public static void save(Experiment experiment, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(experiment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
