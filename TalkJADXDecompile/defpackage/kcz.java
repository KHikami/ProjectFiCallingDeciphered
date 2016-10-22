package defpackage;

import wx;

/* renamed from: kcz */
public final class kcz extends kbc {
    public void a(dr drVar) {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i);
        }
    }

    public void a(wx wxVar) {
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kcy) {
                ((kcy) kcq).a();
            }
        }
    }

    public void b(wx wxVar) {
        if (wxVar != null) {
            for (int i = 0; i < this.a.size(); i++) {
                kcq kcq = (kcq) this.a.get(i);
                if (kcq instanceof kcx) {
                    ((kcx) kcq).b();
                }
            }
        }
    }
}
