package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gandalf implements WizardInterface {

	private Outfit wizardsOutfit;

	@Autowired
	public Gandalf(@Qualifier("greyOutfit") Outfit theWizardsOutfit) {
		wizardsOutfit = theWizardsOutfit;
	}

	@Override
	public String giveAdvice() {
		return "He that breaks a thing to find out what it is has left the path of wisdom.";
	}

	@Override
	public String changeDress() {
		return wizardsOutfit.toString();
	}

}
