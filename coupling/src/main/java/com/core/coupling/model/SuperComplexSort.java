package com.core.coupling.model;

public class SuperComplexSort {
    private SortAlgorithm sortAlgorithm;

    public SuperComplexSort(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }


    public void  Sort(){
        sortAlgorithm.sort();
    }



}
