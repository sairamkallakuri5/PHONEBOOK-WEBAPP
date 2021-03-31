package com.sai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sai.Service.Contact_InfoService;
import com.sai.entity.Contact_Info;

@Controller
public class Contact_InfoOpertionsController {

	private Contact_InfoService contact_InfoService;

	public Contact_InfoOpertionsController(Contact_InfoService contact_InfoService) {
		this.contact_InfoService = contact_InfoService;
	}

	@GetMapping("/edit")
	public String editContact_Info(@RequestParam("cid") Integer contactId, Model model) {

		Contact_Info contactObj = contact_InfoService.getContactInfoById(contactId);

		model.addAttribute("contact_Info", contactObj);
		return "contact";
	}

	@GetMapping("/delete")
	public String deleteContact_Info(@RequestParam("cid") Integer contactId ,Model model) {

		boolean isDeleted = contact_InfoService.deleteContactInfoById(contactId);

		if (isDeleted) {
			model.addAttribute("succsMsg", "Contact deleted successfully");
		}else {
			model.addAttribute("failMsg", "Failed to delete contact");
		}



		return  "redirect:view-contacts";

	}

	}