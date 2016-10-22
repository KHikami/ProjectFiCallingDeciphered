/* compiled from: PG */
public final class blu implements Comparable {
    public static final blu c;
    public final String a;
    public final String b;
    private String d;
    private boolean e;

    static {
        c = new blu();
    }

    public blu(String str, String str2) {
        this.a = str;
        String[] split = blt.a.split(str2);
        if (split.length == 0) {
            throw new blv("Empty rule");
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
                throw new blv("Illegal rule: " + str2);
            }
        }
        this.d = str3;
        this.e = z;
    }

    private blu() {
        this.a = "DEFAULT";
        this.b = "";
        this.d = null;
        this.e = false;
    }

    public final String a(String str) {
        if (this.e) {
            return null;
        }
        if (this.d != null) {
            return this.d + str.substring(this.b.length());
        }
        return str;
    }

    public final int compareTo(Object obj) {
        return ((blu) obj).b.compareTo(this.b);
    }
}
