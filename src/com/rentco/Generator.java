package com.rentco;
/**
 * Created by alvin2 on 4/25/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Generator
{
    int gas = 0;

    public Generator()
    {
        refill();
    }

    public void generate(int distance)
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


    public int getGas()
    {
        return gas;
    }
}
