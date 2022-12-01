class Obra {

  private String titulo;
  private String autor;
  private int ano;
  private int id;
  private static int autoIncrementId = 1;
  private double peso;

  Obra(String titulo, String autor, int ano, double peso) {
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.peso = peso;
    id = autoIncrementId++;
    
  }
   public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public long getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

@Override
    public String toString() {
        return "Obra { " +
                "id = " + id +
                ", titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", ano = " + ano +
                ", peso = " + peso +
                '}';
    }
}