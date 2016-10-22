import android.view.View;
import android.view.ViewParent;

public abstract class ahd extends np {
    private final ed a;
    private dr b;
    private ld<String, dr> c;
    ew f;

    public abstract dr a(int i);

    public ahd(ed edVar) {
        this.f = null;
        this.b = null;
        this.c = new ahe(this, 5);
        this.a = edVar;
    }

    public Object a(View view, int i) {
        if (this.f == null) {
            this.f = this.a.a();
        }
        String a = a(view.getId(), i);
        this.c.b((Object) a);
        dr a2 = this.a.a(a);
        if (a2 != null) {
            this.f.e(a2);
        } else {
            a2 = a(i);
            if (a2 == null) {
                return null;
            }
            this.f.a(view.getId(), a2, a(view.getId(), i));
        }
        if (a2 == this.b) {
            return a2;
        }
        a2.setMenuVisibility(false);
        return a2;
    }

    public void a(View view, int i, Object obj) {
        if (this.f == null) {
            this.f = this.a.a();
        }
        obj = (dr) obj;
        Object tag = obj.getTag();
        if (tag == null) {
            tag = a(view.getId(), i);
        }
        this.c.a(tag, obj);
        this.f.d(obj);
    }

    public void a(Object obj) {
        dr drVar = (dr) obj;
        if (drVar != this.b) {
            if (this.b != null) {
                this.b.setMenuVisibility(false);
            }
            if (drVar != null) {
                drVar.setMenuVisibility(true);
            }
            this.b = drVar;
        }
    }

    public void b() {
        if (this.f != null && !this.a.e()) {
            this.f.b();
            this.f = null;
            this.a.b();
        }
    }

    public boolean a(View view, Object obj) {
        ViewParent view2 = ((dr) obj).getView();
        for (ViewParent viewParent = view; viewParent instanceof View; viewParent = ((View) viewParent).getParent()) {
            if (viewParent == view2) {
                return true;
            }
        }
        return false;
    }

    protected String a(int i, int i2) {
        return "android:switcher:" + i + ":" + i2;
    }
}
