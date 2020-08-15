package ru.netology.domain;

public class Conditioner {

    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setIncreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        while (currentTemperature < maxTemperature) {
            System.out.println(+currentTemperature++);

        }
        this.currentTemperature = currentTemperature;
    }
    public void setDecreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        while (currentTemperature > minTemperature) {
            System.out.println(+currentTemperature--);

        }
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        on = true;
        this.on = true;

    }

//
//    public void setCurrentTemperature(int CurrentTemperature) {
//        if (currentTemperature < maxTemperature) {
//            return;
//        }
//        if (currentTemperature > minTemperature) {
//            return;
//        }
//        while (currentTemperature <= maxTemperature) {
//            System.out.println(+currentTemperature--);
//        }
//    }


//        for(int i = 0; i >= maxTemperature; i++) {
//            return;
//            for (int i = 0, i < minTemperature; i--){
//                return;
//            }
//            System.out.println(i);
//    }

}


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getMaxTemperature() {
//        return maxTemperature;
//    }
//
//    public void setMaxTemperature(int maxTemperature) {
//        this.maxTemperature = maxTemperature;
//    }
//
//    public int getMinTemperature() {
//        return minTemperature;
//    }
//
//    public void setMinTemperature(int minTemperature) {
//        this.minTemperature = minTemperature;
//    }
//
//    public int getCurrentTemperature() {
//        return currentTemperature;
//    }
//
//    public boolean isOn() {
//        return on;
//    }
//
//    public void setOn(boolean on) {
//        this.on = on;
//    }
//
//    public void increaseCurrentTemperature(int currentTemperature) {
//
//        if (currentTemperature > maxTemperature) {
//            return;
//        }
//        if (currentTemperature < minTemperature) {
//            return;
//        }
//        // здесь уверены, что все проверки прошли
//        this.currentTemperature = currentTemperature;
//        for (currentTemperature < maxTemperature; currentTemperature++) ;
//        System.out.println(currentTemperature);
//    }
//
//    public void decreaseCurrentTemperature(int currentTemperature) {
//        if (currentTemperature > maxTemperature) {
//            return;
//        }
//        if (currentTemperature < minTemperature) {
//            return;
//        }
//        // здесь уверены, что все проверки прошли
//        this.currentTemperature = currentTemperature;
//        for (currentTemperature > minTemperature; currentTemperature--)
//            System.out.println(currentTemperature);
//    }
//
//}
//

