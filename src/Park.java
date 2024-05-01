public class Park {
    private String name;
    private String city;
    private String district;

    public Park(String name, String city, String district) {
        this.name = name;
        this.city = city;
        this.district = district;
    }

    public class Attraction {
        private String attractionName;
        private int workingHours;
        private double cost;

        public Attraction(String attractionName, int workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public int getWorkingHours() {
            return workingHours;
        }

        public double getCost() {
            return cost;
        }
    }
}