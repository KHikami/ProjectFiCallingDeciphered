package p000;

import android.util.Log;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

final class jje {
    private final ByteBuffer f20238a;
    private final jjc f20239b;
    private final List<jjf> f20240c = new ArrayList();
    private final jjb f20241d;
    private int f20242e;

    protected jje(ByteBuffer byteBuffer, jjb jjb) {
        Throwable th;
        this.f20238a = byteBuffer;
        this.f20242e = byteBuffer.position();
        this.f20241d = jjb;
        Closeable jiz;
        try {
            jiz = new jiz(byteBuffer);
            try {
                jjh a = jjh.m24419a((InputStream) jiz, this.f20241d);
                this.f20239b = new jjc(a.m24450k());
                this.f20242e = a.m24449j() + this.f20242e;
                this.f20238a.position(0);
                jjb.m24361a(jiz);
            } catch (Throwable th2) {
                th = th2;
                jjb.m24361a(jiz);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jiz = null;
            jjb.m24361a(jiz);
            throw th;
        }
    }

    private ByteOrder m24405b() {
        return this.f20239b.m24403g();
    }

    protected boolean m24407a() {
        Throwable th;
        Closeable closeable;
        try {
            int i;
            Closeable jiz = new jiz(this.f20238a);
            jjn[] jjnArr = new jjn[]{this.f20239b.m24395b(0), this.f20239b.m24395b(1), this.f20239b.m24395b(2), this.f20239b.m24395b(3), this.f20239b.m24395b(4)};
            if (jjnArr[0] != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (jjnArr[1] != null) {
                i |= 2;
            }
            if (jjnArr[2] != null) {
                i |= 4;
            }
            if (jjnArr[4] != null) {
                i |= 8;
            }
            if (jjnArr[3] != null) {
                i |= 16;
            }
            jjh jjh = new jjh(jiz, i, this.f20241d);
            jjn jjn = null;
            for (int a = jjh.m24437a(); a != 6; a = jjh.m24437a()) {
                switch (a) {
                    case 0:
                        jjn = jjnArr[jjh.m24443d()];
                        if (jjn != null) {
                            break;
                        }
                        jjh.m24440b();
                        break;
                    case 1:
                        jjm c = jjh.m24442c();
                        jjm a2 = jjn.m24489a(c.m24471b());
                        if (a2 != null) {
                            if (a2.m24478e() == c.m24478e() && a2.m24474c() == c.m24474c()) {
                                try {
                                    this.f20240c.add(new jjf(a2, c.m24486j()));
                                    jjn.m24493b(c.m24471b());
                                    if (jjn.m24494c() != 0) {
                                        break;
                                    }
                                    jjh.m24440b();
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    closeable = jiz;
                                    break;
                                }
                            }
                            jjb.m24361a(jiz);
                            return false;
                        }
                        continue;
                        break;
                    default:
                        break;
                }
            }
            i = 0;
            while (i < 5) {
                jjn jjn2 = jjnArr[i];
                if (jjn2 == null || jjn2.m24494c() <= 0) {
                    i++;
                } else {
                    jjb.m24361a(jiz);
                    return false;
                }
            }
            this.f20238a.order(m24405b());
            for (jjf jjf : this.f20240c) {
                jjm jjm = jjf.f20244b;
                i = jjf.f20243a;
                if (jjm.m24481f()) {
                    if (Log.isLoggable("ExifModifier", 2)) {
                        String valueOf = String.valueOf(jjm);
                        new StringBuilder(String.valueOf(valueOf).length() + 19).append("modifying tag to: \n").append(valueOf);
                        new StringBuilder(22).append("at offset: ").append(i);
                    }
                    this.f20238a.position(i + this.f20242e);
                    byte[] bArr;
                    int e;
                    switch (jjm.m24474c()) {
                        case (short) 1:
                        case (short) 7:
                            bArr = new byte[jjm.m24478e()];
                            jjm.m24473b(bArr);
                            this.f20238a.put(bArr);
                            break;
                        case (short) 2:
                            bArr = jjm.m24485i();
                            if (bArr.length != jjm.m24478e()) {
                                this.f20238a.put(bArr);
                                this.f20238a.put((byte) 0);
                                break;
                            }
                            bArr[bArr.length - 1] = (byte) 0;
                            this.f20238a.put(bArr);
                            break;
                        case (short) 3:
                            e = jjm.m24478e();
                            for (i = 0; i < e; i++) {
                                this.f20238a.putShort((short) ((int) jjm.m24479e(i)));
                            }
                            break;
                        case (short) 4:
                        case (short) 9:
                            e = jjm.m24478e();
                            for (i = 0; i < e; i++) {
                                this.f20238a.putInt((int) jjm.m24479e(i));
                            }
                            break;
                        case (short) 5:
                        case (short) 10:
                            e = jjm.m24478e();
                            for (i = 0; i < e; i++) {
                                jjq f = jjm.m24480f(i);
                                this.f20238a.putInt((int) f.m24501a());
                                this.f20238a.putInt((int) f.m24502b());
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            jjb.m24361a(jiz);
            return true;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            jjb.m24361a(closeable);
            throw th;
        }
    }

    public void m24406a(jjm jjm) {
        this.f20239b.m24388a(jjm);
    }
}
