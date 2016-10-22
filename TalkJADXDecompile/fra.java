import java.util.Comparator;
import java.util.Locale;

public final class fra {
    public static final Comparator a;
    public final String b;
    public final String c;
    public final String d;

    static {
        a = new frb();
    }

    public fra(String str, String str2) {
        this.b = str;
        this.c = str2;
        this.d = new Locale("", str).getDisplayCountry();
    }
}
