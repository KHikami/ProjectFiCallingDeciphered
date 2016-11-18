package p000;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class bjg implements Serializable {
    private String f3480a = "";

    @Deprecated
    public abstract bjo mo567a();

    public abstract Collection<bjo> mo568b();

    @Deprecated
    public abstract String mo569c();

    public abstract Collection<bje> mo570d();

    public abstract String mo571e();

    public abstract String mo572f();

    public abstract boolean mo573g();

    public abstract boolean mo574h();

    @Deprecated
    public abstract String mo575i();

    public abstract Collection<bjf> mo576j();

    public abstract String mo577k();

    public abstract String mo578l();

    public abstract float mo579m();

    public abstract String mo580n();

    public abstract boolean mo581o();

    public abstract String mo582p();

    public abstract bji mo583q();

    public abstract String mo584r();

    public abstract boolean mo585s();

    public abstract boolean mo586t();

    public abstract boolean mo587u();

    public abstract boolean mo588v();

    public abstract bjh mo589w();

    public abstract boolean mo590x();

    public abstract boolean mo591y();

    public Collection<fbw> m5381a(Context context) {
        Collection<fbw> arrayList = new ArrayList();
        for (bjo c : mo568b()) {
            arrayList.add(fbw.m14927a(context, c.m5473c()));
        }
        for (bjf bjf : mo576j()) {
            arrayList.add(fbw.m14930a(bjf.m5371b(), bjf.m5376f()));
        }
        return arrayList;
    }

    public boolean m5407z() {
        return !mo568b().isEmpty();
    }

    public String m5379A() {
        return this.f3480a;
    }

    public void m5382a(String str) {
        this.f3480a = str;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof bjg) && gwb.m2240h(m5378B(), ((bjg) obj).m5378B());
    }

    public int hashCode() {
        return gwb.m2074c(m5378B());
    }

    private Object[] m5378B() {
        return new Object[]{mo571e(), mo572f(), mo576j(), mo580n(), mo582p(), mo570d(), mo568b(), mo578l(), m5381a(gwb.m1400H())};
    }

    public String toString() {
        String valueOf = String.valueOf(glk.m17974b(mo571e()));
        String valueOf2 = String.valueOf(glk.m17974b(mo572f()));
        String valueOf3 = String.valueOf(Arrays.toString(mo576j().toArray()));
        String valueOf4 = String.valueOf(glk.m17974b(mo580n()));
        String valueOf5 = String.valueOf(glk.m17974b(mo582p()));
        String valueOf6 = String.valueOf(Arrays.toString(mo570d().toArray()));
        String valueOf7 = String.valueOf(Arrays.toString(mo568b().toArray()));
        String valueOf8 = String.valueOf(glk.m17974b(mo578l()));
        float m = mo579m();
        String valueOf9 = String.valueOf(Arrays.toString(m5381a(gwb.m1400H()).toArray()));
        return new StringBuilder(((((((((String.valueOf(valueOf).length() + 185) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()).append("HangoutsContact {name: ").append(valueOf).append(" | avatarUrl: ").append(valueOf2).append(" | gaias: ").append(valueOf3).append(" | contactLookupKey: ").append(valueOf4).append(" | contactId: ").append(valueOf5).append(" | emails: ").append(valueOf6).append(" | phoneNumbers: ").append(valueOf7).append(" | personLoggingId: ").append(valueOf8).append(" | personAffinityScore: ").append(m).append(" | inviteeIds: ").append(valueOf9).append("}").toString();
    }
}
