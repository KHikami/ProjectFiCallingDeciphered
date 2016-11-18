package p000;

import java.util.Collection;
import java.util.List;

final class coc implements fok {
    private static final long serialVersionUID = 1;
    private final mjq<eth> f5794a;
    private int f5795b = 0;
    private final String f5796c;
    private String f5797d;

    coc(List<eth> list) {
        this.f5794a = mjq.m32314a((Collection) list);
        this.f5796c = glk.m17967a(new Throwable());
    }

    public int L_() {
        return this.f5795b;
    }

    public void mo1023b(int i) {
        this.f5795b = i;
    }

    public ead mo1021a() {
        return new coa(this);
    }

    public void d_(String str) {
        this.f5797d = str;
    }

    public boolean mo1022a(int i) {
        return false;
    }

    public String toString() {
        int size = this.f5794a.size();
        String str = this.f5796c;
        String str2 = this.f5797d;
        return new StringBuilder((String.valueOf(str).length() + 94) + String.valueOf(str2).length()).append("mark event observed request: len(observed events): ").append(size).append("\nCreation stack:\n").append(str).append("\nOrigin stack:\n").append(str2).toString();
    }

    mjq<eth> m8115c() {
        return this.f5794a;
    }
}
