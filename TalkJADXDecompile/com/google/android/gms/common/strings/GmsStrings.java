package com.google.android.gms.common.strings;

import java.util.ListResourceBundle;

public class GmsStrings extends ListResourceBundle {
    private static final Object[][] a;

    static {
        r0 = new Object[10][];
        r0[0] = new Object[]{"installPlayServicesTitle", "Get Google Play services"};
        r0[1] = new Object[]{"installPlayServicesTextPhone", "This app won't run without Google Play services, which are missing from your phone."};
        r0[2] = new Object[]{"installPlayServicesTextTablet", "This app won't run without Google Play services, which are missing from your tablet."};
        r0[3] = new Object[]{"installPlayServicesButton", "Get services"};
        r0[4] = new Object[]{"enablePlayServicesTitle", "Enable Google Play services"};
        r0[5] = new Object[]{"enablePlayServicesText", "This app won't work unless you enable Google Play services."};
        r0[6] = new Object[]{"enablePlayServicesButton", "Enable services"};
        r0[7] = new Object[]{"updatePlayServicesTitle", "Update Google Play services"};
        r0[8] = new Object[]{"updatePlayServicesText", "This app won't run unless you update Google Play services."};
        r0[9] = new Object[]{"updatePlayServicesButton", "Update"};
        a = r0;
    }

    protected Object[][] getContents() {
        return a;
    }
}
