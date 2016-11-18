package p000;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class dcj extends jzn {
    private boolean f5091a;
    private boolean f5092b;
    private final Handler f5093c = new dck(this);

    public abstract boolean isEmpty();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5092b = true;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public void onResume() {
        this.f5091a = false;
        super.onResume();
    }

    public void onPause() {
        this.f5091a = true;
        super.onPause();
    }

    public boolean isPaused() {
        return this.f5091a;
    }

    public void showEmptyViewProgress(View view) {
        if (!this.f5092b) {
            doShowEmptyViewProgress(view);
        } else if (!this.f5093c.hasMessages(0) && isEmpty()) {
            this.f5093c.sendEmptyMessageDelayed(0, 800);
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
        gld.m17935a((TextView) view.findViewById(ba.cX), view.findViewById(16908292), i, 0, i2, 0);
    }

    protected void al() {
        this.f5093c.removeMessages(0);
    }

    public bko m7292a(Bundle bundle) {
        bko e = fde.m15018e(bundle.getInt("account_id"));
        if (e == null) {
            glk.m17982e("Babel", "Delete conversation called for unknown account", new Object[0]);
        }
        return e;
    }

    public void m7293f(int i) {
        cyk a = cyk.m11264a(getString(bc.iN), getString(bc.iM), getString(bc.iL), getString(bc.f2931O));
        a.setTargetFragment(this, 0);
        a.getArguments().putInt("account_id", i);
        a.mo2341a(getFragmentManager(), "delete_conversation");
    }
}
