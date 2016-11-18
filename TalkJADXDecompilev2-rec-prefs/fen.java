package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

public final class fen implements OnClickListener {
    final /* synthetic */ EditText f12922a;
    final /* synthetic */ DebugOzGetMergedPersonActivity f12923b;

    public fen(DebugOzGetMergedPersonActivity debugOzGetMergedPersonActivity, EditText editText) {
        this.f12923b = debugOzGetMergedPersonActivity;
        this.f12922a = editText;
    }

    public void onClick(View view) {
        this.f12922a.setInputType(33);
    }
}
