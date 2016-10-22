import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

public final class fem implements OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ DebugOzGetMergedPersonActivity b;

    public fem(DebugOzGetMergedPersonActivity debugOzGetMergedPersonActivity, EditText editText) {
        this.b = debugOzGetMergedPersonActivity;
        this.a = editText;
    }

    public void onClick(View view) {
        this.a.setInputType(3);
    }
}
