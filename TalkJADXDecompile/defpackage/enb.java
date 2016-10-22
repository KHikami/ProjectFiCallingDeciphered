package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;

/* renamed from: enb */
final class enb implements OnClickListener {
    final /* synthetic */ emz a;

    enb(emz emz) {
        this.a = emz;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.a.a.edit();
        edit.remove(fom.HANGOUTS_API.f);
        edit.remove(fom.MESI_API.f);
        edit.remove("use_staging_servers");
        edit.apply();
        Toast.makeText(this.a.b.a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
