public class ExempçoForArray {
    public static void main(String[] args) {

        // em arrays o indice inicia em ZERO
        String alunos[]={"JOEL", "ALICE", "JHULY", "TATA"};

        /*for (int x=0; x<alunos.length;x++){
            System.out.println("O aluno no indice x=" + x + "é" + alunos[x]);
        }*/
        
        for(String aluno : alunos){
            System.out.println("Nome do aluno é:" + aluno);
        }
    }
}
 