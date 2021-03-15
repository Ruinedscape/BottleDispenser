package com.example.viikko7;

import android.widget.TextView;
import java.util.ArrayList;

public class BottleDispenser {
    private int money;
    private ArrayList<PepsiMax> pepsit = new ArrayList();
    private ArrayList<CocaCola> colat = new ArrayList();

    public BottleDispenser() {
        money = 0;
            for(int i = 0; i<5; i++) {
                PepsiMax pepsi = PepsiMax.getInstance();
                pepsit.add(pepsi);
            }
            for(int i = 0; i<5; i++) {
                CocaCola cola = CocaCola.getInstance();
                colat.add(cola);
            }
        }
    public String getMoney() {
        return Integer.toString(money);
    }
    public void addMoney(int x, TextView textBox) {
        money += x;
        textBox.setText("Klink! Added more money!");
    }
    public void returnMoney(TextView textBox) {
        money = 0;
        textBox.setText("Klink klink. Money came out!");
    }
    public void buyBottle(int y, TextView textBox) {
        if (y == 0) {
            if (pepsit.size() == 0) {
                textBox.setText("Beep Boop! Out of bottles!");
            } else if (money < pepsit.get(0).getPrice()) {
                textBox.setText("Add money first!");
            } else {
                money -= (pepsit.get(0).getPrice());
                textBox.setText("KACHUNK! " + pepsit.get(0).getName() + " came out of the dispenser!");
                pepsit.remove(0);
            }
        } else if (y == 1) {
            if (pepsit.size() == 0) {
                textBox.setText("Beep Boop! Out of bottles!");
            } else if (money < (pepsit.get(0).getPrice())*2) {
                textBox.setText("Add money first!");
            } else {
                money -= ((pepsit.get(0).getPrice()) * 2);
                textBox.setText("KACHUNK! " + pepsit.get(0).getName() + " came out of the dispenser!");
                pepsit.remove(0);
            }
        } else if (y == 2) {
            if (colat.size() == 0) {
                textBox.setText("Beep Boop! Out of bottles!");
            } else if (money < colat.get(0).getPrice()) {
                textBox.setText("Add money first!");
            } else {
                money -= (colat.get(0).getPrice());
                textBox.setText("KACHUNK! " + colat.get(0).getName() + " came out of the dispenser!");
                pepsit.remove(0);
            }
        } else if (y == 3) {
            if (colat.size() == 0) {
                textBox.setText("Beep Boop! Out of bottles!");
            } else if (money < (colat.get(0).getPrice())*2) {
                textBox.setText("Add money first!");
            } else {
                money -= ((colat.get(0).getPrice()) * 2);
                textBox.setText("KACHUNK! " + colat.get(0).getName() + " came out of the dispenser!");
                pepsit.remove(0);
            }
        }
    }
}

