import android.app.Activity;
import android.content.Intent;

public final class hkl extends hkm {
    public hkl() {
        super("com.google.android.gms.location.places.ui.PICK_PLACE");
        this.a.putExtra("gmscore_client_jar_version", gtp.b);
    }

    public Intent a(Activity activity) {
        return super.a(activity);
    }

    public void a(int i, int i2, int i3) {
        this.a.putExtra("primary_color", i);
        this.a.putExtra("primary_color_dark", i2);
        this.a.putExtra("title_color", i3);
    }

    public void a(String str) {
        this.a.putExtra("account_name", str);
    }
}
