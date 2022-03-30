package com.blz.cableinvoicegenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CableInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTimeWhenComputedShouldReturnTotalFare() {
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double result = invoice.CalculateFare(10, 1);
        Assertions.assertEquals(101, result, 0);

    }
}
