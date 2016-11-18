package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;

public class kbc extends kbu {
    private kbz f21355c;
    private kbz f21356d;
    private kbz f21357e;
    private kbz f21358f;

    public void m25534a(Bundle bundle) {
        this.f21355c = m25513a(new kbd(this, bundle));
    }

    public void m25541b(Bundle bundle) {
        this.f21356d = m25513a(new kbe(this, bundle));
    }

    public void m25532a() {
        this.f21357e = m25513a(new kbf(this));
    }

    public void mo3637b() {
        m25522b(this.f21357e);
        super.mo3637b();
    }

    public void mo3638c() {
        m25522b(this.f21356d);
        m25522b(this.f21355c);
        super.mo3638c();
    }

    public void m25545d() {
        this.f21358f = m25513a(new kbg(this));
    }

    public void m25546e() {
        m25522b(this.f21358f);
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kas ? i + 1 : i + 1;
        }
    }

    public void m25536a(boolean z) {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kba ? i + 1 : i + 1;
        }
    }

    public void m25533a(Intent intent) {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kav ? i + 1 : i + 1;
        }
    }

    public void m25547f() {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kaz ? i + 1 : i + 1;
        }
    }

    public void m25548g() {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kan ? i + 1 : i + 1;
        }
    }

    public void m25535a(ActionMode actionMode) {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kap ? i + 1 : i + 1;
        }
    }

    public void m25542b(ActionMode actionMode) {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kao ? i + 1 : i + 1;
        }
    }

    public boolean m25538a(KeyEvent keyEvent) {
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kam) {
                if (((kam) kcq).mo3483a(keyEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m25549h() {
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kar) {
                if (((kar) kcq).mo3523a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void m25540b(Intent intent) {
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kbb) {
                ((kbb) kcq).mo3628a(intent);
            }
        }
    }

    public boolean m25537a(int i, KeyEvent keyEvent) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            kcq kcq = (kcq) this.a.get(i2);
            if (kcq instanceof kat) {
                if (((kat) kcq).m25509a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m25543b(int i, KeyEvent keyEvent) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            kcq kcq = (kcq) this.a.get(i2);
            if (kcq instanceof kau) {
                if (((kau) kcq).m25510a()) {
                    return true;
                }
            }
        }
        return false;
    }
}
