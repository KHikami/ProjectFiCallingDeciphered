import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class dyk implements Runnable {
    final /* synthetic */ NavigationDrawerFragment a;

    public dyk(NavigationDrawerFragment navigationDrawerFragment) {
        this.a = navigationDrawerFragment;
    }

    public final void run() {
        this.a.b();
        this.a.d.a();
    }
}
