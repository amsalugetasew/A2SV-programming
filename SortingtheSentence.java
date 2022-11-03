class Solution {
    public String sortSentence(String s) {
        String[] a = s.split(" ");
        int len = a.length;
        String[] b = new String[len];
        for (int i = 0; i < len; i++) {
            int wr = a[i].length();
            String w = a[i].substring(0, wr - 1);
            int j = a[i].charAt(wr - 1) - '0' - 1;
            b[j] = w;
        }
        StringBuffer sub = new StringBuffer(b[0]);
        for (int i = 1; i < len; i++)
            sub.append(" " + b[i]);
        return sub.toString();
        
    }
}
