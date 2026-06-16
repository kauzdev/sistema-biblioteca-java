import model.Livro;
import service.Biblioteca;
import utils.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca bbc = new Biblioteca();
        Menu menu = new Menu();
        Scanner leitor = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 5) {

            menu.mostrarMenu();

            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Titulo: ");
                    String titulo = leitor.nextLine();

                    System.out.print("Autor: ");
                    String autor = leitor.nextLine();

                    System.out.print("ISBN: ");
                    String isbn = leitor.nextLine();

                    Livro livro = new Livro(titulo, autor, isbn);
                    bbc.cadastrarLivro(livro);

                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    bbc.listarLivros();
                    break;

                case 3:
                    System.out.print("Digite o ISBN para emprestar: ");
                    String isbnEmprestar = leitor.nextLine();

                    bbc.emprestarLivroPorIsbn(isbnEmprestar);
                    break;

                case 4:
                    System.out.print("Digite o ISBN para devolver: ");
                    String isbnDevolver = leitor.nextLine();

                    bbc.devolverLivroPorIsbn(isbnDevolver);
                    break;

                case 5:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();
        }

        leitor.close();
    }
}