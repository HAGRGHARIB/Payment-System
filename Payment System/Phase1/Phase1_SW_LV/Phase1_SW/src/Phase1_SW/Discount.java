package Phase1_SW;

public class Discount {
   public String service_name;
    double percentage;
    boolean isOverall;
 public  Discount( String service_name, double percentage, boolean isOverall) {
	 this.service_name=service_name;
	 this.percentage=percentage;
	 this.isOverall=isOverall;
	 
 }
    public void setServiceName(String serviceName) { //admin
        this.service_name = serviceName  ;
    }

    public void setPercentage (double perc) { //admin
        this.percentage = perc ;
    }

    public void setIsOverall (boolean isOverall) { //admin
        this.isOverall = isOverall ;
    }

    public String getServiceName () {
        return service_name;
    }

    public double getPercentage() {
        return percentage;
    }

    public boolean getIsOverall () {
        return isOverall;
    }
}