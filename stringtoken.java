    static boolean isAnagram(String a, String b) 
    {
        // Complete the function
        Boolean reval=false;
        if(a!=null&&b!=null)
        {
            
            char array_of_A [] = a.toLowerCase().toCharArray();
            char array_of_B [] = b.toLowerCase().toCharArray();
            Arrays.sort(array_of_A);
            Arrays.sort(array_of_B);
            reval=Arrays.equals(array_of_A, array_of_B);
        }
        return reval;
    }
