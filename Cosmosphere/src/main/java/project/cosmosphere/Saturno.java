package project.cosmosphere;

public class Saturno extends Planetas{    
    private String nome = "Saturno";
    private String diametro = "116.460  Km";
    private String area = "42.612.133.285 Km²";
    private String massa = "5,683 × 10^26 kg";
    private double distanciaSol = 1429000000; // bilhões de km
    private String sateliteNatural = "Mais de 80 satélites conhecidos, incluindo Titã, Encélado, Reia e Dione";
    private int periodoRotacao = 37500; // segundos
    private long periodoTranslacao = 928704000; // segundos
    private String temperatura = "-139ºC";
    private String populacao = "Nenhuma";
    private String idade = "4,6 bilhões de anos";
    private double perimetro = 365882; // km
    public String [] curiosidades = { 
        "Os anéis de Saturno são compostos de inúmeros anéis individuais que variam em tamanho e brilho. Esses anéis são compostos principalmente de gelo de água, junto com outros materiais como rochas e poeira.",
        "Saturno é um planeta gasoso, composto principalmente de hidrogênio e hélio. Ele tem uma atmosfera densa, com características distintas, como faixas de nuvens e tempestades.",
        "A densidade de Saturno é tão baixa que, se houvesse um oceano grande o suficiente, o planeta flutuaria nele. Sua densidade média é menor que a da água.",
        "A missão Cassini-Huygens, uma colaboração entre a NASA, a ESA e a ASI, estudou Saturno e suas luas de perto. A missão lançou a sonda Huygens, que aterrissou com sucesso na maior lua de Saturno, Titã."
    };    
    private String urlImagem = "@../img/saturno.png";
    
}
