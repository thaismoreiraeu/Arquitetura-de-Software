package arquitetura_de_software.exercicios;

import java.util.ArrayList;

import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<String>();
        boolean condicao = false;
        int aux = 1;
        int remove;

        // Entrada de dados na Lista
        do {
            System.out.println("Escreva uma tarefa a se inserir na lista: ");
            tarefas.add(entrada.nextLine());

            System.out.println("\nDeseja adicionar uma nova tarefa ? [1]Sim [0]Não: ");
            aux = entrada.nextInt();

            // limpando a entrada
            entrada.nextLine();

            condicao = aux == 1 ? false : true;
        } while (!condicao);

        getTarefas(tarefas); // Imprime a lista

        condicao = false; // iniciando o false novamente para a retirada de tarefas
        aux = 1;

        // Remove itens concluidos da lista
        do {
            System.out.println("Deseja retirar uma tarefa da lista ? [1]Sim [2]Nao: ");
            aux = entrada.nextInt();

            // Limpando a entrada
            entrada.nextLine();

            if (aux == 1) {
                System.out.println("\nInsira o ID da tarefa a ser removida: ");
                remove = entrada.nextInt();
                entrada.nextLine();
                tarefas.remove(remove);
            }
            condicao = aux == 1 ? false : true;

        } while (!condicao);

        getTarefas(tarefas); // Imprime a lista
        entrada.close();
    }

    // Metodo para imprimir a lista de tarefas
    public static void getTarefas(ArrayList<String> tarefas) {
        System.out.println("\nLISTA DE TAREFAS\n");

        // Imprime a lista de tarefas
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("ID " + i + " " + "-> " + tarefas.get(i));
        }
    }

}