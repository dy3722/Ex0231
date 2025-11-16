package com.example.ex0231.ex2;

public class Main {
    public static void main(String[] args)
    {
        Vehicles[] ves = new Vehicles[3];
        ves[0] = new Tractor(827572614,19,4,"wheel",5,1,"special");
        ves[1] = new Bicycle(316434539,6,2,"bayonet",0,false,true);
        ves[2] = new Cart(526526525,2,4,"non", 1,false,60);
        System.out.println(sumExhaust(ves));
    }
    public static double sumExhaust(Vehicles[] v)
    {
        double sum = 0;
        for (Vehicles vov : v)
        {
            sum += vov.exhaust();
        }
        return sum;
    }

    public static void theNoise(Vehicles[] v)
    {
        for (Vehicles vov : v)
        {
            if (vov instanceof Regular) {
                System.out.println(((Regular) vov).noise());
            }
            else
            {
                System.out.println("WTF noise!");
            }
        }
    }

    public static int sumPassengers(Vehicles[] v)
    {
        int sum = 0;
        for (Vehicles vov : v)
        {
            if (vov instanceof Regular)
            {
                sum += ((Regular) vov).getNumberOfPassengers() -1;
            }
            else if (vov instanceof Bicycle)
            {
                sum += 1;
            }
        }
        return sum;
    }

    public static int numOfLongTime(Vehicles[] v)
    {
        int max = 0;
        int number = 0;
        for (Vehicles vov : v)
        {
            if (vov instanceof Cart)
            {
                if (((Cart) vov).getChargingTime() > max)
                {
                    max = ((Cart) vov).getChargingTime();
                    number = vov.getNumber();
                }
            }
        }
        return number;
    }
}
