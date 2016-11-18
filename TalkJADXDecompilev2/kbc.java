package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;

public class kbc extends kbu {
    private kbz c;
    private kbz d;
    private kbz e;
    private kbz f;

    public void a(Bundle bundle) {
        this.c = a(new kbd(this, bundle));
    }

    public void b(Bundle bundle) {
        this.d = a(new kbe(this, bundle));
    }

    public void a() {
        this.e = a(new kbf(this));
    }

    public void b() {
        b(this.e);
        super.b();
    }

    public void c() {
        b(this.d);
        b(this.c);
        super.c();
    }

    public void d() {
        this.f = a(new kbg(this));
    }

    public void e() {
        b(this.f);
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kas ? i + 1 : i + 1;
        }
    }

    public void a(boolean z) {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kba ? i + 1 : i + 1;
        }
    }

    public void a(Intent intent) {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kav ? i + 1 : i + 1;
        }
    }

    public void f() {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kaz ? i + 1 : i + 1;
        }
    }

    public void g() {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kan ? i + 1 : i + 1;
        }
    }

    public void a(ActionMode actionMode) {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kap ? i + 1 : i + 1;
        }
    }

    public void b(ActionMode actionMode) {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kao ? i + 1 : i + 1;
        }
    }

    public boolean a(KeyEvent keyEvent) {
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kam) {
                if (((kam) kcq).a(keyEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean h() {
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kar) {
                if (((kar) kcq).a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b(Intent intent) {
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kbb) {
                ((kbb) kcq).a(intent);
            }
        }
    }

    public boolean a(int i, KeyEvent keyEvent) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            kcq kcq = (kcq) this.a.get(i2);
            if (kcq instanceof kat) {
                if (((kat) kcq).a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(int i, KeyEvent keyEvent) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            kcq kcq = (kcq) this.a.get(i2);
            if (kcq instanceof kau) {
                if (((kau) kcq).a()) {
                    return true;
                }
            }
        }
        return false;
    }
}
