package com.adhi.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
	@GetMapping("/games")
	public List<Games> getGames()
	{
		return Arrays.asList(new Games(1,"Spiderman Miles Morales","PC Console"),new Games(2,"Spiderman Miles Morales","PC Console"));
	}

}
