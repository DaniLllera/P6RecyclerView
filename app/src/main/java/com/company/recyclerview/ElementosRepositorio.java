package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento("Charmander", "Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola."));
        elementos.add(new Elemento("Squirtle", "Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble."));
        elementos.add(new Elemento("Bulbasaur", "Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo."));
        elementos.add(new Elemento("Caterpie", "Para protegerse, despide un hedor horrible por las antenas con el que repele a sus enemigos."));
        elementos.add(new Elemento("Abra","Es capaz de usar sus poderes psíquicos aun estando dormido. Al parecer, el contenido del sueño influye en sus facultades."));
        elementos.add(new Elemento("Kadabra","Duerme suspendido en el aire gracias a sus poderes psíquicos. La cola, de una flexibilidad extraordinaria, hace las veces de almohada."));
        elementos.add(new Elemento("Charizard","Escupe un fuego tan caliente que funde las rocas. Causa incendios forestales sin querer."));
        elementos.add(new Elemento("Butterfree","Aletea a gran velocidad para lanzar al aire sus escamas extremadamente tóxicas."));
        elementos.add(new Elemento("Metapod","Como en este estado solo puede endurecer su coraza, permanece inmóvil a la espera de evolucionar."));
        elementos.add(new Elemento("Blastoise","Para acabar con su enemigo, lo aplasta con el peso de su cuerpo. En momentos de apuro, se esconde en el caparazón."));

    }

    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}
