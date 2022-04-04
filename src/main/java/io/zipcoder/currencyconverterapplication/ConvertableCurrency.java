package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {

    default Double convert(CurrencyType currencyType) {

        Double output = currencyType.getRate()/CurrencyType.AUSTRALIAN_DOLLAR.getRate();

        return output;
    }

}
