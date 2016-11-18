package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public final class jef implements kam, kcq, kcx, kcy {
    List<a> a = new ArrayList();
    private boolean b;

    public jef(kbu kbu) {
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
