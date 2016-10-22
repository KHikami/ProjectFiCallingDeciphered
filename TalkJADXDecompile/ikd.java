import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ikd {
    String a;
    String b;
    itf c;
    String d;
    private final String e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private final Map<String, iqo> j;
    private iqs k;
    private long l;
    private int m;
    private int n;
    private String o;
    private boolean p;
    private final ikh q;

    public ikd(itf itf) {
        this.e = itf.a();
        this.c = itf;
        this.f = false;
        this.g = false;
        this.h = -1;
        this.l = 0;
        this.m = 0;
        this.j = new HashMap();
        this.k = null;
        this.q = new ikh(new ike(this));
        this.i = 0;
        this.n = 10000;
        this.o = null;
        this.p = false;
        this.d = itf.f();
    }

    void a(String str) {
        this.d = str;
    }

    String a() {
        return this.d;
    }

    boolean b() {
        return this.f;
    }

    void a(boolean z) {
        this.f = z;
    }

    void b(boolean z) {
        this.g = true;
    }

    boolean c() {
        return this.g;
    }

    private boolean p() {
        return this.h != -1;
    }

    public boolean d() {
        return this.h == 2;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.c.b();
    }

    void a(itf itf) {
        this.c = itf;
    }

    itf h() {
        return this.c;
    }

    private int q() {
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    public ikh i() {
        return this.q;
    }

    public iqo b(String str) {
        if (this.k == null || !str.equals(this.k.a())) {
            return c(str);
        }
        return this.k;
    }

    public iqo c(String str) {
        return (iqo) this.j.get(str);
    }

    public Collection<iqo> j() {
        return Collections.unmodifiableCollection(this.j.values());
    }

    public iqs k() {
        return this.k;
    }

    void a(iqs iqs) {
        iil.a("Expected condition to be true", iqs.k());
        this.k = iqs;
        this.l = System.currentTimeMillis();
    }

    private String r() {
        switch (this.m) {
            case wi.j /*1*/:
                return "eth";
            case wi.l /*2*/:
                return "wifi";
            case wi.z /*3*/:
                return "wimax";
            case wi.h /*4*/:
                return "bt";
            case wi.p /*5*/:
                return "mobile";
            case wi.s /*6*/:
                return "mobile_2g";
            case wi.q /*7*/:
                return "mobile_3g";
            case wi.m /*8*/:
                return "mobile_lte";
            default:
                return "unk";
        }
    }

    void b(int i) {
        this.m = i;
    }

    public void a(iqo iqo) {
        iil.b("Expected condition to be false", iqo.k());
        this.j.put(iqo.a(), iqo);
    }

    void c(int i) {
        this.i = 3;
    }

    public int l() {
        return this.n;
    }

    public String m() {
        return this.o;
    }

    void d(int i) {
        a(i, null);
    }

    void a(int i, String str) {
        if (this.n == 10000) {
            this.n = i;
            this.o = str;
        }
    }

    List<mav> a(Context context, int i, int i2, ilr ilr) {
        iil.b("localState is null - cannot report correct stats", (Object) ilr);
        if (!this.g) {
            return new ArrayList();
        }
        iki a = this.q.a(context, i, i2, this.l, this.e).a(this.c).a(p(), this.n, this.i);
        if (this.c.q() != null) {
            a.a(this.c.q());
        }
        if (this.k != null) {
            a.b(s());
        }
        return a.a();
    }

    private String s() {
        String str = this.d;
        String valueOf = String.valueOf(this.k.a());
        return new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(valueOf).length()).append(str).append("@groupchat.google.com/").append(valueOf).toString();
    }

    public int n() {
        return ikh.d(this.n);
    }

    void d(String str) {
        itx.a(3, "vclib", "setRemoteSessionId = %s", str);
        this.a = str;
        if (this.b == null) {
            e(this.a);
        }
    }

    void e(String str) {
        itx.a(3, "vclib", "setActiveSessionId = %s", str);
        this.b = str;
    }

    void c(boolean z) {
        this.p = z;
    }

    public boolean o() {
        return this.p;
    }

    static String e(int i) {
        switch (i) {
            case -1:
                return "STATE_INVALID";
            case wi.w /*0*/:
                return "STATE_INIT";
            case wi.j /*1*/:
                return "STATE_SENTINITIATE";
            case wi.l /*2*/:
                return "STATE_INPROGRESS";
            case wi.z /*3*/:
                return "STATE_DEINIT";
            default:
                iil.a("Unknown type");
                return "Unknown state";
        }
    }

    public void a(Bundle bundle) {
        if (this.a != null) {
            bundle.putString("call_state_remote_session_id", this.a);
        }
        bundle.putString("call_state_local_session_id", e());
        bundle.putString("media_network_type", r());
        bundle.putString("media_state", e(q()));
        bundle.putString("p2p_mode", String.valueOf(o()));
        bundle.putString("participant_log_id", g());
        if (this.d != null) {
            bundle.putString("hangout_id", this.d);
        }
        bundle.putString("start_time_in_millis", String.valueOf(this.l));
    }

    void b(iqo iqo) {
        iil.b("Expected non-null", (Object) iqo);
        iil.b((Object) iqo, this.k);
        this.j.remove(iqo.a());
    }
}
