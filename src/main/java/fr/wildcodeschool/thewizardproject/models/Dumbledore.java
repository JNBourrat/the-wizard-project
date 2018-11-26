package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {

	private Outfit wizardsOutfit;

	public Dumbledore(Outfit theWizardsOutfit) {
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
