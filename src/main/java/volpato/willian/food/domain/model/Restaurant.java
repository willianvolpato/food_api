package volpato.willian.food.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {

	@Id
	private Long id;
	
	private String name;
	
	@Column(name = "tax_freight")
	private BigDecimal taxFreight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTaxFreight() {
		return taxFreight;
	}

	public void setTaxFreight(BigDecimal taxFreight) {
		this.taxFreight = taxFreight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, taxFreight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(taxFreight, other.taxFreight);
	}
}
