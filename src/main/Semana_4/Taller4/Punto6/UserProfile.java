package main.Semana_4.Taller4.Punto6;

public class UserProfile {

    private final java.util.List<PreferenceObserver> observers =
            new java.util.ArrayList<>();

    private final RecommendationEngine engine;

    private final String username;

    public UserProfile(
            String username,
            RecommendationEngine engine
    ) {
        this.username = username;
        this.engine = engine;
    }

    public void addObserver(
            PreferenceObserver observer
    ) {
        observers.add(observer);
    }

    public void changePreferences(
            RecommendationAlgorithm algorithm
    ) {

        engine.setAlgorithm(algorithm);

        observers.forEach(
                observer ->
                        observer.onPreferenceChanged(
                                username,
                                engine
                        )
        );
    }
}