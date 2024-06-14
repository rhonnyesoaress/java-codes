package com.google.rw.javacore.Csobrecargametodos.dominio;

public class Series {

    private String name = "";
    private String tipo = "";
    private int episodios;
    private int ano;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.ano);
    }

    public void init(String name, String tipo, int episodios) {
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;


    }

    public void init2(String name, String tipo, int episodios, int ano) {
        this.init(name, tipo, episodios);
        this.ano = ano;


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
