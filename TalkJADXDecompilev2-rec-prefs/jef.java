package p000;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public final class jef implements kam, kcq, kcx, kcy {
    List<C0000a> f19930a = new ArrayList();
    private boolean f19931b;

    public jef(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public void mo3482a() {
        this.f19931b = true;
    }

    public void mo3484b() {
        this.f19931b = false;
    }

    public boolean mo3483a(KeyEvent keyEvent) {
        if (this.f19931b && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            for (C0000a p : this.f19930a) {
                if (p.m19p()) {
                    return true;
                }
            }
        }
        return false;
    }
}
