public class vector {

  public static void main(String[] args) {
    int[] numeros = new int[10];
    for(int contador=1;contador<=10;contador=contador+1){
      numeros[contador-1]=contador;
    }
    int contador;
    contador=1;

    while (contador<=10){

      System.out.println(numeros[contador-1]);
      contador=contador+1;
    }
  }

}
