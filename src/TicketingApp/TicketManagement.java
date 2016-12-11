package TicketingApp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10.12.2016.
 */
public class TicketManagement {

    List <Ticketing> IssuedTickets = new ArrayList <Ticketing> ();

    public void IssueTicket (Ticketing ticketing){
        ticketing.ticketId = ticketing.generateTicketId();


        IssuedTickets.add(ticketing);
    }

    public List <Ticketing> IssuedTickets (){
        return IssuedTickets;
    }

}

