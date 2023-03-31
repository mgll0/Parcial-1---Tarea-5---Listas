package uaslp.objetos.list2.src.main.java;

/*
T es el tipo genérico que será reemplazado por un tipo real.
T es el nombre que damos al parámetro genérico.
Este nombre se sustituirá por el tipo real que se le pasará a la clase.
 */

public interface Iterator<T>{ //<T> significa que es cualquier tipo de tato

     boolean hasNext();
     T next();
}
