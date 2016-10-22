package org.chromium.base;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class ImportantFileWriterAndroid {
    private static native boolean nativeWriteFileAtomically(String str, byte[] bArr);
}
