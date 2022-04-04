package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {

    CurrencyType canadianDollar = CurrencyType.CANADIAN_DOLLAR;

    @Override
    public Double convert(CurrencyType currencyType) {

        Double output = currencyType.getRate()/canadianDollar.getRate();

        return output;
    }
}
