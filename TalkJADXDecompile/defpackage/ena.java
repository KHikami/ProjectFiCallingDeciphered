package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;

/* renamed from: ena */
final class ena implements OnClickListener {
    final /* synthetic */ emz a;

    ena(emz emz) {
        this.a = emz;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.a.a.edit();
        edit.putString(fom.HANGOUTS_API.f, "https://staging-www.sandbox.googleapis.com/chat/v1/");
        edit.putString(fom.MESI_API.f, "https://staging-www.sandbox.googleapis.com/hangouts/v1_preprod/");
        edit.putBoolean("use_staging_servers", true);
        edit.apply();
        Toast.makeText(this.a.b.a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
