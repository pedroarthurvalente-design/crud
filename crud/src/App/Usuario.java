package App;

public class Usuario {

    private String nome;
    private long cpf;
    private Genero genero;
    private double peso;
    private double altura;

    

    public enum Genero{ M, F};


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public long getCPF(){
        return cpf;
    }

    public void setCPF(long cpf){
        this.cpf = cpf;
    }

    public Genero getGenero(){
        return genero;
    }

    public void setGenero(Genero genero){
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
