class Parqueadero {
    private Carro[][] matrizParqueadero;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        this.matrizParqueadero = new Carro[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= matrizParqueadero.length || columna < 0 || columna >= matrizParqueadero[0].length) {
            return false; // Fuera de límites
        }

        if (matrizParqueadero[fila][columna] == null) {
            matrizParqueadero[fila][columna] = carro;
            return true; // Estacionado exitosamente
        }

        return false; // Espacio ocupado
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return horas * tarifaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        for (int fila = 0; fila < matrizParqueadero.length; fila++) {
            for (int columna = 0; columna < matrizParqueadero[0].length; columna++) {
                if (matrizParqueadero[fila][columna] == null) {
                    System.out.print("[ ] "); // Espacio vacío
                } else {
                    System.out.print("[X] "); // Espacio ocupado
                }
            }
            System.out.println(); // Nueva fila
        }
    }
}
