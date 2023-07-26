package org.matgyeojo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PET_TENDENCY")
public class PetTendency {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tendenctNo;	//성향 시퀀스
	//반려 시퀀스 FK
	private String tendency1;	//성향1
	private String tendency2;	//성향2
	private String tendency3;	//성향3
	private String tendency4;	//성향4
	private String tendency5;	//성향5
	private String tendencyMsg;	//성향 주의사항
}
