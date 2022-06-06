package com.company;

public class Printer
{
    private int toonerLevel , pagePrinted;
    private boolean duplex;

    public Printer(int toonerLevel, boolean duplex)
    {
        if (toonerLevel > -1 && toonerLevel <= 100)         this.toonerLevel = toonerLevel;

        else  this.toonerLevel = -1;
        this.duplex = duplex;
        this.pagePrinted = 0;

    }
    public int addToner(int toonerAmount)
    {
        if (toonerAmount > 0 && toonerAmount <= 100)
        {
            if (this.toonerLevel + toonerAmount > 100) return -1;
            this.toonerLevel+= toonerAmount;
            return toonerLevel;
        }
        else return -1;
    }
    public int printPages(int pages)
    {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagePrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
