package defpackage;

import android.os.Environment;
import java.io.File;

public abstract class fsr extends frj {
    private final Object a;
    final boolean e;
    public gkh f;
    final String g;
    fss h;

    public abstract fsq a(byte[] bArr);

    public abstract void a(fsq fsq, boolean z);

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract fsh m_();

    public fsr(boolean z, gkh gkh, String str, Object obj) {
        this.a = obj;
        this.e = z;
        this.f = gkh;
        this.g = str;
    }

    public Object l() {
        return this.a;
    }

    public String m() {
        return this.f.m();
    }

    public gkh n() {
        return this.f;
    }

    public boolean o() {
        return this.e;
    }

    public String c() {
        return this.f.q();
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        String defpackage_gkh = this.f == null ? " None" : this.f.toString();
        boolean f = f();
        return new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(defpackage_gkh).length()).append(valueOf).append(" MediaUrl:").append(defpackage_gkh).append(" cacheable=").append(f).append(" cancelled=").append(k()).append(" shouldUseLoaderQueue=").append(a()).toString();
    }

    public boolean a() {
        return true;
    }

    public File j() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    public void a(String str) {
    }
}
