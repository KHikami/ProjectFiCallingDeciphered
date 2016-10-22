package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.libraries.social.settings.PreferenceScreen;

/* renamed from: jwp */
public class jwp extends dr implements jxb {
    private boolean a;
    private boolean b;
    private Handler c;
    public jwy d;
    ListView e;
    private final Runnable f;
    private OnKeyListener g;

    public jwp() {
        this.c = new jwq(this);
        this.f = new jwr(this);
        this.g = new jws(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = new jwy(getActivity(), 100);
        this.d.a(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(gwb.zR, viewGroup, false);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.a) {
            d();
        }
        this.b = true;
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("settings:preferences");
            if (bundle2 != null) {
                PreferenceScreen c = c();
                if (c != null) {
                    c.d(bundle2);
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.d.a((jxb) this);
    }

    public void onStop() {
        super.onStop();
        this.d.h();
        this.d.a(null);
    }

    public void onDestroyView() {
        this.e = null;
        this.c.removeCallbacks(this.f);
        this.c.removeMessages(1);
        super.onDestroyView();
    }

    public void onDestroy() {
        this.d.i();
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen c = c();
        if (c != null) {
            Bundle bundle2 = new Bundle();
            c.b(bundle2);
            bundle.putBundle("settings:preferences", bundle2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.d.a(i, i2, intent);
    }

    public jwy b() {
        return this.d;
    }

    public void a(PreferenceScreen preferenceScreen) {
        if (this.d.a(preferenceScreen) && preferenceScreen != null) {
            this.a = true;
            if (this.b && !this.c.hasMessages(1)) {
                this.c.obtainMessage(1).sendToTarget();
            }
        }
    }

    public PreferenceScreen c() {
        return this.d.d();
    }

    public boolean a(jwi jwi) {
        if (jwi.k() == null || !(getActivity() instanceof jwt)) {
            return false;
        }
        return ((jwt) getActivity()).a();
    }

    void d() {
        PreferenceScreen c = c();
        if (c != null) {
            c.a(e());
        }
    }

    public ListView e() {
        if (this.e == null) {
            View view = getView();
            if (view == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            view = view.findViewById(16908298);
            if (view instanceof ListView) {
                this.e = (ListView) view;
                if (this.e == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                this.e.setOnKeyListener(this.g);
                this.c.post(this.f);
            } else {
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
        }
        return this.e;
    }
}
