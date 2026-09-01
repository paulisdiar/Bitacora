package main.Semana_4.Taller4.Punto6;

public interface PreferenceObserver {

    void onPreferenceChanged(
            String user,
            RecommendationEngine engine
    );
}