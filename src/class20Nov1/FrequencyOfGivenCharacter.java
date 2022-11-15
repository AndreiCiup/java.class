package class20Nov1;



public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        String str="Is this really important for your life? I guess it is!";
        char target='i';
        int count=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==target){
                count++;
            }
        }
        System.out.println("The frequency of given char is: "+count);
    }
}
