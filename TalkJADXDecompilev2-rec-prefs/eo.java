package p000;

import android.view.View;
import android.view.ViewGroup;

public abstract class eo extends np {
    private final ed f5681a;
    private ew f5682b = null;
    private dr f5683c = null;

    public abstract dr mo1005a(int i);

    public eo(ed edVar) {
        this.f5681a = edVar;
    }

    public void m7951a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public Object mo1006a(ViewGroup viewGroup, int i) {
        if (this.f5682b == null) {
            this.f5682b = this.f5681a.mo1845a();
        }
        long b = mo2313b(i);
        dr a = this.f5681a.mo1844a(eo.m7948a(viewGroup.getId(), b));
        if (a != null) {
            this.f5682b.mo1536e(a);
        } else {
            a = mo1005a(i);
            this.f5682b.mo1526a(viewGroup.getId(), a, eo.m7948a(viewGroup.getId(), b));
        }
        if (a != this.f5683c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    public void m7952a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f5682b == null) {
            this.f5682b = this.f5681a.mo1845a();
        }
        this.f5682b.mo1535d((dr) obj);
    }

    public void m7956b(ViewGroup viewGroup, int i, Object obj) {
        dr drVar = (dr) obj;
        if (drVar != this.f5683c) {
            if (this.f5683c != null) {
                this.f5683c.setMenuVisibility(false);
                this.f5683c.setUserVisibleHint(false);
            }
            if (drVar != null) {
                drVar.setMenuVisibility(true);
                drVar.setUserVisibleHint(true);
            }
            this.f5683c = drVar;
        }
    }

    public void m7955b(ViewGroup viewGroup) {
        if (this.f5682b != null) {
            this.f5682b.mo1534c();
            this.f5682b = null;
        }
    }

    public boolean m7953a(View view, Object obj) {
        return ((dr) obj).getView() == view;
    }

    public long mo2313b(int i) {
        return (long) i;
    }

    private static String m7948a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
