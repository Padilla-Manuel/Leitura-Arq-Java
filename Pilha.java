class Pilha extends Vetor{
    int topo; //indicador do topo da pilha

    Pilha(int capacity){
        super(capacity);//chama o construtor da classe mae
        topo = -1; //Pilha vazia 
    }

    public int size(){
    // Devolve o número de elementos da pilha
        return size;
    }

    public void push(String n) throws Exception {
    // Empilha, caso a pilha não esteja cheia, o elemento n
        topo++;
        add(topo,n);
    }

    public void pop() throws Exception {
    // Desempilha, caso a pilha não esteja vazia, o elemento do topo
        remove(topo);
        topo--;
    }

    public String top() throws Exception {
    // Devolve (não desempilha)o elemento do topo se a pilha não estiver vazia
        return get(topo);
    }
        
}