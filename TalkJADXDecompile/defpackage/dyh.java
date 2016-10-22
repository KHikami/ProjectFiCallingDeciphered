package defpackage;

import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

/* renamed from: dyh */
public final class dyh implements Runnable {
    final /* synthetic */ hwn a;
    final /* synthetic */ NavigationDrawerFragment b;

    public dyh(NavigationDrawerFragment navigationDrawerFragment, hwn hwn) {
        this.b = navigationDrawerFragment;
        this.a = hwn;
    }

    public void run() {
        this.b.c.a(this.a.a());
    }
}
