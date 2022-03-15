/* ****************** [Clase BST] **************** *
 * Esta Clase BST, Representa Una Estructura Tipo  *
 * Árbol                                           *
 * *********************************************** *
 * Desarrollador Por: Erick Estrada Aroche         *
 * GIT: estrada-usac                               *
 * *********************************************** */
public class BST {
    
    // Declaración Apuntador A Raíz Del Árbol
    private Nodo raiz;

    // Constructor
    public BST() {

        // Inicializar Apuntador raiz
        raiz = null;
    }

    /* [Método Insertar]
     * Método Recursivo Para Insersión De Una Hoja A Un Árbol
     * Atributos: int:data (Data De Nodo Hoja A Insertar) Nodo:raiz_ (Apuntador A Raiz Del Árbol A Insertar o Posicionar Raiz A Una Hoja)
     * Retorno: Ninguno
    */
    public void insertar(int data, Nodo raiz_) {

        // Verificar Si Es Primer Hoja Del Árbol
        if (raiz == null) {
            
            // Crear Nodo A Insertar
            Nodo nuevaHoja = new Nodo(data);

            // Insertar Primera Hoja Del Árbol
            raiz = nuevaHoja;

        }else { // Ya Hay Hojas En El Árbol
            
            // Verificar Data A Insertar Con Data De Raiz Posicionada
            if (data <= raiz_.getData()) { // La Data Es Menor A La Raiz Posicionada

                // Verificar Rama Izquierda De Raiz Posicionada
                if (raiz_.getIzquierda() == null) { // No Hay Hoja En La Rama Izquierda
                    
                    // Crear Nodo A Insertar
                    Nodo nuevaHoja = new Nodo(data);

                    // Insertar Nueva Hoja En Rama Izquirda De Raiz Posicionada
                    raiz_.setIzquierda(nuevaHoja);

                }else { // Existe Ya Una Hoja En Rama Izquierda De Raiz Posicionada

                    // Cambiar De Posición De Raiz A La Siguiente Hoja De Rama Izquierda Para Seguir Verificando Donde Insertar
                    insertar(data, raiz_.getIzquierda());
                }

            }else { // La Data Es Mayor A La Raiz Posicionada

                // Verificar Rama Derecha De Raiz Posicionada
                if (raiz_.getDerecha() == null) { // No Hay Hoja En La Rama Derecha

                    // Crear Nodo A Insertar
                    Nodo nuevaHoja = new Nodo(data);

                    // Insertar Nueva Hoja En Rama Derecha De Raiz Posicionada
                    raiz_.setDerecha(nuevaHoja);
                    
                }else { // Existe Ya Una Hoja En Rama Derecha De Raiz Posicionada

                    // Cambiar De Posición De Raiz A La Siguiente Hoja De Rama Derecha Para Seguir Verificando Donde Insertar
                    insertar(data, raiz_.getDerecha());
                }

            }

        }

    }


    /* ---------- Recorridos De Árbol ---------- */
    /* [Método PreOrden] 
     * Método Recursivo Para Recorrer Árbol De Forma PreOrden E Imprimir En Consola
     * Atributos: Nodo:raiz_ (Apuntador A Raiz Del Árbol A Insertar o Posicionar Raiz A Una Hoja)
     * Retorno: Ninguno
    */
    public void PreOrden(Nodo raiz_) {
       
            // Mostrar Data De Raiz
            if(raiz_ != null){
                System.out.print(raiz_.getData() + "|");

                // Recorrer SubÁrbol izquierdo
                PreOrden(raiz_.getIzquierda());
    
                // Recorrer Subárbol Derecho
                PreOrden(raiz_.getDerecha());   
            }
     
    }

    /* [Método InOrden]
     * Método Recursivo Para Recorrer árbol De Forma InOrden E Imprimir En Consola
     * Atributos: Nodo:raiz_ (Apuntador A Raiz Del Árbol A Insertar o Posicionar Raiz A Una Hoja)
     * Retorno: Ninguno
     */
    public void InOrden(Nodo raiz_) {

        if(raiz_ != null){
            // Recorrer Subárbol Izquierdo
            InOrden(raiz_.getIzquierda());

            // Mostrar Data De Raíz
            System.out.print(raiz_.getData() + "|");

            // Recorrer Subárbol Derecho
            InOrden(raiz_.getDerecha());
        }
    }

    /* [Método PostOrden]
     * Método Recursivo Para Recorrer árbol De Forma PostOrden E Imprimir En Consola
     * Atributos: Nodo:raiz_ (Apuntador A Raiz Del Árbol A Insertar o Posicionar Raiz A Una Hoja)
     * Retorno: Ninguno
     */
    public void PostOrden(Nodo raiz_) {

        if(raiz_ != null){
            // Recorrer Subárbol Izquierdo
            InOrden(raiz_.getIzquierda());

            // Recorrer Subárbol Derecho
            InOrden(raiz_.getDerecha());

            // Mostrar Data De Raíz
            System.out.print(raiz_.getData() + "|");
        }
    }    


    // Getters Y Setters
    public Nodo getRaiz() {
        return raiz;
    }

    /* Por Seguridad No Debería Ir Este Método
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    */

}
