/* ****************** [Clase Nodo] **************** *
 * Esta Clase Nodo, Representa La Hoja De           *
 * Una Estructura Tipo Árbol Binario De Busqueda    *
 * ************************************************ *
 * Desarrollador Por: Erick Estrada Aroche          *
 * GIT: estrada-usac                                *
 * ************************************************ */
public class Nodo {

    // Declaración De Apuntadores A SubHojas Izquierda Y Derehca De Una Hoja
    private Nodo izquierda; 
    private Nodo derecha;
    
    // Declaración De Variable Data Donde Se Almacenará La Información
    private int data;

    // Constructor
    public Nodo(int data_) {

        // Inicializar Apuntadores
        izquierda = null;
        derecha = null;

        // Inicializar Data Que Es Pasada Por Parámetros
        data = data_;
    }

    // Getters Y Setters
    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha_) {
        this.derecha = derecha_;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda_) {
        this.izquierda = izquierda_;
    }

    public int getData() {
        return data;
    }

    public void setData(int data_) {
        this.data = data_;
    }


}
