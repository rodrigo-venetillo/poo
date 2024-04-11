package exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Livro l = new Livro("pequeno principe", "Antoine de Saint-Exupéry", "HarperCollins Brasil", 1943);
        
        System.out.println(l.Pesquisa("prin"));
        System.out.println(l.Pesquisa("rodinei"));
        
        System.out.println(l.isStatus());   
        l.emprestarLivro();
        System.out.println(l.isStatus());   
        l.devolverLivro();
        System.out.println(l.isStatus());
        l.devolverLivro();


    }
    
}
