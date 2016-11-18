package defpackage;

import android.util.Log;
import java.util.logging.Level;

public final class mpq extends mpg {
    private final String a;

    public mpq(String str) {
        super(str);
        this.a = str.substring(Math.max(0, str.length() - 22));
    }

    public boolean a(Level level) {
        return Log.isLoggable(this.a, mpq.b(level));
    }

    private static int b(Level level) {
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

    public void a(a aVar) {
        StringBuilder append;
        mon a = a();
        StringBuilder stringBuilder = new StringBuilder();
        mpf y = aVar.y();
        if (y == null) {
            append = stringBuilder.append(a.b(aVar.A()));
        } else {
            append = (StringBuilder) y.a(new moc(aVar.z(), a, stringBuilder));
        }
        aVar.x().a();
        switch (mpq.b(aVar.w())) {
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Log.e(this.a, append.toString(), null);
                return;
            default:
                Log.wtf(this.a, String.format("Level \"%d\" is not a valid level", new Object[]{Integer.valueOf(aVar.w().intValue())}));
                return;
        }
    }
}
