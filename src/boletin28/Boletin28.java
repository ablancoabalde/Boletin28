package boletin28;

import boletin28.Alumno.Enderezo;

public class Boletin28 {

    public static void main(String[] args) {
        Alumno al=new Alumno();

        Alumno alumno1=new Alumno("A", 5, "tra", 55);

        alumno1.iamosar();

        alumno1.modNota();

        alumno1.iamosar();

        alumno1.modEnderezo();

        alumno1.iamosar();

    }

}
