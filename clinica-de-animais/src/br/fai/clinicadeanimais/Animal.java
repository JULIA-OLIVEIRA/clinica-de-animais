package br.fai.clinicadeanimais;

public abstract class Animal {

	public static void main(String[] args) {
		
		public void cadastrarCavalo() {
			System.out.println("1.	Cadastrar cavalo");
		}
		
		public void cadastrarGirafa() {
			System.out.println("2.	Cadastrar girafa");
		}
		
		public void listarCavalos() {
			System.out.println("3.	Listar cavalos");
		}
		
		public void listarGirafas() {
			System.out.println("4.	Listar girafas");
		}
		
		public void listarTodosOsAnimais() {
			System.out.println("5.	Listar todos os animais");
		}
		
		public void removerUmAnimalPorId() {
			System.out.println("6.	Remover um animal por id");
		}
		
		public void exibirAQuantidadeDeAnimaisCadastradosPorTipo() {
			System.out.println("7.	Exibir a quantidade de animais cadastrados por tipo");
		}
		
		public void sair() {
			System.out.println("8.	Sair");
		}

	}

}
