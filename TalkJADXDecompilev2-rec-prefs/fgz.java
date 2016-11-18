package p000;

import java.util.Collection;
import java.util.List;

public final class fgz implements fok {
    private static final long serialVersionUID = 2;
    private final mjq<String> f13033a;
    private final int f13034b;
    private int f13035c = 0;
    private final String f13036d;
    private String f13037e;

    public fgz(List<String> list, int i) {
        this.f13033a = mjq.m32314a((Collection) list);
        this.f13034b = i;
        this.f13036d = glk.m17967a(new Throwable());
    }

    public int L_() {
        return this.f13035c;
    }

    public void mo1023b(int i) {
        this.f13035c = i;
    }

    public ead mo1021a() {
        return new fgy(this);
    }

    public void d_(String str) {
        this.f13037e = str;
    }

    public String toString() {
        int i = this.f13034b;
        int size = this.f13033a.size();
        String str = this.f13036d;
        String str2 = this.f13037e;
        return new StringBuilder((String.valueOf(str).length() + 102) + String.valueOf(str2).length()).append("query presence request: field mask=").append(i).append(" len(gaiaIds)").append(size).append("\nCreation stack:\n").append(str).append("\nOrigin stack:\n").append(str2).toString();
    }

    public int m15300c() {
        return this.f13034b;
    }

    public mjq<String> m15301d() {
        return this.f13033a;
    }

    public boolean mo1022a(int i) {
        return false;
    }
}
