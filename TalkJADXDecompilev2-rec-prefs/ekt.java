package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekt implements OnItemLongClickListener {
    final /* synthetic */ DebugActivity f11778a;

    ekt(DebugActivity debugActivity) {
        this.f11778a = debugActivity;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        elf elf = (elf) adapterView.getItemAtPosition(i);
        DebugActivity debugActivity = this.f11778a;
        CharSequence a = DebugActivity.m8912a(elf.f11799a, elf.f11800b);
        Context context = this.f11778a;
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", a));
        Toast.makeText(context, "Copied to clipboard", 0).show();
        return true;
    }
}
