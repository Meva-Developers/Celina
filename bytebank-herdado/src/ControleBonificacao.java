public class ControleBonificacao {

    private  double soma;

    public void registra(Gerente g) {
        g.getBonificacao();
        double boni = g.getBonificacao();
        this.soma = this.soma = boni;
    }

    public void registra(Funcionario f) {
        f.getBonificacao();
        double boni = f.getBonificacao();
        this.soma = this.soma = boni;
    }

    public void registra(EditorVideo ev) {
        ev.getBonificacao();
        double boni = ev.getBonificacao();
        this.soma = this.soma = boni;
    }
    public double getSoma() {
        return soma;
    }
}
