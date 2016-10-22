import java.io.Serializable;

public final class fpb extends foz implements Serializable {
    private static final long serialVersionUID = 1;
    public final double i;
    public final double j;
    public final String k;

    protected fpb(nzr nzr, oaq oaq) {
        String str;
        oad oad;
        super(nzr, oaq.e, oaq.f, foz.a(oaq.w), oaq.c, "hangouts/location");
        if (fox.d) {
            str = "Received location: ";
            String valueOf = String.valueOf(this.d);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (oaq.n != null) {
            obl obl = (obl) oaq.n.a(obl.a);
            if (obl != null) {
                str = obl.s;
                this.k = str;
                oad = (oad) oaq.o.a(oad.a);
                if (oad != null) {
                    this.i = 0.0d;
                    this.j = 0.0d;
                }
                this.i = oad.n.doubleValue();
                this.j = oad.o.doubleValue();
                return;
            }
        }
        str = null;
        this.k = str;
        oad = (oad) oaq.o.a(oad.a);
        if (oad != null) {
            this.i = oad.n.doubleValue();
            this.j = oad.o.doubleValue();
            return;
        }
        this.i = 0.0d;
        this.j = 0.0d;
    }

    public fpb(int[] iArr, String str, String str2, String str3, double d, double d2, String str4, String str5, String str6) {
        super(iArr, null, null, str3, null, str5, str6, "hangouts/location");
        this.i = d;
        this.j = d2;
        this.k = str4;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.d;
        double d = this.i;
        double d2 = this.j;
        String str3 = this.k;
        String str4 = this.f;
        return new StringBuilder((((String.valueOf(str).length() + 107) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("id: ").append(str).append(" name: ").append(str2).append(" latitude: ").append(d).append(" longitude: ").append(d2).append(" address: ").append(str3).append(" staticMapUrl: ").append(str4).toString();
    }
}
