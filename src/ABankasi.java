public class ABankasi implements IBanka {
    private String bankaAdi ;
    private String terminalId ;
    private String password ;

    public ABankasi(String bankaAdi, String terminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

@Override
    public boolean connect (String ipAdress){
        System.out.println("Kullanıcı ip :" + ipAdress);
        System.out.println("Makina ip :" + this.hostIpAdress);
        System.out.println("Bankadan Cevap Bekleniyor");
        System.out.println(this.getBankaAdi() + " Bağlanıldı!");
        return true;
    }

@Override
    public boolean payment (double price ,String cardNumber , String expiryDate, String cvc){
        System.out.println("Bankadan Cevap Bekleniyor");
        System.out.println("İşlem Basarılı!");
        return true;
    }
}
