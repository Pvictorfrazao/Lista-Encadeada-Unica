public class App {
    public static void main(String[] args) throws Exception {
      
        ListaEncadeada list = new ListaEncadeada();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        
        
       System.out.println("Lista Encadeada");
       list.printList(); 
        list.deleteAtPosition(4);
        //list.deleteByKey(3);
        list.printList();



    }
}
