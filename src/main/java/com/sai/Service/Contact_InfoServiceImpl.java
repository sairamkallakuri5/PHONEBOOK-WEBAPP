package com.sai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sai.entity.Contact_Info;
import com.sai.repository.Contact_InfoRepository;

@Service
public class Contact_InfoServiceImpl implements Contact_InfoService {
	
	
	private Contact_InfoRepository contactInfoRepo;
	
	

	public Contact_InfoServiceImpl(Contact_InfoRepository contactInfoRepo) {
		
		this.contactInfoRepo = contactInfoRepo;
	}

	@Override
	public boolean saveOrUpdateContactInfo(Contact_Info contact_Info) {
		Contact_Info savedObj = contactInfoRepo.save(contact_Info);
		
		return savedObj.getContactId()!=null;
	}

	@Override
	public List<Contact_Info> getContactInfoList() {
		return contactInfoRepo.findAll();
	}

	@Override
	public Contact_Info getContactInfoById(Integer contactId) {
		Optional<Contact_Info> findById = contactInfoRepo.findById(contactId);
		
		if (findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}

	@Override
	public boolean deleteContactInfoById(Integer contacId) {
		boolean isDeleted=false;
		try {
			contactInfoRepo.deleteById(contacId);
			isDeleted=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

}
