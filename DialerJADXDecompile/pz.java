import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* compiled from: PG */
public class pz extends de implements ga, qa {
    private qb g;
    private int h;
    private boolean i;
    private Resources j;

    public pz() {
        this.h = 0;
    }

    public void onCreate(Bundle bundle) {
        qb e = e();
        e.h();
        e.a(bundle);
        if (e.i() && this.h != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.h, false);
            } else {
                setTheme(this.h);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.h = i;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        e().c();
    }

    public MenuInflater getMenuInflater() {
        return e().b();
    }

    public void setContentView(int i) {
        e().b(i);
    }

    public void setContentView(View view) {
        e().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        e().a(view, layoutParams);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        e().b(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e().a(configuration);
        if (this.j != null) {
            this.j.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    protected void onStop() {
        super.onStop();
        e().d();
    }

    protected void onPostResume() {
        super.onPostResume();
        e().e();
    }

    public View findViewById(int i) {
        return e().a(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        pl a = e().a();
        if (menuItem.getItemId() != 16908332 || a == null || (a.b() & 4) == 0) {
            return false;
        }
        return f();
    }

    public void onDestroy() {
        super.onDestroy();
        e().g();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        e().a(charSequence);
    }

    public final void c() {
        e().f();
    }

    public void invalidateOptionsMenu() {
        e().f();
    }

    private boolean f() {
        Intent a = ei.a(this);
        if (a == null) {
            return false;
        }
        if (ei.a.a((Activity) this, a)) {
            Intent a2;
            fz fzVar = new fz(this);
            if (this instanceof ga) {
                a = g_();
            } else {
                a = null;
            }
            if (a == null) {
                a2 = ei.a(this);
            } else {
                a2 = a;
            }
            if (a2 != null) {
                ComponentName component = a2.getComponent();
                if (component == null) {
                    component = a2.resolveActivity(fzVar.b.getPackageManager());
                }
                fzVar.a(component);
                fzVar.a.add(a2);
            }
            if (fzVar.a.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) fzVar.a.toArray(new Intent[fzVar.a.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!gd.a(fzVar.b, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                fzVar.b.startActivity(intent);
            }
            try {
                ci.a(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            ei.a.b(this, a);
        }
        return true;
    }

    public final Intent g_() {
        return ei.a(this);
    }

    public void onContentChanged() {
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        e().b(bundle);
    }

    public final qb e() {
        if (this.g == null) {
            this.g = qb.a((Activity) this, (qa) this);
        }
        return this.g;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (jc.a.a(keyEvent) && keyEvent.getUnicodeChar(keyEvent.getMetaState() & -28673) == 60) {
            int action = keyEvent.getAction();
            if (action == 0) {
                pl a = e().a();
                if (a != null && a.c() && a.g()) {
                    this.i = true;
                    return true;
                }
            } else if (action == 1 && this.i) {
                this.i = false;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public Resources getResources() {
        if (this.j == null && aar.a()) {
            this.j = new aar(this, super.getResources());
        }
        return this.j == null ? super.getResources() : this.j;
    }
}
