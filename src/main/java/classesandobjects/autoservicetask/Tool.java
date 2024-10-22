package classesandobjects.autoservicetask;

public class Tool {
    double price;
    String name;
    double weight;

    public Tool(String name) {
        this.name = name;
        System.out.println("Un obiect de tip tool a fost creat, numele lui este " + this.name);
    }

    public Tool() {
        System.out.println("O nouă unealtă a fost creată în cadrul programului. Nu dispunem despre detaliile ei"
                + " pentru detalii Numele este " + this.name + " iar greutatea este " + this.weight);
    }

    public Tool(String nameOfTool, double weight) {
        name = nameOfTool;
        this.weight = weight;
        System.out.println("The tool has been created");
    }

    public Tool(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

}
