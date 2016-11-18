package defpackage;

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
    public static volatile boolean p = false;
    Runnable n;
    public List<epk> o;
    private boolean r;
    private boolean s;
    private bko t;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!gwb.I()) {
            hwu.a(this, this);
        }
        this.o = this.E.c(epk.class);
        if (gwb.a((Context) this, "babel_healthcheck_memory_enabled", false) && this.n == null) {
            this.n = new dco(this);
            gwb.a(this.n, 3000);
        }
    }

    public void onStart() {
        super.onStart();
        if (p) {
            p = false;
            Intent g = gwb.g(null);
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
        if (p) {
            p = false;
            Intent g = gwb.g(null);
            g.addFlags(67141632);
            startActivity(g);
            finish();
        } else if (((dfm) this.E.a(dfm.class)).a(true, false)) {
            if (this.r) {
                hwu.a(this, this);
            }
            this.r = false;
            jca jca = (jca) this.E.b(jca.class);
            if (jca != null && jca.b()) {
                fkb.a(jca.a(), true);
            }
            if (gjk.b) {
                gjk.a(getClass().getSimpleName());
            }
            RealTimeChatService.a((fin) this);
            fde.b(false);
            fqo.a().a(false);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.n != null) {
            gwb.b(this.n);
            this.n = null;
        }
        jca jca = (jca) this.E.b(jca.class);
        if (jca != null && jca.b()) {
            fkb.a(jca.a(), false);
        }
        if (gjk.b) {
            getClass().getSimpleName();
            gjk.a();
        }
        RealTimeChatService.a(null);
        fqo.a().a(true);
    }

    public void onDestroy() {
        super.onDestroy();
        this.s = true;
    }

    public boolean k() {
        if (VERSION.SDK_INT >= 17) {
            return super.isDestroyed();
        }
        return this.s;
    }

    public void a(int i, Intent intent) {
        if (!k()) {
            gtt.a(i, (Activity) this, 103, new dcm(this));
        }
    }

    public boolean a(bko bko, giu giu) {
        Intent intent = giu.a;
        if (intent == null || bkq.d((Context) this, bko.g())) {
            return false;
        }
        intent.setFlags(intent.getFlags() & -268435457);
        this.t = bko;
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
                if (this.t != null) {
                    if (i2 != -1) {
                        ((jcf) this.E.a(jcf.class)).b(this.t.g()).b("logged_in", false).d();
                    } else {
                        new dcn(this, this.t.a()).execute(new Void[0]);
                    }
                    this.t = null;
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
                ((bjn) this.E.a(bjn.class)).a(true);
                return;
            case 103:
                this.r = true;
                return;
            default:
                return;
        }
    }

    public View c(int i) {
        View frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        getLayoutInflater().inflate(i, frameLayout, true);
        return frameLayout;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        for (epk a : this.o) {
            a.a(getMenuInflater(), menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        for (epk a : this.o) {
            a.a(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean a = a(menuItem);
        if (!a) {
            for (epk a2 : this.o) {
                a = a2.a((Activity) this, menuItem);
                if (a) {
                    break;
                }
            }
        }
        return a || super.onOptionsItemSelected(menuItem);
    }

    public boolean a(MenuItem menuItem) {
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
