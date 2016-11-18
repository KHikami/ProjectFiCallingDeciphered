package p000;

import android.text.TextPaint;
import android.text.style.URLSpan;
import com.google.android.apps.hangouts.phone.GoogleVoiceTermsOfServiceActivity;

public final class eoa extends URLSpan {
    final /* synthetic */ GoogleVoiceTermsOfServiceActivity f11913a;

    public eoa(GoogleVoiceTermsOfServiceActivity googleVoiceTermsOfServiceActivity, String str) {
        this.f11913a = googleVoiceTermsOfServiceActivity;
        super(str);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
