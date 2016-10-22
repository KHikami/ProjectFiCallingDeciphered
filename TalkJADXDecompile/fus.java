import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.MessageNotificationSettingsActivity;
import com.google.android.apps.hangouts.settings.NotificationSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fus extends jzn implements jwg {
    private jca a;

    public fus() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jca) this.binder.a(jca.class);
    }

    public void a() {
        jwo jwo = new jwo(this.context);
        PreferenceCategory a = jwo.a(bc.ad);
        if (fdq.O.b(this.a.a())) {
            Context context = this.context;
            kbu kbu = this.lifecycle;
            CharSequence string = context.getString(bc.ab);
            jca jca = (jca) jyn.a(context, jca.class);
            int a2 = jca.a();
            Intent intent = new Intent(context, MessageNotificationSettingsActivity.class);
            intent.putExtra("account_id", a2);
            jwi a3 = jwo.a(string, null, intent);
            kbu.a(new fuv(a3, jca.a(), jca.c()));
            a.c(a3);
        } else {
            a.c(NotificationSettingsActivity.a(this.context, this.lifecycle, jwo, bc.ab, "chat_notification_enabled_key", "chat_notification_sound_key", 2, "chat_notification_vibrate_bool_key"));
        }
        a.c(NotificationSettingsActivity.a(this.context, this.lifecycle, jwo, bc.fx, "hangouts_notification_enabled_key", "hangout_sound_key", 1, "hangout_vibrate_boolean_key"));
    }
}
