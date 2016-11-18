package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class aes extends lt {
    final RecyclerView a;
    final lt c = new aet(this);

    public aes(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (this.a.v() || this.a.c() == null) {
            return false;
        }
        return this.a.c().a(i, bundle);
    }

    public void a(View view, ql qlVar) {
        super.a(view, qlVar);
        qlVar.b(RecyclerView.class.getName());
        if (!this.a.v() && this.a.c() != null) {
            this.a.c().a(qlVar);
        }
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.a.v()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.c() != null) {
                recyclerView.c().a(accessibilityEvent);
            }
        }
    }

    public lt b() {
        return this.c;
    }
}
