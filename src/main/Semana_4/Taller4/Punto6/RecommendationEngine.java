package main.Semana_4.Taller4.Punto6;

public class RecommendationEngine {

    private RecommendationAlgorithm algorithm;

    public RecommendationEngine(
            RecommendationAlgorithm algorithm
    ) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(
            RecommendationAlgorithm algorithm
    ) {
        this.algorithm = algorithm;
    }

    public String recommend(String user) {
        return algorithm.recommend(user);
    }
}

