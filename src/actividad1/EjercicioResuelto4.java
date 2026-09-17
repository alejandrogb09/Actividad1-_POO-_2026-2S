package actividad1;

public class EjercicioResuelto4 {
    public static void main(String args[]) {
        double ageJuan, ageAlberto, ageAna, ageMom;
        ageJuan = 9.0;
        ageAlberto = Age.calculateAgeAlberto(ageJuan);
        ageAna = Age.calculateAgeAna(ageJuan);
        ageMom = Age.calculateAgeMom(ageJuan, ageAlberto, ageAna);
        
        System.out.println("The ages are: ");
        System.out.println("Alberto: " + ageAlberto);
        System.out.println("Juan: " + ageJuan);
        System.out.println("Ana: " + ageAna);
        System.out.println("Mama: " + ageMom);
    }
}
