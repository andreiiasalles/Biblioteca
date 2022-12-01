class Main {
  public static void main(String[] args) {

   Biblioteca a = new Biblioteca();
   Estante p = a.Estantep();
   Estante m = a.Estantem();
   Estante g = a.Estanteg(); 


    Obra[] obras = new Obra[5];
    for (int i = 0; i < obras.length; i++){
     obras[i] = new Obra("livro", "desconhecido",2022, 400.0);
      System.out.println("As informações são: " + obras[i]);
    }

    p.adcionarlivros(obras[1], 1);
    p.adcionarlivros(obras[2], 2);
    p.adcionarlivros(obras[3], 3);
    p.adcionarlivros(obras[4], 4);
    p.adcionarlivros(obras[0], 0);

    m.adcionarlivros(obras[0],0);

    
  
    m.mover(0, 0, obras);
  }
}