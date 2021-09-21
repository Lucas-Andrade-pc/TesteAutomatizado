package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarusuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {

	
	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
	   Na(TelaInicialPage.class).acionarAbaAdmin();
	}
	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	}
	@Quando("informar no campo employer name {string}")
	public void informarNoCampoEmployerName(String exployerName) {
	    Na(CadastrarusuarioPage.class).informarCampoEmployerName(exployerName);
	}
	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String userName) {
	   Na(CadastrarusuarioPage.class).informarCampoUsername(userName);
	}
	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String password) {
	   Na(CadastrarusuarioPage.class).informarCampoPassword(password);
	}
	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String confirmarPassword) {
		Na(CadastrarusuarioPage.class).informarCampoConfirmarPassword(confirmarPassword);
	}
	@E("^acionar o botao salvar$")
	public void acionarOBotaoSalvar() throws Throwable {
		Na(CadastrarusuarioPage.class).acionarBotaoSalvar();
	}
	
	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String username) throws Throwable {
		assertTrue(driver.findElement(By.xpath("//a[text()='"+ username +"']")).isDisplayed());
	}
}
