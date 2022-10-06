package com.investmentmvcapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.investmentmvcapp.model.Investment;

@Controller
public class InvestmentController {
   
   private RestTemplate restTemplate;
   public static final String BASEURL="http://localhost:8080/investment-api/investments";
   
   @Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
	this.restTemplate = restTemplate;
}

	@RequestMapping("/")
	public String homePage(Model model) {
		ResponseEntity<List> responseEntity= restTemplate.getForEntity(BASEURL,List.class);
		List<Investment> investments = responseEntity.getBody();
		System.out.println(responseEntity.getStatusCode()+""+responseEntity.getStatusCodeValue());
		HttpHeaders headers=responseEntity.getHeaders();
		System.out.println(headers.get("info"));
		
		model.addAttribute("investments",investments);
		return "index";
	}

	@RequestMapping("/admin")
	public String adminPage() {
		return "admin";
	}

	@RequestMapping("/addForm")
	public String addFormPage() {
		System.out.println("-----hello world-----");
		return "addformpage"; // This is the file Name
	}

	@RequestMapping(value = "/addInvestment", method = RequestMethod.POST)
	public String addInvestment(@Valid Investment investment, BindingResult result) {
		
		if (result.hasErrors()) {
			System.out.println(result.getErrorCount());
			System.out.println(result.getAllErrors());
			return "redirect:/";
		}
		//get the investment object from the form
		System.out.println(investment);
		
		MultiValueMap<String, Object>map= new LinkedMultiValueMap<>();
		map.add("planName",investment.getPlanName());
		map.add("amount",investment.getAmount());
		map.add("entryAge",investment.getEntryAge());
		map.add("risk",investment.getRisk());
		map.add("purpose",investment.getPurpose());
		map.add("type",investment.getType());
		map.add("nominee",investment.getNominee());
		map.add("term",investment.getTerm());
		
		//send the map object to  backend using post method
		restTemplate.postForEntity(BASEURL, map, Void.class);
		return "admin";
	}

	@RequestMapping("/deleteForm")
	public String deleteFormPage() {
		return "deleteformpage"; // This is the file Name
	}

	@RequestMapping("/deleteInvestment")
	public String deleteInvestment(@RequestParam("planId") int planId) {
		String url=BASEURL+"/"+planId;
		restTemplate.delete(url,planId);
		return "admin";
	}

	@RequestMapping("/updateForm")
	public String updateFormPage() {
		
		return "editformpage";
	}

	@RequestMapping(value = "/getOne")
	public String getById(@RequestParam("planId") int planId, Model model) {
		String url =BASEURL+"/planId/"+planId;
		ResponseEntity<Investment> responseEntity= restTemplate.getForEntity(url,Investment.class);
		System.out.println(responseEntity.getStatusCode()+""+responseEntity.getStatusCodeValue());
		Investment investment = responseEntity.getBody();
		model.addAttribute("investment",investment);
		return "updateformpage";
	}

	@RequestMapping(value = "/updateInvestment")
	public String getById(Investment investment, Model model) {
		restTemplate.put(BASEURL, investment);
		
		return "admin";
	}

//	@ExceptionHandler(Exception.class)
//	public String handleException(Exception e, Model model) {
//		System.out.println("Exception.........");
//		model.addAttribute("error", "error occured");
//		return "admin";
//	}

}
