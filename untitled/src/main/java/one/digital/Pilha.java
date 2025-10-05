package one.digital;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {

        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha.setReNo(refAuxiliar);

    }

    public No pop(){
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return  refNoEntradaPilha;
    }

    public boolean isEmpty() {
      return refNoEntradaPilha == null ? false : true;
    }

    @Override
    public String toString(){

        String stringRetorno = "----------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxuliar = refNoEntradaPilha;

        while (true) {
            if (noAuxuliar != null) {
                stringRetorno += "[No{dado=" + noAuxuliar.getDado() + "}]\n";
                noAuxuliar = noAuxuliar.getReNo();
            }else {
                break;
            }
        }
        stringRetorno += "=================\n";
        return stringRetorno;
    }
}
