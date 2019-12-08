package org.sharpsw.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubDomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        var domainCount = new HashMap<String, Long>();

        for (String cpdomain : cpdomains) {
            var tokens = cpdomain.split(" ");
            var count = Long.parseLong(tokens[0]);
            var domains = tokens[1];

            // breaks the domains
            var domainBuffer = "";
            var items = domains.split("\\.");
            for (int index = items.length - 1; index >= 0; index--) {

                if (index == items.length - 1) {
                    domainBuffer = items[index];
                } else {
                    domainBuffer = items[index] + "." + domainBuffer;
                }

                if (domainCount.containsKey(domainBuffer.toString())) {
                    var total = count + domainCount.get(domainBuffer);
                    domainCount.put(domainBuffer, total);
                } else {
                    domainCount.put(domainBuffer, count);
                }
            }
        }

        var result = new ArrayList<String>();
        var items = domainCount.entrySet();
        items.stream().forEach(item -> {
            var buffer = new StringBuilder();
            buffer.append(item.getValue()).append(" ").append(item.getKey());
            result.add(buffer.toString());
        });
        return result;
    }
}
