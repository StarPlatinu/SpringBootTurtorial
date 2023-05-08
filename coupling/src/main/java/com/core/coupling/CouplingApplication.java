package com.core.coupling;

import com.core.coupling.model.SortAlgorithm;
import com.core.coupling.model.SuperComplexSort;
import com.core.coupling.model.ThanhSort;
import com.core.coupling.model.QuickSort;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouplingApplication {

	public static void main(String[] args) {

//		SpringApplication.run(CouplingApplication.class, args);
//		ThanhSort thanhSort = new ThanhSort();
//		thanhSort.sort();
//		QuickSort quickSort = new QuickSort();
//		quickSort.sort();
		SortAlgorithm cc = new QuickSort();
//        cc.sort();
		SortAlgorithm sort = new ThanhSort();
		SuperComplexSort s1 = new SuperComplexSort(cc);
		SuperComplexSort s2 = new SuperComplexSort(cc);
        s1.Sort();

	}

}
