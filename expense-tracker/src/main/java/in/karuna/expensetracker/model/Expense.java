package in.karuna.expensetracker.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="expensetrackert1")
@Setter
@Getter
public class Expense {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	

	@Column(name="description")
	private String expenseName;
	
	private BigDecimal amount;
	
	private String note;
	
	@Column(name="create_at")
	private Long createdAt;
	
	@Override
	public String toString() {
		return "Expense [id=" + id + ", expenseName=" + expenseName + ", amount=" + amount + ", note=" + note
				+ ", createdAt=" + createdAt + "]";
	}
}
