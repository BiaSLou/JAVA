package aula1;

public class ImprimeIdade {

    public static void main(String[] args) {
        int idade = 41;
        String nome = "Bianca";
        boolean acompanhada = false;
        double altura = 1.65;
        double peso = 60;

        if (idade >= 40) {
            double imc = (peso) / (altura * altura);
            if (imc < 22) {
                System.out.print("IMC=" + imc + "fique atento com a sub-alimentação.");
            } else if (imc > 22 && imc < 30) {
                System.out.print("IMC=" + imc + "Você está com porcentagem dentro do desejado.");
            } else if (imc > 30 && imc <= 35) {
                System.out.print("IMC=" + imc + "Você precisa se atentar a alimentação.");
            }
        } else {
            System.out.println("Você precisa procurar um médico.");
        } else {
        if (imc < 25) {
            System.out.println("IMC= " + imc + " Se alimente melhor e cuidado com desnutrição.");
        } else if (imc <= 35) {
            System.out.println("IMC= " + imc + " Meus parabéns está em forma.");
        } else {
            System.out.println("IMC= " + imc + " Planeje alguns exercícios.");
        }
    }

}
