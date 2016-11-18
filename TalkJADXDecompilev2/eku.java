package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.util.Arrays;

public final class eku implements OnClickListener {
    final /* synthetic */ String[] a;
    final /* synthetic */ DebugActivity b;

    eku(DebugActivity debugActivity, String[] strArr) {
        this.b = debugActivity;
        this.a = strArr;
    }

    public void onClick(View view) {
        Toast.makeText(this.b, Arrays.toString(this.a), 0).show();
    }
}
