class ParkingLot
{
    private int twoWheelers,fourWheelers;
    private final int twoCap,fourCap;
    private static long revenue=0;

    ParkingLot(int twoCap,int fourCap)
    {
        this.twoCap=twoCap;
        this.fourCap=fourCap;
        twoWheelers=0;
        fourWheelers=0;
    }

    void park(String type)
    {
        if(type.equalsIgnoreCase("two"))
        {
            if(twoWheelers<twoCap)
            {
                twoWheelers++;
                revenue+=20;
                System.out.println("Two Wheeler parked");
            }
            else
                System.out.println("Two Wheeler section full");
        }
        else if(type.equalsIgnoreCase("four"))
        {
            if(fourWheelers<fourCap)
            {
                fourWheelers++;
                revenue+=20;
                System.out.println("Four Wheeler parked");
            }
            else
                System.out.println("Four Wheeler section full");
        }
        else
            System.out.println("Invalid vehicle type");
    }

    void leave(String type)
    {
        if(type.equalsIgnoreCase("two"))
        {
            if(twoWheelers>0)
                twoWheelers--;
        }
        else if(type.equalsIgnoreCase("four"))
        {
            if(fourWheelers>0)
                fourWheelers--;
        }
    }

    int getTwoWheelers()
    {
        return twoWheelers;
    }

    int getFourWheelers()
    {
        return fourWheelers;
    }

    static long getRevenue()
    {
        return revenue;
    }

    public static void main(String arg[])
    {
        ParkingLot obj=new ParkingLot(4,4);
        obj.park("two");
        obj.park("two");
        obj.park("two");
        obj.park("two");
        obj.park("four");
        obj.park("four");
        obj.park("four");
        obj.park("four");
        obj.park("four");
        obj.leave("four");
        System.out.println("\nFinal Occupancy:");
        System.out.println("Two-wheelers = " + obj.getTwoWheelers());
        System.out.println("Four-wheelers = " + obj.getFourWheelers());
        System.out.println("Revenue = " + ParkingLot.getRevenue());
    }

}
