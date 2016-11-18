package defpackage;

import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

final class zw extends AsyncTask<Object, Void, Void> {
    final /* synthetic */ zt a;

    zw(zt ztVar) {
        this.a = ztVar;
    }

    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return a(objArr);
    }

    private Void a(Object... objArr) {
        int i = 0;
        List list = (List) objArr[0];
        String str = (String) objArr[1];
        try {
            OutputStream openFileOutput = this.a.b.openFileOutput(str, 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, null);
                newSerializer.startDocument("UTF-8", Boolean.valueOf(true));
                newSerializer.startTag(null, "historical-records");
                int size = list.size();
                while (i < size) {
                    zv zvVar = (zv) list.remove(0);
                    newSerializer.startTag(null, "historical-record");
                    newSerializer.attribute(null, "activity", zvVar.a.flattenToString());
                    newSerializer.attribute(null, "time", String.valueOf(zvVar.b));
                    newSerializer.attribute(null, "weight", String.valueOf(zvVar.c));
                    newSerializer.endTag(null, "historical-record");
                    i++;
                }
                newSerializer.endTag(null, "historical-records");
                newSerializer.endDocument();
                this.a.d = true;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e) {
                    }
                }
            } catch (Throwable e2) {
                Log.e(zt.a, "Error writing historical record file: " + this.a.c, e2);
                this.a.d = true;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable e22) {
                Log.e(zt.a, "Error writing historical record file: " + this.a.c, e22);
                this.a.d = true;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e4) {
                    }
                }
            } catch (Throwable e222) {
                Log.e(zt.a, "Error writing historical record file: " + this.a.c, e222);
                this.a.d = true;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e5) {
                    }
                }
            } catch (Throwable th) {
                this.a.d = true;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e6) {
                    }
                }
            }
        } catch (Throwable e2222) {
            Log.e(zt.a, "Error writing historical record file: " + str, e2222);
        }
        return null;
    }
}
