package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(name = "txtUsername")
	private WebElement campoUsuario;
	
	@FindBy(name = "txtPassword")
	private WebElement campoSenha;
	
	@FindBy(name = "Submit")
	private WebElement botaoLogin;
	 
	public void informarCmapoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}

	public void informarCmapoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void acionarBotaoLogin() {
		botaoLogin.click();  
	}
	public void realizarLogin(String usuario, String senha) {
		informarCmapoUsuario(usuario);
		informarCmapoSenha(senha);
		acionarBotaoLogin();
	}

}
