import java.time.LocalDate;
import java.util.List;

public class Human {
    static int count;

    private int id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth, dateOfDeath;
    private List<Human> parents;
    private List<Human> children;
    private Human spouse;

    Human(String name) {
        id = count;
        count++;
        this.name = name;
        // this.gender = gender;
        // this.dateOfBirth = dateOfBirth;
    }
}