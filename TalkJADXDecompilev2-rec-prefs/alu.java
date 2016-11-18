package p000;

public class alu<T> {
    public final /* synthetic */ long f1251a;
    public final /* synthetic */ gkh f1252b;
    public final /* synthetic */ int f1253c;
    public final /* synthetic */ fsr f1254d;
    public final /* synthetic */ bnn f1255e;

    public alu(bnn bnn, long j, gkh gkh, int i, fsr fsr) {
        this.f1255e = bnn;
        this.f1251a = j;
        this.f1252b = gkh;
        this.f1253c = i;
        this.f1254d = fsr;
    }

    public void m2873a(fsh fsh) {
        byte[] a = fsh.m16124a();
        if (bnn.f3559a) {
            long a2 = glj.m17956a();
            long j = a2 - this.f1251a;
            String valueOf = String.valueOf(this.f1252b.toString());
            int i = this.f1253c;
            String valueOf2 = String.valueOf(a != null ? Integer.valueOf(a.length) : "null");
            new StringBuilder((String.valueOf(valueOf).length() + 128) + String.valueOf(valueOf2).length()).append("Volley: url=").append(valueOf).append(", entryCount= ").append(i).append(" received=").append(valueOf2).append(", clock=").append(a2).append(", dur=").append(j).append("ms from volley cache: ").append(fsh.m16126c());
        }
        if (a == null || a.length == 0) {
            dzr.m13195a(this.f1252b.m5545r());
            this.f1255e.m5519a(this.f1252b, this.f1253c + 1);
            return;
        }
        ((fsi) jyn.m25426a(gwb.m1400H(), fsi.class)).m16137a(this.f1254d, fsh);
    }
}
