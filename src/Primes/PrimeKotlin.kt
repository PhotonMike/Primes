package Primes

import java.lang.StringBuilder

class PrimeKotlin {
    companion object
    {
        fun isPrime(a: Long): Boolean
        {
            var b: Long =2L
            if (a==1L)
            {
                return false
            }
            else if (a==2L)
            {
                return true
            }
            var i=true
            while(i)
            {
                if(a%b==0L)
                {
                    i=false
                }
                else
                {
                    if (b >= Math.sqrt(a.toDouble()))
                    {
                        return true
                    }
                    else
                    {
                        b+=1
                    }
                }
            }
            return false
        }
        var ciklus=0
        fun primelist(veg: Int):String
        {
            var prim = 1L
            var eredmeny = arrayOfNulls<Long>(veg)
            ciklus=0
            while(ciklus<veg)
            {
                if (isPrime(prim))
                {
                    eredmeny[ciklus]=prim
                    ciklus++
                }
                prim++
            }
            var build = StringBuilder()
            for (i in eredmeny.indices)
            {
                build.append(eredmeny[i].toString()+"\r\n")
            }
            return build.toString()
        }
    }
}