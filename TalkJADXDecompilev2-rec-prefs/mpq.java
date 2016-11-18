package p000;

import android.util.Log;
import java.util.logging.Level;

public final class mpq extends mpg {
    private final String f28057a;

    public mpq(String str) {
        super(str);
        this.f28057a = str.substring(Math.max(0, str.length() - 22));
    }

    public boolean mo3711a(Level level) {
        return Log.isLoggable(this.f28057a, mpq.m32666b(level));
    }

    private static int m32666b(Level level) {
        int intValue = level.intValue();
        if (intValue >= 1000) {
            return 6;
        }
        if (intValue >= 900) {
            return 5;
        }
        if (intValue >= 800) {
            return 4;
        }
        if (intValue >= 700) {
            return 3;
        }
        return 2;
    }

    public void mo3710a(C0000a c0000a) {
        StringBuilder append;
        mon a = m29090a();
        StringBuilder stringBuilder = new StringBuilder();
        mpf y = c0000a.m28y();
        if (y == null) {
            append = stringBuilder.append(a.m32633b(c0000a.m4A()));
        } else {
            append = (StringBuilder) y.m32650a(new moc(c0000a.m29z(), a, stringBuilder));
        }
        c0000a.m27x().mo3905a();
        switch (mpq.m32666b(c0000a.m26w())) {
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Log.e(this.f28057a, append.toString(), null);
                return;
            default:
                Log.wtf(this.f28057a, String.format("Level \"%d\" is not a valid level", new Object[]{Integer.valueOf(c0000a.m26w().intValue())}));
                return;
        }
    }
}
