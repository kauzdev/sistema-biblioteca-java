package service;
import model.Livro;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> biblioteca = new ArrayList<>();

    public void cadastrarLivro(Livro livro){
        biblioteca.add(livro);
    }
    public void listarLivros(){
        for (Livro livro: biblioteca){
            System.out.println(livro);
            System.out.println("----------------");
        }
    }

    public Livro buscarPorisbn(String isbn) {
        for (Livro livro : biblioteca) {
            if (livro.getIsbn().equals(isbn)){
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivroPorIsbn(String isbn){

        Livro livro = buscarPorisbn(isbn);

        if(livro != null){
            livro.emprestarLivro();
        }else{
            System.out.println("Livro não encontrado");
        }

    }

    public void devolverLivroPorIsbn(String isbn){

        Livro livro = buscarPorisbn(isbn);

        if(livro != null){
            livro.devolverLivro();
        }else{
            System.out.println("Livro não encontrado");
        }

    }
}
