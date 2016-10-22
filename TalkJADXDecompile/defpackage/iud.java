package defpackage;

/* renamed from: iud */
public final class iud {
    private final iuc a;
    private final int b;

    public iud(iuc iuc, int i) {
        this.a = iuc;
        this.b = i;
    }

    public static iud a(String str) {
        String str2;
        iud iud = null;
        if (str == null) {
            return iud;
        }
        String[] split = str.split("x");
        String valueOf;
        if (split.length != 3) {
            String str3 = "vclib";
            str2 = "VideoSpecification can't parse ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            itx.a(6, str3, valueOf);
            return iud;
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            return new iud(new iuc(parseInt, parseInt2), Integer.parseInt(split[2]));
        } catch (NumberFormatException e) {
            str3 = "vclib";
            str2 = "VideoSpecification can't parse ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            itx.a(6, str3, valueOf);
            return iud;
        }
    }

    public iuc a() {
        return this.a;
    }

    public int b() {
        return this.a.a * this.a.b;
    }

    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iud)) {
            return false;
        }
        iud iud = (iud) obj;
        if (this.a.equals(iud.a) && this.b == iud.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 277) + this.b;
    }
}
