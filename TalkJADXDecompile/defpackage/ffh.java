package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: ffh */
public final class ffh {
    private static final boolean b;
    private static final String[] c;
    private static volatile ffh j;
    public volatile int a;
    private final Context d;
    private final SharedPreferences e;
    private String f;
    private long g;
    private List<Runnable> h;
    private volatile int i;

    static {
        kae kae = glk.o;
        b = false;
        c = new String[]{"Uninit", "RegSent", "Registered", "RegFailed"};
        j = null;
    }

    public static synchronized void a(Context context) {
        synchronized (ffh.class) {
            if (j != null) {
                glk.d("BabelGcmRegistration", "GcmRegistration.initialize() called twice", new Object[0]);
            } else {
                ffh ffh = new ffh(context);
                j = ffh;
                synchronized (ffh) {
                    j.h();
                }
            }
        }
    }

    public static ffh a() {
        if (j == null) {
            glk.e("BabelGcmRegistration", "GcmRegistration.initialize() should be called called first", new Object[0]);
        }
        return j;
    }

    private ffh(Context context) {
        this.h = new ArrayList();
        this.d = context;
        this.e = context.getSharedPreferences("gcm", 0);
        this.f = this.e.getString("gcm_registration_id", null);
        this.a = this.e.getInt("gcm_registration_state", 100);
        this.i = this.e.getInt("gcm_retry_strategy", 0);
        this.g = this.e.getLong("gcm_android_id", -1);
    }

    public synchronized long b() {
        return this.g;
    }

    public boolean c() {
        boolean z;
        synchronized (this) {
            z = this.a == 102;
        }
        return z;
    }

    public boolean d() {
        synchronized (this) {
            long j = this.e.getLong("gcm_registration_timestamp", 0);
            boolean z = j > 0 && glj.a() - j > TimeUnit.MILLISECONDS.convert(gwb.a(this.d, "babel_ac_registration_renew_window_seconds", fls.a), TimeUnit.SECONDS);
            if (this.a == 103 || this.a == 100 || z) {
                return true;
            }
            if (this.a == 102 && gwb.a(this.d, "babel_android_id_check", true)) {
                j = giw.a();
                if (j != this.g) {
                    if (b) {
                        new StringBuilder(81).append("mismatch android id ").append(j).append(" with GCM android ID ").append(this.g);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public String e() {
        String str;
        synchronized (this) {
            if (this.a != 102) {
                String valueOf = String.valueOf("Getting GCM registration. Expected,Actual state=102,");
                glk.e("BabelGcmRegistration", new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString(), new Object[0]);
                str = null;
            } else {
                str = this.f;
            }
        }
        return str;
    }

    void a(String str) {
        int i = 1;
        synchronized (this) {
            if (this.a != 101) {
                String valueOf = String.valueOf("Setting GCM registration. Expected,Actual state=101,");
                glk.d("BabelGcmRegistration", new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString(), new Object[0]);
            }
            if (this.g == giw.a()) {
                a(str, 102);
                a(0);
            } else {
                j();
                i = 0;
            }
        }
        if (i == 0) {
            glk.d("BabelGcmRegistration", "Ignoring GCM registration due to android_id mismatch. Retrying", new Object[0]);
            g();
            return;
        }
        String str2 = "BabelGcmRegistration";
        valueOf = "Start registration for accounts on the device with registration string ";
        String valueOf2 = String.valueOf(str);
        glk.c(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
        fde.m();
        ArrayList arrayList = new ArrayList(this.h);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
    }

    public void f() {
        synchronized (this) {
            if (this.i == 1) {
                a(0);
            }
        }
    }

    private void a(int i) {
        if (glk.a("BabelGcmRegistration", 3)) {
            glk.a("BabelGcmRegistration", "GcmRegistration: set retryStrategy=" + i, new Object[0]);
        }
        this.i = i;
        Editor edit = this.e.edit();
        edit.putInt("gcm_retry_strategy", i);
        edit.apply();
    }

    public void g() {
        if (glk.a("BabelGcmRegistration", 3)) {
            String str = "BabelGcmRegistration";
            String str2 = "Retry GcmRegistration. Current state: ";
            String valueOf = String.valueOf(ffh.b(this.a));
            glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        synchronized (this) {
            if (this.a != 101) {
                this.a = 101;
                this.g = giw.a();
                ffh.b(this.d);
            }
        }
    }

    public synchronized void h() {
        glk.a("BabelGcmRegistration", "GcmRegistration: Checking GCM registration", new Object[0]);
        if (this.a != 102 || gwb.a(this.d, "babel_android_id_check", true)) {
            if (d()) {
                int i;
                glk.a("BabelGcmRegistration", "GcmRegistration: Requesting GCM registration", new Object[0]);
                fde.a();
                fde.d(8);
                for (fdh o : fde.b.values()) {
                    o.o();
                }
                if (fde.n()) {
                    i = 2;
                } else {
                    i = 1;
                }
                a(i);
                this.g = giw.a();
                this.a = 101;
                ffh.b(this.d);
            }
        }
    }

    private static void b(Context context) {
        glk.b("BabelGcmRegistration", "requestGcmRegistrationId", new Object[0]);
        new ffi(context).execute(new Void[]{null, null, null});
    }

    public static void i() {
        ffh a = ffh.a();
        synchronized (a) {
            if (a.a == 102) {
                glk.a("BabelGcmRegistration", "GcmRegistration: Forcing re-registration", new Object[0]);
                a.a(null, 100);
                a.h();
            }
        }
    }

    void j() {
        synchronized (this) {
            a(null, 103);
        }
    }

    public void a(String str, int i) {
        this.f = str;
        this.a = i;
        Editor edit = this.e.edit();
        edit.putLong("gcm_android_id", this.g);
        edit.putString("gcm_registration_id", this.f);
        edit.putInt("gcm_registration_state", this.a);
        if (i == 102) {
            edit.putLong("gcm_registration_timestamp", glj.a());
        }
        edit.apply();
    }

    private static String b(int i) {
        if (i < 100 || i > 103) {
            return Integer.toString(i);
        }
        return c[i - 100];
    }

    public void a(PrintWriter printWriter) {
        synchronized (this) {
            String valueOf = String.valueOf(ffh.b(this.a));
            String str = this.f;
            printWriter.println(new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(str).length()).append("GCM Registration state: ").append(valueOf).append(", reg: ").append(str).toString());
        }
    }

    public synchronized void k() {
        if (!(this.a == 102 && this.g == giw.a())) {
            String valueOf = String.valueOf(ffh.b(this.a));
            glk.d("BabelGcmRegistration", new StringBuilder(String.valueOf(valueOf).length() + 73).append("State: ").append(valueOf).append("; not registered or Android Id mismatch. Force new GcmRegistration").toString(), new Object[0]);
            a(null, 100);
            h();
        }
    }
}
