package p000;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class aks extends ako {
    static final Set<String> f1148a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"BEGIN", "END", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER"})));
    static final Set<String> f1149b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"DOM", "INTL", "POSTAL", "PARCEL", "HOME", "WORK", "PREF", "VOICE", "FAX", "MSG", "CELL", "PAGER", "BBS", "MODEM", "CAR", "ISDN", "VIDEO", "AOL", "APPLELINK", "ATTMAIL", "CIS", "EWORLD", "INTERNET", "IBMMAIL", "MCIMAIL", "POWERSHARE", "PRODIGY", "TLX", "X400", "GIF", "CGM", "WMF", "BMP", "MET", "PMB", "DIB", "PICT", "TIFF", "PDF", "PS", "JPEG", "QTIME", "MPEG", "MPEG2", "AVI", "WAVE", "AIFF", "PCM", "X509", "PGP"})));
    static final Set<String> f1150c = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"INLINE", "URL", "CONTENT-ID", "CID"})));
    static final Set<String> f1151d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"7BIT", "8BIT", "QUOTED-PRINTABLE", "BASE64", "B"})));
    private final akp f1152e;

    public aks() {
        this.f1152e = new akp();
    }

    public aks(int i) {
        this.f1152e = new akp((byte) 0);
    }

    public void mo256a(akn akn) {
        this.f1152e.m2748a(akn);
    }

    public void mo257a(InputStream inputStream) {
        this.f1152e.m2752a(inputStream);
    }
}
