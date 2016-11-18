package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.apps.hangouts.hangout.DebugOverlayTextView;

public final class cwq extends jzn {
    ctj a;
    cvr b;
    private ctn c;
    private crq d;

    public cwq() {
        this.binder.a(cws.class, new cwr(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(gwb.pn, viewGroup, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = ((cuj) this.binder.a(cuj.class)).a();
        ite f = this.c.f();
        this.a = new ctj(f);
        this.b = new cvr(getContext(), f);
        this.d = new crq(this.c, this);
    }

    public void onStart() {
        super.onStart();
        this.c.g().e();
        this.a.a();
        this.b.a();
        ((DebugOverlayTextView) getView().findViewById(gwb.oy)).a(this.c.f());
    }

    public void onResume() {
        super.onResume();
        this.d.a();
    }

    public void onPause() {
        super.onPause();
        this.d.b();
    }

    public void onStop() {
        this.b.b();
        this.a.b();
        this.c.g().f();
        super.onStop();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.c();
        View findViewById = getView().findViewById(gwb.oz);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.leftMargin = getResources().getDimensionPixelSize(gwb.nX);
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        findViewById.setLayoutParams(marginLayoutParams);
    }
}
