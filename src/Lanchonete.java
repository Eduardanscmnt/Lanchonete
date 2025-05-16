public class Lanchonete {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");

        Item iten1 = new Item("Hamburguer de carne de boi", 12.99, 1);
        Item iten2 = new Item("Hamburguer de frango", 11.99, 2);
        Item iten3 = new Item("Coca-cola", 5.99, 3);
        Item iten4 = new Item("Guaraná", 4.99, 4);

        Carrinho c = new Carrinho();

        c.adicionarItem(iten2);
        c.adicionarItem(iten1);
        c.adicionarItem(iten3);
        c.adicionarItem(iten4);

        c.calcularPreco();
    }
}
