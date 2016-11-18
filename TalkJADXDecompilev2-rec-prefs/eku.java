package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.util.Arrays;

public final class eku implements OnClickListener {
    final /* synthetic */ String[] f11779a;
    final /* synthetic */ DebugActivity f11780b;

    eku(DebugActivity debugActivity, String[] strArr) {
        this.f11780b = debugActivity;
        this.f11779a = strArr;
    }

    public void onClick(View view) {
        Toast.makeText(this.f11780b, Arrays.toString(this.f11779a), 0).show();
    }
}
