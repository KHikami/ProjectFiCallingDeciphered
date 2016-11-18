package p000;

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

@Deprecated
public class uq extends dw implements hr, tv, ur {
    private us f6037n;
    private int f6038o;
    private boolean f6039p;
    private Resources f6040q;

    public uq() {
        this.f6038o = 0;
    }

    public void onCreate(Bundle bundle) {
        us i = m8309i();
        i.j();
        i.a(bundle);
        if (i.k() && this.f6038o != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f6038o, false);
            } else {
                setTheme(this.f6038o);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f6038o = i;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m8309i().c();
    }

    public tp m8308g() {
        return m8309i().a();
    }

    public void m8302a(Toolbar toolbar) {
        m8309i().a(toolbar);
    }

    public MenuInflater getMenuInflater() {
        return m8309i().b();
    }

    public void setContentView(int i) {
        m8309i().b(i);
    }

    public void setContentView(View view) {
        m8309i().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m8309i().a(view, layoutParams);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m8309i().b(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m8309i().a(configuration);
        if (this.f6040q != null) {
            this.f6040q.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onPostResume() {
        super.onPostResume();
        m8309i().f();
    }

    public void onStart() {
        super.onStart();
        m8309i().d();
    }

    public void onStop() {
        super.onStop();
        m8309i().e();
    }

    public View findViewById(int i) {
        return m8309i().a(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        tp g = m8308g();
        if (menuItem.getItemId() != 16908332 || g == null || (g.b() & 4) == 0) {
            return false;
        }
        return G_();
    }

    public void onDestroy() {
        super.onDestroy();
        m8309i().h();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m8309i().a(charSequence);
    }

    public void F_() {
        m8309i().g();
    }

    public void invalidateOptionsMenu() {
        m8309i().g();
    }

    public void mo1062a(wx wxVar) {
    }

    public void mo1064b(wx wxVar) {
    }

    public void m8303a(hq hqVar) {
        hqVar.m20488a((Activity) this);
    }

    public boolean G_() {
        Intent H_ = H_();
        if (H_ == null) {
            return false;
        }
        if (a_(H_)) {
            hq a = hq.m20483a((Context) this);
            m8303a(a);
            a.m20491b();
            try {
                cq.m10681a(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            m8306b(H_);
        }
        return true;
    }

    public Intent H_() {
        return fk.m15533b(this);
    }

    public boolean a_(Intent intent) {
        return fk.m15532a((Activity) this, intent);
    }

    public void m8306b(Intent intent) {
        fk.m15535b((Activity) this, intent);
    }

    public void onContentChanged() {
    }

    public tu mo1063b() {
        return m8309i().i();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m8309i().b(bundle);
    }

    public us m8309i() {
        if (this.f6037n == null) {
            this.f6037n = us.a(this, getWindow(), this);
        }
        return this.f6037n;
    }

    public Resources getResources() {
        if (this.f6040q == null && aga.m999a()) {
            this.f6040q = new aga(this, super.getResources());
        }
        return this.f6040q == null ? super.getResources() : this.f6040q;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (mn.f27927a.mo3901a(keyEvent) && keyEvent.getUnicodeChar(keyEvent.getMetaState() & -28673) == 60) {
            int action = keyEvent.getAction();
            if (action == 0) {
                tp g = m8308g();
                if (g != null && g.e() && g.j()) {
                    this.f6039p = true;
                    return true;
                }
            } else if (action == 1 && this.f6039p) {
                this.f6039p = false;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public uq(byte b) {
        this();
    }
}
