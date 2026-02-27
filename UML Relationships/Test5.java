// Dependency (Temporary Use)

class Document {
    String text = "Hello Java";
}

class Printer {
    void print(Document d) {   // dependency
        System.out.println(d.text);
    }
}

public class Test5 {
    public static void main(String[] args) {
        Document doc = new Document();  // create document
        Printer p = new Printer();      // create printer
        p.print(doc);                   // printer uses document
    }
}