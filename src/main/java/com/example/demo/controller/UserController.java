package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojos.Details;
import com.example.demo.pojos.Userpojo;

@RestController
public class UserController {
	
	@PostMapping("/bfhl")
	public Userpojo getUser(@RequestBody Details d) {
		List<Integer> numbers = new ArrayList<>();
		List<String> alphabets = new ArrayList<>();

		for(int i=0;i<d.getData().length;i++) {
			try {
				numbers.add(Integer.parseInt(d.getData()[i]));
			}catch(Exception e){
				alphabets.add((d.getData()[i]));
			}
		}
		Object[] arr1 = numbers.toArray();
		Object[] arr2 = alphabets.toArray();
		
		Userpojo userpojo = new Userpojo("true","Akshay_Pathak_02011992","pathak2192@gmail.com","210943020065",arr1,arr2);
		return userpojo;

	}

}
