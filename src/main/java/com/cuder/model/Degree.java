package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the degree database table.
 * 
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Degree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String degree_name;

	private String description;

	private float effectiveTime;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
}