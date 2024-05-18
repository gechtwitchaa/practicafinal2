package data;

import logic.Experiment;

public class DataManager {
    public static void saveExperiment(Experiment experiment, String fileName) {
        ExperimentSaver.save(experiment, fileName);
    }

    public static Experiment loadExperiment(String fileName) {
        return ExperimentLoader.load(fileName);
    }
}
