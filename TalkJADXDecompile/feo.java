import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

public final class feo implements OnClickListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ RadioGroup b;
    final /* synthetic */ EditText c;
    final /* synthetic */ CheckBox d;
    final /* synthetic */ Context e;
    final /* synthetic */ DebugOzGetMergedPersonActivity f;

    public feo(DebugOzGetMergedPersonActivity debugOzGetMergedPersonActivity, TextView textView, RadioGroup radioGroup, EditText editText, CheckBox checkBox, Context context) {
        this.f = debugOzGetMergedPersonActivity;
        this.a = textView;
        this.b = radioGroup;
        this.c = editText;
        this.d = checkBox;
        this.e = context;
    }

    public void onClick(View view) {
        new fep(this, ((jca) this.f.getBinder().a(jca.class)).a()).execute(new Void[0]);
    }
}
