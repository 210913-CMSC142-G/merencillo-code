import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

/*
Strategy: 
Cut off the link between exits and other nodes that are closest to agent.
If an agent's neighbor node is an exit, immediately cut off the link to the exit.
Else sever the link that leads to many more neighboring nodes.
Note:
According to forum discussion/comments, the link between nodes should first be confirmed of its existence.
In addition, there is a need to organize/update the nodes to check the links faster.
*/

    private int L; //number of links
    private int E; //number of exits/gateways
    private int[] N1; //array of first nodes
    private int[] N2; //array of second nodes
    private int[] EI; //array of exit nodes

    //for easier data access
    public Player(int l, int e, int[] n1, int[] n2, int[] ei){
        this.L = l;
        this.E = e;
        this.N1 = n1;
        this.N2 = n2;
        this.EI = ei;
    }

    //checks if a node is a/n Exit/Gateway; returns boolean value
    private boolean isExit(int node){
        for(int i = 0; i < E; i++){
            //checks if node value exists in exit array EI
            if(node == EI[i]){
                return true;
            }
        }
        return false;
    }

    //separate method to get neighbor nodes of SI and any Exits/Gateways
    private int[] neighborNodes(int currentPosition){
        //initializes array to store neighborhood nodes
        int[] NN = new int[L];
        int n = 0;
        for(int i = 0; i < L; i++){
            if(currentPosition == N1[i]){
                NN[n++] = N2[i];
            }
            if(currentPosition == N2[i]){
                NN[n++] = N1[i];
            }
            //stores the neighbor nodes to array NN
        }
        return Arrays.copyOf(NN, n);
        //returns copy of NN array of n length
    }

    //verifies that a Link exists between two nodes
    //checks both cases i.e. returns true if (node1 is in N1 and node2 in N2) or (node1 is in N2 and node2 in N1)
    private boolean Link(int node1, int node2, int index){
        return (N1[index]==node1 && N2[index]==node2) || (N1[index]==node2 && N2[index]==node1);
    }

    //method to sever/cut the link between nodes
    private void cutLink(int node1, int node2){
        System.out.println(node1 + " " + node2);
        int lp = -1;
        for(int i = 0; i < L; i++){
            if(Link(node1, node2, i)){
            //ensures Link exists
                lp = i;
            }
        }
        //updates arrays of nodes to determine available links
        for(int i = lp; i < L-1; i++){
            N1[i] = N1[i+1];
            N2[i] = N2[i+1];
        }
        L = L - 1;
        N1 = Arrays.copyOf(N1, L);
        N2 = Arrays.copyOf(N2, L);
        //copies of available nodes and links
    }

    //simplified method to solve the problem
    public void action(int si){
        //get SI's neighbor nodes
        int[] nodes = neighborNodes(si);
        for(int i = 0; i < nodes.length; i++){
            //if any of the neighbors are exits, immediately cut/sever the link
            if(isExit(nodes[i])){
                cutLink(si, nodes[i]);
                return;
            }
        }
        cutLink(si, nodes[0]);
        return;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the total number of nodes in the level, including the gateways
        int L = in.nextInt(); // the number of links
        int E = in.nextInt(); // the number of exit gateways

        //changed the following to be arrays so that the values can be stored for later use
        int[] N1 = new int[L]; 
        int[] N2 = new int[L]; 
        int[] EI = new int[E]; 

        for (int i = 0; i < L; i++) {
            N1[i] = in.nextInt(); // N1 and N2 defines a link between these nodes
            N2[i] = in.nextInt();
        }

        for (int i = 0; i < E; i++) {
            EI[i] = in.nextInt(); // the index of a gateway node
        }
        
        Player player = new Player(L, E, N1, N2, EI);

        // game loop
        while (true) {
            int SI = in.nextInt(); // The index of the node on which the Bobnet agent is positioned this turn
            
            //action to begin the link severance process
            player.action(SI);
            
            // Write an action using System.out.println()
            // To debug: System.err.zprintln("Debug messages...");


            // Example: 0 1 are the indices of the nodes you wish to sever the link between
            //System.out.println(node1 + " " + node2);
        }
    }
}