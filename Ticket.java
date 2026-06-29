

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private int ticketNo;
    private int customerId;
    private Bus bus;
    private int numberOfTickets;
    private double amount;
    private List<Integer> registeredSeats;


    public Ticket(int ticketNd, int customerId, Bus bus, int numberOfTickets, double amount, List<Integer> registeredSeats) {
        this.ticketNo = ticketNo;
        this.customerId = customerId;
        this.bus = bus;
        this.numberOfTickets = numberOfTickets;
        this.amount = amount;
        this.registeredSeats = new ArrayList<>();
    }

    public void addBookedSeat(int seatNumber)
    {
        registeredSeats.add(seatNumber);
    }

    public int getTicketId()
    {
        return ticketNo;
    }
    public List<Integer> getRegisteredSeats()
    {
        return registeredSeats;
    }
    public Bus getBus()
    {
        return bus;
    }
    public int getNumberOfTickets()
    {
        return numberOfTickets;
    }
    public double getAmount()
    {
        return amount;
    }
    public int getCustomerId()
    {
        return customerId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketNo +
                ", customerId=" + customerId +
                ", bus=" + bus +
                ", numberOfTickets=" + numberOfTickets +
                ", fare=" + amount +
                ", bookedSeats=" + registeredSeats +
                '}';
    }
}
