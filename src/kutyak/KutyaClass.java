package kutyak;

public class KutyaClass {
    private String kutya_fajta;
    private String kutya_neme;
    private String kutya_kora;
    private String kutya_neve;

    public KutyaClass(String sor) {
        String[] d = sor.split(";");
        this.kutya_fajta = d[0];
        this.kutya_neme = d[1];
        this.kutya_kora = d[2];
        this.kutya_neve = d[3];
    }

    public String getKutya_fajta() {
        return kutya_fajta;
    }

    public String getKutya_neme() {
        return kutya_neme;
    }

    public String getKutya_kora() {
        return kutya_kora;
    }

    public String getKutya_neve() {
        return kutya_neve;
    }

 
}
