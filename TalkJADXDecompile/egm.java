import android.content.Context;

final class egm extends egi {
    final /* synthetic */ int a;
    final /* synthetic */ egj b;

    egm(egj egj, Context context, bck bck, int i, boolean z, boolean z2, fna fna, bxt bxt, int i2) {
        this.b = egj;
        this.a = i2;
        super(context, bck, i, false, true, fna, bxt);
    }

    protected void a(aer aer) {
        egq egq = (egq) aer;
        egq.c(this.a);
        egq.p.setFocusableInTouchMode(true);
    }
}
