import android.content.Context;

public class ixv {
    public final /* synthetic */ Context a;
    public final /* synthetic */ izs b;

    public ixt a() {
        ixu newBuilder = ixt.newBuilder();
        iyd iyd = (iyd) jyn.b(this.a, iyd.class);
        iym iym = (iym) jyn.b(this.a, iym.class);
        ixw ixw = (ixw) jyn.b(this.a, ixw.class);
        iye iye = (iye) jyn.b(this.a, iye.class);
        iyf iyf = (iyf) jyn.b(this.a, iyf.class);
        iyc iyc = (iyc) jyn.b(this.a, iyc.class);
        if (iyd != null) {
            newBuilder.a(iyd);
        }
        if (iym != null) {
            newBuilder.a(iym);
        }
        if (ixw != null) {
            newBuilder.a(ixw);
        }
        if (iye != null) {
            newBuilder.a(iye);
        }
        if (iyf != null) {
            newBuilder.a(iyf);
        }
        if (iyc != null) {
            newBuilder.a(iyc);
        }
        return newBuilder.a(jae.newBuilder().b(jyn.c(this.a, izy.class)).a(jyn.c(this.a, izw.class)).a().a()).a();
    }

    public ixv(izs izs, Context context) {
        this.b = izs;
        this.a = context;
    }
}
