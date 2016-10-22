import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.telecom.Call;
import android.telecom.Call.Callback;
import android.telecom.Call.Details;
import android.telecom.DisconnectCause;
import android.telecom.GatewayInfo;
import android.telecom.InCallService.VideoCall;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.VideoProfile;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
public class ayo {
    private static final String v;
    private static int w;
    private int A;
    private bcz B;
    private boolean C;
    private PhoneAccountHandle D;
    private final Callback E;
    public final String a;
    public final Call b;
    public final bde c;
    public final String d;
    final List e;
    public final ayr f;
    public final ayq g;
    boolean h;
    int i;
    int j;
    String k;
    String l;
    String m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    boolean t;
    public long u;
    private Uri x;
    private int y;
    private DisconnectCause z;

    static {
        v = String.valueOf(ayo.class.getSimpleName()).concat("_");
        w = 0;
    }

    public ayo(Call call, bde bde) {
        this(call, bde, true);
    }

    public ayo(Call call, boolean z) {
        this(call, new bde(), false);
    }

    private ayo(Call call, bde bde, boolean z) {
        this.a = UUID.randomUUID().toString();
        this.e = new ArrayList();
        this.f = new ayr();
        this.g = new ayq();
        this.y = 0;
        this.j = 0;
        this.n = 0;
        this.E = new ayp(this);
        this.b = call;
        this.c = bde;
        String valueOf = String.valueOf(v);
        int i = w;
        w = i + 1;
        String valueOf2 = String.valueOf(Integer.toString(i));
        this.d = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        a(z);
        if (z) {
            this.b.registerCallback(this.E);
        }
        this.u = System.currentTimeMillis();
    }

    public static boolean a(ayo ayo, ayo ayo2) {
        if (ayo == null && ayo2 == null) {
            return true;
        }
        if (ayo == null || ayo2 == null) {
            return false;
        }
        return ayo.d.equals(ayo2.d);
    }

    public static boolean b(ayo ayo, ayo ayo2) {
        if (ayo == null && ayo2 == null) {
            return true;
        }
        if (ayo == null || ayo2 == null) {
            return false;
        }
        return TextUtils.equals(buf.c(ayo.b), buf.c(ayo2.b));
    }

    final void a() {
        Trace.beginSection("Update");
        int c = c();
        a(true);
        if (c == c() || c() != 10) {
            azs.a.b(this);
        } else {
            azs azs = azs.a;
            if (azs.g(this)) {
                String valueOf = String.valueOf(this);
                bdf.d(azs, new StringBuilder(String.valueOf(valueOf).length() + 14).append("onDisconnect: ").append(valueOf).toString());
                azs.e(this);
                azs.f(this);
            }
        }
        Trace.endSection();
    }

    private final void a(boolean z) {
        int i;
        int i2 = 0;
        String str = "updateFromTelecomCall: ";
        String valueOf = String.valueOf(this.b.toString());
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        bdf.a((Object) this, valueOf);
        switch (this.b.getState()) {
            case rl.c /*0*/:
            case rl.l /*9*/:
                i = 13;
                break;
            case rq.b /*1*/:
                i = 6;
                break;
            case rq.c /*2*/:
                i = 4;
                break;
            case rl.e /*3*/:
                i = 8;
                break;
            case rl.f /*4*/:
                i = 3;
                break;
            case rl.h /*7*/:
                i = 10;
                break;
            case rl.j /*8*/:
                i = 12;
                break;
            case rl.m /*10*/:
                i = 9;
                break;
            default:
                i = 0;
                break;
        }
        if (this.y != 14) {
            a(i);
            a(this.b.getDetails().getDisconnectCause());
            int videoState = this.b.getDetails().getVideoState();
            boolean z2 = this.A != videoState;
            if (this.i == 3 && z2) {
                bdf.b((Object) this, "maybeCancelVideoUpgrade : cancelling upgrade notification");
                d(0);
            }
            this.A = videoState;
        }
        if (z && this.b.getVideoCall() != null) {
            if (this.B == null) {
                this.B = new bcz(this);
            }
            this.b.getVideoCall().registerCallback(this.B);
            this.C = true;
        }
        this.e.clear();
        int size = this.b.getChildren().size();
        while (i2 < size) {
            this.e.add(azs.a.a((Call) this.b.getChildren().get(i2)).d);
            i2++;
        }
        this.g.e = Math.max(size, this.g.e);
        Bundle extras = this.b.getDetails().getExtras();
        if (!(extras == null || a(extras))) {
            if (extras.containsKey("android.telecom.extra.CHILD_ADDRESS")) {
                valueOf = extras.getString("android.telecom.extra.CHILD_ADDRESS");
                if (!Objects.equals(valueOf, this.k)) {
                    this.k = valueOf;
                    azs.a.d(this);
                }
            }
            if (extras.containsKey("android.telecom.extra.LAST_FORWARDED_NUMBER")) {
                ArrayList stringArrayList = extras.getStringArrayList("android.telecom.extra.LAST_FORWARDED_NUMBER");
                if (stringArrayList != null) {
                    valueOf = null;
                    if (!stringArrayList.isEmpty()) {
                        valueOf = (String) stringArrayList.get(stringArrayList.size() - 1);
                    }
                    if (!Objects.equals(valueOf, this.l)) {
                        this.l = valueOf;
                        azs.a.c(this);
                    }
                }
            }
            if (extras.containsKey("android.telecom.extra.CALL_SUBJECT")) {
                valueOf = extras.getString("android.telecom.extra.CALL_SUBJECT");
                if (!Objects.equals(this.m, valueOf)) {
                    this.m = valueOf;
                }
            }
        }
        Uri handle = this.b.getDetails().getHandle();
        if (!Objects.equals(this.x, handle)) {
            this.x = handle;
            this.h = buf.b(this.b);
        }
        PhoneAccountHandle accountHandle = this.b.getDetails().getAccountHandle();
        if (!Objects.equals(this.D, accountHandle)) {
            this.D = accountHandle;
            if (this.D != null) {
                PhoneAccount a = buf.a(bcj.b().n(), this.D);
                if (a != null) {
                    this.t = a.hasCapabilities(64);
                }
            }
        }
    }

    private boolean a(Bundle bundle) {
        try {
            bundle.containsKey("android.telecom.extra.CHILD_ADDRESS");
            return false;
        } catch (Exception e) {
            bdf.a((Object) this, "CallExtras is corrupted, ignoring exception", e);
            return true;
        }
    }

    public final Uri b() {
        return this.b == null ? null : this.b.getDetails().getHandle();
    }

    public final int c() {
        if (this.b == null || this.b.getParent() == null) {
            return this.y;
        }
        return 11;
    }

    public final void a(int i) {
        long j = 0;
        this.y = i;
        if (this.y == 4) {
            this.g.b = true;
        } else if (this.y == 10) {
            ayq ayq = this.g;
            if (g() != 0) {
                j = System.currentTimeMillis() - g();
            }
            ayq.f = j;
        }
    }

    public final int d() {
        return this.b == null ? -1 : this.b.getDetails().getHandlePresentation();
    }

    public final Bundle e() {
        return this.b.getDetails().getIntentExtras();
    }

    public final DisconnectCause f() {
        if (this.y == 10 || this.y == 2) {
            return this.z;
        }
        return new DisconnectCause(0);
    }

    public final void a(DisconnectCause disconnectCause) {
        this.z = disconnectCause;
        this.g.a = this.z;
    }

    public final boolean b(int i) {
        int callCapabilities = this.b.getDetails().getCallCapabilities();
        if ((i & 4) != 0) {
            if (this.b.getConferenceableCalls().isEmpty() && (callCapabilities & 4) == 0) {
                return false;
            }
            i &= -5;
        }
        if (i == (this.b.getDetails().getCallCapabilities() & i)) {
            return true;
        }
        return false;
    }

    public final boolean c(int i) {
        return this.b.getDetails().hasProperty(i);
    }

    public final long g() {
        return this.b.getDetails().getConnectTimeMillis();
    }

    public final GatewayInfo h() {
        return this.b == null ? null : this.b.getDetails().getGatewayInfo();
    }

    public final PhoneAccountHandle i() {
        return this.b == null ? null : this.b.getDetails().getAccountHandle();
    }

    public final VideoCall j() {
        if (this.b == null || !this.C) {
            return null;
        }
        return this.b.getVideoCall();
    }

    public final int k() {
        return this.b.getDetails().getVideoState();
    }

    public final boolean a(Context context) {
        return buf.e(context) && buf.h(k());
    }

    public final void d(int i) {
        Object obj = this.i != i ? 1 : null;
        this.i = i;
        bdf.a((Object) this, "setSessionModificationState " + i + " mSessionModificationState=" + this.i);
        if (obj != null) {
            azs.a.a(this, i);
        }
    }

    public String toString() {
        if (this.b == null) {
            return String.valueOf(this.d);
        }
        String str;
        Locale locale = Locale.US;
        String str2 = "[%s, %s, %s, %s, children:%s, parent:%s, conferenceable:%s, videoState:%s, mSessionModificationState:%d, VideoSettings:%s]";
        Object[] objArr = new Object[10];
        objArr[0] = this.d;
        objArr[1] = buf.g(c());
        objArr[2] = Details.capabilitiesToString(this.b.getDetails().getCallCapabilities());
        objArr[3] = Details.propertiesToString(this.b.getDetails().getCallProperties());
        objArr[4] = this.e;
        Call parent = this.b.getParent();
        if (parent != null) {
            str = azs.a.a(parent).d;
        } else {
            str = null;
        }
        objArr[5] = str;
        objArr[6] = this.b.getConferenceableCalls();
        objArr[7] = VideoProfile.videoStateToString(this.b.getDetails().getVideoState());
        objArr[8] = Integer.valueOf(this.i);
        objArr[9] = this.f;
        return String.format(locale, str2, objArr);
    }

    public final String l() {
        return super.toString();
    }
}
