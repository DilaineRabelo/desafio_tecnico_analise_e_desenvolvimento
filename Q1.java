/*
1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
Imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?
R: 78
 */
public class Q1 {
  public static void main(String[] args) {

      int soma = 0;
      int k = 0;

      for(int indice = 13; k < indice; k++ ) {
          soma = soma + k;
      }
      System.out.println("Soma = " + soma);
  }
}