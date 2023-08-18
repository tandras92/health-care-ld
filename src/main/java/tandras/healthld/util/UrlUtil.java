package tandras.healthld.util;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public final class UrlUtil {

    private UrlUtil(){}

    public static String decodeUrl(String url) {
        Objects.requireNonNull(url, "Error Decoding: URL must not be null");
        return URLDecoder.decode(url, StandardCharsets.UTF_8);
    }

    public static String encodeUrl(String url) {
        Objects.requireNonNull(url, "Error Encoding: URL must not be null");
        return URLEncoder.encode(url, StandardCharsets.UTF_8);
    }
}
