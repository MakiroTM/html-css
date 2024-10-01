import java.util.ArrayList;

public class GerenciadorDePessoas {
    private final ArrayList<Pessoa> listaDePessoas;

    // Construtor
    public GerenciadorDePessoas() {
        listaDePessoas = new ArrayList<>();
    }

    // Método para cadastrar uma nova pessoa
    public void cadastrarPessoa(Pessoa pessoa) {
        listaDePessoas.add(pessoa);
    }

    // Método para atualizar uma pessoa existente com base no CPF
    public void atualizarPessoa(String cpf, Pessoa pessoaAtualizada) {
        for (int i = 0; i < listaDePessoas.size(); i++) {
            if (listaDePessoas.get(i).getCpf().equals(cpf)) {
                listaDePessoas.set(i, pessoaAtualizada);
                System.out.println("Pessoa com CPF " + cpf + " atualizada.");
                return;
            }
        }
        System.out.println("Pessoa com CPF " + cpf + " não encontrada.");
    }

    // Método para exibir informações de todas as pessoas
    public void exibirPessoas() {
        if (listaDePessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (Pessoa pessoa : listaDePessoas) {
                System.out.println(pessoa);
            }
        }
    }

    // Método para exibir informações de uma pessoa específica pelo CPF
    public void exibirPessoaPorCpf(String cpf) {
        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                System.out.println(pessoa);
                return;
            }
        }
        System.out.println("Pessoa com CPF " + cpf + " não encontrada.");
    }
}
