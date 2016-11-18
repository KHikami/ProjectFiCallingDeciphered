package p000;

import android.view.View;
import android.view.ViewParent;

public abstract class ahd extends np {
    private final ed f700a;
    private dr f701b = null;
    private ld<String, dr> f702c = new ahe(this, 5);
    ew f703f = null;

    public abstract dr mo185a(int i);

    public ahd(ed edVar) {
        this.f700a = edVar;
    }

    public Object mo186a(View view, int i) {
        if (this.f703f == null) {
            this.f703f = this.f700a.mo1845a();
        }
        String a = mo187a(view.getId(), i);
        this.f702c.m1206b((Object) a);
        dr a2 = this.f700a.mo1844a(a);
        if (a2 != null) {
            this.f703f.mo1536e(a2);
        } else {
            a2 = mo185a(i);
            if (a2 == null) {
                return null;
            }
            this.f703f.mo1526a(view.getId(), a2, mo187a(view.getId(), i));
        }
        if (a2 == this.f701b) {
            return a2;
        }
        a2.setMenuVisibility(false);
        return a2;
    }

    public void mo188a(View view, int i, Object obj) {
        if (this.f703f == null) {
            this.f703f = this.f700a.mo1845a();
        }
        obj = (dr) obj;
        Object tag = obj.getTag();
        if (tag == null) {
            tag = mo187a(view.getId(), i);
        }
        this.f702c.m1201a(tag, obj);
        this.f703f.mo1535d(obj);
    }

    public void m1179a(Object obj) {
        dr drVar = (dr) obj;
        if (drVar != this.f701b) {
            if (this.f701b != null) {
                this.f701b.setMenuVisibility(false);
            }
            if (drVar != null) {
                drVar.setMenuVisibility(true);
            }
            this.f701b = drVar;
        }
    }

    public void m1181b() {
        if (this.f703f != null && !this.f700a.mo1851e()) {
            this.f703f.mo1529b();
            this.f703f = null;
            this.f700a.mo1848b();
        }
    }

    public boolean m1180a(View view, Object obj) {
        ViewParent view2 = ((dr) obj).getView();
        for (ViewParent viewParent = view; viewParent instanceof View; viewParent = ((View) viewParent).getParent()) {
            if (viewParent == view2) {
                return true;
            }
        }
        return false;
    }

    protected String mo187a(int i, int i2) {
        return "android:switcher:" + i + ":" + i2;
    }
}
