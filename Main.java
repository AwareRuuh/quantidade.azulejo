import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner(System.in);
  Double alturaP, larguraP, alturaA, larguraA, parede, azulejo, qntN;

System.out.println("Digite a altura da sua parede em metros: ");
  alturaP = sc1.nextDouble();
System.out.println("Digite a largura da sua parede em metros: ");
  larguraP = sc1.nextDouble();
System.out.println("Agora digite a altura do azulejo em centímetros: ");
  alturaA = sc1.nextDouble();
System.out.println("Por fim digite a largura do azulejo em centímetros: ");
  larguraA = sc1.nextDouble();

  parede = larguraP * alturaP;
  azulejo = larguraA * alturaA;
  qntN = parede / azulejo;
System.out.print("Você vai precisar de " + qntN + " azulejos para cobrir sua parede" );
}
}