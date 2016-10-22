import android.content.Context;
import android.os.Build;
import com.google.android.libraries.hangouts.video.internal.EncoderManager;
import com.google.api.client.http.HttpStatusCodes;
import java.util.HashSet;
import java.util.Set;

public final class iko {
    private static final Set<String> a;
    private static final iud b;
    private static final iud c;
    private static final iud d;
    private static final iud e;
    private static final iud f;
    private static final iud g;
    private Context h;
    private boolean i;

    static {
        Set hashSet = new HashSet();
        a = hashSet;
        hashSet.add("armeabi-v7a");
        a.add("arm64-v8a");
        a.add("x86");
        b = new iud(new iuc(160, 100), 15);
        c = new iud(new iuc(320, HttpStatusCodes.STATUS_CODE_OK), 15);
        d = new iud(new iuc(480, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), 15);
        e = new iud(new iuc(640, 400), 30);
        f = new iud(new iuc(960, 600), 30);
        g = new iud(new iuc(1280, 800), 30);
    }

    public boolean a(Context context) {
        boolean z = false;
        this.h = context;
        b(0);
        if (EncoderManager.a(this.h, 1)) {
            b(1);
        }
        iks.b();
        if (icb.a(this.h.getContentResolver(), "babel_hangout_supported", true)) {
            if (!this.h.getPackageManager().hasSystemFeature("android.hardware.microphone")) {
                itx.a(5, "vclib", "No microphone available for hangout calls");
            }
            if (a.contains(Build.CPU_ABI) || a.contains(Build.CPU_ABI2)) {
                z = true;
            } else {
                String valueOf = String.valueOf(Build.CPU_ABI);
                String valueOf2 = String.valueOf(Build.CPU_ABI2);
                itx.a(5, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()).append("ABI not supported (").append(valueOf).append(",").append(valueOf2).append(") - disabling hangout calls").toString());
            }
        } else {
            itx.a(5, "vclib", "GServices override - disabling hangout calls");
        }
        this.i = z;
        return this.i;
    }

    public boolean a() {
        return this.i;
    }

    private void b(int i) {
        Object obj;
        Object obj2;
        iud iud;
        boolean z = true;
        iud iud2 = c;
        iud iud3 = b;
        iud iud4 = c;
        int i2 = ikp.b;
        int a = imx.a(this.h, false);
        switch (i) {
            case wi.w /*0*/:
                if ((a & 1) == 0) {
                    z = false;
                    break;
                }
                break;
            case wi.j /*1*/:
                if ((a & 2) == 0) {
                    z = false;
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        boolean a2 = EncoderManager.a(this.h, i);
        if (i2 >= 2) {
            obj = e;
            if (i2 >= 4) {
                obj = f;
            }
            if (z) {
                obj = g;
            }
            obj2 = b;
            if (z) {
                obj2 = c;
            }
            iud3 = d;
            if (i2 >= 4 || z) {
                iud = e;
            } else {
                iud = iud3;
            }
            if (a2) {
                iud = g;
            }
        } else {
            iud = iud4;
            iud iud5 = iud2;
            iud4 = iud3;
        }
        String a3 = icb.a(this.h.getContentResolver(), "babel_hangout_max_in_primary_video", null);
        if (a3 != null) {
            obj = iud.a(a3);
        }
        a3 = icb.a(this.h.getContentResolver(), "babel_hangout_max_in_secondary_video", null);
        if (a3 != null) {
            obj2 = iud.a(a3);
        }
        a3 = icb.a(this.h.getContentResolver(), "babel_hangout_max_out_nofx_video", null);
        if (a3 != null) {
            iud = iud.a(a3);
        }
        synchronized (iks.a) {
            iks.d.put(Integer.valueOf(i), obj);
        }
        synchronized (iks.a) {
            iks.e.put(Integer.valueOf(i), obj2);
        }
        synchronized (iks.a) {
            iks.f.put(Integer.valueOf(i), iud);
            if (iks.c == null || iud.b() > iks.c.b()) {
                iks.c = iud;
            }
        }
    }

    protected static iud a(int i) {
        if (i > (g.b() + f.b()) / 2) {
            return g;
        }
        if (i > (f.b() + e.b()) / 2) {
            return f;
        }
        if (i > (e.b() + d.b()) / 2) {
            return e;
        }
        if (i > (d.b() + c.b()) / 2) {
            return d;
        }
        return c;
    }
}
