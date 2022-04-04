package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {

    CurrencyType australianDollar = CurrencyType.AUSTRALIAN_DOLLAR;

    @Override
    public Double convert(CurrencyType currencyType) {

        Double output = currencyType.getRate()/australianDollar.getRate();

        return output;
    }
}
