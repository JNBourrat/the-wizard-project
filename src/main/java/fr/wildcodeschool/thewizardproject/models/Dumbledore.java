package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dumbledore implements WizardInterface {

	private Outfit wizardsOutfit;

	@Autowired
	public Dumbledore(@Qualifier("purpleOutfit") Outfit theWizardsOutfit) {
		wizardsOutfit = theWizardsOutfit;
	}

	@Override
	public String giveAdvice() {
		return "It does not do to dwell on dreams and forget to live, remember that.";
	}

	@Override
	public String changeDress() {
		return wizardsOutfit.toString();
	}

}
