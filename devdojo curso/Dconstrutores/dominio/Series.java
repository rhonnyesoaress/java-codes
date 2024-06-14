package com.google.rw.javacore.Dconstrutores.dominio;

public class Series {

    private String name = "";
    private String tipo = "";
    private int episodios;
    private int ano;

    public Series(String name, String tipo, int episodios, int ano){ //sintaxe do contrutores (te forçam a passar valores na criação do objeto)
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
        this.ano = ano;
    }
    public Series(){

    }

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.ano);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.getTipo();
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.getEpisodios();
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }
}
