package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public class dcl extends dek implements fin, hww {
    public static volatile boolean f6048p = false;
    Runnable f6049n;
    public List<epk> f6050o;
    private boolean f6051r;
    private boolean f6052s;
    private bko f6053t;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!gwb.m1406I()) {
            hwu.m21153a(this, this);
        }
        this.f6050o = this.E.m25457c(epk.class);
        if (gwb.m1906a((Context) this, "babel_healthcheck_memory_enabled", false) && this.f6049n == null) {
            this.f6049n = new dco(this);
            gwb.m1864a(this.f6049n, 3000);
        }
    }

    public void onStart() {
        super.onStart();
        if (f6048p) {
            f6048p = false;
            Intent g = gwb.m2212g(null);
            g.addFlags(67141632);
            startActivity(g);
            finish();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        super.onResume();
        if (f6048p) {
            f6048p = false;
            Intent g = gwb.m2212g(null);
            g.addFlags(67141632);
            startActivity(g);
            finish();
        } else if (((dfm) this.E.m25443a(dfm.class)).mo1521a(true, false)) {
            if (this.f6051r) {
                hwu.m21153a(this, this);
            }
            this.f6051r = false;
            jca jca = (jca) this.E.m25454b(jca.class);
            if (jca != null && jca.mo2319b()) {
                fkb.m15537a(jca.mo2317a(), true);
            }
            if (gjk.f15365b) {
                gjk.m17810a(getClass().getSimpleName());
            }
            RealTimeChatService.m9038a((fin) this);
            fde.m15010b(false);
            fqo.m15977a().m15987a(false);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f6049n != null) {
            gwb.m2042b(this.f6049n);
            this.f6049n = null;
        }
        jca jca = (jca) this.E.m25454b(jca.class);
        if (jca != null && jca.mo2319b()) {
            fkb.m15537a(jca.mo2317a(), false);
        }
        if (gjk.f15365b) {
            getClass().getSimpleName();
            gjk.m17809a();
        }
        RealTimeChatService.m9038a(null);
        fqo.m15977a().m15987a(true);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6052s = true;
    }

    public boolean m8326k() {
        if (VERSION.SDK_INT >= 17) {
            return super.isDestroyed();
        }
        return this.f6052s;
    }

    public void mo1073a(int i, Intent intent) {
        if (!m8326k()) {
            gtt.m18587a(i, (Activity) this, 103, new dcm(this));
        }
    }

    public boolean mo1074a(bko bko, giu giu) {
        Intent intent = giu.f15318a;
        if (intent == null || bkq.m5692d((Context) this, bko.m5638g())) {
            return false;
        }
        intent.setFlags(intent.getFlags() & -268435457);
        this.f6053t = bko;
        startActivityForResult(intent, 100);
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = "EsFragmentActivity.onActivityResult ";
        String valueOf = String.valueOf(Integer.toHexString(i));
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 100:
                if (this.f6053t != null) {
                    if (i2 != -1) {
                        ((jcf) this.E.m25443a(jcf.class)).mo3464b(this.f6053t.m5638g()).m23881b("logged_in", false).m23891d();
                    } else {
                        new dcn(this, this.f6053t.m5629a()).execute(new Void[0]);
                    }
                    this.f6053t = null;
                    return;
                }
                return;
            case 101:
                if (i2 == -1 && intent != null && intent.getExtras().containsKey("new_conversation_created")) {
                    finish();
                    return;
                }
                return;
            case 102:
                ((bjn) this.E.m25443a(bjn.class)).mo1758a(true);
                return;
            case 103:
                this.f6051r = true;
                return;
            default:
                return;
        }
    }

    public View m8325c(int i) {
        View frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        getLayoutInflater().inflate(i, frameLayout, true);
        return frameLayout;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        for (epk a : this.f6050o) {
            a.mo1646a(getMenuInflater(), menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        for (epk a : this.f6050o) {
            a.mo1645a(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean a = mo1080a(menuItem);
        if (!a) {
            for (epk a2 : this.f6050o) {
                a = a2.mo1648a((Activity) this, menuItem);
                if (a) {
                    break;
                }
            }
        }
        return a || super.onOptionsItemSelected(menuItem);
    }

    public boolean mo1080a(MenuItem menuItem) {
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 82 && VERSION.SDK_INT <= 16 && "LGE".equalsIgnoreCase(Build.MANUFACTURER)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 82 || VERSION.SDK_INT > 16 || !"LGE".equalsIgnoreCase(Build.MANUFACTURER)) {
            return super.onKeyUp(i, keyEvent);
        }
        openOptionsMenu();
        return true;
    }
}
