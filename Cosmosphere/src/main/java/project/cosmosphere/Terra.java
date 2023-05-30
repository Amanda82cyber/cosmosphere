package project.cosmosphere;

public class Terra extends Planetas {
    
    private String diametro = "12.756,2 Km";
    private String area = "510.072.000 Km²";
    private String massa = "5,9736 * 10^24 kg";
    private double distanciaSol = 149600000; // km
    private String sateliteNatural = "Lua";
    private int periodoRotacao = 86164; // segundos
    private int periodoTranslacao = 31556880; // segundos
    private String temperatura = "14ºC";
    private String populacao = "8.028.091.456";
    private String idade = "4,5 bilhões de anos";
    private double perimetro = 40075; // km
    public String [] curiosidades = {
        "A Terra é conhecida por “Planeta Azul”, já que cerca de 70% da superfície terrestre é formada por oceanos e mares. A existência da água em seu estado líquido, juntamente à presença do oxigênio oferece à Terra características únicas em comparação a outros planetas.", 
        "A Terra é o único planeta que não foi batizado com nome em referência a algum deus romano. Em latim, “terra” significa “solo, região, país”.", 
        "A cada 100 anos, a velocidade de rotação da Terra diminui 17 milissegundos.", 
        "A Terra tem cerca de 4,5 bilhões de anos, mas a vida só começou a surgir há cerca de 3,8 bilhões de anos.", 
        "A Terra é o planeta com maior densidade do Sistema Solar, tendo a densidade 5,51 g/cm³.", 
        "A distância entre a Lua e a Terra é de cerca de 384.400 km, o que equivale à mais de 30 vezes o diâmetro da Terra."
    };
    private String urlImagem = "@../img/terra.png";
    
}
