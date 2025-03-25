public class Main {
    public static void main(String[] args) throws Exception {
        Pilha p1 = new Pilha(10);
        p1.push("ET");
        p1.push("CONCLAVE");
        p1.push("AINDA ESTOU AQUI");
        System.out.println("topo da pilha:" + p1.top());

        p1.pop();
        p1.pop();
        System.out.println("topo da pilha:" + p1.top());

        System.out.println("Qtda de elementos na pilha:" + p1.size());
    }
}