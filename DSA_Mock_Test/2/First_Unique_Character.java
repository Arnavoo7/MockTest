class First_Unique_Character {

    public static void main(String[] args) {

            String s = "loveleetcode";

            int[] count = new int[26];
            int n = s.length();

            for (int i = 0; i < n; i++) {
                int index = s.charAt(i) - 'a';
                count[index]++;
            }

            for (int i = 0; i < n; i++) {
                int index = s.charAt(i) - 'a';
                if (count[index] == 1) {
                    System.out.println("Output is: "+i);
                    System.exit(0);
                }

            }

        System.out.println("Output is: "+-1);
        }

}
