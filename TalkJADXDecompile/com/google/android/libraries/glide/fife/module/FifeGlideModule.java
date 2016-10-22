package com.google.android.libraries.glide.fife.module;

import amr;
import ayx;
import com.google.android.apps.common.proguard.UsedByReflection;
import iht;
import ihw;
import ihx;
import ihz;
import iia;
import java.io.InputStream;
import java.nio.ByteBuffer;

@UsedByReflection
public final class FifeGlideModule implements ayx {
    public void a(amr amr) {
        amr.b(String.class, InputStream.class, new iia());
        amr.b(String.class, ByteBuffer.class, new ihz());
        amr.a(iht.class, ByteBuffer.class, new ihw());
        amr.a(iht.class, InputStream.class, new ihx());
    }
}
