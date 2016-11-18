package p000;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class bjf extends bjd implements Serializable {
    private final String f3474a;
    private final List<bje> f3475b = new ArrayList();
    private final List<bjo> f3476c = new ArrayList();
    private final boolean f3477d;
    private String f3478e;
    private String f3479f;

    public bjf(String str) {
        this.f3474a = str;
        this.f3477d = false;
    }

    public bjf(String str, boolean z) {
        this.f3474a = str;
        this.f3477d = z;
    }

    public String m5371b() {
        return this.f3474a;
    }

    public void m5368a(bjo bjo) {
        this.f3476c.add(bjo);
    }

    public List<bjo> m5373c() {
        if (this.f3476c != null) {
            return Collections.unmodifiableList(this.f3476c);
        }
        return Collections.emptyList();
    }

    public void m5367a(bje bje) {
        this.f3475b.add(bje);
    }

    public List<bje> m5374d() {
        if (this.f3475b != null) {
            return Collections.unmodifiableList(this.f3475b);
        }
        return Collections.emptyList();
    }

    public String m5375e() {
        return this.f3478e;
    }

    public void m5369a(String str) {
        this.f3478e = str;
    }

    public String m5376f() {
        return this.f3479f;
    }

    public void m5372b(String str) {
        this.f3479f = str;
    }

    public boolean m5377g() {
        return this.f3477d;
    }

    public fbw mo565a(Context context, String str) {
        return fbw.m14930a(this.f3474a, str);
    }

    protected Object[] mo566a() {
        return new Object[]{this.f3474a};
    }

    public String toString() {
        String valueOf = String.valueOf(glk.m17974b(this.f3474a));
        String valueOf2 = String.valueOf(Arrays.toString(m5374d().toArray()));
        String valueOf3 = String.valueOf(Arrays.toString(m5373c().toArray()));
        String valueOf4 = String.valueOf(glk.m17974b(this.f3478e));
        String valueOf5 = String.valueOf(glk.m17974b(this.f3479f));
        return new StringBuilder(((((String.valueOf(valueOf).length() + 75) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("GaiaId {gaiaId: ").append(valueOf).append(" | emails: ").append(valueOf2).append(" | phoneNumbers: ").append(valueOf3).append(" | avatarUrl: ").append(valueOf4).append(" | displayName: ").append(valueOf5).append("}").toString();
    }
}
