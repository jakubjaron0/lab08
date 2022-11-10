/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab08.engine;

import java.math.BigDecimal;


/**
 *
 * @author kuba
 */
abstract public class Generator implements SequenceGenerator {

    protected int lastIndex = 0;
    protected BigDecimal current = null,
            f_1 = null,
            f_2 = null,
            f_3 = null;

    @Override
    public void reset() {
        lastIndex = 0;
    }

    @Override
    public final BigDecimal getTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset();
        }
        while (lastIndex <= i) {
            nextTerm();
        }
        return current;
    }
}
