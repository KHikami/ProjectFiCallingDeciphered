package p000;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class akt extends ako {
    static final Set<String> f1153a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"BEGIN", "END", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER", "NAME", "PROFILE", "SOURCE", "NICKNAME", "CLASS", "SORT-STRING", "CATEGORIES", "PRODID", "IMPP"})));
    static final Set<String> f1154b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"7BIT", "8BIT", "BASE64", "B"})));
    private final akr f1155c;

    public akt() {
        this.f1155c = new akr();
    }

    public akt(int i) {
        this.f1155c = new akr(i);
    }

    public void mo256a(akn akn) {
        this.f1155c.m2748a(akn);
    }

    public void mo257a(InputStream inputStream) {
        this.f1155c.m2752a(inputStream);
    }
}
