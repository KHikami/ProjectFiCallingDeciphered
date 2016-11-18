package p000;

import android.os.AsyncTask;
import android.os.ConditionVariable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class eng extends AsyncTask<Void, Void, Void> {
    private File f11877a;
    private File f11878b;
    private ConditionVariable f11879c;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m14140a();
    }

    public /* synthetic */ void onPostExecute(Object obj) {
        m14141b();
    }

    public eng(File file, File file2, ConditionVariable conditionVariable) {
        this.f11877a = file;
        this.f11878b = file2;
        this.f11879c = conditionVariable;
    }

    private Void m14140a() {
        BufferedInputStream bufferedInputStream;
        Throwable e;
        long length;
        long length2;
        BufferedInputStream bufferedInputStream2 = null;
        BufferedOutputStream bufferedOutputStream;
        try {
            if (this.f11878b.exists()) {
                this.f11878b.delete();
            }
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.f11878b));
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f11877a));
            } catch (IOException e2) {
                e = e2;
                bufferedInputStream = null;
                try {
                    glk.m17978c("Babel_DumpDatabase", "Exception copying the database; destination may not be complete.", e);
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable e3) {
                            glk.m17978c("Babel_DumpDatabase", "Caught exception closing file", e3);
                        }
                    }
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable e32) {
                            glk.m17978c("Babel_DumpDatabase", "Caught exception closing file", e32);
                        }
                    }
                    length = this.f11877a.length();
                    glk.m17979c("Babel_DumpDatabase", "Dump complete; orig size: " + length + ", copy size: " + this.f11878b.length(), new Object[0]);
                    return null;
                } catch (Throwable th) {
                    e32 = th;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable e4) {
                            glk.m17978c("Babel_DumpDatabase", "Caught exception closing file", e4);
                        }
                    }
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (Throwable e42) {
                            glk.m17978c("Babel_DumpDatabase", "Caught exception closing file", e42);
                        }
                    }
                    length2 = this.f11877a.length();
                    glk.m17979c("Babel_DumpDatabase", "Dump complete; orig size: " + length2 + ", copy size: " + this.f11878b.length(), new Object[0]);
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
                length2 = this.f11877a.length();
                glk.m17979c("Babel_DumpDatabase", "Dump complete; orig size: " + length2 + ", copy size: " + this.f11878b.length(), new Object[0]);
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
                            glk.m17978c("Babel_DumpDatabase", "Caught exception closing file", e322);
                        }
                    }
                }
                bufferedOutputStream.close();
                try {
                    bufferedInputStream.close();
                } catch (Throwable e3222) {
                    glk.m17978c("Babel_DumpDatabase", "Caught exception closing file", e3222);
                }
                length = this.f11877a.length();
                glk.m17979c("Babel_DumpDatabase", "Dump complete; orig size: " + length + ", copy size: " + this.f11878b.length(), new Object[0]);
            } catch (IOException e5) {
                e3222 = e5;
                glk.m17978c("Babel_DumpDatabase", "Exception copying the database; destination may not be complete.", e3222);
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                length = this.f11877a.length();
                glk.m17979c("Babel_DumpDatabase", "Dump complete; orig size: " + length + ", copy size: " + this.f11878b.length(), new Object[0]);
                return null;
            }
        } catch (IOException e6) {
            e3222 = e6;
            bufferedInputStream = null;
            bufferedOutputStream = null;
            glk.m17978c("Babel_DumpDatabase", "Exception copying the database; destination may not be complete.", e3222);
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            length = this.f11877a.length();
            glk.m17979c("Babel_DumpDatabase", "Dump complete; orig size: " + length + ", copy size: " + this.f11878b.length(), new Object[0]);
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
            length2 = this.f11877a.length();
            glk.m17979c("Babel_DumpDatabase", "Dump complete; orig size: " + length2 + ", copy size: " + this.f11878b.length(), new Object[0]);
            throw e3222;
        }
        return null;
    }

    private void m14141b() {
        this.f11879c.open();
    }
}