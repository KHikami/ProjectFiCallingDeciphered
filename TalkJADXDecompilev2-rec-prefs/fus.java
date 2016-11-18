package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.MessageNotificationSettingsActivity;
import com.google.android.apps.hangouts.settings.NotificationSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fus extends jzn implements jwg {
    private jca f14048a;

    public fus() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14048a = (jca) this.binder.m25443a(jca.class);
    }

    public void mo495a() {
        jwo jwo = new jwo(this.context);
        PreferenceCategory a = jwo.m25341a(bc.ad);
        if (fdq.f12773O.m14370b(this.f14048a.mo2317a())) {
            Context context = this.context;
            kbu kbu = this.lifecycle;
            CharSequence string = context.getString(bc.ab);
            jca jca = (jca) jyn.m25426a(context, jca.class);
            int a2 = jca.mo2317a();
            Intent intent = new Intent(context, MessageNotificationSettingsActivity.class);
            intent.putExtra("account_id", a2);
            jwi a3 = jwo.m25344a(string, null, intent);
            kbu.m25514a(new fuv(a3, jca.mo2317a(), jca.mo2320c()));
            a.m10483c(a3);
        } else {
            a.m10483c(NotificationSettingsActivity.m9176a(this.context, this.lifecycle, jwo, bc.ab, "chat_notification_enabled_key", "chat_notification_sound_key", 2, "chat_notification_vibrate_bool_key"));
        }
        a.m10483c(NotificationSettingsActivity.m9176a(this.context, this.lifecycle, jwo, bc.fx, "hangouts_notification_enabled_key", "hangout_sound_key", 1, "hangout_vibrate_boolean_key"));
    }
}
