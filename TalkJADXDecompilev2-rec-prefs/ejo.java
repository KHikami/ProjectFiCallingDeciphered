package p000;

import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ejo implements Runnable {
    final /* synthetic */ BabelHomeActivity f11654a;

    public ejo(BabelHomeActivity babelHomeActivity) {
        this.f11654a = babelHomeActivity;
    }

    public void run() {
        this.f11654a.f6619s = false;
        this.f11654a.m8852a(new jmu().m24731a().m24735a(jna.class, new jnb().m24748b(false).m24744a()));
    }
}
