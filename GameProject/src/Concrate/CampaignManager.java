package Concrate;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("%"+campaign.getDiscount()+" oran�nda "+campaign.getCampaignName()+" eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("%"+ campaign.getDiscount()+" "+campaign.getCampaignName()+" ingdirimimiz sona erdi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" indirimimiz  g�ncellendi.");
		
	}

}
