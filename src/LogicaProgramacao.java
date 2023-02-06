public class LogicaProgramacao {
        public static void main(String[] args) {

            //exercicio a
            int A = 4;
            int B = 9;
            trocar(A, B);

            //exercicio b
            double comissao = comissao(93,118);
            System.out.println("Comissão recebida: R$" + comissao);

            //exercicio c
            int[] numeros = {3, 4, 9, 2, 5};
            int maior = maiorNumero(numeros);
            System.out.println("Maior número: " + maior);

            //exercicio d
            int[] elementos = {3, 4, 9, 2, 5};
            ordemCrescente(elementos);

            //exercicio e

            /*Este algoritmo cria um array de números decimais chamado "array" e inicializa uma variável decimal chamada "x" com o valor 0.
            Em seguida, usa um loop "for" para percorrer cada elemento no array "array". Dentro do loop, ele adiciona o valor do elemento atual do array ao valor atual de "x".
            Depois que o loop termina, ele divide o valor total de "x" pelo comprimento do array e escreve o resultado na tela usando o método "Console.write".
            Em resumo, esse algoritmo calcula a média dos valores contidos no array.*/

    }


    public static void ordemCrescente(int[] elementos) {
        for (int i = 0; i < elementos.length - 1; i++) {
            for (int j = i + 1; j < elementos.length; j++) {
                if (elementos[i] > elementos[j]) {
                    int temp = elementos[i];
                    elementos[i] = elementos[j];
                    elementos[j] = temp;
                }
            }
            System.out.print("Passo " + (i + 1) + ": ");
            for (int k = 0; k < elementos.length; k++) {
                System.out.print(elementos[k] + " ");
            }
            System.out.println();
        }
    }
    public static int maiorNumero(int[] numeros) {
        int maiorNumero = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        return maiorNumero;
    }

    public static double comissao(double recargaRealizada, double valorTotal){
        double valorRecarga = 0.35, precoRecarga = 1.05;
        return valorRecarga + (precoRecarga * recargaRealizada);
    }
    public static void trocar(int A, int B) {
       int aux = A;
       A = B;
       B = aux;
       System.out.println("A: " + A + " B: " + B);
        }
    }

