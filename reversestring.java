class reversestring{

    public static void main(String[] args) {
        
        String s = "Hello world";
        String reverse = "";
        int length = s.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + s.charAt(i);
        System.out.println("Result:" + reverse);
        System.out.println(s);

    
    }
}