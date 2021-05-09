package gameDemo.business.concretes;

import gameDemo.business.abstracts.CampaignService;
import gameDemo.core.abstracts.CheckService;
import gameDemo.dataAccess.abstracts.CustomerDao;
import gameDemo.entities.abstracts.Entity;
import gameDemo.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	private CheckService checkService;
	private CustomerDao customerDao;
	
	public CampaignManager(CheckService checkService,CustomerDao customerDao) {
		super();
		this.checkService = checkService;
		this.customerDao=customerDao;
	}
	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
