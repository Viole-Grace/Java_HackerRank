
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
class Singleton //working code taken from Jason_Nao_NYU. Analyse, later confirm with a pattern-lock
{
    private volatile static Singleton instance;//only works when instantiated - perfect for a singleton
    public static String str;
    private Singleton() {}//default constructor    
    static Singleton getSingleInstance() 
    {
        if (instance == null) 
        {
            synchronized (Singleton.class) 
            {
                if (instance == null) 
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
