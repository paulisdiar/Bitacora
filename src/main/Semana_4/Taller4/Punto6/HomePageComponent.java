package main.Semana_4.Taller4.Punto6;

public class HomePageComponent
        implements PreferenceObserver {

    public void onPreferenceChanged(
            String user,
            RecommendationEngine engine
    ) {

        System.out.println(
                "HOME: "
                        + engine.recommend(user)
        );
    }
}