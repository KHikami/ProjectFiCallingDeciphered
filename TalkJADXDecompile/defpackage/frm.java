package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: frm */
public final class frm {
    static final boolean a;
    public static volatile frm b;
    final Object c;
    int d;
    Set<fsr> e;
    private final gui f;

    static {
        kae kae = glk.q;
        a = false;
    }

    public static String a(Long l) {
        String valueOf = String.valueOf("gmscontact:");
        String valueOf2 = String.valueOf(String.valueOf(l));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("gmscontact:");
    }

    public frm() {
        this.c = new Object();
        this.d = 0;
        this.e = null;
        guj guj = new guj(gwb.H());
        guj.a(hsj.c, new hsm().a(117).a());
        guj.a(new frn(this));
        guj.a(new fro(this));
        this.f = guj.b();
    }

    public void a(fsr fsr) {
        iil.b();
        synchronized (this.c) {
            Object obj;
            this.d++;
            if (this.f.e()) {
                obj = 1;
            } else {
                if (!this.f.f()) {
                    this.f.b();
                }
                obj = null;
            }
            if (obj == null) {
                if (this.e == null) {
                    this.e = new HashSet();
                }
                this.e.add(fsr);
            }
        }
        if (obj != null) {
            b(fsr);
        }
    }

    void b(fsr fsr) {
        String l = fsr.n().l();
        if (frm.a(l)) {
            Object substring = l.substring(11);
            if (TextUtils.isEmpty(substring)) {
                glk.e("Babel_medialoader", "GmsAvatarLoader: Empty contact id in gms url", new Object[0]);
                a(fsr, null);
                return;
            }
            try {
                hsj.g.a(this.f, Long.parseLong(substring)).a(new frp(this, fsr));
                return;
            } catch (NumberFormatException e) {
                glk.e("Babel_medialoader", "GmsAvatarLoader: Invalid contact id.", new Object[0]);
                a(fsr, null);
                return;
            }
        }
        glk.e("Babel_medialoader", "GmsAvatarLoader: Not a valid gms url", new Object[0]);
        a(fsr, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(com.google.android.gms.common.api.Status r8, android.os.ParcelFileDescriptor r9, defpackage.fsr r10) {
        /*
        r7 = this;
        r0 = 0;
        r1 = r8.d();
        if (r1 == 0) goto L_0x0009;
    L_0x0007:
        if (r9 != 0) goto L_0x0051;
    L_0x0009:
        r1 = a;
        if (r1 == 0) goto L_0x004d;
    L_0x000d:
        r1 = "Babel_medialoader";
        r2 = java.lang.String.valueOf(r8);
        r3 = java.lang.String.valueOf(r9);
        r4 = new java.lang.StringBuilder;
        r5 = java.lang.String.valueOf(r2);
        r5 = r5.length();
        r5 = r5 + 45;
        r6 = java.lang.String.valueOf(r3);
        r6 = r6.length();
        r5 = r5 + r6;
        r4.<init>(r5);
        r5 = "GmsAvatarLoader: Avatar loaded: status=";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = "  pfd=";
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = 0;
        r3 = new java.lang.Object[r3];
        defpackage.glk.a(r1, r2, r3);
    L_0x004d:
        r7.a(r10, r0);
    L_0x0050:
        return;
    L_0x0051:
        r2 = new java.io.FileInputStream;
        r1 = r9.getFileDescriptor();
        r2.<init>(r1);
        r3 = r2.available();	 Catch:{ IOException -> 0x0076 }
        r1 = new byte[r3];	 Catch:{ IOException -> 0x0076 }
        r4 = r2.read(r1);	 Catch:{ IOException -> 0x0076 }
        if (r4 >= r3) goto L_0x0099;
    L_0x0066:
        r2.close();	 Catch:{ IOException -> 0x006d }
    L_0x0069:
        r7.a(r10, r0);
        goto L_0x0050;
    L_0x006d:
        r1 = move-exception;
        r2 = "Babel_medialoader";
        r3 = "Error closing avatar file for contact.";
        defpackage.glk.d(r2, r3, r1);
        goto L_0x0069;
    L_0x0076:
        r1 = move-exception;
        r3 = "Babel_medialoader";
        r4 = "Error reading avatar file for contact.";
        defpackage.glk.d(r3, r4, r1);	 Catch:{ all -> 0x008b }
        r2.close();	 Catch:{ IOException -> 0x0082 }
        goto L_0x0069;
    L_0x0082:
        r1 = move-exception;
        r2 = "Babel_medialoader";
        r3 = "Error closing avatar file for contact.";
        defpackage.glk.d(r2, r3, r1);
        goto L_0x0069;
    L_0x008b:
        r0 = move-exception;
        r2.close();	 Catch:{ IOException -> 0x0090 }
    L_0x008f:
        throw r0;
    L_0x0090:
        r1 = move-exception;
        r2 = "Babel_medialoader";
        r3 = "Error closing avatar file for contact.";
        defpackage.glk.d(r2, r3, r1);
        goto L_0x008f;
    L_0x0099:
        r0 = r1;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: frm.a(com.google.android.gms.common.api.Status, android.os.ParcelFileDescriptor, fsr):void");
    }

    void a(fsr fsr, byte[] bArr) {
        fsi fsi = (fsi) jyn.a(gwb.H(), fsi.class);
        if (bArr != null) {
            fsi.a(fsr, new fsh(bArr, "image/jpeg", false));
        } else {
            fsi.b(fsr);
        }
        synchronized (this.c) {
            this.d--;
            if (this.d == 0 && (this.f.e() || this.f.f())) {
                this.f.d();
            }
        }
    }
}
