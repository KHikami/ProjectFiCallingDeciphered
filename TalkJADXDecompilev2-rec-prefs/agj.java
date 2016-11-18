package p000;

import android.app.ActionBar.OnMenuVisibilityListener;

final class agj implements OnMenuVisibilityListener {
    final /* synthetic */ agi f609a;
    private final tr f610b;

    public agj(agi agi, tr trVar) {
        this.f609a = agi;
        this.f610b = trVar;
    }

    public void onMenuVisibilityChanged(boolean z) {
        this.f610b.a(z);
    }
}
