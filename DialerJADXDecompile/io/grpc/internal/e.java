package io.grpc.internal;

import buf;
import cob;
import cyl;
import dfo;
import dfp;
import dgb;
import dgl;
import dhn;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public abstract class e implements cf {
    final bn e;
    public final bi f;
    public f g;
    public f h;
    public int i;
    public int j;
    public boolean k;
    public final Object l;

    protected abstract void a();

    protected abstract void a(co coVar, boolean z, boolean z2);

    protected abstract void a(InputStream inputStream);

    public abstract void a(Throwable th);

    public abstract void b();

    public abstract void c_(int i);

    public abstract cg f();

    public abstract Object g();

    e(cp cpVar, int i) {
        this.g = f.HEADERS;
        this.h = f.HEADERS;
        this.i = 32768;
        this.l = new Object();
        this.e = new bn(new bq(this), cpVar);
        this.f = new bi(new bk(this), dfo.a, i);
    }

    public final void b(InputStream inputStream) {
        cob.i((Object) inputStream);
        b(f.MESSAGE);
        if (!this.e.g) {
            bn bnVar = this.e;
            if (bnVar.g) {
                throw new IllegalStateException("Framer already closed");
            }
            int i;
            if (!bnVar.c || bnVar.b == dfo.a) {
                i = 0;
            } else {
                i = 1;
            }
            try {
                int available;
                if ((inputStream instanceof dgl) || (inputStream instanceof ByteArrayInputStream)) {
                    available = inputStream.available();
                } else {
                    available = -1;
                }
                if (available != 0 && r0 != 0) {
                    i = bnVar.a(inputStream);
                } else if (available != -1) {
                    ByteBuffer wrap = ByteBuffer.wrap(bnVar.e);
                    wrap.put((byte) 0);
                    wrap.putInt(available);
                    if (bnVar.a == null) {
                        bnVar.a = bnVar.f.a(wrap.position() + available);
                    }
                    bnVar.a(bnVar.e, 0, wrap.position());
                    i = bn.a(inputStream, bnVar.d);
                } else {
                    bo boVar = new bo(bnVar);
                    i = bn.a(inputStream, (OutputStream) boVar);
                    bnVar.a(boVar, false);
                }
                if (available != -1 && i != available) {
                    throw dhn.i.a(String.format("Message length inaccurate %s != %s", new Object[]{Integer.valueOf(i), Integer.valueOf(available)})).b();
                }
            } catch (Throwable e) {
                throw dhn.i.a("Failed to frame message").b(e).b();
            } catch (Throwable e2) {
                throw dhn.i.a("Failed to frame message").b(e2).b();
            }
        }
    }

    public final void a(boolean z) {
        this.e.c = z;
    }

    public final void h() {
        if (!this.e.g) {
            bn bnVar = this.e;
            if (bnVar.a != null && bnVar.a.b() > 0) {
                bnVar.a(false, true);
            }
        }
    }

    public boolean d() {
        boolean z = false;
        if (!(f() == null || this.h == f.STATUS)) {
            synchronized (this.l) {
                if (this.k && this.j < this.i) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void a(bs bsVar, boolean z) {
        Throwable th;
        Object obj = null;
        try {
            bi biVar = this.f;
            cob.b((Object) bsVar, (Object) "data");
            try {
                boolean z2;
                if (biVar.a()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                cob.b(z2, (Object) "MessageDeframer is already closed");
                cob.b(!biVar.b, (Object) "Past end of stream");
                biVar.c.a(bsVar);
                try {
                    biVar.b = z;
                    biVar.b();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = 1;
                if (obj != null) {
                    bsVar.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            a(th4);
        }
    }

    public final void a(dfp dfp) {
        this.e.b = (dfp) cob.b((dfp) cob.b((Object) dfp, (Object) "compressor"), (Object) "Can't pass an empty compressor");
    }

    public final void a(dgb dgb) {
        this.f.a = (dgb) cob.b((dgb) cob.b((Object) dgb, (Object) "decompressor"), (Object) "Can't pass an empty decompressor");
    }

    public final void i() {
        synchronized (this.l) {
            boolean d = d();
        }
        if (d) {
            f().a();
        }
    }

    public final f a(f fVar) {
        f fVar2 = this.g;
        this.g = a(this.g, fVar);
        return fVar2;
    }

    final f b(f fVar) {
        f fVar2 = this.h;
        this.h = a(this.h, fVar);
        return fVar2;
    }

    private static f a(f fVar, f fVar2) {
        if (fVar2.ordinal() >= fVar.ordinal()) {
            return fVar2;
        }
        throw new IllegalStateException(String.format("Cannot transition phase from %s to %s", new Object[]{fVar, fVar2}));
    }

    public String toString() {
        return e().toString();
    }

    protected cyl e() {
        return buf.C((Object) this).a("id", g()).a("inboundPhase", this.g.name()).a("outboundPhase", this.h.name());
    }
}
