package p000;

import android.os.Bundle;
import java.io.IOException;

public class awx extends IOException {
    private static final long serialVersionUID = -4338378848813561757L;

    public awx(String str) {
        super(str);
    }

    public awx(Bundle bundle) {
        String str = "Blocked by rule: ";
        String valueOf = String.valueOf(bundle.getString("name"));
        super(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public awx(int i, int i2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
    }
}
