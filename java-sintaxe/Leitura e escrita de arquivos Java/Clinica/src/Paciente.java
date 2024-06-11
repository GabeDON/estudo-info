public class Paciente {
    private String nome;
    private String cpf;
    private String Doenca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDoenca() {
        return Doenca;
    }

    public void setDoenca(String doenca) {
        Doenca = doenca;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", Doenca='" + Doenca + '\'' +
                '}';
    }
}
