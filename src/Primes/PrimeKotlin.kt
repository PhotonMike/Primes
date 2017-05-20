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
            var build = StringBuilder()
            ciklus=0
            while(ciklus<veg)
            {
                if (isPrime(prim))
                {
                    build.append(prim.toString()+"\r\n")
                    ciklus++
                }
                prim++
            }
            return build.toString()
        }
    }
}