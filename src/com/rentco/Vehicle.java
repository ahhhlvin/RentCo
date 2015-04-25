package com.rentco;
/**
 * Created by alvin2 on 4/25/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Vehicle
{
    int gas = 0;

    public Vehicle()
    {
        refill();
    }

    public void drive(int distance)
    {
        gas = gas - distance;
        if(gas < 0)
            gas = 0;
    }

    public boolean isEmpty()
    {
        return gas == 0;
    }

    public void refill()
    {
        gas = gas + 10;
    }

    public void playMusic()
    {
        //Pretend we coded this
    }

    public void turn(int amount)
    {
        //Really complex turn code that we don't care about
    }

    public int getGas()
    {
        return gas;
    }
}
