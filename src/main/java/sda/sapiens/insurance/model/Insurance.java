package sda.sapiens.insurance.model;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Embeddable
public class Insurance {

    @Enumerated(EnumType.STRING)
    private InsuranceType type;

    private BigDecimal amount;

    public Insurance() {
    }

    public Insurance(InsuranceType type, BigDecimal amount) {
        this.type = type;
        this.amount = amount;
    }

    public InsuranceType getType() {
        return type;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
