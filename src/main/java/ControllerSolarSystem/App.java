package ControllerSolarSystem;

import EnumSolarSystem.PlanetsTypes;
import ModelSolarSystem.PlanetsModels;
import ViewSolarSystem.viewSolarSystem;

public class App {
    public static void main(String[] args) {
        PlanetsModels jupiter = new PlanetsModels(
            "Jupiter", 79, 1.898e27, 1.43128e15, 139820, 778,
                PlanetsTypes.GASEOUS, true, 11.86, 0.41);

        PlanetsModels mars = new PlanetsModels(
                "Mars", 2, 6.417e23, 1.6318e11, 6779, 228,
                PlanetsTypes.TERRESTRIAL, true,1.88,1.03);

        viewSolarSystem.showMessage("\nPlanet Details:");
        viewSolarSystem.showMessage("Name: " + jupiter.getName());
        viewSolarSystem.showMessage("Number of Satellites: " + jupiter.getNumberOfSatellites());
        viewSolarSystem.showMessage("Mass (kg): " + jupiter.getMass());
        viewSolarSystem.showMessage("Volume (km³): " + jupiter.getVolume());
        viewSolarSystem.showMessage("Diameter (km): " + jupiter.getDiameter());
        viewSolarSystem.showMessage("Average Distance from Sun (million km): " + jupiter.getAverageDistanceFromSun());
        viewSolarSystem.showMessage("Planet Type: " + jupiter.getType());
        viewSolarSystem.showMessage(String.format("Density: %.2f kg/km³", jupiter.calculateDensity()));
        viewSolarSystem.showMessage("Is it an outer planet? " + (jupiter.isOuterPlanet() ? "Yes" : "No"));

        viewSolarSystem.showMessage("\nPlanet Details:");
        viewSolarSystem.showMessage("Name: " + mars.getName());
        viewSolarSystem.showMessage("Number of Satellites: " + mars.getNumberOfSatellites());
        viewSolarSystem.showMessage("Mass (kg): " + mars.getMass());
        viewSolarSystem.showMessage("Volume (km³): " + mars.getVolume());
        viewSolarSystem.showMessage("Diameter (km): " + mars.getDiameter());
        viewSolarSystem.showMessage("Average Distance from Sun (million km): " + mars.getAverageDistanceFromSun());
        viewSolarSystem.showMessage("Planet Type: " + mars.getType());
        viewSolarSystem.showMessage(String.format("Density: %.2f kg/km³", mars.calculateDensity()));
        viewSolarSystem.showMessage("Is it an outer planet? " + (mars.isOuterPlanet() ? "Yes" : "No"));
    }
}