import burlap.oomdp.auxiliary.DomainGenerator;
import burlap.oomdp.core.*;
import burlap.oomdp.core.objects.MutableObjectInstance;
import burlap.oomdp.core.objects.ObjectInstance;
import burlap.oomdp.core.states.MutableState;
import burlap.oomdp.core.states.State;
import burlap.oomdp.singleagent.*;
import burlap.oomdp.singleagent.common.SimpleAction;
import burlap.oomdp.singleagent.environment.SimulatedEnvironment;
import burlap.oomdp.singleagent.explorer.TerminalExplorer;
import burlap.oomdp.singleagent.explorer.VisualExplorer;
import burlap.oomdp.visualizer.ObjectPainter;
import burlap.oomdp.visualizer.StateRenderLayer;
import burlap.oomdp.visualizer.StaticPainter;
import burlap.oomdp.visualizer.Visualizer;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.*;
import java.util.List;



public static void main(String [] args)
{
    // Bounded random walk to be modelled:
    //                        Start here 
    //                             |
    //  A  <-->  B  <-->  C  <-->  D  <-->  E  <-->  F  <-->  G
    //
    // There is a 50% chance of moving in either direction
    // Terminal state A has an outcome of 0
    // Terminal state G has an outcome of 1
    // Values for non terminal states in order are
    // 1/6, 1/3, 1/2, 2/3, 5/6
    // Use these for error calculations
    
    // Use GraphDefinedDomain to define a bounded random walk MDP
    
    // Values for lamba are 0, 0.1, 0.3, 0.5, 0.7, and 1.0
}