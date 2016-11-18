package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

final class ht implements hs {
    ht() {
    }

    public PendingIntent a(Context context, Intent[] intentArr, int i, int i2) {
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        return PendingIntent.getActivity(context, i, intent, i2);
    }
}
