package ru.ulsu.zebra.crit;

import junit.framework.Assert;
import org.apache.commons.math3.stat.correlation.KendallsCorrelation;
import org.junit.Test;

/**
 * Created by user on 08.04.14.
 */
public class KendallMethodTest {

    double[][] input = {
            {100, 118, 112, 97, 99, 103, 102, 132, 122, 121, 115, 117, 109, 111},

            {154, 123, 120, 213, 200, 187, 155, 100, 114, 115, 107, 176, 143, 111}
    };

    double result = - 0.67;

    double [] a = {38, 50, 52, 54, 59, 61, 66, 70, 71, 73};
    double [] b = {292, 302, 366, 312, 359, 398, 401, 298, 283, 413};


    @Test
    public void kendall() {

        KendallsCorrelation correlation = new KendallsCorrelation();

       // correlation.
        Assert.assertEquals(correlation.correlation(a, b), 0.29);
    }

}


