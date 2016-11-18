package p000;

import com.google.api.client.http.HttpStatusCodes;
import java.io.IOException;
import java.io.Serializable;

public final class fdo extends IOException implements Serializable {
    public static final fdo f12752a = new fdo(120);
    public static final fdo f12753b = new fdo(121);
    private static final long serialVersionUID = 1;
    private final boolean f12754c;
    private final int f12755d;
    private final String f12756e;
    private final long f12757f;
    private final giu f12758g;

    public fdo(int i, Exception exception, long j, boolean z, String str) {
        if (i < 100 || i > 141) {
            throw new IllegalArgumentException("error code out of range: " + i);
        }
        String str2;
        fdo fdo;
        this.f12754c = z;
        this.f12755d = i;
        String valueOf;
        if (exception != null) {
            valueOf = String.valueOf(exception.getMessage());
            str2 = this.f12754c ? "[INJECTED] -- " : "";
            str2 = new StringBuilder(((String.valueOf(valueOf).length() + 4) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(valueOf).append(" -- ").append(str2).append(str).toString();
            fdo = this;
        } else {
            valueOf = String.valueOf(this.f12754c ? "[INJECTED] -- " : "");
            str2 = String.valueOf(str);
            if (str2.length() != 0) {
                str2 = valueOf.concat(str2);
                fdo = this;
            } else {
                str2 = new String(valueOf);
                fdo = this;
            }
        }
        fdo.f12756e = str2;
        if (i == 100 && (exception instanceof giu)) {
            this.f12758g = (giu) exception;
        } else {
            this.f12758g = null;
        }
        this.f12757f = j;
    }

    public long m15082a() {
        return this.f12757f;
    }

    public fdo(int i, Exception exception) {
        this(i, exception, 0, false, null);
    }

    public fdo(int i) {
        this(i, null, 0, false, null);
    }

    public fdo(int i, long j, String str) {
        this(i, null, j, false, str);
    }

    public fdo(int i, String str) {
        this(i, null, 0, false, str);
    }

    public giu m15083b() {
        return this.f12758g;
    }

    public int m15084c() {
        return this.f12755d;
    }

    public String getMessage() {
        return this.f12756e;
    }

    public static fdo m15081a(int i, Exception exception, String str) {
        switch (i) {
            case 0:
                return new fdo(102, exception, 0, false, str);
            case 400:
                return new fdo(111, exception, 0, false, str);
            case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED /*401*/:
                return new fdo(104, exception, 0, false, str);
            case HttpStatusCodes.STATUS_CODE_FORBIDDEN /*403*/:
                return new fdo(111, exception, 0, false, str);
            case HttpStatusCodes.STATUS_CODE_NOT_FOUND /*404*/:
                return new fdo(113, exception, 0, false, str);
            case HttpStatusCodes.STATUS_CODE_CONFLICT /*409*/:
                return new fdo(108, exception, 0, false, str);
            case 416:
                return new fdo(111, exception, 0, false, str);
            case 418:
                return new fdo(111, exception, 0, false, str);
            case 429:
                return new fdo(109, exception, 0, false, str);
            case 499:
                return new fdo(121, exception, 0, false, str);
            case 501:
                return new fdo(111, exception, 0, false, str);
            case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
            case 504:
                return new fdo(108, exception, 0, false, str);
            default:
                if (i >= 400 && i < 500) {
                    return new fdo(111, exception, 0, false, str);
                }
                if (i >= 500 && i < 600) {
                    return new fdo(108, exception, 0, false, str);
                }
                glk.m17981d("Babel_RequestWriter", "Unknown HTTP response code " + i, new Object[0]);
                return new fdo(106, exception, 0, false, str);
        }
    }
}
