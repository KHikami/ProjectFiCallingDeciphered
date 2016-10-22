import java.io.Serializable;

/* compiled from: PG */
public final class cxl implements Serializable {
    private static final long serialVersionUID = 1;
    private int a;
    private long b;
    private String c;
    private boolean d;
    private int e;
    private String f;
    private cxm g;
    private String h;

    public cxl() {
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = false;
        this.e = 1;
        this.f = "";
        this.h = "";
        this.g = cxm.FROM_NUMBER_WITH_PLUS_SIGN;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cxl) {
            boolean z;
            cxl cxl = (cxl) obj;
            if (cxl != null) {
                if (this == cxl) {
                    z = true;
                } else if (0 == 0 && this.c.equals(cxl.c) && this.e == cxl.e && this.f.equals(cxl.f) && this.g == cxl.g && this.h.equals(cxl.h)) {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((115169 + Long.valueOf(0).hashCode()) * 53) + this.c.hashCode()) * 53) + 1237) * 53) + this.e) * 53) + this.f.hashCode()) * 53) + this.g.hashCode()) * 53) + this.h.hashCode()) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Country Code: 0");
        stringBuilder.append(" National Number: 0");
        return stringBuilder.toString();
    }
}
