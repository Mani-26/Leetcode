class Solution {
    public boolean isValid(String code) {

        Stack<String> stack = new Stack<>();
        int i = 0;
        int n = code.length();

        while (i < n) {

            // Characters outside root tag
            if (i > 0 && stack.isEmpty())
                return false;

            // CDATA
            if (code.startsWith("<![CDATA[", i)) {

                if (stack.isEmpty())
                    return false;

                int end = code.indexOf("]]>", i);

                if (end == -1)
                    return false;

                i = end + 3;
            }

            // Closing tag
            else if (code.startsWith("</", i)) {

                int end = code.indexOf('>', i);

                if (end == -1)
                    return false;

                String tag = code.substring(i + 2, end);

                if (stack.isEmpty())
                    return false;

                if (!stack.peek().equals(tag))
                    return false;

                stack.pop();

                i = end + 1;
            }

            // Opening tag
            else if (code.charAt(i) == '<') {

                int end = code.indexOf('>', i);

                if (end == -1)
                    return false;

                String tag = code.substring(i + 1, end);

                if (tag.length() < 1 || tag.length() > 9)
                    return false;

                for (char c : tag.toCharArray()) {
                    if (!Character.isUpperCase(c))
                        return false;
                }

                stack.push(tag);

                i = end + 1;
            }

            // Normal character
            else {
                i++;
            }
        }

        return stack.isEmpty();
    }
}