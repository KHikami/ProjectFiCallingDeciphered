package defpackage;

/* renamed from: gsm */
public final class gsm implements Comparable {
    public static final gsm e;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    static {
        e = new gsm();
    }

    public gsm(String str, String str2) {
        this.a = str;
        String[] split = gsl.a.split(str2);
        if (split.length == 0) {
            throw new gsn("Empty rule");
        }
        this.b = split[0];
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
        this.c = str3;
        this.d = z;
    }

    private gsm() {
        this.a = "DEFAULT";
        this.b = "";
        this.c = null;
        this.d = false;
    }

    public String a(String str) {
        if (this.d) {
            return null;
        }
        if (this.c != null) {
            return this.c + str.substring(this.b.length());
        }
        return str;
    }

    public int compareTo(Object obj) {
        return ((gsm) obj).b.compareTo(this.b);
    }
}
