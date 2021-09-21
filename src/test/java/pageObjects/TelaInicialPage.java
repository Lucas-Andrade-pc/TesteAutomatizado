package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
import static utils.Utils.*;

public class TelaInicialPage extends BasePage {
	
	public void acionarAbaAdmin() {
		abaAdmin.click();
	}
	
	@FindBy(name = "btnAdd")
	public WebElement botaoAdd;
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	public void moverMouseParaAbaPIM() {
		Actions acao = new Actions(driver);
		acao.moveToElement(abaPIM).build().perform();
	}
	public void moverMouseParaMenuConfiguration() {
		Actions acao = new Actions(driver);
		acao.moveToElement(menuConfigurations).build().perform();;
	}
	public void moverMouseParaMenuFields() {
		Actions acao = new Actions(driver);
		acao.moveToElement(menuField).build().perform();;
	}
}

