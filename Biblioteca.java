class Biblioteca {
  
  public Estante Estantep(){
     Estante p = new Estante(3);
    System.out.println("A estante pequena suporta " + p.pesomaxestante + " gramas");
    return p;
  }
  public Estante Estantem() {
     Estante m = new Estante(5);
    System.out.println("A estante média suporta " + m.pesomaxestante + " gramas");
    return m;
  }
   public Estante Estanteg() {
     Estante g = new Estante(7);
    System.out.println("A estante grande suporta " + g.pesomaxestante + " gramas");
     return g;
  }
}