package com.example.silerehberim;

import java.io.Serializable;

public class Yerler implements Serializable {
    private String yer_id;
    private String yer_ad;
    private String yer_resim;
    private String yer_icerik;

    public Yerler() {
    }



    public Yerler(String yer_id, String yer_ad, String yer_resim, String yer_icerik) {
        this.yer_id = yer_id;
        this.yer_ad = yer_ad;
        this.yer_resim = yer_resim;
        this.yer_icerik = yer_icerik;
    }

    public String getYer_id() {
        return yer_id;
    }

    public void setYer_id(String yer_id) {
        this.yer_id = yer_id;
    }

    public String getYer_ad() {
        return yer_ad;
    }

    public void setYer_ad(String yer_ad) {
        this.yer_ad = yer_ad;
    }

    public String getYer_resim() {
        return yer_resim;
    }

    public void setYer_resim(String yer_resim) {
        this.yer_resim = yer_resim;
    }
    public String getYer_icerik() {
        return yer_icerik;
    }

    public void setYer_icerik(String yer_icerik) {
        this.yer_icerik = yer_icerik;
    }
}
