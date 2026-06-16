    package model;

    public class Livro {

        private String titulo;
        private String autor;
        private String isbn;
        private boolean disponivel;

        public Livro(String titulo, String autor, String isbn){
            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
            this.disponivel = true;
        }

        public String getTitulo(){
            return titulo;
        }
        public String getAutor(){
            return autor;
        }

        public String getIsbn(){
            return isbn;
        }

        public boolean getDisponivel(){
            return disponivel;
        }

        public String getStatus(){
            if (disponivel){
                return "Disponivel";
            } else {
                return "Emprestado";
            }
        }



        @Override
        public String toString() {
            return "Titulo: " + titulo +
                    "\nAutor: " + autor +
                    "\nISBN: " + isbn +
                    "\nStatus: " + getStatus();

        }

        public void emprestarLivro(){
            if (disponivel){
                System.out.println("Livro emprestado com sucesso");
                this.disponivel = false;
            }else {
                System.out.println("Livro indisponivel para emprestimo");
            }
        }

        public void devolverLivro(){
            if (!disponivel){
                System.out.println("Livro devolvido com sucesso");
                this.disponivel = true;
            } else {
                System.out.println("Livro já disponivel");
            }
        }
    }