/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author cefet
 */
public class Pessoa {
    String nome;
    int idade;
    String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        if(sexo.length() == 1){
            this.sexo = sexo.toUpperCase();
        }
    }
    
    
    
    //letra a)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // fim da letra a)
    
     //letra b)
    public void apresentar(){
        System.out.println("nome:" + getNome() + "\nidade:" + idade + "\nsexo:" + sexo);
    }
    //fim da letra b)
}
