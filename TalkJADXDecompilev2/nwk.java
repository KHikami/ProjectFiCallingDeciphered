package defpackage;

import java.io.IOException;

public class nwk<MessageType extends nwi<MessageType, BuilderType>, BuilderType extends nwk<MessageType, BuilderType>> extends nvi<MessageType, BuilderType> {
    public MessageType a;
    public boolean b;
    private final MessageType c;

    public /* synthetic */ nvi a() {
        return c();
    }

    public /* synthetic */ nvi a(nvw nvw, nwd nwd) {
        return c(nvw, nwd);
    }

    public /* synthetic */ nxj b(nvw nvw, nwd nwd) {
        return c(nvw, nwd);
    }

    public /* synthetic */ Object clone() {
        return c();
    }

    public /* synthetic */ nxi i() {
        return f();
    }

    public /* synthetic */ nxi i_() {
        return g();
    }

    public nwk(MessageType messageType) {
        this.c = messageType;
        this.a = (nwi) messageType.a(nws.e);
        this.b = false;
    }

    public void b() {
        if (this.b) {
            nwi nwi = (nwi) this.a.a(nws.e);
            nwi.a(nwr.a, this.a);
            this.a = nwi;
            this.b = false;
        }
    }

    public final boolean e() {
        if (this.a.a(nws.a, Boolean.valueOf(false)) != null) {
            return true;
        }
        return false;
    }

    public BuilderType c() {
        nwk nwk = (nwk) g().a(nws.f);
        nwk.b(d());
        return nwk;
    }

    public MessageType d() {
        if (this.b) {
            return this.a;
        }
        this.a.d();
        this.b = true;
        return this.a;
    }

    public final MessageType f() {
        Object obj;
        MessageType d = d();
        if (d.a(nws.a, Boolean.TRUE) != null) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            return d;
        }
        throw new nxx();
    }

    protected BuilderType a(MessageType messageType) {
        return b((nwi) messageType);
    }

    public BuilderType b(MessageType messageType) {
        b();
        this.a.a(nwr.a, messageType);
        return this;
    }

    public MessageType g() {
        return this.c;
    }

    public BuilderType c(nvw nvw, nwd nwd) {
        b();
        try {
            this.a.a(nws.c, nvw, nwd);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public nwk() {
        this(ogu.k);
    }

    public long j() {
        return ((ogu) this.a).i();
    }

    public nwk a(long j) {
        b();
        ogu ogu = (ogu) this.a;
        ogu.d |= 1;
        ogu.e = j;
        return this;
    }

    public nwk b(long j) {
        b();
        ogu ogu = (ogu) this.a;
        ogu.d |= 2;
        ogu.f = j;
        return this;
    }

    public nwk c(long j) {
        b();
        ogu ogu = (ogu) this.a;
        ogu.d |= 4;
        ogu.g = j;
        return this;
    }

    public String k() {
        return ((ogu) this.a).k();
    }

    public nwk a(String str) {
        b();
        ogu ogu = (ogu) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        ogu.d |= 128;
        ogu.h = str;
        return this;
    }

    public nwk a(double d) {
        b();
        ogu ogu = (ogu) this.a;
        ogu.d |= 256;
        ogu.i = d;
        return this;
    }

    public nwk b(double d) {
        b();
        ogu ogu = (ogu) this.a;
        ogu.d |= 512;
        ogu.j = d;
        return this;
    }

    public nwk(char c) {
        this(ogw.d);
    }

    public nwk(short s) {
        this(ogx.d);
    }

    public nwk(int i) {
        this(ogv.d);
    }

    public nwk(boolean z) {
        this(ozs.d);
    }

    public nwk(float f) {
        this(ozt.d);
    }

    public nwk(byte[] bArr) {
        this(ozu.d);
    }

    public nwk(char[] cArr) {
        this(pab.d);
    }

    public nwk(short[] sArr) {
        this(pag.d);
    }

    public nwk(int[] iArr) {
        this(ozq.d);
    }

    public nwk(boolean[] zArr) {
        this(pak.d);
    }

    public nwk(float[] fArr) {
        this(pan.d);
    }

    public nwk(byte[][] bArr) {
        this(par.d);
    }

    public nwk(char[][] cArr) {
        this(pau.d);
    }

    public nwk(short[][] sArr) {
        this(paj.d);
    }

    public nwk(int[][] iArr) {
        this(paz.d);
    }

    public nwk(boolean[][] zArr) {
        this(pba.d);
    }

    public nwk(float[][] fArr) {
        this(pbb.d);
    }

    public nwk(byte[][][] bArr) {
        this(pbg.d);
    }

    public nwk(char[][][] cArr) {
        this(pbj.d);
    }

    public nwk(short[][][] sArr) {
        this(pbk.d);
    }

    public nwk(int[][][] iArr) {
        this(pbl.d);
    }
}
