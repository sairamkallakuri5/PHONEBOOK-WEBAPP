package com.sai.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sai.Service.Contact_InfoService;
import com.sai.entity.Contact_Info;
import com.sai.repository.Contact_InfoRepository;

@Controller
public class Contact_InfoController {
	
	
	private Contact_InfoService contact_Infoservice;
	
	
	public Contact_InfoController(Contact_InfoService contact_Infoservice) {
		this.contact_Infoservice = contact_Infoservice;
	}

	/***
	 * This method is used to display contact form
	 * @return
	 */
	@GetMapping("/load-form")
	public String loadForm(Model model) {
		
		Contact_Info cobj = new Contact_Info();
        
		//send data from controller to ui we use model object
		model.addAttribute("contact_Info", cobj);
		
		//returning logical view name
		return "contact";
		
	}
	
	@PostMapping("/saveContact")
	public String handleSubmitBtn(Contact_Info contact_Info,Model model) {
		
		boolean isSaved = contact_Infoservice.saveOrUpdateContactInfo(contact_Info);
		
		if (isSaved) {
          
			model.addAttribute("succMsg", "Contact Saved");
			
		}else {
			model.addAttribute("failMsg", "Failed to save Contact");
		}
		return "contact";
	}
	
	@GetMapping("/view-contacts")
	public String handleViewsContactHyperLink(Model model) {
		
		List<Contact_Info> contactInfoList = contact_Infoservice.getContactInfoList();
		
		model.addAttribute("contactInfoList", contactInfoList);
		
		return "allContacts";
	}

}
