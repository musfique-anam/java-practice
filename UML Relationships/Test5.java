// Dependency (Temporary Use)

class Document {
}

class Printer {
    void print(Document d) {   // used only in method
        System.out.println("Printing document");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Document doc = new Document();
        Printer p = new Printer();
        p.print(doc);
    }
}