package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {

	
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
	   Na(LoginPage.class).informarCmapoUsuario(usuario);
	}
	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    Na(LoginPage.class).informarCmapoSenha(senha);
	}
	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
	    Na(LoginPage.class).acionarBotaoLogin();
	}
	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
		assertEquals("Invalid credentials",driver.findElement(By.id("spanMessage")).getText());
	}
	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	   assertEquals("Welcome Paul",driver.findElement(By.id("welcome")).getText());
	}
}
