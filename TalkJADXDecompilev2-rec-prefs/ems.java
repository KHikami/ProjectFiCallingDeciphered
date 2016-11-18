package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.EditText;
import android.widget.Toast;

final class ems implements OnClickListener {
    final /* synthetic */ fom f11860a;
    final /* synthetic */ EditText f11861b;
    final /* synthetic */ emo f11862c;

    ems(emo emo, fom fom, EditText editText) {
        this.f11862c = emo;
        this.f11860a = fom;
        this.f11861b = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.f11862c.f11853a.edit();
        edit.putString(this.f11860a.f13582f, this.f11861b.getText().toString());
        edit.apply();
        Toast.makeText(this.f11862c.f11854b.f11810a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
