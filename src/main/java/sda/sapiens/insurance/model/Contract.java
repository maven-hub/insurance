package sda.sapiens.insurance.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contracts")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Candidate candidate;

    @Embedded
    private Insurance insurance;

    public Contract() {
    }

    public Contract(Candidate candidate, Insurance insurance) {
        this.candidate = candidate;
        this.insurance = insurance;
    }

    public Long getId() {
        return id;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return id.equals(contract.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
