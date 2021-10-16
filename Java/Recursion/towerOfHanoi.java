public class solution 
{
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination)
    {
        if (disks==0)
        {
            return;
        }

        else
        {
            towerOfHanoi(disks-1,source,destination,auxiliary);

            System.out.println(source + " "+ destination);

            towerOfHanoi(disks-1,auxiliary,source,destination);
        }
    }

}
