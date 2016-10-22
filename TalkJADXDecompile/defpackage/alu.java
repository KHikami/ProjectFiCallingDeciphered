package defpackage;

/* renamed from: alu */
public class alu<T> {
    public final /* synthetic */ long a;
    public final /* synthetic */ gkh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fsr d;
    public final /* synthetic */ bnn e;

    public alu(bnn bnn, long j, gkh gkh, int i, fsr fsr) {
        this.e = bnn;
        this.a = j;
        this.b = gkh;
        this.c = i;
        this.d = fsr;
    }

    public void a(fsh fsh) {
        byte[] a = fsh.a();
        if (bnn.a) {
            long a2 = glj.a();
            long j = a2 - this.a;
            String valueOf = String.valueOf(this.b.toString());
            int i = this.c;
            String valueOf2 = String.valueOf(a != null ? Integer.valueOf(a.length) : "null");
            new StringBuilder((String.valueOf(valueOf).length() + 128) + String.valueOf(valueOf2).length()).append("Volley: url=").append(valueOf).append(", entryCount= ").append(i).append(" received=").append(valueOf2).append(", clock=").append(a2).append(", dur=").append(j).append("ms from volley cache: ").append(fsh.c());
        }
        if (a == null || a.length == 0) {
            dzr.a(this.b.r());
            this.e.a(this.b, this.c + 1);
            return;
        }
        ((fsi) jyn.a(gwb.H(), fsi.class)).a(this.d, fsh);
    }
}
