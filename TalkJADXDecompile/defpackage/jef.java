package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jef */
public final class jef implements kam, kcq, kcx, kcy {
    List<a> a;
    private boolean b;

    public jef(kbu kbu) {
        this.a = new ArrayList();
        kbu.a((kcq) this);
    }

    public void a() {
        this.b = true;
    }

    public void b() {
        this.b = false;
    }

    public boolean a(KeyEvent keyEvent) {
        if (this.b && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            for (a p : this.a) {
                if (p.p()) {
                    return true;
                }
            }
        }
        return false;
    }
}
