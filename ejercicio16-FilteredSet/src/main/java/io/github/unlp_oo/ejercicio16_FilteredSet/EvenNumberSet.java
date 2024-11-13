package io.github.unlp_oo.ejercicio16_FilteredSet;
import java.util.HashSet;

public class EvenNumberSet extends HashSet<Integer>{

    public void add(int valor) {
    	if ( valor % 2 == 0) {
    		super.add(valor);
    	}
    }

}
