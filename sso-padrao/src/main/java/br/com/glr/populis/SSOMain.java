package br.com.glr.populis;

/**
 * 
 * @author felipereis
 * 
 */
public class SSOMain {

	/**
	 * Obt�m nome do grupo SSO
	 * 
	 * @return o nome do grupo
	 */
	public static String obtemNomeGrupoSSO() {
		return "Grupo S�o Paulo";
	}

	public static void main(String[] args) {
		System.out.println("--- Iniciando SSO para grupo: " + obtemNomeGrupoSSO() + " ---");
		System.out.println("- EPI do m�dulo: " + EPIService.getNomeEPI());
	}
}
