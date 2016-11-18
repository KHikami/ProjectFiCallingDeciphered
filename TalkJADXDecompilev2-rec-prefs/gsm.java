package p000;

public final class gsm implements Comparable {
    public static final gsm f16018e = new gsm();
    public final String f16019a;
    public final String f16020b;
    public final String f16021c;
    public final boolean f16022d;

    public gsm(String str, String str2) {
        this.f16019a = str;
        String[] split = gsl.f16012a.split(str2);
        if (split.length == 0) {
            throw new gsn("Empty rule");
        }
        this.f16020b = split[0];
        String str3 = null;
        boolean z = false;
        int i = 1;
        while (i < split.length) {
            String toLowerCase = split[i].toLowerCase();
            if (toLowerCase.equals("rewrite") && i + 1 < split.length) {
                str3 = split[i + 1];
                i += 2;
            } else if (toLowerCase.equals("block")) {
                i++;
                z = true;
            } else {
                throw new gsn("Illegal rule: " + str2);
            }
        }
        this.f16021c = str3;
        this.f16022d = z;
    }

    private gsm() {
        this.f16019a = "DEFAULT";
        this.f16020b = "";
        this.f16021c = null;
        this.f16022d = false;
    }

    public String m18474a(String str) {
        if (this.f16022d) {
            return null;
        }
        if (this.f16021c != null) {
            return this.f16021c + str.substring(this.f16020b.length());
        }
        return str;
    }

    public int compareTo(Object obj) {
        return ((gsm) obj).f16020b.compareTo(this.f16020b);
    }
}
