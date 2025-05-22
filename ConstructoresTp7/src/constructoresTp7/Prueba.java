package constructoresTp7;

public class Prueba {
    public static void main(String[] args) {
       
        Persona persona = new Persona("Agustina", 17);

       
        char letra = 'a';


        System.out.println("Nombre: " + persona.getNombre() + " edad: " + persona.getEdad());


        if (persona.sosMayor()) {
            System.out.println(persona.getNombre() + " es mayor de edad");
        } else {
            System.out.println(persona.getNombre() + " es menor de edad.");
        }

     
        System.out.println("Cantidad de veces que aparece (" + letra + ") en el nombre: " + persona.repeticionesDeLetra(letra));
    }
}
