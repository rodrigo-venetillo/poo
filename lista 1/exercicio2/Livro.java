package exercicio2;

public class Livro {
     String titulo;
     String autor;
     String editora;
     boolean status;//diz se o livro esta emprestado para alguem no momento, ou não
     int anoDePublicacao;

    public Livro(String titulo, String autor, String editora, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;
        this.status = true;// ao criar o livro ele ja se encontra disponivel
    }
     
     
    //letra a)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public boolean isStatus() {
        return status;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
    //fim da letra a) 
    
    //letra b)
    public void emprestarLivro(){
        if(status == false){ //garante que o livro nao seja emprestado se ele estiver indisponivel 
            System.out.println("o livro ja se encontra emprestado");
            return ;
        }
        status = false;//livro agora esta indisponivel 
    }
    //fim da letra b)
    
    //letra c)
    public void devolverLivro(){
        if(status == true){ //garante que o livro nao seja devolvido se ele ja estiver na "biblioteca" 
            System.out.println("o livro nao pode ser devolvido porque ja esta conosco");
            return ;
        }
        status = true;//livro agora esta disponivel 
        
    }
    //fim da letra c)
    
    //letra d)
    public boolean Pesquisa(String s){
        if(titulo.indexOf(s) == -1){
            return false;
        }
        return true;
    }
    //fim da letra d) 
}

