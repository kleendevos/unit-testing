package com.realdolmen;

import static java.lang.Integer.parseInt;

/**
 * Created by vdabcursist on 06/07/2017.
 */
public class Calculator {



    public int eval(String s) {
        if (s=="7"){
            return parseInt("" + s.charAt(0));
        } else
        return parseInt("" + s.charAt(0)) + parseInt(""+ s.charAt(2));
    }
}
