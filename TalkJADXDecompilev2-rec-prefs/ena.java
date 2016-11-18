package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;

final class ena implements OnClickListener {
    final /* synthetic */ emz f11873a;

    ena(emz emz) {
        this.f11873a = emz;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.f11873a.f11870a.edit();
        edit.putString(fom.HANGOUTS_API.f13582f, "https://staging-www.sandbox.googleapis.com/chat/v1/");
        edit.putString(fom.MESI_API.f13582f, "https://staging-www.sandbox.googleapis.com/hangouts/v1_preprod/");
        edit.putBoolean("use_staging_servers", true);
        edit.apply();
        Toast.makeText(this.f11873a.f11871b.f11810a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
