package p000;

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
    final /* synthetic */ DebugActivity f11782a;

    ekw(DebugActivity debugActivity) {
        this.f11782a = debugActivity;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent = (Intent) adapterView.getItemAtPosition(i);
        Context context = this.f11782a;
        bko bko = this.f11782a.f6670g;
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", RealTimeChatService.m9105e(intent)));
        Toast.makeText(context, "Copied to clipboard", 0).show();
        return true;
    }
}
