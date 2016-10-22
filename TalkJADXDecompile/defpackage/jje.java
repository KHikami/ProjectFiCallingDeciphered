package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jje */
final class jje {
    private final ByteBuffer a;
    private final jjc b;
    private final List<jjf> c;
    private final jjb d;
    private int e;

    protected jje(ByteBuffer byteBuffer, jjb jjb) {
        Closeable jiz;
        Throwable th;
        this.c = new ArrayList();
        this.a = byteBuffer;
        this.e = byteBuffer.position();
        this.d = jjb;
        try {
            jiz = new jiz(byteBuffer);
            try {
                jjh a = jjh.a((InputStream) jiz, this.d);
                this.b = new jjc(a.k());
                this.e = a.j() + this.e;
                this.a.position(0);
                jjb.a(jiz);
            } catch (Throwable th2) {
                th = th2;
                jjb.a(jiz);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jiz = null;
            jjb.a(jiz);
            throw th;
        }
    }

    private ByteOrder b() {
        return this.b.g();
    }

    protected boolean a() {
        Throwable th;
        Closeable closeable;
        try {
            int i;
            Closeable jiz = new jiz(this.a);
            jjn[] jjnArr = new jjn[]{this.b.b(0), this.b.b(1), this.b.b(2), this.b.b(3), this.b.b(4)};
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
            jjh jjh = new jjh(jiz, i, this.d);
            jjn jjn = null;
            for (int a = jjh.a(); a != 6; a = jjh.a()) {
                switch (a) {
                    case wi.w /*0*/:
                        jjn = jjnArr[jjh.d()];
                        if (jjn != null) {
                            break;
                        }
                        jjh.b();
                        break;
                    case wi.j /*1*/:
                        jjm c = jjh.c();
                        jjm a2 = jjn.a(c.b());
                        if (a2 != null) {
                            if (a2.e() == c.e() && a2.c() == c.c()) {
                                try {
                                    this.c.add(new jjf(a2, c.j()));
                                    jjn.b(c.b());
                                    if (jjn.c() != 0) {
                                        break;
                                    }
                                    jjh.b();
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    closeable = jiz;
                                    break;
                                }
                            }
                            jjb.a(jiz);
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
                if (jjn2 == null || jjn2.c() <= 0) {
                    i++;
                } else {
                    jjb.a(jiz);
                    return false;
                }
            }
            this.a.order(b());
            for (jjf jjf : this.c) {
                jjm jjm = jjf.b;
                i = jjf.a;
                if (jjm.f()) {
                    if (Log.isLoggable("ExifModifier", 2)) {
                        String valueOf = String.valueOf(jjm);
                        new StringBuilder(String.valueOf(valueOf).length() + 19).append("modifying tag to: \n").append(valueOf);
                        new StringBuilder(22).append("at offset: ").append(i);
                    }
                    this.a.position(i + this.e);
                    byte[] bArr;
                    int e;
                    switch (jjm.c()) {
                        case wi.j /*1*/:
                        case wi.q /*7*/:
                            bArr = new byte[jjm.e()];
                            jjm.b(bArr);
                            this.a.put(bArr);
                            break;
                        case wi.l /*2*/:
                            bArr = jjm.i();
                            if (bArr.length != jjm.e()) {
                                this.a.put(bArr);
                                this.a.put((byte) 0);
                                break;
                            }
                            bArr[bArr.length - 1] = (byte) 0;
                            this.a.put(bArr);
                            break;
                        case wi.z /*3*/:
                            e = jjm.e();
                            for (i = 0; i < e; i++) {
                                this.a.putShort((short) ((int) jjm.e(i)));
                            }
                            break;
                        case wi.h /*4*/:
                        case wi.n /*9*/:
                            e = jjm.e();
                            for (i = 0; i < e; i++) {
                                this.a.putInt((int) jjm.e(i));
                            }
                            break;
                        case wi.p /*5*/:
                        case wi.dr /*10*/:
                            e = jjm.e();
                            for (i = 0; i < e; i++) {
                                jjq f = jjm.f(i);
                                this.a.putInt((int) f.a());
                                this.a.putInt((int) f.b());
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            jjb.a(jiz);
            return true;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            jjb.a(closeable);
            throw th;
        }
    }

    public void a(jjm jjm) {
        this.b.a(jjm);
    }
}
