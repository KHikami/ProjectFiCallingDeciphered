import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

public final class bnl implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ Runnable b;
    private /* synthetic */ bni c;

    public bnl(bni bni, String str, Runnable runnable) {
        this.c = bni;
        this.a = str;
        this.b = runnable;
    }

    public final void run() {
        bno bno = this.c.a;
        String str = this.a;
        buf.n(str);
        cqn.b();
        bno.e();
        cqv a = bpq.a(bno.f.a(), str);
        if (a == null) {
            bno.d("Parsing failed. Ignoring invalid campaign data", str);
        } else {
            bnp bnp = bno.f;
            bnp.a(bnp.g);
            CharSequence m = bnp.g.m();
            if (str.equals(m)) {
                bno.e("Ignoring duplicate install campaign");
            } else if (TextUtils.isEmpty(m)) {
                bnp = bno.f;
                bnp.a(bnp.g);
                box box = bnp.g;
                cqn.b();
                box.o();
                Editor edit = box.a.edit();
                if (TextUtils.isEmpty(str)) {
                    edit.remove("installation_campaign");
                } else {
                    edit.putString("installation_campaign", str);
                }
                if (!edit.commit()) {
                    box.e("Failed to commit campaign data");
                }
                bnp bnp2 = bno.f;
                bnp.a(bnp2.g);
                if (bnp2.g.c().a(bom.l())) {
                    bno.d("Campaign received too late, ignoring", a);
                } else {
                    bno.b("Received installation campaign", a);
                    for (bns a2 : bno.b.c(0)) {
                        bno.a(a2, a);
                    }
                }
            } else {
                bno.d("Ignoring multiple install campaigns. original, new", m, str);
            }
        }
        if (this.b != null) {
            this.b.run();
        }
    }
}
