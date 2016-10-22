import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class bjg implements Serializable {
    private String a;

    @Deprecated
    public abstract bjo a();

    public abstract Collection<bjo> b();

    @Deprecated
    public abstract String c();

    public abstract Collection<bje> d();

    public abstract String e();

    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();

    @Deprecated
    public abstract String i();

    public abstract Collection<bjf> j();

    public abstract String k();

    public abstract String l();

    public abstract float m();

    public abstract String n();

    public abstract boolean o();

    public abstract String p();

    public abstract bji q();

    public abstract String r();

    public abstract boolean s();

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    public abstract bjh w();

    public abstract boolean x();

    public abstract boolean y();

    public bjg() {
        this.a = "";
    }

    public Collection<fbw> a(Context context) {
        Collection<fbw> arrayList = new ArrayList();
        for (bjo c : b()) {
            arrayList.add(fbw.a(context, c.c()));
        }
        for (bjf bjf : j()) {
            arrayList.add(fbw.a(bjf.b(), bjf.f()));
        }
        return arrayList;
    }

    public boolean z() {
        return !b().isEmpty();
    }

    public String A() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof bjg) && gwb.h(B(), ((bjg) obj).B());
    }

    public int hashCode() {
        return gwb.c(B());
    }

    private Object[] B() {
        return new Object[]{e(), f(), j(), n(), p(), d(), b(), l(), a(gwb.H())};
    }

    public String toString() {
        String valueOf = String.valueOf(glk.b(e()));
        String valueOf2 = String.valueOf(glk.b(f()));
        String valueOf3 = String.valueOf(Arrays.toString(j().toArray()));
        String valueOf4 = String.valueOf(glk.b(n()));
        String valueOf5 = String.valueOf(glk.b(p()));
        String valueOf6 = String.valueOf(Arrays.toString(d().toArray()));
        String valueOf7 = String.valueOf(Arrays.toString(b().toArray()));
        String valueOf8 = String.valueOf(glk.b(l()));
        float m = m();
        String valueOf9 = String.valueOf(Arrays.toString(a(gwb.H()).toArray()));
        return new StringBuilder(((((((((String.valueOf(valueOf).length() + 185) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()).append("HangoutsContact {name: ").append(valueOf).append(" | avatarUrl: ").append(valueOf2).append(" | gaias: ").append(valueOf3).append(" | contactLookupKey: ").append(valueOf4).append(" | contactId: ").append(valueOf5).append(" | emails: ").append(valueOf6).append(" | phoneNumbers: ").append(valueOf7).append(" | personLoggingId: ").append(valueOf8).append(" | personAffinityScore: ").append(m).append(" | inviteeIds: ").append(valueOf9).append("}").toString();
    }
}
