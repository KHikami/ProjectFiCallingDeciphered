import android.content.SharedPreferences.Editor;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.contacts.common.dialog.CallSubjectDialog;
import java.util.List;

/* compiled from: PG */
public final class ach implements OnClickListener {
    private /* synthetic */ CallSubjectDialog a;

    public ach(CallSubjectDialog callSubjectDialog) {
        this.a = callSubjectDialog;
    }

    public final void onClick(View view) {
        int i = 0;
        String obj = this.a.d.getText().toString();
        buf.a(this.a, (TelecomManager) this.a.getSystemService("telecom"), buf.a(this.a.h, this.a.i, obj));
        this.a.g.add(obj);
        CallSubjectDialog callSubjectDialog = this.a;
        List<String> list = this.a.g;
        while (list.size() > 5) {
            list.remove(0);
        }
        Editor edit = callSubjectDialog.f.edit();
        for (String str : list) {
            int i2;
            if (TextUtils.isEmpty(str)) {
                i2 = i;
            } else {
                String valueOf = String.valueOf("subject_history_item");
                edit.putString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), str);
                i2 = i + 1;
            }
            i = i2;
        }
        edit.putInt("subject_history_count", i);
        edit.apply();
        this.a.finish();
    }
}
