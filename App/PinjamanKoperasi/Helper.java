package App.PinjamanKoperasi;

import java.text.DecimalFormat;

public class Helper {
    public static String numberFormat(Object val) {
        DecimalFormat formatter = new DecimalFormat("###,###.##");
        return formatter.format(val);
    }
}
