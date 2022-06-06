package com.company;

public class PC
{
    private Case theCase;
    private Monitor monitor;
    private Notherboard notherboard;

    public PC(Case theCase, Monitor monitor, Notherboard notherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.notherboard = notherboard;
    }

    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo()
    {
        monitor.drawPixelAt(12500 , 50 , "Yellow");
    }
}
