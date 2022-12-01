class Estante {

  public Obra[] estante = new Obra[20];
  
  public static final double pesomaxprateleira = 550;
  public  double acm = 0;
  public int prateleirasporestante;
  public double pesomaxestante;
  
  public Estante( int prateleirasporestante){
    
    this.pesomaxestante = pesomaxprateleira*prateleirasporestante ;
    
  }

  public void adcionarlivros(Obra obra, int indice) {
      if (acm + obra.getPeso() <= pesomaxestante){
        estante[indice] = obra;
        acm += estante[indice].getPeso();
        
      } else {
        System.out.println("Peso máximo atingido, escolha outra estante.");
      }
    System.out.println("Sua estante está ocupando a seguinte capacidade" + acm);
  
  }
  
  public void mover(int id, int indice, Obra[] estante) {
    for (int i = 0; i < estante.length; i++){
      if (estante[i] != null && id == estante[i].getId()) {
          if (acm + estante[i].getPeso() <= pesomaxestante) {
            acm -= estante[i].getPeso();
            estante[indice] = estante[i];
            estante[i] = null;
            acm += estante[i].getPeso();
            break;
          } else {
            System.out.println("Peso máximo atingido, escolha outra estante.");
          }
        } else {
         System.out.println("Obra não localizada.");
        }
      }
    System.out.println("Sua estante está ocupando a seguinte capacidade" + acm);
    }
  
}