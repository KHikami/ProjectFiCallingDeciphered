package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.util.Arrays;

public final class eky implements OnLongClickListener {
    final /* synthetic */ String[] f11786a;
    final /* synthetic */ DebugActivity f11787b;

    eky(DebugActivity debugActivity, String[] strArr) {
        this.f11787b = debugActivity;
        this.f11786a = strArr;
    }

    public boolean onLongClick(View view) {
        Context context = this.f11787b;
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", Arrays.toString(this.f11786a)));
        Toast.makeText(context, "Copied to clipboard", 0).show();
        return true;
    }
}
