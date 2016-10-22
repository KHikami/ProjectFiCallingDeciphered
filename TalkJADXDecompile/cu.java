import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;

public class cu {
    public static cu a(Context context, int i, int i2) {
        if (VERSION.SDK_INT >= 24) {
            return new cx(new db(ActivityOptions.makeCustomAnimation(context, i, i2)));
        }
        if (VERSION.SDK_INT >= 23) {
            return new cw(new da(ActivityOptions.makeCustomAnimation(context, i, i2)));
        }
        if (VERSION.SDK_INT >= 21) {
            return new cv(new cz(ActivityOptions.makeCustomAnimation(context, i, i2)));
        }
        if (VERSION.SDK_INT >= 16) {
            return new cy(new dc(ActivityOptions.makeCustomAnimation(context, i, i2)));
        }
        return new cu();
    }

    protected cu() {
    }

    public Bundle a() {
        return null;
    }
}
