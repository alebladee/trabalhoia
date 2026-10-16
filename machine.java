public class machine{
    //estados do maldito carinha
    public enum EstadoCarinha{
        esperando,
        indodir,
    }
    //estados da bola
    public enum EstadoBola{
        jogando,
        caindo,
        grounded
    }
// o "jogo" em si
public static void main(String[] args) {
carinha carinha = new carinha(); //spawna carinha
EstadoCarinha estadocarinha = EstadoCarinha.esperando; //fala pra ele começar esperando
bola bola = new bola(); //spawna bola
EstadoBola estadobola = EstadoBola.jogando; //fala pra bola começar sendo jogada pra um lugar aleatorio de 1 a 10

int counter = 0; // pro jogo n durar infinitamente mas foi mais pra teste só
int jogadas = 0; // numero de vezes q a bola foi jogada
int bolx = bola.getX(); //ignora esses 2 eu nao usei eles ahjgdsjkgajsghas pelo menos nao direito
int boly = bola.getY();

System.out.println("vamo joga bola eeeeeeeeeeee");
carinha.setbola(bola.getX()); //fala pro carinha onde ta a bola, acabei n usando isso tbm
if (bola.getY() < 0){
    estadocarinha = EstadoCarinha.esperando;}
// se a bola tiver no ar, espera

while (jogadas<6){
    switch(estadocarinha) {
         case esperando:
            carinha.esperando();
            System.out.println("-------------------");
            System.out.println("bola ta caindo...");
             System.out.println("Posiçao carinha:" + carinha.getX());
             System.out.println("Posiçao bola:" + bola.getX());
             System.out.println("Altura bola:" + bola.getY());
            System.out.println("-------------------");
// dialogo de quando ele começa a esperar
        case indodir:
//logica dele andando pra direita, ele ia andar pra esquerda e direita antes mas eu nao consegui fazer funfar entao ele só vai pra direita e loopa
            if (carinha.getX() != bola.getX() && bola.getY() == 0){
                    System.out.println("-------------------");
                    System.out.println("indo pegar a bola!!!");
                    System.out.println("Posiçao carinha:" + carinha.getX());
                    System.out.println("Posiçao bola:" + bola.getX());
                    System.out.println("Altura bola:" + bola.getY());
                    System.out.println("-------------------");
                carinha.indodir();
                }
                else if (carinha.getX() == bola.getX() && bola.getY() == 0){
                    estadobola = EstadoBola.jogando;
                    estadocarinha = EstadoCarinha.esperando;
                    System.out.println("-------------------");
                    System.out.println("peguei!!! la se vai ela denvovo...");
                    System.out.println("Posiçao carinha:" + carinha.getX());
                    System.out.println("Posiçao bola:" + bola.getX());
                    System.out.println("Altura bola:" + bola.getY());
                    System.out.println("-------------------");
                }
                else { estadocarinha = EstadoCarinha.esperando;}

if (carinha.getX() > 10){ carinha.setX(0);}




    }
    switch(estadobola){
        case jogando:
            bola.jogando();
            estadobola = EstadoBola.caindo;
            jogadas += 1;
// fala pra bola ser jogada e aumenta numero de jogadas
        case caindo:
                if (boly > 0){
                    bola.caindo();
                    System.out.println("Altura bola:" + bola.getY());
                }
                else{
                    estadobola = EstadoBola.grounded;
                    bola.setY(0);
                }
// fala altura da bola caindo e para quando tiver em 0
        case grounded:
//se tiver bola no chao, fala pro carinha andar
                estadocarinha = EstadoCarinha.indodir;

            bola.grounded();
            carinha.setbola(bola.getX());


    }
//debug
    counter++;


}

}







}