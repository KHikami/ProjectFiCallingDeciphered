package p000;

public final class iud {
    private final iuc f19034a;
    private final int f19035b;

    public iud(iuc iuc, int i) {
        this.f19034a = iuc;
        this.f19035b = i;
    }

    public static iud m23301a(String str) {
        String valueOf;
        iud iud = null;
        if (str == null) {
            return iud;
        }
        String[] split = str.split("x");
        String str2;
        if (split.length != 3) {
            String str3 = "vclib";
            str2 = "VideoSpecification can't parse ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            itx.m23277a(6, str3, valueOf);
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
            itx.m23277a(6, str3, valueOf);
            return iud;
        }
    }

    public iuc m23302a() {
        return this.f19034a;
    }

    public int m23303b() {
        return this.f19034a.f19032a * this.f19034a.f19033b;
    }

    public int m23304c() {
        return this.f19035b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iud)) {
            return false;
        }
        iud iud = (iud) obj;
        if (this.f19034a.equals(iud.f19034a) && this.f19035b == iud.f19035b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f19034a.hashCode() * 277) + this.f19035b;
    }
}
