/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbrawl;

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
    
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        
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
            
            if(retval == "I DON'T KNOW")
            {
               bb.learnObservation(atEstablishment[i], fightOccurred[i]);
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
        
        // Initialize the version space
        // Version space initially is the same as the hypothesis class
        // I think the hypothesis class is the set of all possible 2 combinations of 
        // patrons
        
        // Initialize arrays containing our guess of who the instigator and 
        // peacemaker might be
        this.instigator = new boolean[this.numPatrons];
        this.peacemaker = new boolean[this.numPatrons];
        this.seenPatron = new boolean[this.numPatrons];
        
        // Intitially we believe that any of the patrons could be the 
        // instigator or the peacemaker. As we learn (as we get information about
        // the world) we will begin to eliminate patrons
        Arrays.fill(this.instigator, true);
        Arrays.fill(this.peacemaker, true);
        Arrays.fill(this.seenPatron, false);
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
        // This is a tricky method to implement. We have arrays of 
        // potential instigators and peacemakers, but we need some way of keeping
        // track of pairwise combinations of patrons so we can know what patrons
        // we have observed together. I am thinking of a numPatrons x numPatrons
        // boolean array to keep track of which patrons we have seen with which patrons.
        // Using this information, if we come across any combination we have not 
        // seen before (if any entry is false), we report 'I DON'T KNOW'
        // If we have seen all these patrons together in some combination before,
        // I think we can determine whether a fight breaks out or not
        
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
        // TODO: I CAN'T DO THIS
        // I need a to be able to determine sooner. This fails the simple test case in 
        // the main section above, at least as far as the number of 'don't knows'
        // if there is at least one patron we have not seen before, we return
        // "I DON'T KNOW"
        else if( firstVisit(atEstablishment) )
        {
            return "I DON'T KNOW";
        }
        // So we know at this point that all the patrons present
        // have been seen at least once, so we know whether they are a 
        // potential peacemaker or not
        // If none of the patrons present are potential peacemakers, we 
        // know a fight should break out
        else if( noPeacemakers(atEstablishment) )
        {
            return "FIGHT";
        }
        else
        {
            return "NO FIGHT";           
        }
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
        // Update array keeping track of who we have seen
        for(int i=0; i < this.numPatrons; i++)
        {
            this.seenPatron[i] = this.seenPatron[i] || atEstablishment[i];
        }
        
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
        // I am not sure if there is a second case when a fight doesn't break out.
        // We don't know if this is because the peacemaker is present or if this is
        // because the instigator is not present. 
        // If we go through the patrons and find that a single potential instigator
        // is present, we know that the peacemaker must be present
        // If we find that some but not all of the potential instigators are present
        // I don't think we can make any determination. The peacemaker doesn't have to
        // be present for a fight not to break out.
        // This doesn't help us determine who might be a peacemaker or instigator.
        // Similarly for the peackemaker. If we find that all the potential peacemakers
        // are present, we can't really tell who, if anyone, is an instigator.
        // 
        // In order to acheive the bounds specified above, I really don't think I
        // need to handle this else case. I think enough information can be supplied
        // in the first case to satisfy these constraints.
        
        
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
    
    // Returns true if at least one patron has never been seen before
    private boolean firstVisit( boolean[] atEstablishment )
    {
        boolean retVal = true;
        
        for(int i = 0; i < this.numPatrons; i++)
        {
            // if patron is present
            if(atEstablishment[i])
            {
                // check if this patron has been seen before
                // if patron has not been seen before, retVal will be false
                retVal = retVal && this.seenPatron[i];
            }
        }
        
        return !retVal;
    }
    
    // Returns true of none of the patrons at the establishment have the
    // potential to be peacemakers
    private boolean noPeacemakers(boolean[] atEstablishment)
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
}
