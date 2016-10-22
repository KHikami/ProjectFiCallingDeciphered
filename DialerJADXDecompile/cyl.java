import java.util.Arrays;

/* compiled from: PG */
public final class cyl {
    private final String a;
    private final cym b;
    private cym c;
    private boolean d;

    public cyl(String str) {
        this.b = new cym();
        this.c = this.b;
        this.d = false;
        this.a = (String) cob.i((Object) str);
    }

    public final String toString() {
        String str = "";
        StringBuilder append = new StringBuilder(32).append(this.a).append('{');
        for (cym cym = this.b.c; cym != null; cym = cym.c) {
            Object obj = cym.b;
            append.append(str);
            str = ", ";
            if (cym.a != null) {
                append.append(cym.a).append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                append.append(obj);
            } else {
                CharSequence deepToString = Arrays.deepToString(new Object[]{obj});
                append.append(deepToString, 1, deepToString.length() - 1);
            }
        }
        return append.append('}').toString();
    }

    public final cyl a(String str, Object obj) {
        cym cym = new cym();
        this.c.c = cym;
        this.c = cym;
        cym.b = obj;
        cym.a = (String) cob.i((Object) str);
        return this;
    }
}
