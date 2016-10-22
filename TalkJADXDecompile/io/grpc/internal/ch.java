package io.grpc.internal;

import bm;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import mqy;
import ojw;
import ojx;
import okl;
import okq;
import olv;

public final class ch {
    final dn a;
    private final ck b;
    private dm c;
    private ojx d;
    private boolean e;
    private final cj f;
    private final byte[] g;
    private boolean h;

    public ch(ck ckVar, dn dnVar) {
        this.d = ojw.a;
        this.e = true;
        this.f = new cj(this);
        this.g = new byte[5];
        this.b = (ck) bm.a((Object) ckVar, (Object) "sink");
        this.a = (dn) bm.a((Object) dnVar, (Object) "bufferAllocator");
    }

    ch a(ojx ojx) {
        this.d = (ojx) bm.a((Object) ojx, (Object) "Can't pass an empty compressor");
        return this;
    }

    private int b(InputStream inputStream) {
        ci ciVar = new ci(this);
        OutputStream a = this.d.a(ciVar);
        try {
            int a2 = a(inputStream, a);
            a(ciVar, true);
            return a2;
        } finally {
            a.close();
        }
    }

    private void a(ci ciVar, boolean z) {
        byte b;
        ByteBuffer wrap = ByteBuffer.wrap(this.g);
        if (z) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        wrap.put(b);
        int i = 0;
        for (dm b2 : ciVar.a) {
            i = b2.b() + i;
        }
        wrap.putInt(i);
        dm b22 = this.a.a(5);
        b22.a(this.g, 0, wrap.position());
        if (i == 0) {
            this.c = b22;
            return;
        }
        this.b.a(b22, false, false);
        List list = ciVar.a;
        for (i = 0; i < list.size() - 1; i++) {
            this.b.a((dm) list.get(i), false, false);
        }
        this.c = (dm) list.get(list.size() - 1);
    }

    private static int a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof okl) {
            return ((okl) inputStream).a();
        }
        long a = mqy.a(inputStream, outputStream);
        bm.a(a <= 2147483647L, "Message size overflow: %s", a);
        return (int) a;
    }

    void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            if (this.c != null && this.c.a() == 0) {
                a(false, false);
            }
            if (this.c == null) {
                this.c = this.a.a(i2);
            }
            int min = Math.min(i2, this.c.a());
            this.c.a(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    public void a() {
        if (this.c != null && this.c.b() > 0) {
            a(false, true);
        }
    }

    public boolean b() {
        return this.h;
    }

    public void c() {
        if (!b()) {
            this.h = true;
            if (this.c != null && this.c.b() == 0) {
                e();
            }
            a(true, true);
        }
    }

    public void d() {
        this.h = true;
        e();
    }

    private void e() {
        if (this.c != null) {
            this.c = null;
        }
    }

    private void a(boolean z, boolean z2) {
        dm dmVar = this.c;
        this.c = null;
        this.b.a(dmVar, z, z2);
    }

    public void a(InputStream inputStream) {
        if (b()) {
            throw new IllegalStateException("Framer already closed");
        }
        int i;
        if (!this.e || this.d == ojw.a) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            int available;
            if ((inputStream instanceof okq) || (inputStream instanceof ByteArrayInputStream)) {
                available = inputStream.available();
            } else {
                available = -1;
            }
            if (available != 0 && r0 != 0) {
                i = b(inputStream);
            } else if (available != -1) {
                ByteBuffer wrap = ByteBuffer.wrap(this.g);
                wrap.put((byte) 0);
                wrap.putInt(available);
                if (this.c == null) {
                    this.c = this.a.a(wrap.position() + available);
                }
                a(this.g, 0, wrap.position());
                i = a(inputStream, this.f);
            } else {
                ci ciVar = new ci(this);
                i = a(inputStream, (OutputStream) ciVar);
                a(ciVar, false);
            }
            if (available != -1 && i != available) {
                throw olv.p.a(String.format("Message length inaccurate %s != %s", new Object[]{Integer.valueOf(i), Integer.valueOf(available)})).e();
            }
        } catch (Throwable e) {
            throw olv.p.a("Failed to frame message").b(e).e();
        } catch (Throwable e2) {
            throw olv.p.a("Failed to frame message").b(e2).e();
        }
    }
}
