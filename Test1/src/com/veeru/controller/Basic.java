package com.veeru.controller;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.veeru.services.IBasicServices;


@Controller
public class Basic {
	
 @Autowired
 IBasicServices serv;
	
	@RequestMapping("/home")
	public String showHomePage(){
		
		
		return "Homepage";}
	

	@GetMapping("/newPlan")
	public String addNewPlan(){
		return "NewPlan";}
	
	@PostMapping("/newPlan")
	public String addNewPlan(@RequestParam(name="plan",required=true)String newPlan){
		System.out.println(newPlan);
		try {
			serv.newPlanInsert(newPlan);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Homepage";}

	@RequestMapping("/allPlans")
	public String showAllPlans(Model map){
		
		try {
			serv.getAllPlans();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "AllPlans";}

	
	
	
}
