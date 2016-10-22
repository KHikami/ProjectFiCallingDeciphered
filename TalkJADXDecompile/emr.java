import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;

final class emr implements OnClickListener {
    final /* synthetic */ fom a;
    final /* synthetic */ emo b;

    emr(emo emo, fom fom) {
        this.b = emo;
        this.a = fom;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.b.a.edit();
        edit.remove(this.a.f);
        edit.apply();
        Toast.makeText(this.b.b.a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
