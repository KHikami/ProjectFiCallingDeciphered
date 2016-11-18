package p000;

import java.util.Comparator;
import java.util.Locale;

public final class fra {
    public static final Comparator f13801a = new frb();
    public final String f13802b;
    public final String f13803c;
    public final String f13804d;

    public fra(String str, String str2) {
        this.f13802b = str;
        this.f13803c = str2;
        this.f13804d = new Locale("", str).getDisplayCountry();
    }
}
