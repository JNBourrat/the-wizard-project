package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Gandalf implements WizardInterface {

	private Outfit wizardsOutfit;

	public Gandalf(Outfit theWizardsOutfit) {
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
