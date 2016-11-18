package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.social.silentfeedback.impl.SilentFeedbackService;

public final class jxu implements iea {
    final /* synthetic */ ifh f21262a;
    final /* synthetic */ Intent f21263b;
    final /* synthetic */ idx f21264c;
    final /* synthetic */ SilentFeedbackService f21265d;

    public jxu(SilentFeedbackService silentFeedbackService, ifh ifh, Intent intent, idx idx) {
        this.f21265d = silentFeedbackService;
        this.f21262a = ifh;
        this.f21263b = intent;
        this.f21264c = idx;
    }

    public void mo2183a() {
        try {
            ifk a;
            ifh ifh = this.f21262a;
            SilentFeedbackService silentFeedbackService = this.f21265d;
            Intent intent = this.f21263b;
            ifm ifm = (ifm) jyn.m25426a(silentFeedbackService.getApplication(), ifm.class);
            if (intent == null) {
                a = ifm.mo3179a();
            } else {
                ifm.mo3185b(" ");
                ifm.mo3184a(true);
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass")) {
                    ifm.mo3188d(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace")) {
                    ifm.mo3192h(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass")) {
                    ifm.mo3190f(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile")) {
                    ifm.mo3189e(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine")) {
                    ifm.mo3187a(intent.getIntExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine", -1));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod")) {
                    ifm.mo3191g(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag")) {
                    ifm.mo3186c(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag"));
                }
                a = ifm.mo3179a();
            }
            ifh.mo3176a(a).m21645a(new jxv(this));
        } catch (UnsupportedOperationException e) {
            Log.e("SilentFeedbackService", "Could not clean PII, no feedback sent.");
            this.f21265d.m10500a();
        }
    }

    public void mo2184a(int i) {
    }
}
