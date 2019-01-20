package ru.itpark;

public class TV {
private int totalSum;

public int getChannelList() {
        return totalSum;
        }

public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
        }
//public int playChannel(Channel Channel, int button, int sum) {
        if (Channel.equals(pin)) {
        if (totalSum > sum) {
        totalSum -= sum;
        return sum;
        } else {
        System.err.println("Денег нет, но вы держитесь");
        return -1;
        }
        } else {
        System.err.println("Пин код неверен");
        return -1;
        }
        }
        }

