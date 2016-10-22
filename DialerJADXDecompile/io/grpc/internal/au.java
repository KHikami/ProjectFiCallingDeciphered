package io.grpc.internal;

import dhn;

/* compiled from: PG */
public enum au {
    NO_ERROR(0, dhn.j),
    PROTOCOL_ERROR(1, dhn.i),
    INTERNAL_ERROR(2, dhn.i),
    FLOW_CONTROL_ERROR(3, dhn.i),
    SETTINGS_TIMEOUT(4, dhn.i),
    STREAM_CLOSED(5, dhn.i),
    FRAME_SIZE_ERROR(6, dhn.i),
    REFUSED_STREAM(7, dhn.j),
    CANCEL(8, dhn.c),
    COMPRESSION_ERROR(9, dhn.i),
    CONNECT_ERROR(10, dhn.i),
    ENHANCE_YOUR_CALM(11, dhn.h.a("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, dhn.f.a("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, dhn.d);
    
    private static final au[] o;
    private final int p;
    private final dhn q;

    static {
        au[] values = values();
        au[] auVarArr = new au[(values[values.length - 1].p + 1)];
        int length = values.length;
        int i;
        while (i < length) {
            au auVar = values[i];
            auVarArr[auVar.p] = auVar;
            i++;
        }
        o = auVarArr;
    }

    private au(int i, dhn dhn) {
        this.p = i;
        String str = "HTTP/2 error code: ";
        String valueOf = String.valueOf(name());
        this.q = dhn.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public static dhn a(long j) {
        au auVar;
        if (j >= ((long) o.length) || j < 0) {
            auVar = null;
        } else {
            auVar = o[(int) j];
        }
        if (auVar == null) {
            return dhn.a(INTERNAL_ERROR.q.m.r).a("Unrecognized HTTP/2 error code: " + j);
        }
        return auVar.q;
    }
}
