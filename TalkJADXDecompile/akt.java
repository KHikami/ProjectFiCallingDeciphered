import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class akt extends ako {
    static final Set<String> a;
    static final Set<String> b;
    private final akr c;

    static {
        a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"BEGIN", "END", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER", "NAME", "PROFILE", "SOURCE", "NICKNAME", "CLASS", "SORT-STRING", "CATEGORIES", "PRODID", "IMPP"})));
        b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"7BIT", "8BIT", "BASE64", "B"})));
    }

    public akt() {
        this.c = new akr();
    }

    public akt(int i) {
        this.c = new akr(i);
    }

    public void a(akn akn) {
        this.c.a(akn);
    }

    public void a(InputStream inputStream) {
        this.c.a(inputStream);
    }
}
