package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

public final class fem implements OnClickListener {
    final /* synthetic */ EditText f12920a;
    final /* synthetic */ DebugOzGetMergedPersonActivity f12921b;

    public fem(DebugOzGetMergedPersonActivity debugOzGetMergedPersonActivity, EditText editText) {
        this.f12921b = debugOzGetMergedPersonActivity;
        this.f12920a = editText;
    }

    public void onClick(View view) {
        this.f12920a.setInputType(3);
    }
}
