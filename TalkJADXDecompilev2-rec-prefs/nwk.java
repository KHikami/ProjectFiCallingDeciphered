package p000;

import java.io.IOException;

public class nwk<MessageType extends nwi<MessageType, BuilderType>, BuilderType extends nwk<MessageType, BuilderType>> extends nvi<MessageType, BuilderType> {
    public MessageType f31175a;
    public boolean f31176b;
    private final MessageType f31177c;

    public /* synthetic */ nvi mo4038a() {
        return mo4054c();
    }

    public /* synthetic */ nvi mo4040a(nvw nvw, nwd nwd) {
        return m36936c(nvw, nwd);
    }

    public /* synthetic */ nxj mo3975b(nvw nvw, nwd nwd) {
        return m36936c(nvw, nwd);
    }

    public /* synthetic */ Object clone() {
        return mo4054c();
    }

    public /* synthetic */ nxi mo4042i() {
        return m36939f();
    }

    public /* synthetic */ nxi i_() {
        return m36940g();
    }

    public nwk(MessageType messageType) {
        this.f31177c = messageType;
        this.f31175a = (nwi) messageType.a(nws.f31190e);
        this.f31176b = false;
    }

    public void mo4053b() {
        if (this.f31176b) {
            nwi nwi = (nwi) this.f31175a.a(nws.f31190e);
            nwi.a(nwr.f31185a, this.f31175a);
            this.f31175a = nwi;
            this.f31176b = false;
        }
    }

    public final boolean m36938e() {
        if (this.f31175a.a(nws.f31186a, Boolean.valueOf(false)) != null) {
            return true;
        }
        return false;
    }

    public BuilderType mo4054c() {
        nwk nwk = (nwk) m36940g().a(nws.f31191f);
        nwk.m36931b(mo4055d());
        return nwk;
    }

    public MessageType mo4055d() {
        if (this.f31176b) {
            return this.f31175a;
        }
        this.f31175a.d();
        this.f31176b = true;
        return this.f31175a;
    }

    public final MessageType m36939f() {
        Object obj;
        MessageType d = mo4055d();
        if (d.a(nws.f31186a, Boolean.TRUE) != null) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            return d;
        }
        throw new nxx();
    }

    protected BuilderType m36928a(MessageType messageType) {
        return m36931b((nwi) messageType);
    }

    public BuilderType m36931b(MessageType messageType) {
        mo4053b();
        this.f31175a.a(nwr.f31185a, messageType);
        return this;
    }

    public MessageType m36940g() {
        return this.f31177c;
    }

    public BuilderType m36936c(nvw nvw, nwd nwd) {
        mo4053b();
        try {
            this.f31175a.a(nws.f31188c, nvw, nwd);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public nwk() {
        this(ogu.f32755k);
    }

    public long m36942j() {
        return ((ogu) this.f31175a).m38256i();
    }

    public nwk m36926a(long j) {
        mo4053b();
        ogu ogu = (ogu) this.f31175a;
        ogu.f32758d |= 1;
        ogu.f32759e = j;
        return this;
    }

    public nwk m36930b(long j) {
        mo4053b();
        ogu ogu = (ogu) this.f31175a;
        ogu.f32758d |= 2;
        ogu.f32760f = j;
        return this;
    }

    public nwk m36935c(long j) {
        mo4053b();
        ogu ogu = (ogu) this.f31175a;
        ogu.f32758d |= 4;
        ogu.f32761g = j;
        return this;
    }

    public String m36943k() {
        return ((ogu) this.f31175a).m38258k();
    }

    public nwk m36927a(String str) {
        mo4053b();
        ogu ogu = (ogu) this.f31175a;
        if (str == null) {
            throw new NullPointerException();
        }
        ogu.f32758d |= 128;
        ogu.f32762h = str;
        return this;
    }

    public nwk m36925a(double d) {
        mo4053b();
        ogu ogu = (ogu) this.f31175a;
        ogu.f32758d |= 256;
        ogu.f32763i = d;
        return this;
    }

    public nwk m36929b(double d) {
        mo4053b();
        ogu ogu = (ogu) this.f31175a;
        ogu.f32758d |= 512;
        ogu.f32764j = d;
        return this;
    }

    public nwk(char c) {
        this(ogw.f32784d);
    }

    public nwk(short s) {
        this(ogx.f32798d);
    }

    public nwk(int i) {
        this(ogv.f32778d);
    }

    public nwk(boolean z) {
        this(ozs.f34708d);
    }

    public nwk(float f) {
        this(ozt.f34713d);
    }

    public nwk(byte[] bArr) {
        this(ozu.f34720d);
    }

    public nwk(char[] cArr) {
        this(pab.f34760d);
    }

    public nwk(short[] sArr) {
        this(pag.f34784d);
    }

    public nwk(int[] iArr) {
        this(ozq.f34695d);
    }

    public nwk(boolean[] zArr) {
        this(pak.f34812d);
    }

    public nwk(float[] fArr) {
        this(pan.f34822d);
    }

    public nwk(byte[][] bArr) {
        this(par.f34838d);
    }

    public nwk(char[][] cArr) {
        this(pau.f34848d);
    }

    public nwk(short[][] sArr) {
        this(paj.f34803d);
    }

    public nwk(int[][] iArr) {
        this(paz.f34876d);
    }

    public nwk(boolean[][] zArr) {
        this(pba.f34881d);
    }

    public nwk(float[][] fArr) {
        this(pbb.f34885d);
    }

    public nwk(byte[][][] bArr) {
        this(pbg.f34904d);
    }

    public nwk(char[][][] cArr) {
        this(pbj.f34926d);
    }

    public nwk(short[][][] sArr) {
        this(pbk.f34933d);
    }

    public nwk(int[][][] iArr) {
        this(pbl.f34940d);
    }
}
