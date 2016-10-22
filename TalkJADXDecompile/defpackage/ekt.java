package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;

/* renamed from: ekt */
public final class ekt implements OnItemLongClickListener {
    final /* synthetic */ DebugActivity a;

    ekt(DebugActivity debugActivity) {
        this.a = debugActivity;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        elf elf = (elf) adapterView.getItemAtPosition(i);
        DebugActivity debugActivity = this.a;
        CharSequence a = DebugActivity.a(elf.a, elf.b);
        Context context = this.a;
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", a));
        Toast.makeText(context, "Copied to clipboard", 0).show();
        return true;
    }
}
