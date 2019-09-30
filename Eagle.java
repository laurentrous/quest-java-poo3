public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    /**
     * takeof -> isFlying = false and altitude == 0
     */
    @Override
    public void takeOff() {
        if(!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky%n", this.getName());
        }
    }

    /**
     * flie upward
     * @param meters altitude increase
     * @return altitude in meters
     */
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s flies upward, alititude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    /**
     * flie downward
     * @param meters altitude decrease
     * @return altitude in meters
     */
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 325);
            System.out.printf("%s flies downward, alititude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    /**
     * land -> isFlying = true and altitude > 0
     */
    @Override
    public void land() {
        if(this.flying && this.altitude > 0) {
            if(this.altitude == 1) {
                System.out.printf("%s lands on the ground%n", this.getName());
                this.flying = false;
            } else {
                System.out.printf("%s is too hight, it can't land%n", this.getName());
            }
            
        }
    }

}
