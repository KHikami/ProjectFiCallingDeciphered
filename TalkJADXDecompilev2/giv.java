package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import java.util.Set;

public final class giv {
    public static final boolean a = false;

    static {
        kae kae = glk.t;
    }

    public static boolean a() {
        if (gwb.H().getResources().getConfiguration().touchscreen != 1) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (giv.a()) {
            return ((AccessibilityManager) gwb.H().getSystemService("accessibility")).isTouchExplorationEnabled();
        }
        return true;
    }

    public static boolean c() {
        boolean z;
        Resources resources = gwb.H().getResources();
        if ((resources.getConfiguration().screenLayout & 15) >= 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) > 4 || configuration.smallestScreenWidthDp < 600) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static boolean d() {
        return gwb.H().getPackageManager().hasSystemFeature("android.hardware.nfc");
    }

    public static void a(Activity activity) {
        int integer;
        int dimensionPixelOffset;
        iil.a("Expected condition to be true", giv.c());
        Resources resources = activity.getResources();
        if (resources.getConfiguration().orientation == 2) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            integer = point.x / resources.getInteger(gwb.fD);
            dimensionPixelOffset = resources.getDimensionPixelOffset(gwb.fc);
        } else {
            integer = resources.getDimensionPixelOffset(gwb.fd);
            dimensionPixelOffset = resources.getDimensionPixelOffset(gwb.fe);
        }
        View findViewById = activity.findViewById(ba.eS);
        iil.a(Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()), Integer.valueOf(resources.getColor(gwb.dF)));
        findViewById.setPadding(integer, dimensionPixelOffset, integer, dimensionPixelOffset);
    }

    public static void a(Activity activity, Window window, int i, int i2) {
        DisplayMetrics displayMetrics = activity.getApplicationContext().getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(window.getAttributes());
        if (f > ((float) i)) {
            layoutParams.width = (int) (displayMetrics.density * ((float) i));
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
        }
    }

    public static void a(String str, Intent intent) {
        if (!a) {
            return;
        }
        if (intent == null) {
            new StringBuilder(String.valueOf(str).length() + 25).append("dumpIntent from: ").append(str).append(" is null");
            return;
        }
        Bundle extras = intent.getExtras();
        String valueOf = String.valueOf(extras);
        new StringBuilder((String.valueOf(str).length() + 26) + String.valueOf(valueOf).length()).append("dumpIntent from: ").append(str).append(" extras: ").append(valueOf);
        if (extras != null) {
            String type = intent.getType();
            String action = intent.getAction();
            Uri uri = (Uri) extras.getParcelable("android.intent.extra.STREAM");
            String dataString = intent.getDataString();
            String string = extras.getString("android.intent.extra.TEXT");
            String string2 = extras.getString("conversation_id");
            Set<String> keySet = extras.keySet();
            StringBuilder stringBuilder = new StringBuilder();
            for (String append : keySet) {
                stringBuilder.append(append).append(',');
            }
            valueOf = String.valueOf(uri);
            String append2 = String.valueOf(stringBuilder);
            new StringBuilder(((((((String.valueOf(type).length() + 79) + String.valueOf(action).length()) + String.valueOf(valueOf).length()) + String.valueOf(dataString).length()) + String.valueOf(string).length()) + String.valueOf(string2).length()) + String.valueOf(append2).length()).append("dumpIntent mimeType: ").append(type).append(" action: ").append(action).append(" uri: ").append(valueOf).append(" data: ").append(dataString).append(" extraText: ").append(string).append(" convId: ").append(string2).append(" extras keySet:").append(append2);
        }
    }
}
