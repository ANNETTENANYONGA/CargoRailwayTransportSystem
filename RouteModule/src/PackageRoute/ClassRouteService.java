package PackageRoute;

public class ClassRouteService {
    private String RouteCode = "RT-99";

    public void DisplayClassRouteService(){
        System.out.println("ClassRouteService from PackageRoute");
    }

    public String getRouteInfo(String from, String to){
        double distance = calculatedDistance(from, to);
        return  "Route: " + from + " to " + to + " - Distance: " + distance + "km, Status: Active";
    }
    private double calculatedDistance(String from, String to){
        System.out.println("Internal: Calculating using code " + RouteCode);
        return 80;
    }

}
