package com.example.demo.beans.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.beans.models.Creature;
import com.example.demo.beans.repositories.CreatureRepo;

@RestController
@RequestMapping("/creatures")
public class CreatureController {

	protected CreatureRepo repo;
	
	@Autowired
	public CreatureController(CreatureRepo repo) {
		this.repo = repo;
	}
	
	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public Creature getCreature(@PathVariable int creatureId)
	  {
		  return repo.getById(creatureId);
	  }
	
	@GetMapping(value = "/all")
	public  List<Creature> getAllCreatures()
	{
		return repo.findAll();
	}
	
	@PostMapping()
	public void postCreature(@RequestBody Creature creature)
	{
		System.out.println(creature);
		this.repo.save(creature);
	}

}
