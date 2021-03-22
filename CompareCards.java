import java.util.Comparator;
/**
 * 
 * @author José Rodrigo Barrera García y Oscar Fernando Lopez Barrios
 * Carnets: 20807 y 20679
 * Universidad del Valle de Guatemalas
 *
 */
class CompareCards implements Comparator<Card>
{
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Card a, Card b)
    {
        return a.getType().compareTo(b.getType());
    }
} 