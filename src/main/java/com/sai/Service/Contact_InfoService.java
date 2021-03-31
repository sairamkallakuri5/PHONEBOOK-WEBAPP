package com.sai.Service;

import java.util.List;

import com.sai.entity.Contact_Info;

public interface Contact_InfoService {

	public boolean saveOrUpdateContactInfo(Contact_Info contact_Info);

	public List<Contact_Info> getContactInfoList();

	public Contact_Info getContactInfoById(Integer contactId);

	public boolean deleteContactInfoById(Integer contacId);

}
