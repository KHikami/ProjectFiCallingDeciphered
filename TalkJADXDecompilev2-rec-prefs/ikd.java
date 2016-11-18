package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ikd {
    String f17851a;
    String f17852b;
    itf f17853c;
    String f17854d;
    private final String f17855e;
    private boolean f17856f = false;
    private boolean f17857g = false;
    private int f17858h = -1;
    private int f17859i = 0;
    private final Map<String, iqo> f17860j = new HashMap();
    private iqs f17861k = null;
    private long f17862l = 0;
    private int f17863m = 0;
    private int f17864n = 10000;
    private String f17865o = null;
    private boolean f17866p = false;
    private final ikh f17867q = new ikh(new ike(this));

    public ikd(itf itf) {
        this.f17855e = itf.m23159a();
        this.f17853c = itf;
        this.f17854d = itf.m23173f();
    }

    void m22118a(String str) {
        this.f17854d = str;
    }

    String m22110a() {
        return this.f17854d;
    }

    boolean m22124b() {
        return this.f17856f;
    }

    void m22119a(boolean z) {
        this.f17856f = z;
    }

    void m22123b(boolean z) {
        this.f17857g = true;
    }

    boolean m22128c() {
        return this.f17857g;
    }

    private boolean m22106p() {
        return this.f17858h != -1;
    }

    public boolean m22131d() {
        return this.f17858h == 2;
    }

    public String m22132e() {
        return this.f17855e;
    }

    public String m22134f() {
        return this.f17851a;
    }

    public String m22135g() {
        return this.f17853c.m23163b();
    }

    void m22117a(itf itf) {
        this.f17853c = itf;
    }

    itf m22136h() {
        return this.f17853c;
    }

    private int m22107q() {
        return this.f17858h;
    }

    public void m22112a(int i) {
        this.f17858h = i;
    }

    public ikh m22137i() {
        return this.f17867q;
    }

    public iqo m22120b(String str) {
        if (this.f17861k == null || !str.equals(this.f17861k.m22949a())) {
            return m22125c(str);
        }
        return this.f17861k;
    }

    public iqo m22125c(String str) {
        return (iqo) this.f17860j.get(str);
    }

    public Collection<iqo> m22138j() {
        return Collections.unmodifiableCollection(this.f17860j.values());
    }

    public iqs m22139k() {
        return this.f17861k;
    }

    void m22116a(iqs iqs) {
        iil.m21874a("Expected condition to be true", iqs.m22969k());
        this.f17861k = iqs;
        this.f17862l = System.currentTimeMillis();
    }

    private String m22108r() {
        switch (this.f17863m) {
            case 1:
                return "eth";
            case 2:
                return "wifi";
            case 3:
                return "wimax";
            case 4:
                return "bt";
            case 5:
                return "mobile";
            case 6:
                return "mobile_2g";
            case 7:
                return "mobile_3g";
            case 8:
                return "mobile_lte";
            default:
                return "unk";
        }
    }

    void m22121b(int i) {
        this.f17863m = i;
    }

    public void m22115a(iqo iqo) {
        iil.m21879b("Expected condition to be false", iqo.m22969k());
        this.f17860j.put(iqo.m22949a(), iqo);
    }

    void m22126c(int i) {
        this.f17859i = 3;
    }

    public int m22140l() {
        return this.f17864n;
    }

    public String m22141m() {
        return this.f17865o;
    }

    void m22129d(int i) {
        m22113a(i, null);
    }

    void m22113a(int i, String str) {
        if (this.f17864n == 10000) {
            this.f17864n = i;
            this.f17865o = str;
        }
    }

    List<mav> m22111a(Context context, int i, int i2, ilr ilr) {
        iil.m21875b("localState is null - cannot report correct stats", (Object) ilr);
        if (!this.f17857g) {
            return new ArrayList();
        }
        iki a = this.f17867q.m22155a(context, i, i2, this.f17862l, this.f17855e).m22174a(this.f17853c).m22178a(m22106p(), this.f17864n, this.f17859i);
        if (this.f17853c.m23191q() != null) {
            a.m22175a(this.f17853c.m23191q());
        }
        if (this.f17861k != null) {
            a.m22180b(m22109s());
        }
        return a.m22179a();
    }

    private String m22109s() {
        String str = this.f17854d;
        String valueOf = String.valueOf(this.f17861k.m22949a());
        return new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(valueOf).length()).append(str).append("@groupchat.google.com/").append(valueOf).toString();
    }

    public int m22142n() {
        return ikh.m22151d(this.f17864n);
    }

    void m22130d(String str) {
        itx.m23279a(3, "vclib", "setRemoteSessionId = %s", str);
        this.f17851a = str;
        if (this.f17852b == null) {
            m22133e(this.f17851a);
        }
    }

    void m22133e(String str) {
        itx.m23279a(3, "vclib", "setActiveSessionId = %s", str);
        this.f17852b = str;
    }

    void m22127c(boolean z) {
        this.f17866p = z;
    }

    public boolean m22143o() {
        return this.f17866p;
    }

    static String m22105e(int i) {
        switch (i) {
            case -1:
                return "STATE_INVALID";
            case 0:
                return "STATE_INIT";
            case 1:
                return "STATE_SENTINITIATE";
            case 2:
                return "STATE_INPROGRESS";
            case 3:
                return "STATE_DEINIT";
            default:
                iil.m21870a("Unknown type");
                return "Unknown state";
        }
    }

    public void m22114a(Bundle bundle) {
        if (this.f17851a != null) {
            bundle.putString("call_state_remote_session_id", this.f17851a);
        }
        bundle.putString("call_state_local_session_id", m22132e());
        bundle.putString("media_network_type", m22108r());
        bundle.putString("media_state", ikd.m22105e(m22107q()));
        bundle.putString("p2p_mode", String.valueOf(m22143o()));
        bundle.putString("participant_log_id", m22135g());
        if (this.f17854d != null) {
            bundle.putString("hangout_id", this.f17854d);
        }
        bundle.putString("start_time_in_millis", String.valueOf(this.f17862l));
    }

    void m22122b(iqo iqo) {
        iil.m21875b("Expected non-null", (Object) iqo);
        iil.m21877b((Object) iqo, this.f17861k);
        this.f17860j.remove(iqo.m22949a());
    }
}
