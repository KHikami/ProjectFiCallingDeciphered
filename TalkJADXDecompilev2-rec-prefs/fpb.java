package p000;

import java.io.Serializable;

public final class fpb extends foz implements Serializable {
    private static final long serialVersionUID = 1;
    public final double f13634i;
    public final double f13635j;
    public final String f13636k;

    protected fpb(nzr nzr, oaq oaq) {
        String str;
        oad oad;
        super(nzr, oaq.e, oaq.f, foz.m15863a(oaq.w), oaq.c, "hangouts/location");
        if (fox.f13616d) {
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
                this.f13636k = str;
                oad = (oad) oaq.o.a(oad.a);
                if (oad != null) {
                    this.f13634i = 0.0d;
                    this.f13635j = 0.0d;
                }
                this.f13634i = oad.n.doubleValue();
                this.f13635j = oad.o.doubleValue();
                return;
            }
        }
        str = null;
        this.f13636k = str;
        oad = (oad) oaq.o.a(oad.a);
        if (oad != null) {
            this.f13634i = oad.n.doubleValue();
            this.f13635j = oad.o.doubleValue();
            return;
        }
        this.f13634i = 0.0d;
        this.f13635j = 0.0d;
    }

    public fpb(int[] iArr, String str, String str2, String str3, double d, double d2, String str4, String str5, String str6) {
        super(iArr, null, null, str3, null, str5, str6, "hangouts/location");
        this.f13634i = d;
        this.f13635j = d2;
        this.f13636k = str4;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.d;
        double d = this.f13634i;
        double d2 = this.f13635j;
        String str3 = this.f13636k;
        String str4 = this.f;
        return new StringBuilder((((String.valueOf(str).length() + 107) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("id: ").append(str).append(" name: ").append(str2).append(" latitude: ").append(d).append(" longitude: ").append(d2).append(" address: ").append(str3).append(" staticMapUrl: ").append(str4).toString();
    }
}
