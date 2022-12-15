import java.util.Arrays;
import java.util.List;
import java.util.Random;

import AbstractClasses.ProblemDomain;
import AbstractClasses.ProblemDomain.HeuristicType;

public class HH {


    protected ProblemDomain domain;
    protected int[] lowLevelHeuristics;
    protected HeuristicType[] heuristicTypes;
    public HH(ProblemDomain problem){
        this.domain = problem;
    }


    public int[] getmutation(ProblemDomain domain) {

        this.domain = domain;
        // Parse heuristics
        int[] mutations = domain.getHeuristicsOfType(HeuristicType.MUTATION);
        int[] ruinAndRepairs = domain.getHeuristicsOfType(HeuristicType.RUIN_RECREATE);
        int[] localSearches = domain.getHeuristicsOfType(HeuristicType.LOCAL_SEARCH);


        return mutations;
//        System.arraycopy(mutations, 0, lowLevelHeuristics, 0, mutations.length);
//        System.arraycopy(ruinAndRepairs, 0, lowLevelHeuristics, mutations.length, ruinAndRepairs.length);
//        System.arraycopy(localSearches, 0, lowLevelHeuristics, mutations.length+ruinAndRepairs.length, localSearches.length);
//        Arrays.fill(heuristicTypes, 0, mutations.length, HeuristicType.MUTATION);
//        Arrays.fill(heuristicTypes, mutations.length, mutations.length + ruinAndRepairs.length, HeuristicType.RUIN_RECREATE);
//        Arrays.fill(heuristicTypesypes, mutations.length + ruinAndRepairs.length, mutations.length + ruinAndRepairs.length + localSearches.length, HeuristicType.LOCAL_SEARCH);
    }

    public int[] getruin(ProblemDomain domain) {

        this.domain = domain;
        // Parse heuristics
        int[] mutations = domain.getHeuristicsOfType(HeuristicType.MUTATION);
        int[] ruinAndRepairs = domain.getHeuristicsOfType(HeuristicType.RUIN_RECREATE);
        int[] localSearches = domain.getHeuristicsOfType(HeuristicType.LOCAL_SEARCH);


        return ruinAndRepairs;
//        System.arraycopy(mutations, 0, lowLevelHeuristics, 0, mutations.length);
//        System.arraycopy(ruinAndRepairs, 0, lowLevelHeuristics, mutations.length, ruinAndRepairs.length);
//        System.arraycopy(localSearches, 0, lowLevelHeuristics, mutations.length+ruinAndRepairs.length, localSearches.length);
//        Arrays.fill(heuristicTypes, 0, mutations.length, HeuristicType.MUTATION);
//        Arrays.fill(heuristicTypes, mutations.length, mutations.length + ruinAndRepairs.length, HeuristicType.RUIN_RECREATE);
//        Arrays.fill(heuristicTypesypes, mutations.length + ruinAndRepairs.length, mutations.length + ruinAndRepairs.length + localSearches.length, HeuristicType.LOCAL_SEARCH);
    }

    public int[] getlocalSearch(ProblemDomain domain) {

        this.domain = domain;
        // Parse heuristics
        int[] mutations = domain.getHeuristicsOfType(HeuristicType.MUTATION);
        int[] ruinAndRepairs = domain.getHeuristicsOfType(HeuristicType.RUIN_RECREATE);
        int[] localSearches = domain.getHeuristicsOfType(HeuristicType.LOCAL_SEARCH);


        return localSearches;
//        System.arraycopy(mutations, 0, lowLevelHeuristics, 0, mutations.length);
//        System.arraycopy(ruinAndRepairs, 0, lowLevelHeuristics, mutations.length, ruinAndRepairs.length);
//        System.arraycopy(localSearches, 0, lowLevelHeuristics, mutations.length+ruinAndRepairs.length, localSearches.length);
//        Arrays.fill(heuristicTypes, 0, mutations.length, HeuristicType.MUTATION);
//        Arrays.fill(heuristicTypes, mutations.length, mutations.length + ruinAndRepairs.length, HeuristicType.RUIN_RECREATE);
//        Arrays.fill(heuristicTypesypes, mutations.length + ruinAndRepairs.length, mutations.length + ruinAndRepairs.length + localSearches.length, HeuristicType.LOCAL_SEARCH);
    }


}
