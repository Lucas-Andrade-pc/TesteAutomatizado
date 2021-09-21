package stepsDefinitions;

import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static utils.Utils.*;

public class TestandoActionsSteps {

	@Quando("mover o mouse para aba PIM")
	public void moverOMouseParaAbaPIM() {
		Na(TelaInicialPage.class).moverMouseParaAbaPIM();
	}

	@Quando("mover o mouse para o menu configuration")
	public void moverOMouseParaOMenuConfiguration() {
		Na(TelaInicialPage.class).moverMouseParaMenuConfiguration();
	}

	@Quando("mover o mouse para o menu custom field")
	public void moverOMouseParaOMenuCustomField() {
		Na(TelaInicialPage.class).moverMouseParaMenuFields();
	}
}
