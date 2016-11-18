package p000;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

public final class feo implements OnClickListener {
    final /* synthetic */ TextView f12924a;
    final /* synthetic */ RadioGroup f12925b;
    final /* synthetic */ EditText f12926c;
    final /* synthetic */ CheckBox f12927d;
    final /* synthetic */ Context f12928e;
    final /* synthetic */ DebugOzGetMergedPersonActivity f12929f;

    public feo(DebugOzGetMergedPersonActivity debugOzGetMergedPersonActivity, TextView textView, RadioGroup radioGroup, EditText editText, CheckBox checkBox, Context context) {
        this.f12929f = debugOzGetMergedPersonActivity;
        this.f12924a = textView;
        this.f12925b = radioGroup;
        this.f12926c = editText;
        this.f12927d = checkBox;
        this.f12928e = context;
    }

    public void onClick(View view) {
        new fep(this, ((jca) this.f12929f.getBinder().m25443a(jca.class)).mo2317a()).execute(new Void[0]);
    }
}
