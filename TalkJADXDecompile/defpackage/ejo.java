package defpackage;

import com.google.android.apps.hangouts.phone.BabelHomeActivity;

/* renamed from: ejo */
public final class ejo implements Runnable {
    final /* synthetic */ BabelHomeActivity a;

    public ejo(BabelHomeActivity babelHomeActivity) {
        this.a = babelHomeActivity;
    }

    public void run() {
        this.a.s = false;
        this.a.a(new jmu().a().a(jna.class, new jnb().b(false).a()));
    }
}
