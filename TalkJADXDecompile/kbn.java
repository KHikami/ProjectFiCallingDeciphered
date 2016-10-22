import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public final class kbn extends kbu {
    private kbz c;
    private kbz d;
    private kbz e;
    private kbz f;
    private kbz g;

    public void a(Activity activity) {
        this.c = a(new kbo(this, activity));
    }

    public void a(Bundle bundle) {
        this.d = a(new kbp(this, bundle));
    }

    public void a(boolean z) {
        if (this.g != null) {
            b(this.g);
        }
        if (z) {
            for (int i = 0; i < this.a.size(); i++) {
                a((kcq) this.a.get(i), z);
            }
            return;
        }
        this.g = a(new kbq(this, z));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(kcq r1, boolean r2) {
        /*
        r0 = r1 instanceof kbl;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r1 = (kbl) r1;	 Catch:{ all -> 0x000a }
        r1.a(r2);	 Catch:{ all -> 0x000a }
    L_0x0009:
        return;
    L_0x000a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kbn.a(kcq, boolean):void");
    }

    public void b(Bundle bundle) {
        this.f = a(new kbr(this, bundle));
    }

    public void a(View view, Bundle bundle) {
        this.e = a(new kbs(this, bundle, view));
    }

    public void a() {
        b(this.e);
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kbj) {
                ((kbj) kcq).a();
            }
        }
    }

    public void c() {
        super.c();
        b(this.d);
        b(this.f);
    }

    public void d() {
        b(this.c);
    }
}
