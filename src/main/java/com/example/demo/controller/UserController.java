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
	public Userpojo getUserinfo(@RequestBody Details d) {
		List<Integer> nums = new ArrayList<>();
		List<String> chars = new ArrayList<>();

		for(int i=0;i<d.getData().length;i++) {
			try {
				nums.add(Integer.parseInt(d.getData()[i]));
			}
			catch(Exception e)
			{
				chars.add((d.getData()[i]));
			}
		}
		Object[] a1 = nums.toArray();
		Object[] a2 = chars.toArray();
		
		
		Userpojo userpojo = new Userpojo("true","Akshay_Pathak_02011992","pathak2192@gmail.com","210943020065",a1,a2);
		
		return userpojo;

	}

}
