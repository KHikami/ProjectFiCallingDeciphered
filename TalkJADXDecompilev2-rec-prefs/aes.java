package p000;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class aes extends lt {
    final RecyclerView f454a;
    final lt f455c = new aet(this);

    public aes(RecyclerView recyclerView) {
        this.f454a = recyclerView;
    }

    public boolean mo109a(View view, int i, Bundle bundle) {
        if (super.mo109a(view, i, bundle)) {
            return true;
        }
        if (this.f454a.m3108v() || this.f454a.m3072c() == null) {
            return false;
        }
        return this.f454a.m3072c().m438a(i, bundle);
    }

    public void mo13a(View view, ql qlVar) {
        super.mo13a(view, qlVar);
        qlVar.b(RecyclerView.class.getName());
        if (!this.f454a.m3108v() && this.f454a.m3072c() != null) {
            this.f454a.m3072c().m437a(qlVar);
        }
    }

    public void mo12a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo12a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.f454a.m3108v()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.m3072c() != null) {
                recyclerView.m3072c().mo46a(accessibilityEvent);
            }
        }
    }

    public lt m885b() {
        return this.f455c;
    }
}
