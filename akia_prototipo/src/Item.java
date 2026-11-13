package akia_prototipo.src;

public abstract class Item {
    String nome;
    String categoria;
    boolean uso;
    public Item(String nome, String categoria, boolean uso){
        this.nome = nome;
        this.categoria = categoria;
        this.uso = uso;
    }
    public String getnome() {
        return nome;
    }
    public String getcategoria() {
        return categoria;
    }


}
