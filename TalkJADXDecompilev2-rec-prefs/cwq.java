package p000;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.apps.hangouts.hangout.DebugOverlayTextView;

public final class cwq extends jzn {
    ctj f9239a;
    cvr f9240b;
    private ctn f9241c;
    private crq f9242d;

    public cwq() {
        this.binder.m25444a(cws.class, new cwr(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(gwb.pn, viewGroup, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9241c = ((cuj) this.binder.m25443a(cuj.class)).mo1392a();
        ite f = this.f9241c.m10974f();
        this.f9239a = new ctj(f);
        this.f9240b = new cvr(getContext(), f);
        this.f9242d = new crq(this.f9241c, this);
    }

    public void onStart() {
        super.onStart();
        this.f9241c.m10975g().m11060e();
        this.f9239a.m10938a();
        this.f9240b.m11128a();
        ((DebugOverlayTextView) getView().findViewById(gwb.oy)).m8545a(this.f9241c.m10974f());
    }

    public void onResume() {
        super.onResume();
        this.f9242d.m10836a();
    }

    public void onPause() {
        super.onPause();
        this.f9242d.m10839b();
    }

    public void onStop() {
        this.f9240b.m11131b();
        this.f9239a.m10941b();
        this.f9241c.m10975g().m11061f();
        super.onStop();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9242d.m10840c();
        View findViewById = getView().findViewById(gwb.oz);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.leftMargin = getResources().getDimensionPixelSize(gwb.nX);
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        findViewById.setLayoutParams(marginLayoutParams);
    }
}
