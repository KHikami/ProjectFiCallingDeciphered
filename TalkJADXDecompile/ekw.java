import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ekw implements OnItemLongClickListener {
    final /* synthetic */ DebugActivity a;

    ekw(DebugActivity debugActivity) {
        this.a = debugActivity;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent = (Intent) adapterView.getItemAtPosition(i);
        Context context = this.a;
        bko bko = this.a.g;
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", RealTimeChatService.e(intent)));
        Toast.makeText(context, "Copied to clipboard", 0).show();
        return true;
    }
}
