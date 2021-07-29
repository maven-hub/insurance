package sda.sapiens.insurance.model;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class Candidate {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Candidate() {
    }

    public Candidate(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
