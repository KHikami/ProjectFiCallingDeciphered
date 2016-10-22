import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

abstract class dp extends do {
    boolean b;

    dp() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.b || i == -1)) {
            dn.b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!(this.a || i == -1)) {
            dn.b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
