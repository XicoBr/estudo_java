package livros;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    void mostrarDetalhes(){
        String mensagem = "\nMostrando detalhes do(a) autor(a):\n";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
    String getEmail() {
        return email;
    }
    void setEmail(String email) {
        this.email = email;
    }
    String getCpf() {
        return cpf;
    }
    void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
