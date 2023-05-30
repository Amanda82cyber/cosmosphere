package project.cosmosphere;

public class Planetas {
    private String diametro;
    private String area;
    private String massa;
    private double distanciaSol; // km
    private String sateliteNatural;
    private int periodoRotacao; // segundos
    private int periodoTranslacao; // segundos
    private String temperatura;
    private String populacao;
    private String idade;
    private double perimetro; // km
    private String [] caracteristicas = new String[6];
    private String urlImagem;
    
    // GETs
    public String getDiametro() {
        return diametro;
    }
    
    public String getArea() {
       return area;
    }
    
    public String getMassa() {
        return massa;
    }
    
    public double getDistanciaSol() {
        return distanciaSol;
    }
    
    public String getSateliteNatural() {
        return sateliteNatural;
    }
    
    public int getPeriodoRotacao() {
        return periodoRotacao;
    }
    
    public int getPeriodoTranslacao() {
        return periodoTranslacao;
    }
    
    public String getTemperatura() {
        return temperatura;
    }
    
    public String getPopulacao() {
        return populacao;
    }
    
    public String getIdade() {
        return idade;
    }
    
    public double getPerimetro() {
        return perimetro;
    }
    
    public String [] getCaracteristicas() {
        return caracteristicas;
    }
    
    public String getUrlImagem() {
        return urlImagem;
    }
    
    // GETs com Formatação    
    public String getDistanciaSolFormatado() {
        return Double.toString(distanciaSol) + " KM";
    }
    
    public String getPeriodoRotacaoFormatado() {
        return calcularPeriodo(periodoRotacao);
    }
    
    public String getPeriodoTranslacaoFormatado() {
        return calcularPeriodo(periodoTranslacao);
    }
    
    // ACTIONS    
    public static String calcularPeriodo(int valor) {
        int horas = valor/3600;
        int min = (valor%3600)/60;
        int seg = (valor%3600)%60;
        
        StringBuilder periodo = new StringBuilder(Integer.toString(horas));
        periodo.append("H ");
        periodo.append(Integer.toString(min));
        periodo.append("MIN ");
        periodo.append(Integer.toString(seg));
        periodo.append("S");
        
        return periodo.toString();
    }
    
    public double velocidadeRotacao() {
      double perimetroEmM = perimetro/1000;
      double velocidade = perimetroEmM/periodoRotacao;
      return Math.round(velocidade * 100.0)/100.0;
    }
    
    public double velocidadeTranslacao() {
      double distanciaSolEmM = distanciaSol/1000;
      double perimetroCircunferencia = 2 * 3.14 * distanciaSolEmM;
      double velocidade = perimetroCircunferencia/periodoTranslacao;
      return Math.round(velocidade * 100.0)/100.0;
    }
}
