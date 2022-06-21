package sbnz.integracija.example.facts;

import java.io.Serializable;
import javax.persistence.*;
import sbnz.integracija.example.enums.Medal;

@Entity
@DiscriminatorValue(value = "REGISTERED_USER")
public class RegisteredUser extends User implements Serializable{
	
	//private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "preparations_id", referencedColumnName = "id")
	private Preparations preparations;
	
	@Column(name = "medal")
	private Medal medal;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "advice_id", referencedColumnName = "id")
	private Advice advices;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hair_id", referencedColumnName = "id")
	private Hair hair;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diary_id", referencedColumnName = "id")
	private Diary diary;
	
	
	
}
