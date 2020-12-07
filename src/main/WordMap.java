import java.util.*;
import java.io.*;

public class WordMap
{
    public static void main(String[] args)
    {
        Map<String, wordSynonyms> mapStructure = new HashMap<>();

        File adjData = new File("data/adjective_data.txt");
        File advData = new File("data/adverb_data.txt");
        File nounData = new File("data/noun_data.txt");
        File verbData = new File("data/verb_data.txt");

        Scanner adjDataScan;
        try
        {
            adjDataScan = new Scanner(adjData);

            while (adjDataScan.hasNextLine())
            {
                adjDataScan.nextLine();
            }

            adjDataScan.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

class wordSynonyms
{
    boolean empty()
    {
        if(verbSyn.isEmpty() && nounSyn.isEmpty() && adverbSyn.isEmpty() && adjectiveSyn.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean verb = false;
    boolean noun = false;
    boolean adverb = false;
    boolean adjective = false;

    private Comparator<String> comparator = new StringLengthComparator();
    PriorityQueue<String> verbSyn = new PriorityQueue<String>(20, comparator);
    PriorityQueue<String> nounSyn = new PriorityQueue<String>(20, comparator);
    PriorityQueue<String> adverbSyn = new PriorityQueue<String>(20, comparator);
    PriorityQueue<String> adjectiveSyn = new PriorityQueue<String>(20, comparator);
}

class StringLengthComparator implements Comparator<String>
{
    @Override
    public int compare(String x, String y)
    {
        return x.length() - y.length();
    }
}
