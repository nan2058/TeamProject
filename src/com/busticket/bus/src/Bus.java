package com.busticketbooking;

import java.util.Arrays;

public class Bus {

    private int id;
    private String coachType;      // AC / Non-AC
    private String berthType;      // Seater / Sleeper
    private int seatCapacity;
    private boolean[] seatStatus;  // true = booked, false = available

    public Bus(int id, String coachType, String berthType, int seatCapacity) {
        this.id = id;
        this.coachType = coachType;
        this.berthType = berthType;
        this.seatCapacity = seatCapacity;
        this.seatStatus = new boolean[seatCapacity];
    }

    // Returns number of available seats
    public int getAvailableSeats() {
        int available = 0;
        for (boolean seat : seatStatus) {
            if (!seat) {
                available++;
            }
        }
        return available;
    }

    // Displays available seat numbers
    public void displayAvailableSeats() {
        System.out.println("Available seats in Bus " + id + ":");

        for (int i = 0; i < seatCapacity; i++) {
            if (!seatStatus[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }

    // Books a seat
    public boolean bookSeat(int seatIndex) {
        if (seatIndex < 0 || seatIndex >= seatCapacity) {
            return false;
        }

        if (!seatStatus[seatIndex]) {
            seatStatus[seatIndex] = true;
            return true;
        }

        return false;
    }

    // Cancels a booked seat
    public boolean cancelSeat(int seatIndex) {
        if (seatIndex < 0 || seatIndex >= seatCapacity) {
            return false;
        }

        if (seatStatus[seatIndex]) {
            seatStatus[seatIndex] = false;
            return true;
        }

        return false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCoachType() {
        return coachType;
    }

    public String getBerthType() {
        return berthType;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public boolean[] getSeatStatus() {
        return seatStatus;
    }

    @Override
    public String toString() {
        return "Bus [id=" + id +
                ", coachType=" + coachType +
                ", berthType=" + berthType +
                ", seatCapacity=" + seatCapacity +
                ", seatStatus=" + Arrays.toString(seatStatus) +
                "]";
    }
}
