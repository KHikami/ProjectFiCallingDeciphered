import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class gks {
    private static final boolean a;

    static {
        kae kae = glk.t;
        a = false;
    }

    public static int a(int i, int i2, int i3, String str) {
        if (i == -1) {
            return i3;
        }
        String valueOf;
        SharedPreferences sharedPreferences = gwb.H().getSharedPreferences("notificationRequestCodes.v1", 0);
        if (str == null) {
            valueOf = String.valueOf("|");
            valueOf = new StringBuilder(String.valueOf(valueOf).length() + 22).append(i).append(valueOf).append(i3).toString();
        } else {
            valueOf = String.valueOf("|");
            String valueOf2 = String.valueOf("|");
            valueOf = new StringBuilder(((String.valueOf(valueOf).length() + 22) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()).append(i).append(valueOf).append(i3).append(valueOf2).append(str).toString();
        }
        int i4 = sharedPreferences.getInt(valueOf, 0);
        if (i4 == 0) {
            i4 = sharedPreferences.getInt("maxRequestCode", 1001) + 1;
            Editor edit = sharedPreferences.edit();
            edit.putInt("maxRequestCode", (i4 + i2) - 1);
            edit.putInt(valueOf, i4);
            edit.apply();
            if (a) {
                new StringBuilder(String.valueOf(valueOf).length() + 118).append("New Request code assigned for account=").append(i).append(" numReserved=").append(i2).append(" type=").append(i3).append(" assigned=").append(i4).append(" (key=").append(valueOf).append(")");
            }
        }
        return i4;
    }

    public static int a(int i) {
        return i;
    }
}
