import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseException.Builder;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import java.io.IOException;

public final class kee extends HttpResponseException {
    private static final long serialVersionUID = 4020689092957439244L;
    final transient kdz a;

    private kee(Builder builder, kdz kdz) {
        super(builder);
        this.a = kdz;
    }

    public static kee a(JsonFactory jsonFactory, HttpResponse httpResponse) {
        kdz kdz;
        IOException e;
        kdz kdz2;
        Object obj;
        kdz kdz3 = null;
        Builder builder = new Builder(httpResponse.getStatusCode(), httpResponse.getStatusMessage(), httpResponse.getHeaders());
        bc.a((Object) jsonFactory);
        String contentType = httpResponse.getContentType();
        StringBuilder computeMessageBuffer;
        try {
            if (httpResponse.isSuccessStatusCode() || contentType == null || httpResponse.getContent() == null || !HttpMediaType.equalsIgnoreParameters(Json.MEDIA_TYPE, contentType)) {
                contentType = httpResponse.parseAsString();
                computeMessageBuffer = HttpResponseException.computeMessageBuffer(httpResponse);
                if (!gwb.ag(contentType)) {
                    computeMessageBuffer.append(kgn.a).append(contentType);
                    builder.setContent(contentType);
                }
                builder.setMessage(computeMessageBuffer.toString());
                return new kee(builder, kdz3);
            }
            kdz = (kdz) new JsonObjectParser(jsonFactory).parseAndClose(httpResponse.getContent(), httpResponse.getContentCharset(), kdz.class);
            try {
                kdz3 = kdz;
                contentType = kdz.toPrettyString();
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                kdz2 = kdz3;
                kdz3 = kdz;
                obj = kdz2;
                computeMessageBuffer = HttpResponseException.computeMessageBuffer(httpResponse);
                if (gwb.ag(contentType)) {
                    computeMessageBuffer.append(kgn.a).append(contentType);
                    builder.setContent(contentType);
                }
                builder.setMessage(computeMessageBuffer.toString());
                return new kee(builder, kdz3);
            }
            computeMessageBuffer = HttpResponseException.computeMessageBuffer(httpResponse);
            if (gwb.ag(contentType)) {
                computeMessageBuffer.append(kgn.a).append(contentType);
                builder.setContent(contentType);
            }
            builder.setMessage(computeMessageBuffer.toString());
            return new kee(builder, kdz3);
        } catch (IOException e3) {
            e = e3;
            kdz = kdz3;
            e.printStackTrace();
            kdz2 = kdz3;
            kdz3 = kdz;
            obj = kdz2;
            computeMessageBuffer = HttpResponseException.computeMessageBuffer(httpResponse);
            if (gwb.ag(contentType)) {
                computeMessageBuffer.append(kgn.a).append(contentType);
                builder.setContent(contentType);
            }
            builder.setMessage(computeMessageBuffer.toString());
            return new kee(builder, kdz3);
        }
    }
}
