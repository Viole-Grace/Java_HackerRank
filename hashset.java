//Write your code here
HashSet<String> pairs = new HashSet<String>(t);
    for(int i=0;i<t;++i)
    {
        pairs.add("(" +pair_left[i]+ ", "+pair_right[i]+")");
        System.out.println(pairs.size());        
    }
