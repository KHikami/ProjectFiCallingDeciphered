package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import tp;
import tu;
import us;
import wx;

@Deprecated
/* renamed from: uq */
public class uq extends dw implements hr, tv, ur {
    private us n;
    private int o;
    private boolean p;
    private Resources q;

    public uq() {
        this.o = 0;
    }

    public void onCreate(Bundle bundle) {
        us i = i();
        i.j();
        i.a(bundle);
        if (i.k() && this.o != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.o, false);
            } else {
                setTheme(this.o);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.o = i;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        i().c();
    }

    public tp g() {
        return i().a();
    }

    public void a(Toolbar toolbar) {
        i().a(toolbar);
    }

    public MenuInflater getMenuInflater() {
        return i().b();
    }

    public void setContentView(int i) {
        i().b(i);
    }

    public void setContentView(View view) {
        i().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        i().a(view, layoutParams);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        i().b(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i().a(configuration);
        if (this.q != null) {
            this.q.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onPostResume() {
        super.onPostResume();
        i().f();
    }

    public void onStart() {
        super.onStart();
        i().d();
    }

    public void onStop() {
        super.onStop();
        i().e();
    }

    public View findViewById(int i) {
        return i().a(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        tp g = g();
        if (menuItem.getItemId() != 16908332 || g == null || (g.b() & 4) == 0) {
            return false;
        }
        return G_();
    }

    public void onDestroy() {
        super.onDestroy();
        i().h();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        i().a(charSequence);
    }

    public void F_() {
        i().g();
    }

    public void invalidateOptionsMenu() {
        i().g();
    }

    public void a(wx wxVar) {
    }

    public void b(wx wxVar) {
    }

    public void a(hq hqVar) {
        hqVar.a((Activity) this);
    }

    public boolean G_() {
        Intent H_ = H_();
        if (H_ == null) {
            return false;
        }
        if (a_(H_)) {
            hq a = hq.a((Context) this);
            a(a);
            a.b();
            try {
                cq.a(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            b(H_);
        }
        return true;
    }

    public Intent H_() {
        return fk.b(this);
    }

    public boolean a_(Intent intent) {
        return fk.a((Activity) this, intent);
    }

    public void b(Intent intent) {
        fk.b((Activity) this, intent);
    }

    public void onContentChanged() {
    }

    public tu b() {
        return i().i();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        i().b(bundle);
    }

    public us i() {
        if (this.n == null) {
            this.n = us.a(this, getWindow(), this);
        }
        return this.n;
    }

    public Resources getResources() {
        if (this.q == null && aga.a()) {
            this.q = new aga(this, super.getResources());
        }
        return this.q == null ? super.getResources() : this.q;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (mn.a.a(keyEvent) && keyEvent.getUnicodeChar(keyEvent.getMetaState() & -28673) == 60) {
            int action = keyEvent.getAction();
            if (action == 0) {
                tp g = g();
                if (g != null && g.e() && g.j()) {
                    this.p = true;
                    return true;
                }
            } else if (action == 1 && this.p) {
                this.p = false;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public uq(byte b) {
        this();
    }
}
