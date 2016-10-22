import java.util.Collection;
import java.util.List;

final class coc implements fok {
    private static final long serialVersionUID = 1;
    private final mjq<eth> a;
    private int b;
    private final String c;
    private String d;

    coc(List<eth> list) {
        this.b = 0;
        this.a = mjq.a((Collection) list);
        this.c = glk.a(new Throwable());
    }

    public int L_() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public ead a() {
        return new coa(this);
    }

    public void d_(String str) {
        this.d = str;
    }

    public boolean a(int i) {
        return false;
    }

    public String toString() {
        int size = this.a.size();
        String str = this.c;
        String str2 = this.d;
        return new StringBuilder((String.valueOf(str).length() + 94) + String.valueOf(str2).length()).append("mark event observed request: len(observed events): ").append(size).append("\nCreation stack:\n").append(str).append("\nOrigin stack:\n").append(str2).toString();
    }

    mjq<eth> c() {
        return this.a;
    }
}
