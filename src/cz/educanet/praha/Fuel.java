package cz.educanet.praha;

public class Fuel implements ILanderControls {
    @Override

    public int getSecondsOfFuelBurn(int altitude, int velocity) {

        return altitude / velocity;
    }
}
