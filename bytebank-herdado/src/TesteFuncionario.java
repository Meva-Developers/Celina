public class TesteFuncionario {

public static void main(String[] args) {

   Funcionario celina = new Funcionario();
   celina.setNome("Celina Neta");
   celina.setCpf("23681469744");
   celina.setSalario(5000.00);

   System.out.println(celina.getNome());
   System.out.println(celina.getBonificacao());



}
}
