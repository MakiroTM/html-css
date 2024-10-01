public class Main {
    public static void main(String[] args) {
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        // Cadastrando duas pessoas
        Pessoa p1 = new Pessoa("João", "12345678900", 25);
        Pessoa p2 = new Pessoa("Maria", "98765432100", 30);

        gerenciador.cadastrarPessoa(p1);
        gerenciador.cadastrarPessoa(p2);

        // Exibindo as informações cadastradas
        System.out.println("Informações iniciais:");
        gerenciador.exibirPessoas();

        // Atualizando informações da pessoa 1
        Pessoa p1Atualizado = new Pessoa("João Silva", "12345678900", 26);
        gerenciador.atualizarPessoa("12345678900", p1Atualizado);

        // Exibindo as informações após a atualização
        System.out.println("\nInformações após atualização:");
        gerenciador.exibirPessoas();

        // Exibindo uma pessoa específica por CPF
        System.out.println("\nExibindo pessoa pelo CPF:");
        gerenciador.exibirPessoaPorCpf("98765432100");
    }
}
