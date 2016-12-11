package TicketingApp;

/**
 * Created by user on 08.12.2016.
 */
public interface Pricing {
    public double routePrice(Route route);

    public double returnPrice(double price);

    public double studentDiscount(double price);
}
