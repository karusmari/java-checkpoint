package group2.BreakdownURL;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BreakdownURL {
    public Map<String, String> parseURL(String url) {
        Map<String, String> components = new HashMap<>();
        try {
            URL parsed = new URL(url);

            if (!parsed.getProtocol().isEmpty()) {
                components.put("protocol", parsed.getProtocol());
            }
            if (!parsed.getHost().isEmpty()) {
                components.put("domain", parsed.getHost());
            }
            if (parsed.getPort() != -1) { // -1 means no port specified
                components.put("port", String.valueOf(parsed.getPort()));
            }
            if (!parsed.getPath().isEmpty()) {
                components.put("path", parsed.getPath());
            }
            if (!parsed.getQuery().isEmpty()) {
                components.put("query", parsed.getQuery());
            }

        } catch (Exception e) {
            // If URL is invalid (but per your assumption, it’s always correct)
            return components;
        }
        return components;
    }
}