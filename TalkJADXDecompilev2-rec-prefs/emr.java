package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;

final class emr implements OnClickListener {
    final /* synthetic */ fom f11858a;
    final /* synthetic */ emo f11859b;

    emr(emo emo, fom fom) {
        this.f11859b = emo;
        this.f11858a = fom;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.f11859b.f11853a.edit();
        edit.remove(this.f11858a.f13582f);
        edit.apply();
        Toast.makeText(this.f11859b.f11854b.f11810a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
