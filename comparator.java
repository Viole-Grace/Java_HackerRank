// Write your Checker class here
class Checker implements Comparator<Player> //interface usage
{
    @Override
    public int compare(Player p1, Player p2) 
    {
        if (p2.score==p1.score) 
        {
            return p1.name.compareTo(p2.name);
        } 
        else 
        {
            return p1.score>p2.score?-1:1;    
        }
    }
}
