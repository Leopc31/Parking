public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 5.0); // Crear un parqueadero con 5 filas, 10 columnas y tarifa por hora de 5.0

        Carro carro1 = new Carro("ABC123", "Toyota", "Camry");
        Carro carro2 = new Carro("XYZ789", "Honda", "Civic");

        // Estacionar carros
        boolean estacionado1 = parqueadero.parquearCarro(carro1, 2, 3);
        boolean estacionado2 = parqueadero.parquearCarro(carro2, 0, 0);

        // Verificar si el estacionamiento fue exitoso
        System.out.println("Carro 1 estacionado exitosamente: " + estacionado1);
        System.out.println("Carro 2 estacionado exitosamente: " + estacionado2);

        // Intentar estacionar en un espacio ocupado
        boolean estacionado3 = parqueadero.parquearCarro(new Carro("DEF456", "Ford", "Focus"), 2, 3);
        System.out.println("Carro 3 estacionado exitosamente: " + estacionado3);

        // Calcular costo por tiempo
        double costoCarro1 = parqueadero.cobrarPorTiempo(carro1, 3);
        double costoCarro2 = parqueadero.cobrarPorTiempo(carro2, 2);

        System.out.println("Costo por tiempo para Carro 1: $" + costoCarro1);
        System.out.println("Costo por tiempo para Carro 2: $" + costoCarro2);

        // Mostrar estado del parqueadero
        parqueadero.mostrarEstadoParqueadero();
    }
}
