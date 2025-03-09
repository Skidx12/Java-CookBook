public class StringBuffer_Builder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Batman"); // StringBuffer keeps a bit of buffer along with the space taken by value.
        System.out.println(sb.capacity());

        // operations
        sb.append(" Arkham");
        System.out.println(sb);
        sb.chars();
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.insert(0, "_idk_");
        System.out.println(sb);

        // StringBuffer vs StringBuilder:
        // String buffer is Thread Safe! that's all the difference!

    }
}
