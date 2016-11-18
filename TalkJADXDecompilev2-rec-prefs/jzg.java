package p000;

import android.app.Activity;
import android.content.Context;

public final class jzg extends jzj<jze> {
    private final Activity f21318b;

    public jzg(Activity activity, kbu kbu) {
        super(kbu, jzf.class);
        this.f21318b = activity;
    }

    private void m25474a(jze jze, kbu kbu, jyn jyn) {
        jze.mo674a(this.f21318b, kbu, jyn);
    }

    protected jzi<jze> mo3630a(Context context) {
        return new jzf(context);
    }
}
