package p000;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.concurrent.atomic.AtomicReference;

public final class bah {
    private static final AtomicReference<byte[]> f2724a = new AtomicReference();

    public static ByteBuffer m4665a(File file) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileChannel fileChannel = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile2.getChannel();
                try {
                    ByteBuffer load = channel.map(MapMode.READ_ONLY, 0, file.length()).load();
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e) {
                        }
                    }
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e2) {
                    }
                    return load;
                } catch (Throwable th2) {
                    randomAccessFile = randomAccessFile2;
                    FileChannel fileChannel2 = channel;
                    th = th2;
                    fileChannel = fileChannel2;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e3) {
                        }
                    }
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = randomAccessFile2;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    public static void m4666a(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException e) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException e2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException e3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    public static InputStream m4668b(ByteBuffer byteBuffer) {
        return new bai(byteBuffer);
    }

    public static byte[] m4667a(ByteBuffer byteBuffer) {
        baj baj;
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            baj = null;
        } else {
            baj = new baj(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        if (baj != null && baj.f2727a == 0 && baj.f2728b == baj.f2729c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }
}
