public class bola {
// posiçao da bola
   private int x = 10;
   private int y = 10;



    public void jogando(){
        this.x = (int)(Math.random()* 10);
        this.y = 10;
        return;
        // joga a bola num lugar aleatorio de 1 a 10 e na altura 10
    }

   public void caindo(){
        //cai e para em 0
        this.y -= 1;
       if (y < 0){
           y = 0;
       }
   }

      public void grounded(){
        //nada acontece feijoada
          return;
   }
//setters e getters e betters e letters e hetters e petters e wetters e tetters e yetters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

        public void setX(int x) {
        this.x = x;
    }
        public void setY(int y) {
        this.y = y;
    }

}