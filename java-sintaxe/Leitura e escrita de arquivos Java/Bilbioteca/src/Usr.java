public class Usr {
    private String senha;
    private int codU;

    public Usr(String senha, int codU) {
        this.senha = senha;
        this.codU = codU;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodU() {
        return codU;
    }

    public void setCodU(int codU) {
        this.codU = codU;
    }

}
