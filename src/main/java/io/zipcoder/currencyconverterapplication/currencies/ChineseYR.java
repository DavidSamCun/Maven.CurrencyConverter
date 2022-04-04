package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {

    CurrencyType chineseYr = CurrencyType.CHINESE_YR;

    @Override
    public Double convert(CurrencyType currencyType) {

        Double output = currencyType.getRate()/chineseYr.getRate();

        return output;
    }

}
