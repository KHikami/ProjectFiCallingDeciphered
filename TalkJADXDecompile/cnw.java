import android.content.Context;
import android.text.TextUtils;

public final class cnw implements cnt {
    private final Context a;
    private final jyn b;

    public cnw(Context context) {
        this.a = context;
        this.b = jyn.b(context);
    }

    public void a(int i, String str, CharSequence charSequence, bxn bxn, boolean z, String str2) {
        if (TextUtils.isEmpty(charSequence) && bxn == null) {
            glk.e("Babel_ConvService", "The message has empty text and attachment. Skip sending.", new Object[0]);
            return;
        }
        a(fde.e(i), str, charSequence, "", z, 0, bxn, str2);
    }

    public void a(int i, String str, bxy bxy) {
        a(fde.e(i), str, "", "", true, 0, bxy, bxy.e);
    }

    private String a(bko bko, String str, CharSequence charSequence, String str2, boolean z, int i, bxn bxn, String str3) {
        bhm cpc;
        if (bxn == null || !(bxn.c == bxo.PHOTO || bxn.c == bxo.VIDEO)) {
            Object cov = new cov(this.a, bko, str, charSequence, bxn, 0, str2, z, str3);
        } else {
            cpc = new cpc(this.a, bko, str, charSequence, bxn, 0, str2, z, str3);
        }
        ba.a(bko.g(), glj.b(), 10, ba.c().b(str3).a(str).a(211));
        ((bhl) jyn.a(this.a, bhl.class)).a(cpc);
        return str3;
    }

    public void a(int i, String str, int i2) {
        ((bhl) jyn.a(this.a, bhl.class)).a(new coj(fde.e(i), str, i2));
    }

    public void a(int i, String str, long j) {
        ((bhl) jyn.a(this.a, bhl.class)).a(new cnz(fde.e(i), str, j));
    }

    public void b(int i, String str, long j) {
        ((bhl) jyn.a(this.a, bhl.class)).a(new cos(fde.e(i), str, j));
    }

    public void a(int i, String str, String str2) {
        ((bhl) jyn.a(this.a, bhl.class)).a(new coq(fde.e(i), str, str2));
    }

    public void a(int i, String str, boolean z) {
        ((bhl) jyn.a(this.a, bhl.class)).a(new coe(i, str, z));
    }
}
