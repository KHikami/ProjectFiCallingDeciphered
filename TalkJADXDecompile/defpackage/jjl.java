package defpackage;

import android.util.Log;
import java.io.InputStream;

/* renamed from: jjl */
final class jjl {
    private final jjb a;

    jjl(jjb jjb) {
        this.a = jjb;
    }

    protected jjc a(InputStream inputStream) {
        jjh a = jjh.a(inputStream, this.a);
        jjc jjc = new jjc(a.k());
        for (int a2 = a.a(); a2 != 6; a2 = a.a()) {
            jjm c;
            byte[] bArr;
            switch (a2) {
                case wi.w /*0*/:
                    jjc.a(new jjn(a.d()));
                    break;
                case wi.j /*1*/:
                    c = a.c();
                    if (!c.f()) {
                        a.a(c);
                        break;
                    }
                    jjc.b(c.a()).a(c);
                    break;
                case wi.l /*2*/:
                    c = a.c();
                    if (c.c() == (short) 7) {
                        a.b(c);
                    }
                    jjc.b(c.a()).a(c);
                    break;
                case wi.z /*3*/:
                    a2 = a.g();
                    if (a2 < 0) {
                        if (!Log.isLoggable("ExifReader", 6)) {
                            break;
                        }
                        Log.e("ExifReader", "Found negative image size for compressed thumbnail");
                        break;
                    }
                    bArr = new byte[a2];
                    if (bArr.length != a.a(bArr)) {
                        if (!Log.isLoggable("ExifReader", 5)) {
                            break;
                        }
                        break;
                    }
                    jjc.b(bArr);
                    break;
                case wi.h /*4*/:
                    bArr = new byte[a.f()];
                    if (bArr.length != a.a(bArr)) {
                        if (!Log.isLoggable("ExifReader", 5)) {
                            break;
                        }
                        break;
                    }
                    jjc.a(a.e(), bArr);
                    break;
                case wi.p /*5*/:
                    jjc.a(a.h());
                    break;
                default:
                    break;
            }
        }
        return jjc;
    }
}
