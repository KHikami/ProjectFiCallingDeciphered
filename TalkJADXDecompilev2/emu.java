package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;

final class emu implements OnClickListener {
    final /* synthetic */ CharSequence[] a;
    final /* synthetic */ emt b;

    emu(emt emt, CharSequence[] charSequenceArr) {
        this.b = emt;
        this.a = charSequenceArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.b.a.edit();
        edit.putString("grpc_server_type", this.a[i].toString());
        edit.apply();
        Context context = this.b.b.a;
        String valueOf = String.valueOf(this.a[i]);
        Toast.makeText(context, new StringBuilder(String.valueOf(valueOf).length() + 29).append("Changed gRpc backend type to ").append(valueOf).toString(), 0).show();
    }
}
