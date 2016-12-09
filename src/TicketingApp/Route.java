package TicketingApp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 08.12.2016.
 */
public class Route {

    int routeId;
    Bus bus;

    public Route(int routeId, Bus bus) {
        this.routeId = routeId;
        this.bus = bus;
    }

    public Route() {
    }


    //populates the list with routes for customers
    public List <Route> populateRoutes (){

        List <Route> routes = new ArrayList <Route> ();

        routes.add(new Route (1, new Bus("Tallinn","Tartu", 166)));
        routes.add(new Route (2, new Bus ("Tallinn", "Parnu", 114)));
        routes.add(new Route (3, new Bus("Riga", "Kaunas", 268)));
        routes.add(new Route (4, new Bus("Helsinki", "Turku", 169)));
        routes.add(new Route (5, new Bus("Stockholm", "Oslo", 530)));
        routes.add(new Route (6, new Bus("Gothenburg", "Stockholm", 469)));
        routes.add(new Route (7, new Bus("Riga", "Tallinn", 308)));
        routes.add(new Route (8, new Bus("Tallinn", "Moscow", 1038)));
        routes.add(new Route (9, new Bus("Minsk", "Tallinn", 790)));

        return routes;
    }

    public List <String> depArrRoute(){
        List <String> depArr = new ArrayList();
        String rout;

        //Goes through the elements in the list from the method (populateroutes())
        for (Route route : populateRoutes()){
            rout = fromTo(route);
            depArr.add(rout);
        }

        return depArr;
    }

    public String fromTo (Route route){
        return route.bus.departureCity + " to " + route.bus.arrivalCity;
    }

}
