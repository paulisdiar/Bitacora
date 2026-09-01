package main.Semana_4.Taller4.Punto6;

public class Punto6 {

    public static void main(String[] args) {

        RecommendationEngine engine =
                new RecommendationEngine(
                        new GenreStrategy()
                );

        UserProfile user =
                new UserProfile(
                        "Paula",
                        engine
                );

        user.addObserver(
                new HomePageComponent()
        );

        user.addObserver(
                new NotificationService()
        );

        System.out.println(
                "Cambio de preferencias..."
        );

        user.changePreferences(
                new PopularityStrategy()
        );
    }
}