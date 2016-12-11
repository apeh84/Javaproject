package TicketingApp;

import java.util.List;

/**
 * Created by user on 10.12.2016.
 */
public class Ticketing {
    int ticketId;
    Person person;
    int route;
    boolean oneWay;
    double price;

    public Ticketing(Person person, int route, boolean oneWay, double price) {
        this.person = person;
        this.route = route;
        this.oneWay = oneWay;
        this.price = price;
    }


    TicketManagement tm = new TicketManagement();
    List<Ticketing> isTicket = tm.IssuedTickets();

    public int generateTicketId() {
        // To generate a random number from 1000 to 6000
        int id = 1000 + (int) (Math.random() * 5000);

        for (Ticketing t : isTicket) {
            if (t.ticketId == id) {
                generateTicketId();
            }
        }

        return id;
    }


}



