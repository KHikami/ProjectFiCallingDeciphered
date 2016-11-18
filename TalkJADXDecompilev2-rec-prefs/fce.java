package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fce implements TextWatcher {
    final /* synthetic */ EditText f12680a;
    final /* synthetic */ QuickReplyActivity f12681b;

    public fce(QuickReplyActivity quickReplyActivity, EditText editText) {
        this.f12681b = quickReplyActivity;
        this.f12680a = editText;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = this.f12680a.getText().toString().trim().length() > 0;
        QuickReplyActivity quickReplyActivity = this.f12681b;
        if (quickReplyActivity.f6721o != z) {
            quickReplyActivity.f6721o = z;
            quickReplyActivity.f6722p.setClickable(z);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator a = gwb.m1528a(1.0f, 0.0f, 1.0f, 0.0f);
            a.setStartDelay(0);
            a.setDuration(150);
            a.setInterpolator(gwb.m2326p());
            a.addListener(new fch(quickReplyActivity, z));
            Animator a2 = gwb.m1528a(0.0f, 1.0f, 0.0f, 1.0f);
            a2.setStartDelay(0);
            a2.setDuration(150);
            a2.setInterpolator(gwb.m2326p());
            animatorSet.playSequentially(new Animator[]{a, a2});
            animatorSet.setTarget(quickReplyActivity.f6723q);
            animatorSet.start();
        }
        if (z && !this.f12681b.f6726t) {
            this.f12681b.f6726t = true;
            QuickReplyActivity quickReplyActivity2 = this.f12681b;
            if (quickReplyActivity2.f6727u == 1) {
                quickReplyActivity2.f6720n.mo550a(new fko(quickReplyActivity2.f6724r, quickReplyActivity2.f6725s, 1));
            }
        }
    }

    public void afterTextChanged(Editable editable) {
    }
}
