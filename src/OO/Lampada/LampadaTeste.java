package OO.Lampada;

     class lampadaTeste {
        public static void main(String[] args) {

            Lampada lampada = new Lampada();
            lampada.nome = "Smart Lâmpada";
            lampada.marca = "Positivo";
            lampada.peso = 60;
            lampada.volts = 110.22;

            lampada.ligar();
            lampada.mostrarEstado();
            lampada.mudarEstado();
            lampada.desligar();
            lampada.mostrarEstado();






        }
    }
