public class main {
    
    public static void main(String[] args) {
        
        /* ----- Pruebas ----- */
        // Crear Un Nuevo Árbol
        BST bst = new BST();

        // Insertar Hojas Al Árbol
        bst.insertar(20, bst.getRaiz());
        bst.insertar(10, bst.getRaiz());
        bst.insertar(52, bst.getRaiz());
        bst.insertar(30, bst.getRaiz());
        bst.insertar(20, bst.getRaiz());
        bst.insertar(50, bst.getRaiz());
        bst.insertar(60, bst.getRaiz());
        bst.insertar(5, bst.getRaiz());
        bst.insertar(15, bst.getRaiz());
        bst.insertar(25, bst.getRaiz());

        // Mostrar Recorridos
        bst.PreOrden(bst.getRaiz()); // 20|10|5|20|15|52|30|25|50|60
        System.out.println("");
        bst.InOrden(bst.getRaiz());  // 5|10|15|20|20|25|30|50|52|60 
        System.out.println("");
        bst.PostOrden(bst.getRaiz());// 5|15|20|10|25|50|30|60|52|20

    }

}
