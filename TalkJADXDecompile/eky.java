import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.util.Arrays;

public final class eky implements OnLongClickListener {
    final /* synthetic */ String[] a;
    final /* synthetic */ DebugActivity b;

    eky(DebugActivity debugActivity, String[] strArr) {
        this.b = debugActivity;
        this.a = strArr;
    }

    public boolean onLongClick(View view) {
        Context context = this.b;
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", Arrays.toString(this.a)));
        Toast.makeText(context, "Copied to clipboard", 0).show();
        return true;
    }
}
