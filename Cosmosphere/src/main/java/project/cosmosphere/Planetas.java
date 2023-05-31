package project.cosmosphere;

public class Planetas {
    protected String nome;
    protected String diametro;
    protected String area;
    protected String massa;
    protected double distanciaSol; // km
    protected String sateliteNatural;
    protected int periodoRotacao; // segundos
    protected long periodoTranslacao; // segundos
    protected String temperatura;
    protected String populacao;
    protected String idade;
    protected double perimetro; // km
    protected String [] curiosidades = new String[6];
    protected String imagem;
    
    // GETs
    public String getNome() {
        return nome;
    }
    
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
    
    public long getPeriodoTranslacao() {
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
    
    public String getCuriosidades(int i) {
        return curiosidades[i];
    }
    
    public String getImagem() {
        return imagem;
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
    public static String calcularPeriodo(long valor) {
        long horas = valor/3600;
        long min = (valor%3600)/60;
        long seg = (valor%3600)%60;
        
        StringBuilder periodo = new StringBuilder(Long.toString(horas));
        periodo.append("H ");
        periodo.append(Long.toString(min));
        periodo.append("MIN ");
        periodo.append(Long.toString(seg));
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
