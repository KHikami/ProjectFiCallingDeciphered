import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class bjf extends bjd implements Serializable {
    private final String a;
    private final List<bje> b;
    private final List<bjo> c;
    private final boolean d;
    private String e;
    private String f;

    public bjf(String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = str;
        this.d = false;
    }

    public bjf(String str, boolean z) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = str;
        this.d = z;
    }

    public String b() {
        return this.a;
    }

    public void a(bjo bjo) {
        this.c.add(bjo);
    }

    public List<bjo> c() {
        if (this.c != null) {
            return Collections.unmodifiableList(this.c);
        }
        return Collections.emptyList();
    }

    public void a(bje bje) {
        this.b.add(bje);
    }

    public List<bje> d() {
        if (this.b != null) {
            return Collections.unmodifiableList(this.b);
        }
        return Collections.emptyList();
    }

    public String e() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public String f() {
        return this.f;
    }

    public void b(String str) {
        this.f = str;
    }

    public boolean g() {
        return this.d;
    }

    public fbw a(Context context, String str) {
        return fbw.a(this.a, str);
    }

    protected Object[] a() {
        return new Object[]{this.a};
    }

    public String toString() {
        String valueOf = String.valueOf(glk.b(this.a));
        String valueOf2 = String.valueOf(Arrays.toString(d().toArray()));
        String valueOf3 = String.valueOf(Arrays.toString(c().toArray()));
        String valueOf4 = String.valueOf(glk.b(this.e));
        String valueOf5 = String.valueOf(glk.b(this.f));
        return new StringBuilder(((((String.valueOf(valueOf).length() + 75) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("GaiaId {gaiaId: ").append(valueOf).append(" | emails: ").append(valueOf2).append(" | phoneNumbers: ").append(valueOf3).append(" | avatarUrl: ").append(valueOf4).append(" | displayName: ").append(valueOf5).append("}").toString();
    }
}
