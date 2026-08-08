package Week4;

import java.util.regex.*;
public class TemplateFiller 
{
 public static String fillTemplate(String template, String[] names, String[] values) {

        Pattern p = java.util.regex.Pattern.compile("\\{(\\w+)\\}");
        Matcher m = p.matcher(template);

        StringBuilder r = new StringBuilder();

        int last = 0;

        while (m.find()) {

            r.append(template.substring(last, m.start()));

            String key = m.group(1);

            String replace = "[?]";

            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(key)) {
                    replace = values[i];
                    break;
                }
            }

            r.append(replace);

            last = m.end();
        }

        r.append(template.substring(last));

        return r.toString();
    }
}
