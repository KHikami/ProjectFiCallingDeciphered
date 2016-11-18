package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Deprecated
public final class ffh {
    private static final boolean f12966b = false;
    private static final String[] f12967c = new String[]{"Uninit", "RegSent", "Registered", "RegFailed"};
    private static volatile ffh f12968j = null;
    public volatile int f12969a;
    private final Context f12970d;
    private final SharedPreferences f12971e;
    private String f12972f;
    private long f12973g;
    private List<Runnable> f12974h = new ArrayList();
    private volatile int f12975i;

    static {
        kae kae = glk.f15568o;
    }

    public static synchronized void m15194a(Context context) {
        synchronized (ffh.class) {
            if (f12968j != null) {
                glk.m17981d("BabelGcmRegistration", "GcmRegistration.initialize() called twice", new Object[0]);
            } else {
                ffh ffh = new ffh(context);
                f12968j = ffh;
                synchronized (ffh) {
                    f12968j.m15207h();
                }
            }
        }
    }

    public static ffh m15192a() {
        if (f12968j == null) {
            glk.m17982e("BabelGcmRegistration", "GcmRegistration.initialize() should be called called first", new Object[0]);
        }
        return f12968j;
    }

    private ffh(Context context) {
        this.f12970d = context;
        this.f12971e = context.getSharedPreferences("gcm", 0);
        this.f12972f = this.f12971e.getString("gcm_registration_id", null);
        this.f12969a = this.f12971e.getInt("gcm_registration_state", 100);
        this.f12975i = this.f12971e.getInt("gcm_retry_strategy", 0);
        this.f12973g = this.f12971e.getLong("gcm_android_id", -1);
    }

    public synchronized long m15201b() {
        return this.f12973g;
    }

    public boolean m15202c() {
        boolean z;
        synchronized (this) {
            z = this.f12969a == 102;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m15203d() {
        synchronized (this) {
            long j = this.f12971e.getLong("gcm_registration_timestamp", 0);
            boolean z = j > 0 && glj.m17956a() - j > TimeUnit.MILLISECONDS.convert(gwb.m1519a(this.f12970d, "babel_ac_registration_renew_window_seconds", fls.f13424a), TimeUnit.SECONDS);
            if (this.f12969a == 103 || this.f12969a == 100 || z) {
            } else {
                if (this.f12969a == 102 && gwb.m1906a(this.f12970d, "babel_android_id_check", true)) {
                    j = giw.m17752a();
                    if (j != this.f12973g) {
                        if (f12966b) {
                            new StringBuilder(81).append("mismatch android id ").append(j).append(" with GCM android ID ").append(this.f12973g);
                        }
                    }
                }
                return false;
            }
        }
    }

    public String m15204e() {
        String str;
        synchronized (this) {
            if (this.f12969a != 102) {
                String valueOf = String.valueOf("Getting GCM registration. Expected,Actual state=102,");
                glk.m17982e("BabelGcmRegistration", new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f12969a).toString(), new Object[0]);
                str = null;
            } else {
                str = this.f12972f;
            }
        }
        return str;
    }

    void m15199a(String str) {
        int i = 1;
        synchronized (this) {
            if (this.f12969a != 101) {
                String valueOf = String.valueOf("Setting GCM registration. Expected,Actual state=101,");
                glk.m17981d("BabelGcmRegistration", new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f12969a).toString(), new Object[0]);
            }
            if (this.f12973g == giw.m17752a()) {
                m15200a(str, 102);
                m15193a(0);
            } else {
                m15208j();
                i = 0;
            }
        }
        if (i == 0) {
            glk.m17981d("BabelGcmRegistration", "Ignoring GCM registration due to android_id mismatch. Retrying", new Object[0]);
            m15206g();
            return;
        }
        String str2 = "BabelGcmRegistration";
        valueOf = "Start registration for accounts on the device with registration string ";
        String valueOf2 = String.valueOf(str);
        glk.m17979c(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
        fde.m15035m();
        ArrayList arrayList = new ArrayList(this.f12974h);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
    }

    public void m15205f() {
        synchronized (this) {
            if (this.f12975i == 1) {
                m15193a(0);
            }
        }
    }

    private void m15193a(int i) {
        if (glk.m17973a("BabelGcmRegistration", 3)) {
            glk.m17970a("BabelGcmRegistration", "GcmRegistration: set retryStrategy=" + i, new Object[0]);
        }
        this.f12975i = i;
        Editor edit = this.f12971e.edit();
        edit.putInt("gcm_retry_strategy", i);
        edit.apply();
    }

    public void m15206g() {
        if (glk.m17973a("BabelGcmRegistration", 3)) {
            String str = "BabelGcmRegistration";
            String str2 = "Retry GcmRegistration. Current state: ";
            String valueOf = String.valueOf(ffh.m15195b(this.f12969a));
            glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        synchronized (this) {
            if (this.f12969a != 101) {
                this.f12969a = 101;
                this.f12973g = giw.m17752a();
                ffh.m15196b(this.f12970d);
            }
        }
    }

    public synchronized void m15207h() {
        glk.m17970a("BabelGcmRegistration", "GcmRegistration: Checking GCM registration", new Object[0]);
        if (this.f12969a != 102 || gwb.m1906a(this.f12970d, "babel_android_id_check", true)) {
            if (m15203d()) {
                int i;
                glk.m17970a("BabelGcmRegistration", "GcmRegistration: Requesting GCM registration", new Object[0]);
                fde.m14996a();
                fde.m15017d(8);
                for (fdh o : fde.f12725b.values()) {
                    o.m15062o();
                }
                if (fde.m15036n()) {
                    i = 2;
                } else {
                    i = 1;
                }
                m15193a(i);
                this.f12973g = giw.m17752a();
                this.f12969a = 101;
                ffh.m15196b(this.f12970d);
            }
        }
    }

    private static void m15196b(Context context) {
        glk.m17976b("BabelGcmRegistration", "requestGcmRegistrationId", new Object[0]);
        new ffi(context).execute(new Void[]{null, null, null});
    }

    public static void m15197i() {
        ffh a = ffh.m15192a();
        synchronized (a) {
            if (a.f12969a == 102) {
                glk.m17970a("BabelGcmRegistration", "GcmRegistration: Forcing re-registration", new Object[0]);
                a.m15200a(null, 100);
                a.m15207h();
            }
        }
    }

    void m15208j() {
        synchronized (this) {
            m15200a(null, 103);
        }
    }

    public void m15200a(String str, int i) {
        this.f12972f = str;
        this.f12969a = i;
        Editor edit = this.f12971e.edit();
        edit.putLong("gcm_android_id", this.f12973g);
        edit.putString("gcm_registration_id", this.f12972f);
        edit.putInt("gcm_registration_state", this.f12969a);
        if (i == 102) {
            edit.putLong("gcm_registration_timestamp", glj.m17956a());
        }
        edit.apply();
    }

    private static String m15195b(int i) {
        if (i < 100 || i > 103) {
            return Integer.toString(i);
        }
        return f12967c[i - 100];
    }

    public void m15198a(PrintWriter printWriter) {
        synchronized (this) {
            String valueOf = String.valueOf(ffh.m15195b(this.f12969a));
            String str = this.f12972f;
            printWriter.println(new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(str).length()).append("GCM Registration state: ").append(valueOf).append(", reg: ").append(str).toString());
        }
    }

    public synchronized void m15209k() {
        if (!(this.f12969a == 102 && this.f12973g == giw.m17752a())) {
            String valueOf = String.valueOf(ffh.m15195b(this.f12969a));
            glk.m17981d("BabelGcmRegistration", new StringBuilder(String.valueOf(valueOf).length() + 73).append("State: ").append(valueOf).append("; not registered or Android Id mismatch. Force new GcmRegistration").toString(), new Object[0]);
            m15200a(null, 100);
            m15207h();
        }
    }
}
