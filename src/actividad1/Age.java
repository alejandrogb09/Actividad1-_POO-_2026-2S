package actividad1;

public class Age {
    public static double calculateAgeAlberto(double ageJuan) {
        return (2.0 / 3.0) * ageJuan;
    }
    public static double calculateAgeAna(double ageJuan) {
        return (4.0 / 3.0) * ageJuan;
    }
    public static double calculateAgeMom(double ageJuan, double ageAlberto, double ageAna) {
        return ageJuan + ageAlberto + ageAna;
    }
}