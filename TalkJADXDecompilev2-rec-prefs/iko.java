package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.libraries.hangouts.video.internal.EncoderManager;
import com.google.api.client.http.HttpStatusCodes;
import java.util.HashSet;
import java.util.Set;

public final class iko {
    private static final Set<String> f17915a;
    private static final iud f17916b = new iud(new iuc(160, 100), 15);
    private static final iud f17917c = new iud(new iuc(320, HttpStatusCodes.STATUS_CODE_OK), 15);
    private static final iud f17918d = new iud(new iuc(480, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), 15);
    private static final iud f17919e = new iud(new iuc(640, 400), 30);
    private static final iud f17920f = new iud(new iuc(960, 600), 30);
    private static final iud f17921g = new iud(new iuc(1280, 800), 30);
    private Context f17922h;
    private boolean f17923i;

    static {
        Set hashSet = new HashSet();
        f17915a = hashSet;
        hashSet.add("armeabi-v7a");
        f17915a.add("arm64-v8a");
        f17915a.add("x86");
    }

    public boolean m22189a(Context context) {
        boolean z = false;
        this.f17922h = context;
        m22187b(0);
        if (EncoderManager.m10309a(this.f17922h, 1)) {
            m22187b(1);
        }
        iks.m22204b();
        if (icb.m21567a(this.f17922h.getContentResolver(), "babel_hangout_supported", true)) {
            if (!this.f17922h.getPackageManager().hasSystemFeature("android.hardware.microphone")) {
                itx.m23277a(5, "vclib", "No microphone available for hangout calls");
            }
            if (f17915a.contains(Build.CPU_ABI) || f17915a.contains(Build.CPU_ABI2)) {
                z = true;
            } else {
                String valueOf = String.valueOf(Build.CPU_ABI);
                String valueOf2 = String.valueOf(Build.CPU_ABI2);
                itx.m23277a(5, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()).append("ABI not supported (").append(valueOf).append(",").append(valueOf2).append(") - disabling hangout calls").toString());
            }
        } else {
            itx.m23277a(5, "vclib", "GServices override - disabling hangout calls");
        }
        this.f17923i = z;
        return this.f17923i;
    }

    public boolean m22188a() {
        return this.f17923i;
    }

    private void m22187b(int i) {
        Object obj;
        Object obj2;
        iud iud;
        boolean z = true;
        iud iud2 = f17917c;
        iud iud3 = f17916b;
        iud iud4 = f17917c;
        int i2 = ikp.f17925b;
        int a = imx.m22316a(this.f17922h, false);
        switch (i) {
            case 0:
                if ((a & 1) == 0) {
                    z = false;
                    break;
                }
                break;
            case 1:
                if ((a & 2) == 0) {
                    z = false;
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        boolean a2 = EncoderManager.m10309a(this.f17922h, i);
        if (i2 >= 2) {
            obj = f17919e;
            if (i2 >= 4) {
                obj = f17920f;
            }
            if (z) {
                obj = f17921g;
            }
            obj2 = f17916b;
            if (z) {
                obj2 = f17917c;
            }
            iud3 = f17918d;
            if (i2 >= 4 || z) {
                iud = f17919e;
            } else {
                iud = iud3;
            }
            if (a2) {
                iud = f17921g;
            }
        } else {
            iud = iud4;
            iud iud5 = iud2;
            iud4 = iud3;
        }
        String a3 = icb.m21564a(this.f17922h.getContentResolver(), "babel_hangout_max_in_primary_video", null);
        if (a3 != null) {
            obj = iud.m23301a(a3);
        }
        a3 = icb.m21564a(this.f17922h.getContentResolver(), "babel_hangout_max_in_secondary_video", null);
        if (a3 != null) {
            obj2 = iud.m23301a(a3);
        }
        a3 = icb.m21564a(this.f17922h.getContentResolver(), "babel_hangout_max_out_nofx_video", null);
        if (a3 != null) {
            iud = iud.m23301a(a3);
        }
        synchronized (iks.f17939a) {
            iks.f17942d.put(Integer.valueOf(i), obj);
        }
        synchronized (iks.f17939a) {
            iks.f17943e.put(Integer.valueOf(i), obj2);
        }
        synchronized (iks.f17939a) {
            iks.f17944f.put(Integer.valueOf(i), iud);
            if (iks.f17941c == null || iud.m23303b() > iks.f17941c.m23303b()) {
                iks.f17941c = iud;
            }
        }
    }

    protected static iud m22186a(int i) {
        if (i > (f17921g.m23303b() + f17920f.m23303b()) / 2) {
            return f17921g;
        }
        if (i > (f17920f.m23303b() + f17919e.m23303b()) / 2) {
            return f17920f;
        }
        if (i > (f17919e.m23303b() + f17918d.m23303b()) / 2) {
            return f17919e;
        }
        if (i > (f17918d.m23303b() + f17917c.m23303b()) / 2) {
            return f17918d;
        }
        return f17917c;
    }
}
