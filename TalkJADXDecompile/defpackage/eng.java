package defpackage;

import android.os.AsyncTask;
import android.os.ConditionVariable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: eng */
public final class eng extends AsyncTask<Void, Void, Void> {
    private File a;
    private File b;
    private ConditionVariable c;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    public /* synthetic */ void onPostExecute(Object obj) {
        b();
    }

    public eng(File file, File file2, ConditionVariable conditionVariable) {
        this.a = file;
        this.b = file2;
        this.c = conditionVariable;
    }

    private Void a() {
        BufferedInputStream bufferedInputStream;
        Throwable e;
        long length;
        long length2;
        BufferedInputStream bufferedInputStream2 = null;
        BufferedOutputStream bufferedOutputStream;
        try {
            if (this.b.exists()) {
                this.b.delete();
            }
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.b));
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(this.a));
            } catch (IOException e2) {
                e = e2;
                bufferedInputStream = null;
                try {
                    glk.c("Babel_DumpDatabase", "Exception copying the database; destination may not be complete.", e);
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable e3) {
                            glk.c("Babel_DumpDatabase", "Caught exception closing file", e3);
                        }
                    }
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable e32) {
                            glk.c("Babel_DumpDatabase", "Caught exception closing file", e32);
                        }
                    }
                    length = this.a.length();
                    glk.c("Babel_DumpDatabase", "Dump complete; orig size: " + length + ", copy size: " + this.b.length(), new Object[0]);
                    return null;
                } catch (Throwable th) {
                    e32 = th;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable e4) {
                            glk.c("Babel_DumpDatabase", "Caught exception closing file", e4);
                        }
                    }
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (Throwable e42) {
                            glk.c("Babel_DumpDatabase", "Caught exception closing file", e42);
                        }
                    }
                    length2 = this.a.length();
                    glk.c("Babel_DumpDatabase", "Dump complete; orig size: " + length2 + ", copy size: " + this.b.length(), new Object[0]);
                    throw e32;
                }
            } catch (Throwable th2) {
                e32 = th2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                length2 = this.a.length();
                glk.c("Babel_DumpDatabase", "Dump complete; orig size: " + length2 + ", copy size: " + this.b.length(), new Object[0]);
                throw e32;
            }
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read > 0) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (Throwable e322) {
                            glk.c("Babel_DumpDatabase", "Caught exception closing file", e322);
                        }
                    }
                }
                bufferedOutputStream.close();
                try {
                    bufferedInputStream.close();
                } catch (Throwable e3222) {
                    glk.c("Babel_DumpDatabase", "Caught exception closing file", e3222);
                }
                length = this.a.length();
                glk.c("Babel_DumpDatabase", "Dump complete; orig size: " + length + ", copy size: " + this.b.length(), new Object[0]);
            } catch (IOException e5) {
                e3222 = e5;
                glk.c("Babel_DumpDatabase", "Exception copying the database; destination may not be complete.", e3222);
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                length = this.a.length();
                glk.c("Babel_DumpDatabase", "Dump complete; orig size: " + length + ", copy size: " + this.b.length(), new Object[0]);
                return null;
            }
        } catch (IOException e6) {
            e3222 = e6;
            bufferedInputStream = null;
            bufferedOutputStream = null;
            glk.c("Babel_DumpDatabase", "Exception copying the database; destination may not be complete.", e3222);
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            length = this.a.length();
            glk.c("Babel_DumpDatabase", "Dump complete; orig size: " + length + ", copy size: " + this.b.length(), new Object[0]);
            return null;
        } catch (Throwable th3) {
            e3222 = th3;
            bufferedOutputStream = null;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            length2 = this.a.length();
            glk.c("Babel_DumpDatabase", "Dump complete; orig size: " + length2 + ", copy size: " + this.b.length(), new Object[0]);
            throw e3222;
        }
        return null;
    }

    private void b() {
        this.c.open();
    }
}
