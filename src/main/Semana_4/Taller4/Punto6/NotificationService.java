package main.Semana_4.Taller4.Punto6;

public class NotificationService
        implements PreferenceObserver {

    public void onPreferenceChanged(
            String user,
            RecommendationEngine engine
    ) {

        System.out.println(
                "NOTIFICACIÓN: "
                        + engine.recommend(user)
        );
    }
}