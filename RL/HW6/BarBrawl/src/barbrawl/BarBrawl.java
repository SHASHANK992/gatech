/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbrawl;

import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;
/**
 *
 * @author Jacob
 * 
 * 
 *  
 * 
 * 
 */
public class BarBrawl {

    // Must be between 2 and 1000 inclusive
    int numPatrons;
    // Keeps track of possible instigators
    boolean[] instigator;
    // Keeps track of possible peacemakers
    boolean[] peacemaker;
    // Keeps track of what patrons we have seen together
    boolean[] seenPatron;
    
    Hashtable ht;
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
        // TODO code application logic here
        testFourPatrons();
        
        /*
        int numOfPatrons = 2;
        int maxIDontKnows = 1;
        boolean[][] atEstablishment = {
                {true,true},
                {true,false},
                {false,true},
                {true,true},
                {false,false},
                {true,false},
                {true,true}
        };
        boolean[] fightOccurred = {
                false,
                true,
                false,
                false,
                false,
                true,
                false
        };
        
        BarBrawl bb = new BarBrawl(numOfPatrons);
        
        for(int i=0; i < 7; i++)
        {
            String retval = bb.predictOutcome( atEstablishment[i] );
            
            if("I DON'T KNOW".equals(retval))
            {
               bb.learnObservation(atEstablishment[i], fightOccurred[i]);
            }
            
            System.out.println(retval);
        }
        */
    }
    
    private static void testFourPatrons()
    {
        int numOfPatrons = 4;
        int maxIDKs = 11;
        
        boolean[][] atEst = {
            {true, true, false, true},
            {true, false, true, true},
            {true, false, false, true},
            {false, true, true, true},
            {false, true, true, false},
            {false, true, false, true},
            {false, true, false, false},
            {false, false, true, true},
            {false, false, true, false},
            {false, false, false, true},
            {true, true, true, false},
            {true, true, false, false}
        };
        
        boolean[] fightOccurred = {
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            true,
            true
        };
        
        BarBrawl bb = new BarBrawl(numOfPatrons);
        
        for(int i=0; i < 12; i++)
        {
            String retval = bb.predictOutcome( atEst[i] );
            
            if("I DON'T KNOW".equals(retval))
            {
               bb.learnObservation(atEst[i], fightOccurred[i]);
            }
            
            System.out.println(retval);
        }
    }
    
    /**
     * Constructor for class BarBrawl
     *
     * @param numPatrons - number of patrons that attend establishment
     * 
     * 
     */
    BarBrawl(int numPatrons)
    {
        this.numPatrons = numPatrons;
        
        // Initialize arrays containing our guess of who the instigator and 
        // peacemaker might be
        this.instigator = new boolean[this.numPatrons];
        this.peacemaker = new boolean[this.numPatrons];
        
        // Intitially we believe that any of the patrons could be the 
        // instigator or the peacemaker. As we learn (as we get information about
        // the world) we will begin to eliminate patrons
        Arrays.fill(this.instigator, true);
        Arrays.fill(this.peacemaker, true);
        
        // This keeps track of what combinations we have seen. If we have seen a
        // certain combination of already, we can report its value. Using this in
        // combination with the guesses of instigators and peacemakers, we can
        // beat a simple memorization algorithm
        this.ht = new Hashtable(this.numPatrons);
    }
    
    
    /**
     * If 'FIGHT' or 'NO FIGHT' is output, it must be correct. Otherwise the 
     * method should output 'I DON'T KNOW'    
     * If 'I DON'T KNOW' is returned, the caller should next call learnObservation
     * to provide the learner with the correct data
     *
     * The number of times that 'I DON'T KNOW' is returned should be no more than
     * numPatrons*(numPatrons-1) - 1 times if this API is maintained
     * 
     * @param atEstablishment - boolean array of length numPatrons
     *       value at index i tells whether patron i is present at
     *       the establishment
     * @return String value telling whether or not fight broke out or not or if the 
     * learner cannot say with certain whether a fight broke out or not
     */
    public String predictOutcome(boolean[] atEstablishment)
    {          
        // Convert input into a list
        List<Boolean> atEst = convertToList(atEstablishment);
        
        // Special cases
        // 1) Every patron is at establishment
        if( allPresent(atEstablishment) )
        {
            return "NO FIGHT";
        }
        // 2) No patron is at establishment
        else if( nonePresent(atEstablishment) )
        {
            return "NO FIGHT";
        }
        // If there is only one peacemaker left and that peacemaker is present,
        // we know a fight does not break out.
        else if( isSinglePeacemakerPresent(atEstablishment) )
        {
            return "NO FIGHT";
        }
        // If we have seen this case before, we can simply retrieve its value
        // from the hashtable
        else if( this.ht.containsKey(atEst) )
        {
            boolean val = (boolean)this.ht.get(atEst);
            if( val )
            {
                return "FIGHT";
            }
            else 
            {
                return "NO FIGHT";
            }
        }
        // Beyond here we have to start taking guesses
        // This isn't a simple case, nor have we seen this combo before, nor
        // have we determined who the peacemaker is.
        
        // If there are no potential peacemakers and all the potential
        // instigators are present, we know a fight breaks out
        else if( this.noPotentialPeacemakersPresent(atEstablishment) && this.allPotentialInstigatorsPresent(atEstablishment) )
        {
            return "FIGHT";
        }
        
        return "I DON'T KNOW";
    }
    
    
    /**
     * Method will take input data to update output of predictOutcome
     * 
     * @param atEstablishment - boolean array of length numPatrons
     *       value at index i tells whether patron i is present at
     *       the establishment
     * @param fightOccurred - boolean telling whether fight occurred when patrons
     *       specified by atEstablishment are present
     */
    public void learnObservation(boolean[] atEstablishment, boolean fightOccurred)
    {     
        // Convert input to list
        List<Boolean> atEst = convertToList(atEstablishment);
        
        // Add this case to the hashtable
        this.ht.put(atEst, fightOccurred);
        
        // Case 1: Fight breaks out
        // We know two things: 1) The instigator has to be present and 2) The
        // peacemaker cannot be present
        
        // For every patron not at the establishment, set their 'instigator'
        // belief to false
        // For every patron present at the establishment, set their 
        // 'peacemaker' belief to false
        if(fightOccurred)
        {
            for(int i=0; i<this.numPatrons; i++)
            {
                boolean patronPresent = atEstablishment[i];

                if( !patronPresent )
                {
                    this.instigator[i] = false;
                }
                else
                {
                    this.peacemaker[i] = false;
                }
            }
        }  
        else
        {
            // If no fight occurred, we can't really tell much unless only one 
            // patron is present. In that case we know that the patron is not
            // the instigator
            if( singlePatron(atEstablishment) )
            {
                int index = indexOfLonePatron(atEstablishment);
                
                instigator[index] = false;
            }
            
            // For all other combinations, if a fight does not break out there is
            // no other information we can determine.
        }
    }
    
    /******************************************
     * 
     * Helper functions
     * 
     ****************************************/
    private List<Boolean> convertToList(boolean[] atEstablishment)
    {
        List<Boolean> retval = new ArrayList<Boolean>();
        
        for(int i=0; i<this.numPatrons; i++)
        {
            Boolean temp = atEstablishment[i];
            retval.add(temp);
        }
        
        return retval;
    }
    
    // return true if all patrons are present
    private boolean allPresent( boolean[] atEstablishment )
    {
        boolean retVal = true;
        for(int i=0; i < this.numPatrons; i++ )
        {
            retVal = (retVal && atEstablishment[i]);
        }
        return retVal;
    }
    
    // returns true of no patrons are present
    private boolean nonePresent( boolean[] atEstablishment )
    {
        boolean retVal = false;
        for(int i = 0; i < this.numPatrons; i++)
        {
            retVal = (retVal || atEstablishment[i]);
        }
        return !retVal;
    }
    
    // Returns true of none of the patrons at the establishment have the
    // potential to be peacemakers
    private boolean noPotentialPeacemakersPresent(boolean[] atEstablishment)
    {
        boolean peacemakerPresent = false;
        
        for(int i = 0; i < this.numPatrons; i++)
        {
            if(atEstablishment[i])
            {
                // Will be true if at least one patron is a peacemaker
                peacemakerPresent = peacemakerPresent || this.peacemaker[i];
            }
        }
        
        // if there are no peacemakers, this will remain false. Negate it
        return !peacemakerPresent;
    }
    
    // Returns true if all the instigators left are present
    private boolean allPotentialInstigatorsPresent(boolean[] atEstablishment)
    {
        boolean retval = true;
        
        for(int i = 0; i< this.numPatrons; i++)
        {
            // If the patron is present at the establishment
            if(atEstablishment[i])
            {
                retval = retval && this.instigator[i];
            }
        }
        
        return retval;
    }
    
    // Returns true if there is only one patron present at the establishment
    private boolean singlePatron(boolean[] atEstablishment)
    {
        int numPresent = 0;
        
        for(int i=0; i < this.numPatrons; i++)
        {
            if(atEstablishment[i])
            {
                numPresent += 1;
            }
        }
        
        return (numPresent == 1);
    }
    
    // Only to be used when there is only a single patron present.
    // Returns the index of that patron in the array
    private int indexOfLonePatron(boolean[] atEstablishment)
    {
        int i = 0;
        while(i < this.numPatrons)
        {
            if(atEstablishment[i])
            {
                break;
            }
            
            i++;
        }
        
        return i;
    }
    
    // Returns true if there is a single peacemaker and that peacemaker is present
    // at the establishment
    // If there is more than one peacemaker or if the lone peacemaker is not present
    // at the establishment, returns false
    private boolean isSinglePeacemakerPresent(boolean[] atEstablishment)
    {
        // First make sure that there is only one peacemaker
        int numPeacemakers = 0;
        int idx=0;
        for(int i=0; i<this.numPatrons; i++)
        {
            if(this.peacemaker[i])
            {
                numPeacemakers++;
                idx=i;
            }
        }
        // If there is more than 1 peacemaker, return false
        if(numPeacemakers != 1)
        {
            return false;
        }
        else
        {
            return (this.peacemaker[idx] && atEstablishment[idx]);
        }     
    }
    
    // Returns true if there is a single instigator and that instigator is present
    // at the establishment
    // If there is more than one instigator or if the lone instigator is not present
    // at the establishment, returns false
    private boolean isSingleInstigatorPresent(boolean[] atEstablishment)
    {
        // First make sure that there is only one instigator
        int numInstigators = 0;
        int idx=0;
        for(int i=0; i<this.numPatrons; i++)
        {
            if(this.peacemaker[i])
            {
                numInstigators++;
                idx=i;
            }
        }
        // If there is more than 1 peacemaker, return false
        if(numInstigators != 1)
        {
            return false;
        }
        else
        {
            return (this.instigator[idx] && atEstablishment[idx]);
        } 
    }
}
