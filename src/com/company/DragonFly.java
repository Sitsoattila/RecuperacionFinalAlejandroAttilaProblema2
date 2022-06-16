package com.company;

public class DragonFly implements Drone{

    private int maxEnergy;
    private float energy;
    private int movementCount = 0;
    private int energyDelta;
    private String matricula;

    public DragonFly(int maxEnergy, int energyDelta, String matricula) {
        this.maxEnergy = maxEnergy;
        this.energyDelta = energyDelta;
        this.matricula = matricula;
        energy = maxEnergy;
    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        energy = maxEnergy;
        System.out.println("Energía al maximo");
    }

    @Override
    public void move() {

        if ((energy - energyDelta) > 0) {
            movementCount++;
            energy  -= energyDelta;
            System.out.println("Dron moviendose");
        } else {
            System.out.println("No tiene la batería suficiente");
        }
    }

    @Override
    public String status() {
        String out = "El vehículo " + matricula + " tiene un nivel de carga" +
                "de : " + energyLevel() + " y se ha movido " + movementCount + " veces";

        return out;
    }

    @Override
    public void returnHome() {
        if(energyLevel() > (energyDelta * movementCount)) {
            System.out.println("Volviendo a casa");
        } else {
            System.out.println("Cataploff, ya no tienes dron");
        }
    }
}

