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
        private String name;
        private int workingHours;
        private double cost;

        public Attraction(String name, int workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public int getWorkingHours() {
            return workingHours;
        }

        public double getCost() {
            return cost;
        }
    }
}