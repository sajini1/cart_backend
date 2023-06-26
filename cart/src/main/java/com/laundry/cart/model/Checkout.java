package com.laundry.cart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Checkout {
    @Id
    @GeneratedValue
    private Long id;
    private int tshirt;
    private int shirt;
    private int trouser;
    private int short_;
    private int denim;
    private int blazer;
    private int sweeter;
    private int cap;
    private int ladiesJacket;
    private int blouse;
    private int ladiesDenim;
    private int lehega;
    private int flock;
    private int skirt;
    private int ladiest;
    private int saree;
    private int kidsfrock;
    private int kidst;
    private int kidsdenim;
    private int kidsShort;
    private int bedsheet;
    private int pillowcase;
    private int curtain;
    private int towel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTshirt() {
        return tshirt;
    }

    public void setTshirt(int tshirt) {
        this.tshirt = tshirt;
    }

    public int getShirt() {
        return shirt;
    }

    public void setShirt(int shirt) {
        this.shirt = shirt;
    }

    public int getTrouser() {
        return trouser;
    }

    public void setTrouser(int trouser) {
        this.trouser = trouser;
    }

    public int getShort_() {
        return short_;
    }

    public void setShort_(int short_) {
        this.short_ = short_;
    }

    public int getDenim() {
        return denim;
    }

    public void setDenim(int denim) {
        this.denim = denim;
    }

    public int getBlazer() {
        return blazer;
    }

    public void setBlazer(int blazer) {
        this.blazer = blazer;
    }

    public int getSweeter() {
        return sweeter;
    }

    public void setSweeter(int sweeter) {
        this.sweeter = sweeter;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getLadiesJacket() {
        return ladiesJacket;
    }

    public void setLadiesJacket(int ladiesJacket) {
        this.ladiesJacket = ladiesJacket;
    }

    public int getBlouse() {
        return blouse;
    }

    public void setBlouse(int blouse) {
        this.blouse = blouse;
    }

    public int getLadiesDenim() {
        return ladiesDenim;
    }

    public void setLadiesDenim(int ladiesDenim) {
        this.ladiesDenim = ladiesDenim;
    }

    public int getLehega() {
        return lehega;
    }

    public void setLehega(int lehega) {
        this.lehega = lehega;
    }

    public int getFlock() {
        return flock;
    }

    public void setFlock(int flock) {
        this.flock = flock;
    }

    public int getSkirt() {
        return skirt;
    }

    public void setSkirt(int skirt) {
        this.skirt = skirt;
    }

    public int getLadiest() {
        return ladiest;
    }

    public void setLadiest(int ladiest) {
        this.ladiest = ladiest;
    }

    public int getSaree() {
        return saree;
    }

    public void setSaree(int saree) {
        this.saree = saree;
    }

    public int getKidsfrock() {
        return kidsfrock;
    }

    public void setKidsfrock(int kidsfrock) {
        this.kidsfrock = kidsfrock;
    }

    public int getKidst() {
        return kidst;
    }

    public void setKidst(int kidst) {
        this.kidst = kidst;
    }

    public int getKidsdenim() {
        return kidsdenim;
    }

    public void setKidsdenim(int kidsdenim) {
        this.kidsdenim = kidsdenim;
    }

    public int getKidsShort() {
        return kidsShort;
    }

    public void setKidsShort(int kidsShort) {
        this.kidsShort = kidsShort;
    }

    public int getBedsheet() {
        return bedsheet;
    }

    public void setBedsheet(int bedsheet) {
        this.bedsheet = bedsheet;
    }

    public int getPillowcase() {
        return pillowcase;
    }

    public void setPillowcase(int pillowcase) {
        this.pillowcase = pillowcase;
    }

    public int getCurtain() {
        return curtain;
    }

    public void setCurtain(int curtain) {
        this.curtain = curtain;
    }

    public int getTowel() {
        return towel;
    }

    public void setTowel(int towel) {
        this.towel = towel;
    }
}
