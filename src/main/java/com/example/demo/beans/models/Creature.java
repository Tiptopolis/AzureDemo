package com.example.demo.beans.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//return ResponseEntity.ok().body(objectMapper.writeValueAsString(userService.getUserById(user.getiD())));


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "creatures")
public class Creature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "creatureId")
	protected int creatureId = -1;
	
	@Column(name = "genera")
	public String genera;
	
	@Column(name = "species")
	public String species;
	
	public Creature(String genera, String species)
	{
		this.genera = genera;
		this.species = species;
	}
}


