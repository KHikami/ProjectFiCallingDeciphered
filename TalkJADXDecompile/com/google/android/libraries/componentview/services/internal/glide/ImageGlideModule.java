package com.google.android.libraries.componentview.services.internal.glide;

import amr;
import ayx;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.componentview.services.internal.glide.GlideUrlLoader.Factory;
import java.io.InputStream;

@UsedByReflection
public class ImageGlideModule implements ayx {
    static boolean a;
    static final Object b;

    static {
        b = new Object();
    }

    public void a(amr amr) {
        synchronized (b) {
            if (a) {
                return;
            }
            amr.c(ImageUrl.class, InputStream.class, new Factory());
            a = true;
        }
    }
}
