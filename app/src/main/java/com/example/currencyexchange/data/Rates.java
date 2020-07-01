package com.example.currencyexchange.data;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

public class Rates{

    private String jsonElement;
    private String country;
    private String sign;

    public Rates(String jsonElement, String sign,String country) {
        this.jsonElement = jsonElement;
        this.sign = sign;
        this.country = country;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getJsonElement() {
        return jsonElement;
    }

    public void setJsonElement(String jsonElement) {
        this.jsonElement = jsonElement;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @SerializedName("USD")
    private String uSD;

    @SerializedName("HKD")
    private String hKD;

    @SerializedName("BRL")
    private String bRL;

    @SerializedName("RSD")
    private String rSD;

    @SerializedName("MYR")
    private String mYR;

    @SerializedName("GBP")
    private String gBP;

    @SerializedName("CAD")
    private String cAD;

    @SerializedName("SEK")
    private String sEK;

    @SerializedName("NOK")
    private String nOK;

    @SerializedName("ILS")
    private String iLS;

    @SerializedName("DKK")
    private String dKK;

    @SerializedName("AUD")
    private String aUD;

    @SerializedName("KWD")
    private String kWD;

    @SerializedName("RUB")
    private String rUB;

    @SerializedName("INR")
    private String iNR;

    @SerializedName("BND")
    private String bND;

    @SerializedName("EUR")
    private String eUR;

    @SerializedName("ZAR")
    private String zAR;

    @SerializedName("NPR")
    private String nPR;

    @SerializedName("CHF")
    private String cHF;

    @SerializedName("CNY")
    private String cNY;

    @SerializedName("THB")
    private String tHB;

    @SerializedName("PKR")
    private String pKR;

    @SerializedName("KES")
    private String kES;

    @SerializedName("EGP")
    private String eGP;

    @SerializedName("BDT")
    private String bDT;

    @SerializedName("SAR")
    private String sAR;

    @SerializedName("LAK")
    private String lAK;

    @SerializedName("IDR")
    private String iDR;

    @SerializedName("KHR")
    private String kHR;

    @SerializedName("SGD")
    private String sGD;

    @SerializedName("LKR")
    private String lKR;

    @SerializedName("NZD")
    private String nZD;

    @SerializedName("CZK")
    private String cZK;

    @SerializedName("JPY")
    private String jPY;

    @SerializedName("VND")
    private String vND;

    @SerializedName("PHP")
    private String pHP;

    @SerializedName("KRW")
    private String kRW;

    public String getuSD() {
        return uSD;
    }

    public void setuSD(String uSD) {
        this.uSD = uSD;
    }

    public String gethKD() {
        return hKD;
    }

    public void sethKD(String hKD) {
        this.hKD = hKD;
    }

    public String getbRL() {
        return bRL;
    }

    public void setbRL(String bRL) {
        this.bRL = bRL;
    }

    public String getrSD() {
        return rSD;
    }

    public void setrSD(String rSD) {
        this.rSD = rSD;
    }

    public String getmYR() {
        return mYR;
    }

    public void setmYR(String mYR) {
        this.mYR = mYR;
    }

    public String getgBP() {
        return gBP;
    }

    public void setgBP(String gBP) {
        this.gBP = gBP;
    }

    public String getcAD() {
        return cAD;
    }

    public void setcAD(String cAD) {
        this.cAD = cAD;
    }

    public String getsEK() {
        return sEK;
    }

    public void setsEK(String sEK) {
        this.sEK = sEK;
    }

    public String getnOK() {
        return nOK;
    }

    public void setnOK(String nOK) {
        this.nOK = nOK;
    }

    public String getiLS() {
        return iLS;
    }

    public void setiLS(String iLS) {
        this.iLS = iLS;
    }

    public String getdKK() {
        return dKK;
    }

    public void setdKK(String dKK) {
        this.dKK = dKK;
    }

    public String getaUD() {
        return aUD;
    }

    public void setaUD(String aUD) {
        this.aUD = aUD;
    }

    public String getkWD() {
        return kWD;
    }

    public void setkWD(String kWD) {
        this.kWD = kWD;
    }

    public String getrUB() {
        return rUB;
    }

    public void setrUB(String rUB) {
        this.rUB = rUB;
    }

    public String getiNR() {
        return iNR;
    }

    public void setiNR(String iNR) {
        this.iNR = iNR;
    }

    public String getbND() {
        return bND;
    }

    public void setbND(String bND) {
        this.bND = bND;
    }

    public String geteUR() {
        return eUR;
    }

    public void seteUR(String eUR) {
        this.eUR = eUR;
    }

    public String getzAR() {
        return zAR;
    }

    public void setzAR(String zAR) {
        this.zAR = zAR;
    }

    public String getnPR() {
        return nPR;
    }

    public void setnPR(String nPR) {
        this.nPR = nPR;
    }

    public String getcHF() {
        return cHF;
    }

    public void setcHF(String cHF) {
        this.cHF = cHF;
    }

    public String getcNY() {
        return cNY;
    }

    public void setcNY(String cNY) {
        this.cNY = cNY;
    }

    public String gettHB() {
        return tHB;
    }

    public void settHB(String tHB) {
        this.tHB = tHB;
    }

    public String getpKR() {
        return pKR;
    }

    public void setpKR(String pKR) {
        this.pKR = pKR;
    }

    public String getkES() {
        return kES;
    }

    public void setkES(String kES) {
        this.kES = kES;
    }

    public String geteGP() {
        return eGP;
    }

    public void seteGP(String eGP) {
        this.eGP = eGP;
    }

    public String getbDT() {
        return bDT;
    }

    public void setbDT(String bDT) {
        this.bDT = bDT;
    }

    public String getsAR() {
        return sAR;
    }

    public void setsAR(String sAR) {
        this.sAR = sAR;
    }

    public String getlAK() {
        return lAK;
    }

    public void setlAK(String lAK) {
        this.lAK = lAK;
    }

    public String getiDR() {
        return iDR;
    }

    public void setiDR(String iDR) {
        this.iDR = iDR;
    }

    public String getkHR() {
        return kHR;
    }

    public void setkHR(String kHR) {
        this.kHR = kHR;
    }

    public String getsGD() {
        return sGD;
    }

    public void setsGD(String sGD) {
        this.sGD = sGD;
    }

    public String getlKR() {
        return lKR;
    }

    public void setlKR(String lKR) {
        this.lKR = lKR;
    }

    public String getnZD() {
        return nZD;
    }

    public void setnZD(String nZD) {
        this.nZD = nZD;
    }

    public String getcZK() {
        return cZK;
    }

    public void setcZK(String cZK) {
        this.cZK = cZK;
    }

    public String getjPY() {
        return jPY;
    }

    public void setjPY(String jPY) {
        this.jPY = jPY;
    }

    public String getvND() {
        return vND;
    }

    public void setvND(String vND) {
        this.vND = vND;
    }

    public String getpHP() {
        return pHP;
    }

    public void setpHP(String pHP) {
        this.pHP = pHP;
    }

    public String getkRW() {
        return kRW;
    }

    public void setkRW(String kRW) {
        this.kRW = kRW;
    }




}
