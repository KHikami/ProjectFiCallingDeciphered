package p000;

import android.util.Log;
import java.io.InputStream;

final class jjl {
    private final jjb f20285a;

    jjl(jjb jjb) {
        this.f20285a = jjb;
    }

    protected jjc m24451a(InputStream inputStream) {
        jjh a = jjh.m24419a(inputStream, this.f20285a);
        jjc jjc = new jjc(a.m24450k());
        for (int a2 = a.m24437a(); a2 != 6; a2 = a.m24437a()) {
            jjm c;
            byte[] bArr;
            switch (a2) {
                case 0:
                    jjc.m24391a(new jjn(a.m24443d()));
                    break;
                case 1:
                    c = a.m24442c();
                    if (!c.m24481f()) {
                        a.m24439a(c);
                        break;
                    }
                    jjc.m24395b(c.m24463a()).m24488a(c);
                    break;
                case 2:
                    c = a.m24442c();
                    if (c.m24474c() == (short) 7) {
                        a.m24441b(c);
                    }
                    jjc.m24395b(c.m24463a()).m24488a(c);
                    break;
                case 3:
                    a2 = a.m24446g();
                    if (a2 < 0) {
                        if (!Log.isLoggable("ExifReader", 6)) {
                            break;
                        }
                        Log.e("ExifReader", "Found negative image size for compressed thumbnail");
                        break;
                    }
                    bArr = new byte[a2];
                    if (bArr.length != a.m24438a(bArr)) {
                        if (!Log.isLoggable("ExifReader", 5)) {
                            break;
                        }
                        break;
                    }
                    jjc.m24397b(bArr);
                    break;
                case 4:
                    bArr = new byte[a.m24445f()];
                    if (bArr.length != a.m24438a(bArr)) {
                        if (!Log.isLoggable("ExifReader", 5)) {
                            break;
                        }
                        break;
                    }
                    jjc.m24390a(a.m24444e(), bArr);
                    break;
                case 5:
                    jjc.m24392a(a.m24447h());
                    break;
                default:
                    break;
            }
        }
        return jjc;
    }
}
