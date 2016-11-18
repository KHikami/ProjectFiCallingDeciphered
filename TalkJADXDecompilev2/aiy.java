package defpackage;

import android.content.Context;
import android.drm.DrmConvertedStatus;
import android.drm.DrmManagerClient;
import com.google.api.client.http.HttpStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class aiy {
    private DrmManagerClient a;
    private int b;

    private aiy(DrmManagerClient drmManagerClient, int i) {
        this.a = drmManagerClient;
        this.b = i;
    }

    public static aiy a(Context context, String str) {
        int i;
        DrmManagerClient drmManagerClient;
        DrmManagerClient drmManagerClient2;
        int i2;
        int i3 = -1;
        if (context == null || str == null || str.equals("")) {
            i = i3;
            drmManagerClient = null;
        } else {
            try {
                drmManagerClient2 = new DrmManagerClient(context);
                try {
                    drmManagerClient = drmManagerClient2;
                    i = drmManagerClient2.openConvertSession(str);
                } catch (IllegalArgumentException e) {
                    try {
                        new StringBuilder(String.valueOf(str).length() + 42).append("Conversion of Mimetype: ").append(str).append(" is not supported.");
                        i2 = i3;
                        drmManagerClient = drmManagerClient2;
                        i = i2;
                    } catch (IllegalArgumentException e2) {
                        i2 = i3;
                        drmManagerClient = drmManagerClient2;
                        i = i2;
                        return drmManagerClient != null ? null : null;
                    } catch (IllegalStateException e3) {
                        i2 = i3;
                        drmManagerClient = drmManagerClient2;
                        i = i2;
                        if (drmManagerClient != null) {
                        }
                    }
                } catch (IllegalStateException e4) {
                    i2 = i3;
                    drmManagerClient = drmManagerClient2;
                    i = i2;
                }
            } catch (IllegalArgumentException e5) {
                drmManagerClient2 = null;
                i2 = i3;
                drmManagerClient = drmManagerClient2;
                i = i2;
                if (drmManagerClient != null) {
                }
            } catch (IllegalStateException e6) {
                drmManagerClient2 = null;
                i2 = i3;
                drmManagerClient = drmManagerClient2;
                i = i2;
                if (drmManagerClient != null) {
                }
            }
        }
        if (drmManagerClient != null && i >= 0) {
            return new aiy(drmManagerClient, i);
        }
    }

    public byte[] a(byte[] bArr, int i) {
        if (bArr != null) {
            try {
                DrmConvertedStatus convertData;
                if (i != bArr.length) {
                    Object obj = new byte[i];
                    System.arraycopy(bArr, 0, obj, 0, i);
                    convertData = this.a.convertData(this.b, obj);
                } else {
                    convertData = this.a.convertData(this.b, bArr);
                }
                if (convertData == null || convertData.statusCode != 1 || convertData.convertedData == null) {
                    return null;
                }
                return convertData.convertedData;
            } catch (IllegalArgumentException e) {
                new StringBuilder(67).append("Buffer with data to convert is illegal. Convertsession: ").append(this.b);
                return null;
            } catch (IllegalStateException e2) {
                new StringBuilder(51).append("Could not convert data. Convertsession: ").append(this.b);
                return null;
            }
        }
        throw new IllegalArgumentException("Parameter inBuffer is null");
    }

    public int a(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        Throwable th;
        int i = 492;
        int i2 = 491;
        if (this.a != null && this.b >= 0) {
            try {
                DrmConvertedStatus closeConvertSession = this.a.closeConvertSession(this.b);
                if (closeConvertSession == null || closeConvertSession.statusCode != 1 || closeConvertSession.convertedData == null) {
                    return 406;
                }
                RandomAccessFile randomAccessFile3 = null;
                try {
                    randomAccessFile = new RandomAccessFile(str, "rw");
                    try {
                        randomAccessFile.seek((long) closeConvertSession.offset);
                        randomAccessFile.write(closeConvertSession.convertedData);
                        try {
                            randomAccessFile.close();
                            return HttpStatusCodes.STATUS_CODE_OK;
                        } catch (IOException e) {
                            try {
                                new StringBuilder(String.valueOf(str).length() + 22).append("Failed to close File:").append(str).append(".");
                                return 492;
                            } catch (IllegalStateException e2) {
                                new StringBuilder(59).append("Could not close convertsession. Convertsession: ").append(this.b);
                                return i;
                            }
                        }
                    } catch (FileNotFoundException e3) {
                        randomAccessFile2 = randomAccessFile;
                        try {
                            new StringBuilder(String.valueOf(str).length() + 26).append("File: ").append(str).append(" could not be found.");
                            if (randomAccessFile2 != null) {
                                return 492;
                            }
                            try {
                                randomAccessFile2.close();
                                return 492;
                            } catch (IOException e4) {
                                new StringBuilder(String.valueOf(str).length() + 22).append("Failed to close File:").append(str).append(".");
                                return 492;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile3 = randomAccessFile2;
                            i2 = 492;
                            if (randomAccessFile3 != null) {
                                try {
                                    randomAccessFile3.close();
                                } catch (IOException e5) {
                                    new StringBuilder(String.valueOf(str).length() + 22).append("Failed to close File:").append(str).append(".");
                                    i2 = 492;
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e6) {
                        try {
                            new StringBuilder(String.valueOf(str).length() + 25).append("Could not access File: ").append(str).append(" .");
                            if (randomAccessFile != null) {
                                return 492;
                            }
                            try {
                                randomAccessFile.close();
                                return 492;
                            } catch (IOException e7) {
                                new StringBuilder(String.valueOf(str).length() + 22).append("Failed to close File:").append(str).append(".");
                                return 492;
                            }
                        } catch (Throwable th3) {
                            randomAccessFile3 = randomAccessFile;
                            th = th3;
                            i2 = 492;
                            if (randomAccessFile3 != null) {
                                randomAccessFile3.close();
                            }
                            throw th;
                        }
                    } catch (IllegalArgumentException e8) {
                        if (randomAccessFile != null) {
                            return 492;
                        }
                        try {
                            randomAccessFile.close();
                            return 492;
                        } catch (IOException e9) {
                            new StringBuilder(String.valueOf(str).length() + 22).append("Failed to close File:").append(str).append(".");
                            return 492;
                        }
                    } catch (SecurityException e10) {
                        try {
                            new StringBuilder(String.valueOf(str).length() + 54).append("Access to File: ").append(str).append(" was denied denied by SecurityManager.");
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                    return 491;
                                } catch (IOException e11) {
                                    new StringBuilder(String.valueOf(str).length() + 22).append("Failed to close File:").append(str).append(".");
                                    return 492;
                                }
                            }
                            return 491;
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            randomAccessFile3 = randomAccessFile;
                            th = th5;
                            if (randomAccessFile3 != null) {
                                randomAccessFile3.close();
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e12) {
                    randomAccessFile2 = null;
                    new StringBuilder(String.valueOf(str).length() + 26).append("File: ").append(str).append(" could not be found.");
                    if (randomAccessFile2 != null) {
                        return 492;
                    }
                    randomAccessFile2.close();
                    return 492;
                } catch (IOException e13) {
                    randomAccessFile = null;
                    new StringBuilder(String.valueOf(str).length() + 25).append("Could not access File: ").append(str).append(" .");
                    if (randomAccessFile != null) {
                        return 492;
                    }
                    randomAccessFile.close();
                    return 492;
                } catch (IllegalArgumentException e14) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        return 492;
                    }
                    randomAccessFile.close();
                    return 492;
                } catch (SecurityException e15) {
                    randomAccessFile = null;
                    new StringBuilder(String.valueOf(str).length() + 54).append("Access to File: ").append(str).append(" was denied denied by SecurityManager.");
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                        return 491;
                    }
                    return 491;
                } catch (Throwable th6) {
                    th = th6;
                    if (randomAccessFile3 != null) {
                        randomAccessFile3.close();
                    }
                    throw th;
                }
            } catch (IllegalStateException e16) {
                i = i2;
            }
        }
        return 491;
    }
}
