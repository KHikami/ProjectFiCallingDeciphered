package p000;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;

public final class frm {
    static final boolean f13816a = false;
    public static volatile frm f13817b;
    final Object f13818c = new Object();
    int f13819d = 0;
    Set<fsr> f13820e = null;
    private final gui f13821f;

    static {
        kae kae = glk.f15570q;
    }

    public static String m16047a(Long l) {
        String valueOf = String.valueOf("gmscontact:");
        String valueOf2 = String.valueOf(String.valueOf(l));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static boolean m16048a(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("gmscontact:");
    }

    public frm() {
        guj guj = new guj(gwb.m1400H());
        guj.m18640a(hsj.f17166c, new hsm().m20771a(117).m20770a());
        guj.m18641a(new frn(this));
        guj.m18642a(new fro(this));
        this.f13821f = guj.m18645b();
    }

    public void m16050a(fsr fsr) {
        Object obj;
        iil.m21876b();
        synchronized (this.f13818c) {
            this.f13819d++;
            if (this.f13821f.mo2524e()) {
                obj = 1;
            } else {
                if (!this.f13821f.mo2525f()) {
                    this.f13821f.mo2518b();
                }
                obj = null;
            }
            if (obj == null) {
                if (this.f13820e == null) {
                    this.f13820e = new HashSet();
                }
                this.f13820e.add(fsr);
            }
        }
        if (obj != null) {
            m16052b(fsr);
        }
    }

    void m16052b(fsr fsr) {
        String l = fsr.m5508n().m5539l();
        if (frm.m16048a(l)) {
            Object substring = l.substring(11);
            if (TextUtils.isEmpty(substring)) {
                glk.m17982e("Babel_medialoader", "GmsAvatarLoader: Empty contact id in gms url", new Object[0]);
                m16051a(fsr, null);
                return;
            }
            try {
                hsj.f17170g.m20761a(this.f13821f, Long.parseLong(substring)).mo2419a(new frp(this, fsr));
                return;
            } catch (NumberFormatException e) {
                glk.m17982e("Babel_medialoader", "GmsAvatarLoader: Invalid contact id.", new Object[0]);
                m16051a(fsr, null);
                return;
            }
        }
        glk.m17982e("Babel_medialoader", "GmsAvatarLoader: Not a valid gms url", new Object[0]);
        m16051a(fsr, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m16049a(Status status, ParcelFileDescriptor parcelFileDescriptor, fsr fsr) {
        byte[] bArr = null;
        if (!status.m9663d() || parcelFileDescriptor == null) {
            if (f13816a) {
                String valueOf = String.valueOf(status);
                String valueOf2 = String.valueOf(parcelFileDescriptor);
                glk.m17970a("Babel_medialoader", new StringBuilder((String.valueOf(valueOf).length() + 45) + String.valueOf(valueOf2).length()).append("GmsAvatarLoader: Avatar loaded: status=").append(valueOf).append("  pfd=").append(valueOf2).toString(), new Object[0]);
            }
            m16051a(fsr, null);
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            int available = fileInputStream.available();
            byte[] bArr2 = new byte[available];
            if (fileInputStream.read(bArr2) >= available) {
                bArr = bArr2;
            }
            try {
                fileInputStream.close();
            } catch (Throwable e) {
                glk.m17980d("Babel_medialoader", "Error closing avatar file for contact.", e);
            }
        } catch (Throwable e2) {
            glk.m17980d("Babel_medialoader", "Error reading avatar file for contact.", e2);
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable e22) {
                glk.m17980d("Babel_medialoader", "Error closing avatar file for contact.", e22);
            }
        }
        m16051a(fsr, bArr);
    }

    void m16051a(fsr fsr, byte[] bArr) {
        fsi fsi = (fsi) jyn.m25426a(gwb.m1400H(), fsi.class);
        if (bArr != null) {
            fsi.m16137a(fsr, new fsh(bArr, "image/jpeg", false));
        } else {
            fsi.m16143b(fsr);
        }
        synchronized (this.f13818c) {
            this.f13819d--;
            if (this.f13819d == 0 && (this.f13821f.mo2524e() || this.f13821f.mo2525f())) {
                this.f13821f.mo2523d();
            }
        }
    }
}
