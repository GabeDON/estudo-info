public class Adm extends Usr{
    private int pda;

    public Adm(String senha, int codU,int pda) {
        super(senha, codU);
        this.pda=pda;
    }

    public int getPda() {
        return pda;
    }

    public void setPda(int pda) {
        this.pda = pda;
    }
}
