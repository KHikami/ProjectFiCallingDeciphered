package defpackage;

import com.google.android.libraries.social.login.ui.CurrentAccountBannerView;

public final class jpa implements Runnable {
    final /* synthetic */ CurrentAccountBannerView a;

    public jpa(CurrentAccountBannerView currentAccountBannerView) {
        this.a = currentAccountBannerView;
    }

    public void run() {
        if (this.a.a != null) {
            this.a.announceForAccessibility(this.a.a);
            this.a.a = null;
        }
    }
}
