package com.google.android.apps.hangouts.telephony;

import android.app.IntentService;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import glk;

public class TeleActivityRecognitionService extends IntentService {
    public TeleActivityRecognitionService() {
        super("TeleAcitivityRecognitionService");
    }

    protected void onHandleIntent(Intent intent) {
        if (ActivityRecognitionResult.a(intent)) {
            glk.c("Babel_telephony", "ActivityRecognitionService.onHandleIntent, intent returned result, sending broadcast", new Object[0]);
            DetectedActivity a = ActivityRecognitionResult.b(intent).a();
            Intent intent2 = new Intent("com.google.android.apps.hangouts.user_activity_action");
            intent2.putExtra("com.google.android.apps.hangouts.user_activity_type", a.a());
            intent2.putExtra("com.google.android.apps.hangouts.user_activity_confidence", a.b());
            sendBroadcast(intent2);
            return;
        }
        glk.a("Babel_telephony", "ActivityRecognitionService.onHandleIntent, intent didn't return any activity recognition result.", new Object[0]);
    }
}
