import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public final class bgx extends bgs {
    static final Set a;
    private final bgv b;

    static {
        a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"BEGIN", "END", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER", "NAME", "PROFILE", "SOURCE", "NICKNAME", "CLASS", "SORT-STRING", "CATEGORIES", "PRODID", "IMPP"})));
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"7BIT", "8BIT", "BASE64", "B"})));
    }

    public bgx() {
        this.b = new bgv();
    }

    public bgx(int i) {
        this.b = new bgv(i);
    }

    public final void a(bgr bgr) {
        this.b.a(bgr);
    }

    public final void a(InputStream inputStream) {
        this.b.a(inputStream);
    }

    public final void a() {
        this.b.f();
    }
}
