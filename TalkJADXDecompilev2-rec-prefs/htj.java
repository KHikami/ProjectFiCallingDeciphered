package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class htj extends AnimatorListenerAdapter {
    final /* synthetic */ SelectedAccountNavigationView f17254a;

    htj(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.f17254a = selectedAccountNavigationView;
    }

    public void onAnimationEnd(Animator animator) {
        SelectedAccountNavigationView selectedAccountNavigationView = this.f17254a;
        if (selectedAccountNavigationView.f7774c != null) {
            selectedAccountNavigationView.f7774c.mo1132a(selectedAccountNavigationView.f7773b);
        }
        selectedAccountNavigationView = this.f17254a;
        if (selectedAccountNavigationView.f7783l != null) {
            selectedAccountNavigationView.f7773b = selectedAccountNavigationView.f7783l;
            selectedAccountNavigationView.f7783l = null;
        }
        if (!(selectedAccountNavigationView.f7784m == null && selectedAccountNavigationView.f7785n == null)) {
            selectedAccountNavigationView.f7772a.clear();
            if (selectedAccountNavigationView.f7784m != null) {
                selectedAccountNavigationView.f7772a.add(selectedAccountNavigationView.f7784m);
            }
            if (selectedAccountNavigationView.f7785n != null) {
                selectedAccountNavigationView.f7772a.add(selectedAccountNavigationView.f7785n);
            }
            selectedAccountNavigationView.f7784m = null;
            selectedAccountNavigationView.f7785n = null;
        }
        this.f17254a.m9972b();
        this.f17254a.f7782k = null;
    }
}
