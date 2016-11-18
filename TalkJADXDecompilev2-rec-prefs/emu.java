package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;

final class emu implements OnClickListener {
    final /* synthetic */ CharSequence[] f11865a;
    final /* synthetic */ emt f11866b;

    emu(emt emt, CharSequence[] charSequenceArr) {
        this.f11866b = emt;
        this.f11865a = charSequenceArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.f11866b.f11863a.edit();
        edit.putString("grpc_server_type", this.f11865a[i].toString());
        edit.apply();
        Context context = this.f11866b.f11864b.f11810a;
        String valueOf = String.valueOf(this.f11865a[i]);
        Toast.makeText(context, new StringBuilder(String.valueOf(valueOf).length() + 29).append("Changed gRpc backend type to ").append(valueOf).toString(), 0).show();
    }
}
