package gameDemo.dataAccess.concretes;

import gameDemo.dataAccess.abstracts.CampaignDao;
import gameDemo.entities.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
      System.out.println("Kampanya"+campaign.getName()+"Bitis Tarihi:"+campaign.getFinisDate());		
	}

}
