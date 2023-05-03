package com.bondarenko.hw11;

public class Task2 {

    public static void main(String[] args) {

        PassengerCar passengerCar = new PassengerCar(1, 1, "Красный", 1000, 20, 1);
        passengerCar.sitPassegers(3);
        passengerCar.movementMet();
        passengerCar.showStatisticsMet();
        passengerCar.recoveryFuel();

        System.out.println();

        Truck truck = new Truck(2, 3, "Зеленый", 2000, 500, 2);
        truck.loading(5);
        truck.unloading();
        truck.movementMet();
        truck.recoveryFuel();

    }

}

class Car implements Recovery {

    //Показатели
    private final int series;
    private final int year;
    private final String color;
    private final int tankSize; //Размер бака.
    private final int currentFuel; //Текущий показатель топлива.
    private final int fuelConsumption; //Потребление топлива.

    public Car(int series, int year, String color, int tankSize, int currentFuel, int fuelConsumption) {

        this.series = series;
        this.year = year;
        this.color = color;
        this.tankSize = tankSize;
        this.currentFuel = currentFuel;
        this.fuelConsumption = fuelConsumption;

    }

    //Движение пока есть топливо.
    public void movementMet() {

        int oilOne = tankSize;

        //Если - текущий бензин указан больше бака.
        if (tankSize < currentFuel) {

            for (int i = tankSize; i >= 0; i++) {
                oilOne -= fuelConsumption;
                if (oilOne <= 0) {
                    break;
                }
            }
            System.out.println("Бензин закончился, движение снова остановлинно. ");
            return;
        }

        //Текущий бензин указан верно.
        int oil = currentFuel;

        for (int i = currentFuel; i >= 0; i++) {
            oil -= fuelConsumption;
            if (oil <= 0) {
                break;
            }
        }
        System.out.println("Бензин закончился, движение остановлинно. ");
    }

    //Интерфейс - возобновить бензин.
    public void recoveryFuel() {

        System.out.println("Машина заправленна ");

        int oilOne = tankSize;

        for (int i = tankSize; i >= 0; i++) {
            oilOne -= fuelConsumption;
            if (oilOne <= 0) {
                break;
            }
        }
        System.out.println("Бензин закончился, движение остановлинно. ");
    }

    //Показывает статистику.
    public void showStatisticsMet() {

        System.out.println("Серия - " + series
                + " Год выпуска - " + year
                + " Цвет - " + color
                + " Размер бака - " + tankSize
                + " Количество топлива в баке " + currentFuel
                + " Расход топлива - " + fuelConsumption);

    }

}

class PassengerCar extends Car {

    int passenger;

    public PassengerCar(int series, int year, String color, int tankSize, int currentFuel, int fuelConsumption) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
    }

    public void sitPassegers(int passenger) { //Метод - посадка пассажиров

        this.passenger = passenger;

        if (passenger > 3) {
            System.out.println("Нельзя садить больше 3 (трех) пассажиров ");
            return;
        }
        System.out.println("Пассажири уселись ");

    }

}

class Truck extends Car {

    public Truck(int series, int year, String color, int tankSize, int currentFuel, int fuelConsumption) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
    }

    private int cargo;

    public void loading(int cargo) {

        this.cargo = cargo;

        if (cargo > 0) {
            System.out.println("Груз загружен ");
        }

    }

    public void unloading() {
        System.out.println("Груз выгружен ");
    }

}

//Интерфейс. Возобновить бензин.
interface Recovery {

    void recoveryFuel();

}
