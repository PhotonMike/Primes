package Primes;

public class PrimeJava {
    public static boolean isPrime(Long a)
    {
        Long b= 2L;
        if (a == 1L)
        {
            return false;
        }
        if (a == 2L)
        {
            return true;
        }
        boolean i=true;
        while (i)
        {
            if (a % b == 0)
            {
                i = false;
            }
            else
            {
                if (b >= Math.sqrt(a))
                {
                    return true;
                }
                else
                {
                    b += 1;
                }
            }
        }
        return false;
    }
    public static int ciklus;
    public static String primelist(int veg)
    {
        Long prim = 1L;
        StringBuilder build = new StringBuilder();
        for (ciklus = 0; ciklus < veg;)
        {
            if (isPrime(prim))
            {
                build.append(prim+"\r\n");
                ciklus++;
            }
            prim++;
        }
        return build.toString();
    }
}
