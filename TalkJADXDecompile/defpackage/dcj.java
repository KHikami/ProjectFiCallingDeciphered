package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: dcj */
public abstract class dcj extends jzn {
    private boolean a;
    private boolean b;
    private final Handler c;

    public abstract boolean isEmpty();

    public dcj() {
        this.c = new dck(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = true;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public void onResume() {
        this.a = false;
        super.onResume();
    }

    public void onPause() {
        this.a = true;
        super.onPause();
    }

    public boolean isPaused() {
        return this.a;
    }

    public void showEmptyViewProgress(View view) {
        if (!this.b) {
            doShowEmptyViewProgress(view);
        } else if (!this.c.hasMessages(0) && isEmpty()) {
            this.c.sendEmptyMessageDelayed(0, 800);
        }
    }

    protected void ak() {
        if (isAdded() && !isPaused()) {
            View view = getView();
            if (view != null) {
                doShowEmptyViewProgress(view);
            }
        }
    }

    public void doShowEmptyViewProgress(View view) {
        if (isEmpty()) {
            view.findViewById(16908292).setVisibility(0);
            view.findViewById(ba.cX).setVisibility(8);
            view.findViewById(ba.cW).setVisibility(0);
        }
    }

    public void showEmptyView(View view) {
        al();
        if (isEmpty()) {
            view.findViewById(16908292).setVisibility(0);
            view.findViewById(ba.cX).setVisibility(0);
            view.findViewById(ba.cW).setVisibility(8);
        }
    }

    public void showContent(View view) {
        al();
        view.findViewById(16908292).setVisibility(8);
    }

    public void setupEmptyView(View view, int i, int i2) {
        gld.a((TextView) view.findViewById(ba.cX), view.findViewById(16908292), i, 0, i2, 0);
    }

    protected void al() {
        this.c.removeMessages(0);
    }

    public bko a(Bundle bundle) {
        bko e = fde.e(bundle.getInt("account_id"));
        if (e == null) {
            glk.e("Babel", "Delete conversation called for unknown account", new Object[0]);
        }
        return e;
    }

    public void f(int i) {
        cyk a = cyk.a(getString(bc.iN), getString(bc.iM), getString(bc.iL), getString(bc.O));
        a.setTargetFragment(this, 0);
        a.getArguments().putInt("account_id", i);
        a.a(getFragmentManager(), "delete_conversation");
    }
}
