package project.cosmosphere;

public class Planetas {
    private double diametro;
    private double area;
    private double massa;
    private double distanciaSol;
    private String sateliteNatural;
    private int periodoRotacao; // segundos
    private int periodoTranslacao; // segundos
    private double temperatura;
    private double populacao;
    private double idade;
    
    // SETs
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public void setMassa(double massa) {
        this.massa = massa;
    }
    
    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }
    
    public void setSateliteNatural(String sateliteNatural) {
        this.sateliteNatural = sateliteNatural;
    }
    
    public void setPeriodoRotacao(int periodoRotacao) {
        this.periodoRotacao = periodoRotacao;
    }
    
    public void setPeriodoTranslacao(int periodoTranslacao) {
        this.periodoTranslacao = periodoTranslacao;
    }
    
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }
    
    public void setIdade(double idade) {
        this.idade = idade;
    }
    
    // GETs
    public double getDiametro() {
        return diametro;
    }
    
    public double getArea() {
       return area;
    }
    
    public double getMassa() {
        return massa;
    }
    
    public double getDistanciaSol() {
        return distanciaSol;
    }
    
    public String getSateliteNatural() {
        return sateliteNatural;
    }
    
    public double getPeriodoRotacao() {
        return periodoRotacao;
    }
    
    public double getPeriodoTranslacao() {
        return periodoTranslacao;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    public double getPopulacao() {
        return populacao;
    }
    
    public double getIdade() {
        return idade;
    }
    
    // GETs com Formatação
    public String getDiametroFormatado() {
        return escreverComPotencia(diametro, " KM");
    }
    
    public String getAreaFormatado() {
       return escreverComPotencia(area, " KM²");
    }
    
    public String getMassaFormatado() {
        return escreverComPotencia(massa, " KG");
    }
    
    public String getDistanciaSolFormatado() {
        return escreverComPotencia(distanciaSol, " KM");
    }
    
    public String getSateliteNaturalFormatado() {
        return sateliteNatural;
    }
    
    public String getPeriodoRotacaoFormatado() {
        return calcularPeriodo(periodoRotacao);
    }
    
    public String getPeriodoTranslacaoFormatado() {
        return calcularPeriodo(periodoTranslacao);
    }
    
    public String getTemperaturaFormatado() {
        return escreverComPotencia(temperatura, " °C");
    }
    
    public String getPopulacaoFormatado() {
        return escreverComPotencia(populacao, "");
    }
    
    public String getIdadeFormatado() {
        return escreverComPotencia(idade, " ANOS");
    }
    
    // ACTIONS
    public static String escreverComPotencia(double valor, String unidade) {
        int inteira = (int) valor;
        int decimal = (int)Math.round((valor - inteira) * 10);
        StringBuilder num = new StringBuilder(Integer.toString(inteira));
        int potencia = num.length() - 1;
        
        num.insert(1, '.');
        num.append(Integer.toString(decimal));
        num.append(" * 10^");
        num.append(Integer.toString(potencia));
        num.append(unidade);
        
        return num.toString();
    }
    
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
}
