package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.libraries.social.settings.PreferenceScreen;

public class jwp extends dr implements jxb {
    private boolean f13963a;
    private boolean f13964b;
    private Handler f13965c = new jwq(this);
    public jwy f13966d;
    ListView f13967e;
    private final Runnable f13968f = new jwr(this);
    private OnKeyListener f13969g = new jws(this);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13966d = new jwy(getActivity(), 100);
        this.f13966d.m25364a(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(gwb.zR, viewGroup, false);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f13963a) {
            m16203d();
        }
        this.f13964b = true;
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("settings:preferences");
            if (bundle2 != null) {
                PreferenceScreen c = m16202c();
                if (c != null) {
                    c.m5136d(bundle2);
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.f13966d.m25367a((jxb) this);
    }

    public void onStop() {
        super.onStop();
        this.f13966d.m25377h();
        this.f13966d.m25367a(null);
    }

    public void onDestroyView() {
        this.f13967e = null;
        this.f13965c.removeCallbacks(this.f13968f);
        this.f13965c.removeMessages(1);
        super.onDestroyView();
    }

    public void onDestroy() {
        this.f13966d.m25378i();
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen c = m16202c();
        if (c != null) {
            Bundle bundle2 = new Bundle();
            c.m5126b(bundle2);
            bundle.putBundle("settings:preferences", bundle2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f13966d.m25362a(i, i2, intent);
    }

    public jwy m16201b() {
        return this.f13966d;
    }

    public void m16199a(PreferenceScreen preferenceScreen) {
        if (this.f13966d.m25368a(preferenceScreen) && preferenceScreen != null) {
            this.f13963a = true;
            if (this.f13964b && !this.f13965c.hasMessages(1)) {
                this.f13965c.obtainMessage(1).sendToTarget();
            }
        }
    }

    public PreferenceScreen m16202c() {
        return this.f13966d.m25373d();
    }

    public boolean mo2090a(jwi jwi) {
        if (jwi.m5153k() == null || !(getActivity() instanceof jwt)) {
            return false;
        }
        return ((jwt) getActivity()).m25347a();
    }

    void m16203d() {
        PreferenceScreen c = m16202c();
        if (c != null) {
            c.m10496a(m16204e());
        }
    }

    public ListView m16204e() {
        if (this.f13967e == null) {
            View view = getView();
            if (view == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            view = view.findViewById(16908298);
            if (view instanceof ListView) {
                this.f13967e = (ListView) view;
                if (this.f13967e == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                this.f13967e.setOnKeyListener(this.f13969g);
                this.f13965c.post(this.f13968f);
            } else {
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
        }
        return this.f13967e;
    }
}
