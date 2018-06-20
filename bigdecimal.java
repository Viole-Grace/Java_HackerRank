        // use a comparator function - for leading vs trailing 0s
        String newArr[] = new String[n]; //to solve the n+2 problem
        for(int i=0;i<newArr.length;i++)
        {
            newArr[i]=s[i]; //store into newArr,save original as a sort of newArr
        }
        Arrays.sort(newArr, Collections.reverseOrder(new Comparator<String>() 
        {
            @Override //override sort function for string comaprison
             public int compare(String a, String b) 
             {
                //convert to Big_Decimal inside comparator so permanent string values are never changed
                BigDecimal c = new BigDecimal(a);
                BigDecimal d = new BigDecimal(b);
                return c.compareTo(d);
             }
        }));
        s=newArr;
