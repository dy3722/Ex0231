package com.example.ex0231.ex2;

public class Kibbutz {
    private int mone;
    private Vehicles[] vehic;

    public Kibbutz() {
        vehic = new Vehicles[500];
        mone = 0;
    }

    public void addCar(Vehicles someCar)
    {
        vehic[mone] = someCar;
        mone++;
    }

    private Vehicles[] above15AndIsWheel()
    {
        if (mone == 0) return new Vehicles[0];
        int x = 0;
        for (int i = 0 ; i < mone; i++)
        {
            if (vehic[i].getAge() > 15 && vehic[i].getSteeringType().equals("wheel"))
            {
                x++;
            }
        }
        Vehicles[] vova = new Vehicles[x];

        x = 0;
        for (int i = 0 ; i < mone; i++)
        {
            if (vehic[i].getAge() > 15 && vehic[i].getSteeringType().equals("wheel"))
            {
                vova[x] = vehic[i];
                x++;
            }
        }
        return vova;
    }

    private int isLightAndIsWheel()
    {
        if (mone == 0) return 0;
        int num = 0;
        for (int i = 0 ; i < mone; i++)
        {
            if ((vehic[i] instanceof Light || vehic[i] instanceof Regular) && vehic[i].getSteeringType().equals("wheel"))
            {
                num++;
            }
        }
        return num;
    }
}
