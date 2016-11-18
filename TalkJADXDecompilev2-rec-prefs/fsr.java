package p000;

import android.os.Environment;
import java.io.File;

public abstract class fsr extends frj {
    private final Object f3554a;
    final boolean f3555e;
    public gkh f3556f;
    final String f3557g;
    fss f3558h;

    public abstract fsq mo595a(byte[] bArr);

    public abstract void mo597a(fsq fsq, boolean z);

    public abstract boolean mo598e();

    public abstract boolean mo599f();

    public abstract void mo600g();

    public abstract void mo601h();

    public abstract fsh m_();

    public fsr(boolean z, gkh gkh, String str, Object obj) {
        this.f3554a = obj;
        this.f3555e = z;
        this.f3556f = gkh;
        this.f3557g = str;
    }

    public Object m5506l() {
        return this.f3554a;
    }

    public String m5507m() {
        return this.f3556f.m5540m();
    }

    public gkh m5508n() {
        return this.f3556f;
    }

    public boolean m5509o() {
        return this.f3555e;
    }

    public String mo594c() {
        return this.f3556f.m5544q();
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        String p000_gkh = this.f3556f == null ? " None" : this.f3556f.toString();
        boolean f = mo599f();
        return new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(p000_gkh).length()).append(valueOf).append(" MediaUrl:").append(p000_gkh).append(" cacheable=").append(f).append(" cancelled=").append(m5495k()).append(" shouldUseLoaderQueue=").append(mo606a()).toString();
    }

    public boolean mo606a() {
        return true;
    }

    public File mo635j() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    public void mo634a(String str) {
    }
}
