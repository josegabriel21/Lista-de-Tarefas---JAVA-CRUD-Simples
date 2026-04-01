import java.util.ArrayList;
import java.util.Scanner;

public class praticando2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefaUsuario = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar tarefas");
            System.out.println("2 - Excluir tarefas");
            System.out.println("3 - Listar todas as tarefas");
            System.out.println("4 - Editar tarefa");
            System.out.println("5 - Sair");
            System.out.print("Digite aqui sua opção: ");
            int decisaoUsuario = sc.nextInt();
            sc.nextLine();

            if (decisaoUsuario == 5) {
                System.out.println("Saindo...");
                break;
            }

            if (decisaoUsuario == 1) {
                System.out.println("Qual tarefa deseja adicionar? :");
                String adicionarTarefa = sc.nextLine();
                tarefaUsuario.add(adicionarTarefa.trim().toLowerCase());
                System.out.println("Tarefa adicionada com Sucesso!!!");

            } else if (decisaoUsuario == 2) {
                System.out.println("Qual tarefa deseja remover?? ");
                String removerTarefa = sc.nextLine().trim().toLowerCase();
                if (tarefaUsuario.remove(removerTarefa)) {
                    System.out.println("Tarefa Removida!");
                } else {
                    System.out.println("Tarefa não cadastrada.");
                }

            } else if (decisaoUsuario == 3) { // FECHA AQUI A OPÇÃO 3 CORRETAMENTE
                if (tarefaUsuario.isEmpty()) {
                    System.out.println("Sem tarefas por hoje!! ");
                } else {
                    System.out.println("---- MINHAS TAREFAS ----");
                    for (int i = 0; i < tarefaUsuario.size(); i++) {
                        System.out.println(i + " - " + tarefaUsuario.get(i));
                    }
                }

            } else if (decisaoUsuario == 4) {
                if (tarefaUsuario.isEmpty()) {
                    System.out.println("Não existem tarefas para editar!");
                } else {
                    System.out.println("Digite o número da tarefa que deseja editar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    if (indice >= 0 && indice < tarefaUsuario.size()) {
                        System.out.println("Tarefa atual: [" + tarefaUsuario.get(indice) + "]");
                        System.out.println("Digite o nome da nova tarefa: ");
                        String novoNome = sc.nextLine();
                        tarefaUsuario.set(indice, novoNome.trim().toLowerCase());
                        System.out.println("Tarefa editada com sucesso!");
                    } else {
                        System.out.println("Esse número de tarefa não existe.");
                    }
                }
            }
        }
    }
}