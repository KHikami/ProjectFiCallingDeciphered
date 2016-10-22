package defpackage;

import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.social.silentfeedback.impl.SilentFeedbackService;

/* renamed from: jxu */
public final class jxu implements iea {
    final /* synthetic */ ifh a;
    final /* synthetic */ Intent b;
    final /* synthetic */ idx c;
    final /* synthetic */ SilentFeedbackService d;

    public jxu(SilentFeedbackService silentFeedbackService, ifh ifh, Intent intent, idx idx) {
        this.d = silentFeedbackService;
        this.a = ifh;
        this.b = intent;
        this.c = idx;
    }

    public void a() {
        try {
            ifk a;
            ifh ifh = this.a;
            SilentFeedbackService silentFeedbackService = this.d;
            Intent intent = this.b;
            ifm ifm = (ifm) jyn.a(silentFeedbackService.getApplication(), ifm.class);
            if (intent == null) {
                a = ifm.a();
            } else {
                ifm.b(" ");
                ifm.a(true);
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass")) {
                    ifm.d(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace")) {
                    ifm.h(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass")) {
                    ifm.f(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile")) {
                    ifm.e(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine")) {
                    ifm.a(intent.getIntExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine", -1));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod")) {
                    ifm.g(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod"));
                }
                if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag")) {
                    ifm.c(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag"));
                }
                a = ifm.a();
            }
            ifh.a(a).a(new jxv(this));
        } catch (UnsupportedOperationException e) {
            Log.e("SilentFeedbackService", "Could not clean PII, no feedback sent.");
            this.d.a();
        }
    }

    public void a(int i) {
    }
}
