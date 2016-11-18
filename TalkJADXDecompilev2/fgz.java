package defpackage;

import java.util.Collection;
import java.util.List;

public final class fgz implements fok {
    private static final long serialVersionUID = 2;
    private final mjq<String> a;
    private final int b;
    private int c = 0;
    private final String d;
    private String e;

    public fgz(List<String> list, int i) {
        this.a = mjq.a((Collection) list);
        this.b = i;
        this.d = glk.a(new Throwable());
    }

    public int L_() {
        return this.c;
    }

    public void b(int i) {
        this.c = i;
    }

    public ead a() {
        return new fgy(this);
    }

    public void d_(String str) {
        this.e = str;
    }

    public String toString() {
        int i = this.b;
        int size = this.a.size();
        String str = this.d;
        String str2 = this.e;
        return new StringBuilder((String.valueOf(str).length() + 102) + String.valueOf(str2).length()).append("query presence request: field mask=").append(i).append(" len(gaiaIds)").append(size).append("\nCreation stack:\n").append(str).append("\nOrigin stack:\n").append(str2).toString();
    }

    public int c() {
        return this.b;
    }

    public mjq<String> d() {
        return this.a;
    }

    public boolean a(int i) {
        return false;
    }
}
