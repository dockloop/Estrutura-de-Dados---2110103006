public class Main {
    public static void main(String[] args){
        IPilha pilha = new Pilha(5);
        

        for(int i = 0; i < 5; i++){
            pilha.Push("Prometheus");
        }

        pilha.top();
        
    }

    public static boolean palindromo(String palavra){
		int x=palavra.length();
		PilhaVet p = new PilhaVet(x);
		for (int i=0;i<x;i++) {
			char c = palavra.charAt(i);
			p.push(c);
		}
		for (int i=0;i<x;i++) {
			if (!(p.pop()==palavra.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
