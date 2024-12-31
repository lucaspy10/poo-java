package pessoa.cadastro;

import pessoa.pessoa.Pessoa;

public class Cadastro extends Pessoa {
	public void Cliente() {
		Pessoa cadastroUm = new Pessoa();
		cadastroUm.setNome("Hershell");
		cadastroUm.setCpf("12345678911");
		cadastroUm.setIdade(17);
		cadastroUm.setEndereco("Santo André(SP)");
		System.out.println("Seja bem vindo " + cadastroUm.getNome().toUpperCase() + ", sua idade é " + cadastroUm.getIdade() + " e você mora em " + cadastroUm.getEndereco() + ", prazer em te conhecer!");
	}
}
