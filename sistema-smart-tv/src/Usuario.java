public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV Ligado? " + smartTv.ligada);
        System.out.println("Qual o Canal atual: " + smartTv.canal);
        System.out.println("Qual e o Volume: " + smartTv.volume);

        System.out.println("Novo Status ==> do Canal é:  " + smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Novo Status ==> do Canal é:  " + smartTv.canal);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Status ==> do Volume é:  " + smartTv.volume);


        smartTv.desligar();
        System.out.println("Novo Status ==> TV Ligada? " + smartTv.ligada);
    }
}

