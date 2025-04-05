 Interface 1: 

 interface Printable {  

void print(); 

 } 

 class Document implements Printable { 

 public void print() {  

System.out.println("Printing the document");  

} 

 public static void main(String[] args) { 

 Document doc = new Document(); doc.print(); 

 } 

 } 