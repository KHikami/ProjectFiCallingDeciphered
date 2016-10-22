import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public final class bgw extends bgs {
    static final Set a;
    static final Set b;
    static final Set c;
    static final Set d;
    private final bgt e;

    static {
        a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"BEGIN", "END", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER"})));
        b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"DOM", "INTL", "POSTAL", "PARCEL", "HOME", "WORK", "PREF", "VOICE", "FAX", "MSG", "CELL", "PAGER", "BBS", "MODEM", "CAR", "ISDN", "VIDEO", "AOL", "APPLELINK", "ATTMAIL", "CIS", "EWORLD", "INTERNET", "IBMMAIL", "MCIMAIL", "POWERSHARE", "PRODIGY", "TLX", "X400", "GIF", "CGM", "WMF", "BMP", "MET", "PMB", "DIB", "PICT", "TIFF", "PDF", "PS", "JPEG", "QTIME", "MPEG", "MPEG2", "AVI", "WAVE", "AIFF", "PCM", "X509", "PGP"})));
        c = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"INLINE", "URL", "CONTENT-ID", "CID"})));
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"7BIT", "8BIT", "QUOTED-PRINTABLE", "BASE64", "B"})));
    }

    public bgw() {
        this.e = new bgt();
    }

    public bgw(int i) {
        this.e = new bgt((byte) 0);
    }

    public final void a(bgr bgr) {
        this.e.a(bgr);
    }

    public final void a(InputStream inputStream) {
        this.e.a(inputStream);
    }

    public final void a() {
        this.e.f();
    }
}
