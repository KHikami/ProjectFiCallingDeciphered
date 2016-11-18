package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;

final class enb implements OnClickListener {
    final /* synthetic */ emz f11874a;

    enb(emz emz) {
        this.f11874a = emz;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.f11874a.f11870a.edit();
        edit.remove(fom.HANGOUTS_API.f13582f);
        edit.remove(fom.MESI_API.f13582f);
        edit.remove("use_staging_servers");
        edit.apply();
        Toast.makeText(this.f11874a.f11871b.f11810a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
