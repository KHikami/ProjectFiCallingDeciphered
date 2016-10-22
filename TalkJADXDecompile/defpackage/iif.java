package defpackage;

import android.util.SparseArray;
import com.google.api.client.http.HttpStatusCodes;

/* renamed from: iif */
public final class iif {
    public static final SparseArray<iig> a;

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(2, new iig(1, 2));
        sparseArray.put(4, new iig(2, 3));
        sparseArray.put(5, new iig(3, 4));
        sparseArray.put(6, new iig(2, 4));
        sparseArray.put(7, new iig(4, 5));
        sparseArray.put(8, new iig(2, 5));
        sparseArray.put(9, new iig(4, 6));
        sparseArray.put(10, new iig(2, 6));
        sparseArray.put(11, new iig(4, 7));
        sparseArray.put(12, new iig(2, 7));
        sparseArray.put(13, new iig(4, 8));
        sparseArray.put(14, new iig(2, 8));
        sparseArray.put(15, new iig(4, 9));
        sparseArray.put(16, new iig(2, 9));
        sparseArray.put(101, new iig(100, 101));
        sparseArray.put(102, new iig(100, 102));
        sparseArray.put(104, new iig(103, 104));
        sparseArray.put(105, new iig(103, 105));
        sparseArray.put(107, new iig(106, 107));
        sparseArray.put(108, new iig(106, 108));
        sparseArray.put(110, new iig(109, 110));
        sparseArray.put(111, new iig(109, 111));
        sparseArray.put(112, new iig(112, 113));
        sparseArray.put(113, new iig(112, 114));
        sparseArray.put(HttpStatusCodes.STATUS_CODE_OK, new iig(HttpStatusCodes.STATUS_CODE_OK, 201));
        sparseArray.put(201, new iig(201, 202));
        sparseArray.put(202, new iig(201, 203));
        sparseArray.put(203, new iig(201, HttpStatusCodes.STATUS_CODE_NO_CONTENT));
        sparseArray.put(HttpStatusCodes.STATUS_CODE_NO_CONTENT, new iig(HttpStatusCodes.STATUS_CODE_OK, 205));
        sparseArray.put(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, new iig(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, 501));
        sparseArray.put(501, new iig(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, HttpStatusCodes.STATUS_CODE_BAD_GATEWAY));
        sparseArray.put(HttpStatusCodes.STATUS_CODE_BAD_GATEWAY, new iig(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE));
        a = sparseArray;
    }
}
