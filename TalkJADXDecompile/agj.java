import android.app.ActionBar.OnMenuVisibilityListener;

final class agj implements OnMenuVisibilityListener {
    final /* synthetic */ agi a;
    private final tr b;

    public agj(agi agi, tr trVar) {
        this.a = agi;
        this.b = trVar;
    }

    public void onMenuVisibilityChanged(boolean z) {
        this.b.a(z);
    }
}
