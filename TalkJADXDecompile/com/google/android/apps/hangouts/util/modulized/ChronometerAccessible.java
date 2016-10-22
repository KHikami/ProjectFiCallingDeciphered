package com.google.android.apps.hangouts.util.modulized;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Chronometer;
import glj;
import gwb;
import java.util.concurrent.TimeUnit;

public class ChronometerAccessible extends Chronometer {
    public ChronometerAccessible(Context context) {
        super(context);
    }

    public ChronometerAccessible(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChronometerAccessible(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ChronometerAccessible(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public CharSequence getContentDescription() {
        Object obj;
        Object obj2;
        String str;
        long b = glj.b() - getBase();
        int toHours = (int) TimeUnit.MILLISECONDS.toHours(b);
        int toMinutes = (int) (TimeUnit.MILLISECONDS.toMinutes(b) - TimeUnit.HOURS.toMinutes((long) toHours));
        int toSeconds = (int) ((TimeUnit.MILLISECONDS.toSeconds(b) - TimeUnit.MINUTES.toSeconds((long) toMinutes)) - TimeUnit.HOURS.toSeconds((long) toHours));
        if (toHours == 0) {
            obj = "";
        } else {
            String quantityString = getResources().getQuantityString(gwb.wB, toHours, new Object[]{Integer.valueOf(toHours)});
        }
        if (toMinutes == 0) {
            obj2 = "";
        } else {
            String quantityString2 = getResources().getQuantityString(gwb.wn, toMinutes, new Object[]{Integer.valueOf(toMinutes)});
        }
        if (toSeconds == 0) {
            str = "";
        } else {
            str = getResources().getQuantityString(gwb.wp, toSeconds, new Object[]{Integer.valueOf(toSeconds)});
        }
        return getResources().getString(gwb.wF, new Object[]{obj, obj2, str});
    }
}
