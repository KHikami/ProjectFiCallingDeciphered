package p000;

import com.google.android.libraries.social.login.ui.CurrentAccountBannerView;

public final class jpa implements Runnable {
    final /* synthetic */ CurrentAccountBannerView f20642a;

    public jpa(CurrentAccountBannerView currentAccountBannerView) {
        this.f20642a = currentAccountBannerView;
    }

    public void run() {
        if (this.f20642a.f8664a != null) {
            this.f20642a.announceForAccessibility(this.f20642a.f8664a);
            this.f20642a.f8664a = null;
        }
    }
}
