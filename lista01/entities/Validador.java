package lista01.entities;

public class Validador {
    // Método estático para validar o formato do ano
    public static void validarAno(int nasc) throws AnoInvalidoException {
        if (String.valueOf(nasc).length() != 4 || nasc <= 0) {
            throw new AnoInvalidoException("O ano deve ter 4 dígitos e ser maior que 0.");
        }
    }

    // Método estático para validar se o ano de nascimento não está no futuro
    public static void validarAnoFuturo(int nasc, int anoAtual) throws FutureTravelException {
        if (nasc >= anoAtual) {
            throw new FutureTravelException("Digite um ano válido, menor que " + anoAtual);
        }
    }
}