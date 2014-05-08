package br.com.glr.populis;

/**
 * 
 * @author felipereis
 * 
 */
public class SSOMain {

	/**
	 * Obtém nome do grupo SSO
	 * 
	 * @return o nome do grupo
	 */
	public static String obtemNomeGrupoSSO() {
		return "Grupo São Paulo";
	}

	public static void main(String[] args) {
		System.out.println("--- Iniciando SSO para grupo: " + obtemNomeGrupoSSO() + " ---");
		System.out.println("- EPI do módulo: " + EPIService.getNomeEPI());
	}
}
